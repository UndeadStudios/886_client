/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class550
{
    float aFloat7289;
    SourceDataLine aSourceDataLine7290;
    Class372_Sub2 this$0;
    byte[] aByteArray7291;
    int anInt7292;
    int anInt7293;
    int anInt7294;
    byte[] aByteArray7295;
    int anInt7296;
    int anInt7297;
    List aList7298;
    boolean aBool7299;
    
    void method9118() {
	anInt7293 = 0;
	method9120(-1497550922);
	int i;
	for (/**/; anInt7293 * 1246256413 > 0; anInt7293 -= 1050627381 * i) {
	    i = 1246256413 * anInt7293;
	    if (anInt7296 * 22842967 + i >= aByteArray7295.length)
		i = aByteArray7295.length - anInt7296 * 22842967;
	    aSourceDataLine7290.write(aByteArray7295, anInt7296 * 22842967, i);
	    for (int i_0_ = 0; i_0_ < i; i_0_++)
		aByteArray7295[i_0_ + 22842967 * anInt7296] = (byte) 0;
	    anInt7296 += i * 1911045479;
	    anInt7296
		= 1911045479 * (22842967 * anInt7296 % aByteArray7295.length);
	}
    }
    
    void method9119(Class558 class558, int i) {
	aList7298.add(class558);
    }
    
    void method9120(int i) {
	synchronized (this) {
	    int i_1_ = 2147483647;
	    double d = (double) (-1619528709 * anInt7294 / 8
				 * (anInt7297 * 1121681529));
	    boolean bool = false;
	    Iterator iterator = aList7298.iterator();
	    while (iterator.hasNext()) {
		Class558 class558 = (Class558) iterator.next();
		int i_2_ = (class558.aByteArray7543.length
			    - 1695910357 * class558.anInt7545);
		if (class558.aFloat7539 != aFloat7289) {
		    i_2_ *= aFloat7289 / class558.aFloat7539;
		    i_2_ = (int) (d * Math.ceil((double) i_2_ / d));
		}
		class558.anInt7542 = -219414917 * i_2_;
		if (i_2_ > 0 && i_2_ < i_1_) {
		    bool = true;
		    i_1_ = i_2_;
		}
	    }
	    if (i_1_ > 1948751955 * anInt7292)
		i_1_ = anInt7292 * 1948751955;
	    if (i_1_ == 0 || false == bool) {
		/* empty */
	    } else {
		int i_3_ = anInt7294 * -1619528709 / 8;
		Iterator iterator_4_ = aList7298.iterator();
		while (iterator_4_.hasNext()) {
		    Class558 class558 = (Class558) iterator_4_.next();
		    if (class558.anInt7542 * 1878143155 >= i_1_) {
			int i_5_ = anInt7296 * 22842967;
			int i_6_ = 0;
			int i_7_ = 1913699235 * class558.anInt7544 / 8;
			double d_8_ = 0.0;
			int i_9_ = 0;
			double d_10_ = (double) aFloat7289;
			double d_11_ = (double) class558.aFloat7539;
			int i_12_ = 1002020087 * class558.anInt7541;
			for (/**/; (1878143155 * class558.anInt7542 > 0
				    && i_6_ < i_1_); i_6_ += i_7_) {
			    short i_13_ = 0;
			    short i_14_ = 0;
			    byte[] is = aByteArray7291;
			    for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
				is[i_15_] = aByteArray7295[i_15_ + i_5_];
				i_13_ |= (is[i_15_] & 0xff) << 8 * i_15_;
			    }
			    if (class558.aFloat7539 != aFloat7289) {
				byte[] is_16_ = class558.aByteArray7538;
				float f = (float) (d_8_ / d_10_ * d_11_);
				float f_17_ = (float) Math.floor((double) f);
				short i_18_ = 0;
				short i_19_ = 0;
				int i_20_ = (int) Math.floor((double) f);
				int i_21_ = (int) Math.ceil((double) f);
				i_20_ = (is_16_.length
					 * (class558.anInt7537 * -1889837191)
					 * i_20_) + i_9_ * is_16_.length;
				i_21_ = (i_21_ * (is_16_.length
						  * (class558.anInt7537
						     * -1889837191))
					 + i_9_ * is_16_.length);
				i_20_ += i_12_;
				i_21_ += i_12_;
				i_20_ %= class558.aByteArray7543.length;
				i_21_ %= class558.aByteArray7543.length;
				for (int i_22_ = 0; i_22_ < is_16_.length;
				     i_22_++) {
				    is_16_[i_22_] = (class558.aByteArray7543
						     [i_20_ + i_22_]);
				    i_18_
					|= (is_16_[i_22_] & 0xff) << 8 * i_22_;
				}
				for (int i_23_ = 0; i_23_ < is_16_.length;
				     i_23_++) {
				    is_16_[i_23_] = (class558.aByteArray7543
						     [i_23_ + i_21_]);
				    i_19_
					|= (is_16_[i_23_] & 0xff) << i_23_ * 8;
				}
				float f_24_ = f - f_17_;
				if (f_24_ < 0.0F || f_24_ > 1.0F)
				    throw new RuntimeException("");
				float f_25_ = (float) (i_19_ - i_18_);
				i_14_ = (short) (int) ((float) i_18_
						       + f_25_ * f_24_);
				i_9_ = ++i_9_ % (-1889837191
						 * class558.anInt7537);
				if (i_9_ == 0)
				    d_8_++;
			    } else {
				byte[] is_26_ = class558.aByteArray7538;
				for (int i_27_ = 0; i_27_ < is_26_.length;
				     i_27_++) {
				    is_26_[i_27_]
					= (class558.aByteArray7543
					   [i_27_ + (1002020087
						     * class558.anInt7541)]);
				    i_14_
					|= (is_26_[i_27_] & 0xff) << i_27_ * 8;
				}
				class558.anInt7541 += 1353573575 * i_7_;
				Class558 class558_28_;
				(class558_28_ = class558).anInt7541
				    = (1353573575
				       * (class558_28_.anInt7541 * 1002020087
					  % class558.aByteArray7543.length));
				class558.anInt7545 += i_7_ * -429168771;
			    }
			    i_14_ += i_13_;
			    if (i_14_ > 32767)
				i_14_ = (short) 32767;
			    if (i_14_ < -32768)
				i_14_ = (short) -32768;
			    aByteArray7295[i_5_] = (byte) i_14_;
			    aByteArray7295[1 + i_5_] = (byte) (i_14_ >> 8);
			    i_5_ += i_3_;
			    i_5_ %= aByteArray7295.length;
			}
			if (aFloat7289 != class558.aFloat7539) {
			    double d_29_ = (double) i_1_ * (d_11_ / d_10_);
			    int i_30_ = (int) (d * Math.ceil(d_29_ / d));
			    class558.anInt7541 += 1353573575 * i_30_;
			    Class558 class558_31_;
			    (class558_31_ = class558).anInt7541
				= (1353573575
				   * (class558_31_.anInt7541 * 1002020087
				      % class558.aByteArray7543.length));
			    class558.anInt7545 += i_30_ * -429168771;
			}
		    }
		}
		anInt7293 = i_1_ * 1050627381;
	    }
	}
    }
    
    void method9121(byte i) {
	if (aBool7299) {
	    if (null != aSourceDataLine7290)
		anInt7292 = aSourceDataLine7290.available() * -1376621605;
	}
    }
    
    void method9122(int i) {
	anInt7293 = 0;
	method9120(-2074326339);
	int i_32_;
	for (/**/; anInt7293 * 1246256413 > 0;
	     anInt7293 -= 1050627381 * i_32_) {
	    i_32_ = 1246256413 * anInt7293;
	    if (anInt7296 * 22842967 + i_32_ >= aByteArray7295.length)
		i_32_ = aByteArray7295.length - anInt7296 * 22842967;
	    aSourceDataLine7290.write(aByteArray7295, anInt7296 * 22842967,
				      i_32_);
	    for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
		aByteArray7295[i_33_ + 22842967 * anInt7296] = (byte) 0;
	    anInt7296 += i_32_ * 1911045479;
	    anInt7296
		= 1911045479 * (22842967 * anInt7296 % aByteArray7295.length);
	}
    }
    
    void method9123(Class558 class558, int i) {
	aList7298.remove(class558);
    }
    
    void method9124() {
	if (aBool7299) {
	    if (null != aSourceDataLine7290)
		anInt7292 = aSourceDataLine7290.available() * -1376621605;
	}
    }
    
    void method9125() {
	if (aBool7299) {
	    if (null != aSourceDataLine7290)
		anInt7292 = aSourceDataLine7290.available() * -1376621605;
	}
    }
    
    void method9126() {
	anInt7293 = 0;
	method9120(1486281228);
	int i;
	for (/**/; anInt7293 * 1246256413 > 0; anInt7293 -= 1050627381 * i) {
	    i = 1246256413 * anInt7293;
	    if (anInt7296 * 22842967 + i >= aByteArray7295.length)
		i = aByteArray7295.length - anInt7296 * 22842967;
	    aSourceDataLine7290.write(aByteArray7295, anInt7296 * 22842967, i);
	    for (int i_34_ = 0; i_34_ < i; i_34_++)
		aByteArray7295[i_34_ + 22842967 * anInt7296] = (byte) 0;
	    anInt7296 += i * 1911045479;
	    anInt7296
		= 1911045479 * (22842967 * anInt7296 % aByteArray7295.length);
	}
    }
    
    Class550(Class372_Sub2 class372_sub2, float f, int i) {
	this$0 = class372_sub2;
	anInt7294 = -1747848400;
	anInt7297 = 974508946;
	aList7298 = new ArrayList();
	if (!aBool7299) {
	    aFloat7289 = f;
	    if (-1619528709 * anInt7294 > 16)
		throw new RuntimeException("");
	    try {
		AudioFormat audioformat
		    = new AudioFormat(aFloat7289, anInt7294 * -1619528709,
				      anInt7297 * 1121681529, true, false);
		try {
		    DataLine.Info info
			= (new DataLine.Info
			   (javax.sound.sampled.SourceDataLine.class,
			    audioformat, i));
		    aSourceDataLine7290
			= (SourceDataLine) AudioSystem.getLine(info);
		} catch (IllegalArgumentException illegalargumentexception) {
		    return;
		}
		aSourceDataLine7290.open(audioformat, i);
		aSourceDataLine7290.start();
	    } catch (LineUnavailableException lineunavailableexception) {
		return;
	    }
	    aByteArray7295 = new byte[i];
	    aByteArray7291 = new byte[anInt7294 * -1619528709 / 8];
	    anInt7296 = 0;
	    aBool7299 = true;
	}
    }
    
    void method9127() {
	synchronized (this) {
	    int i = 2147483647;
	    double d = (double) (-1619528709 * anInt7294 / 8
				 * (anInt7297 * 1121681529));
	    boolean bool = false;
	    Iterator iterator = aList7298.iterator();
	    while (iterator.hasNext()) {
		Class558 class558 = (Class558) iterator.next();
		int i_35_ = (class558.aByteArray7543.length
			     - 1695910357 * class558.anInt7545);
		if (class558.aFloat7539 != aFloat7289) {
		    i_35_ *= aFloat7289 / class558.aFloat7539;
		    i_35_ = (int) (d * Math.ceil((double) i_35_ / d));
		}
		class558.anInt7542 = -219414917 * i_35_;
		if (i_35_ > 0 && i_35_ < i) {
		    bool = true;
		    i = i_35_;
		}
	    }
	    if (i > 1948751955 * anInt7292)
		i = anInt7292 * 1948751955;
	    if (i == 0 || false == bool) {
		/* empty */
	    } else {
		int i_36_ = anInt7294 * -1619528709 / 8;
		Iterator iterator_37_ = aList7298.iterator();
		while (iterator_37_.hasNext()) {
		    Class558 class558 = (Class558) iterator_37_.next();
		    if (class558.anInt7542 * 1878143155 >= i) {
			int i_38_ = anInt7296 * 22842967;
			int i_39_ = 0;
			int i_40_ = 1913699235 * class558.anInt7544 / 8;
			double d_41_ = 0.0;
			int i_42_ = 0;
			double d_43_ = (double) aFloat7289;
			double d_44_ = (double) class558.aFloat7539;
			int i_45_ = 1002020087 * class558.anInt7541;
			for (/**/;
			     1878143155 * class558.anInt7542 > 0 && i_39_ < i;
			     i_39_ += i_40_) {
			    short i_46_ = 0;
			    short i_47_ = 0;
			    byte[] is = aByteArray7291;
			    for (int i_48_ = 0; i_48_ < is.length; i_48_++) {
				is[i_48_] = aByteArray7295[i_48_ + i_38_];
				i_46_ |= (is[i_48_] & 0xff) << 8 * i_48_;
			    }
			    if (class558.aFloat7539 != aFloat7289) {
				byte[] is_49_ = class558.aByteArray7538;
				float f = (float) (d_41_ / d_43_ * d_44_);
				float f_50_ = (float) Math.floor((double) f);
				short i_51_ = 0;
				short i_52_ = 0;
				int i_53_ = (int) Math.floor((double) f);
				int i_54_ = (int) Math.ceil((double) f);
				i_53_ = (is_49_.length
					 * (class558.anInt7537 * -1889837191)
					 * i_53_) + i_42_ * is_49_.length;
				i_54_ = (i_54_ * (is_49_.length
						  * (class558.anInt7537
						     * -1889837191))
					 + i_42_ * is_49_.length);
				i_53_ += i_45_;
				i_54_ += i_45_;
				i_53_ %= class558.aByteArray7543.length;
				i_54_ %= class558.aByteArray7543.length;
				for (int i_55_ = 0; i_55_ < is_49_.length;
				     i_55_++) {
				    is_49_[i_55_] = (class558.aByteArray7543
						     [i_53_ + i_55_]);
				    i_51_
					|= (is_49_[i_55_] & 0xff) << 8 * i_55_;
				}
				for (int i_56_ = 0; i_56_ < is_49_.length;
				     i_56_++) {
				    is_49_[i_56_] = (class558.aByteArray7543
						     [i_56_ + i_54_]);
				    i_52_
					|= (is_49_[i_56_] & 0xff) << i_56_ * 8;
				}
				float f_57_ = f - f_50_;
				if (f_57_ < 0.0F || f_57_ > 1.0F)
				    throw new RuntimeException("");
				float f_58_ = (float) (i_52_ - i_51_);
				i_47_ = (short) (int) ((float) i_51_
						       + f_58_ * f_57_);
				i_42_ = ++i_42_ % (-1889837191
						   * class558.anInt7537);
				if (i_42_ == 0)
				    d_41_++;
			    } else {
				byte[] is_59_ = class558.aByteArray7538;
				for (int i_60_ = 0; i_60_ < is_59_.length;
				     i_60_++) {
				    is_59_[i_60_]
					= (class558.aByteArray7543
					   [i_60_ + (1002020087
						     * class558.anInt7541)]);
				    i_47_
					|= (is_59_[i_60_] & 0xff) << i_60_ * 8;
				}
				class558.anInt7541 += 1353573575 * i_40_;
				Class558 class558_61_;
				(class558_61_ = class558).anInt7541
				    = (1353573575
				       * (class558_61_.anInt7541 * 1002020087
					  % class558.aByteArray7543.length));
				class558.anInt7545 += i_40_ * -429168771;
			    }
			    i_47_ += i_46_;
			    if (i_47_ > 32767)
				i_47_ = (short) 32767;
			    if (i_47_ < -32768)
				i_47_ = (short) -32768;
			    aByteArray7295[i_38_] = (byte) i_47_;
			    aByteArray7295[1 + i_38_] = (byte) (i_47_ >> 8);
			    i_38_ += i_36_;
			    i_38_ %= aByteArray7295.length;
			}
			if (aFloat7289 != class558.aFloat7539) {
			    double d_62_ = (double) i * (d_44_ / d_43_);
			    int i_63_ = (int) (d * Math.ceil(d_62_ / d));
			    class558.anInt7541 += 1353573575 * i_63_;
			    Class558 class558_64_;
			    (class558_64_ = class558).anInt7541
				= (1353573575
				   * (class558_64_.anInt7541 * 1002020087
				      % class558.aByteArray7543.length));
			    class558.anInt7545 += i_63_ * -429168771;
			}
		    }
		}
		anInt7293 = i * 1050627381;
	    }
	}
    }
    
    void method9128() {
	synchronized (this) {
	    int i = 2147483647;
	    double d = (double) (-1619528709 * anInt7294 / 8
				 * (anInt7297 * 1121681529));
	    boolean bool = false;
	    Iterator iterator = aList7298.iterator();
	    while (iterator.hasNext()) {
		Class558 class558 = (Class558) iterator.next();
		int i_65_ = (class558.aByteArray7543.length
			     - 1695910357 * class558.anInt7545);
		if (class558.aFloat7539 != aFloat7289) {
		    i_65_ *= aFloat7289 / class558.aFloat7539;
		    i_65_ = (int) (d * Math.ceil((double) i_65_ / d));
		}
		class558.anInt7542 = -219414917 * i_65_;
		if (i_65_ > 0 && i_65_ < i) {
		    bool = true;
		    i = i_65_;
		}
	    }
	    if (i > 1948751955 * anInt7292)
		i = anInt7292 * 1948751955;
	    if (i == 0 || false == bool) {
		/* empty */
	    } else {
		int i_66_ = anInt7294 * -1619528709 / 8;
		Iterator iterator_67_ = aList7298.iterator();
		while (iterator_67_.hasNext()) {
		    Class558 class558 = (Class558) iterator_67_.next();
		    if (class558.anInt7542 * 1878143155 >= i) {
			int i_68_ = anInt7296 * 22842967;
			int i_69_ = 0;
			int i_70_ = 1913699235 * class558.anInt7544 / 8;
			double d_71_ = 0.0;
			int i_72_ = 0;
			double d_73_ = (double) aFloat7289;
			double d_74_ = (double) class558.aFloat7539;
			int i_75_ = 1002020087 * class558.anInt7541;
			for (/**/;
			     1878143155 * class558.anInt7542 > 0 && i_69_ < i;
			     i_69_ += i_70_) {
			    short i_76_ = 0;
			    short i_77_ = 0;
			    byte[] is = aByteArray7291;
			    for (int i_78_ = 0; i_78_ < is.length; i_78_++) {
				is[i_78_] = aByteArray7295[i_78_ + i_68_];
				i_76_ |= (is[i_78_] & 0xff) << 8 * i_78_;
			    }
			    if (class558.aFloat7539 != aFloat7289) {
				byte[] is_79_ = class558.aByteArray7538;
				float f = (float) (d_71_ / d_73_ * d_74_);
				float f_80_ = (float) Math.floor((double) f);
				short i_81_ = 0;
				short i_82_ = 0;
				int i_83_ = (int) Math.floor((double) f);
				int i_84_ = (int) Math.ceil((double) f);
				i_83_ = (is_79_.length
					 * (class558.anInt7537 * -1889837191)
					 * i_83_) + i_72_ * is_79_.length;
				i_84_ = (i_84_ * (is_79_.length
						  * (class558.anInt7537
						     * -1889837191))
					 + i_72_ * is_79_.length);
				i_83_ += i_75_;
				i_84_ += i_75_;
				i_83_ %= class558.aByteArray7543.length;
				i_84_ %= class558.aByteArray7543.length;
				for (int i_85_ = 0; i_85_ < is_79_.length;
				     i_85_++) {
				    is_79_[i_85_] = (class558.aByteArray7543
						     [i_83_ + i_85_]);
				    i_81_
					|= (is_79_[i_85_] & 0xff) << 8 * i_85_;
				}
				for (int i_86_ = 0; i_86_ < is_79_.length;
				     i_86_++) {
				    is_79_[i_86_] = (class558.aByteArray7543
						     [i_86_ + i_84_]);
				    i_82_
					|= (is_79_[i_86_] & 0xff) << i_86_ * 8;
				}
				float f_87_ = f - f_80_;
				if (f_87_ < 0.0F || f_87_ > 1.0F)
				    throw new RuntimeException("");
				float f_88_ = (float) (i_82_ - i_81_);
				i_77_ = (short) (int) ((float) i_81_
						       + f_88_ * f_87_);
				i_72_ = ++i_72_ % (-1889837191
						   * class558.anInt7537);
				if (i_72_ == 0)
				    d_71_++;
			    } else {
				byte[] is_89_ = class558.aByteArray7538;
				for (int i_90_ = 0; i_90_ < is_89_.length;
				     i_90_++) {
				    is_89_[i_90_]
					= (class558.aByteArray7543
					   [i_90_ + (1002020087
						     * class558.anInt7541)]);
				    i_77_
					|= (is_89_[i_90_] & 0xff) << i_90_ * 8;
				}
				class558.anInt7541 += 1353573575 * i_70_;
				Class558 class558_91_;
				(class558_91_ = class558).anInt7541
				    = (1353573575
				       * (class558_91_.anInt7541 * 1002020087
					  % class558.aByteArray7543.length));
				class558.anInt7545 += i_70_ * -429168771;
			    }
			    i_77_ += i_76_;
			    if (i_77_ > 32767)
				i_77_ = (short) 32767;
			    if (i_77_ < -32768)
				i_77_ = (short) -32768;
			    aByteArray7295[i_68_] = (byte) i_77_;
			    aByteArray7295[1 + i_68_] = (byte) (i_77_ >> 8);
			    i_68_ += i_66_;
			    i_68_ %= aByteArray7295.length;
			}
			if (aFloat7289 != class558.aFloat7539) {
			    double d_92_ = (double) i * (d_74_ / d_73_);
			    int i_93_ = (int) (d * Math.ceil(d_92_ / d));
			    class558.anInt7541 += 1353573575 * i_93_;
			    Class558 class558_94_;
			    (class558_94_ = class558).anInt7541
				= (1353573575
				   * (class558_94_.anInt7541 * 1002020087
				      % class558.aByteArray7543.length));
			    class558.anInt7545 += i_93_ * -429168771;
			}
		    }
		}
		anInt7293 = i * 1050627381;
	    }
	}
    }
    
    void method9129(Class558 class558) {
	aList7298.remove(class558);
    }
    
    void method9130(Class558 class558) {
	aList7298.remove(class558);
    }
    
    void method9131(Class558 class558) {
	aList7298.remove(class558);
    }
    
    static final void method9132(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2708
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1294274626);
	class259.aBool2695 = true;
    }
    
    static final void method9133(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.aStringArray2701 = null;
    }
    
    static final void method9134(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		  .method17078(-27364158) ? 1 : 0;
    }
    
    static final void method9135(int i, int i_95_, int i_96_, int i_97_,
				 boolean bool, short i_98_) {
	if (client.aClass507_11137.method8358((byte) 50) == null)
	    Class501.aClass182_5564.method3190(i, i_95_, i_96_, i_97_,
					       -16777216, (byte) -1);
	else {
	    Class446 class446
		= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818()
		   .aClass446_4807);
	    boolean bool_99_ = false;
	    if (1 != 1874190559 * client.anInt11145) {
		if (!client.aBool11146)
		    bool_99_ = true;
	    } else {
		if ((int) class446.aFloat4895 < 0
		    || ((int) class446.aFloat4895
			>= client.aClass507_11137.method8412(444982681) * 512)
		    || (int) class446.aFloat4897 < 0
		    || ((int) class446.aFloat4897
			>= (client.aClass507_11137.method8352((byte) -65)
			    * 512)))
		    bool_99_ = true;
		if (-174799205 * Class700.anInt8779 == 5
		    && !Class453_Sub3.aClass309_Sub1_10316
			    .method5505((byte) 0))
		    bool_99_ = true;
	    }
	    if (bool_99_)
		Class501.aClass182_5564.method3190(i, i_95_, i_96_, i_97_,
						   -16777216, (byte) -1);
	    else {
		client.anInt11267 += 420289035;
		if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705 != null
		    && ((int) class446.aFloat4895
			- (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			       .method18608((byte) 51)
			   - 1) * 256) >> 9 == Class98.anInt1200 * -183945107
		    && (((int) class446.aFloat4897
			 - (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				.method18608((byte) 16)
			    - 1) * 256) >> 9
			== Class98.anInt1201 * -2034861947)) {
		    Class98.anInt1200 = 1046245019;
		    Class98.anInt1201 = 671956915;
		    Class73.method1541(899428791);
		}
		Class709.method14428(1392735215);
		if (!bool)
		    Class10.method705(2074527827);
		Class350_Sub1.method15843(-383472878);
		for (int i_100_ = 0;
		     i_100_ < client.aClass523Array11183.length; i_100_++) {
		    if (client.aClass523Array11183[i_100_] != null
			&& !client.aClass523Array11183[i_100_]
				.method8711(1696375567)
			&& client.aClass523Array11183[i_100_]
			       .method8712(Class501.aClass182_5564, 594863321))
			client.aClass523Array11183[i_100_].method8707
			    (client.aClass507_11137.method8358((byte) 81),
			     (byte) 54);
		}
		Class596.method9838(i, i_95_, i_96_, i_97_, true, 1302949321);
		i = client.anInt11292 * 634814571;
		i_95_ = -1391214471 * client.anInt11357;
		i_96_ = -672051425 * client.anInt11067;
		i_97_ = client.anInt11359 * 155908143;
		Class637.method10518(i, i_95_, (byte) 0);
		if (1 == Class700.anInt8779 * -174799205) {
		    int i_101_ = (int) client.aFloat11176;
		    if (466430475 * client.anInt11185 >> 8 > i_101_)
			i_101_ = 466430475 * client.anInt11185 >> 8;
		    if (client.aBoolArray11343[4]
			&& 128 + client.anIntArray11345[4] > i_101_)
			i_101_ = 128 + client.anIntArray11345[4];
		    int i_102_ = (((int) client.aFloat11052
				   + 1579923035 * client.anInt11164)
				  & 0x3fff);
		    Class492.method7994
			(Class275.anInt2867 * 1497781253,
			 (Class335.method5855((int) class446.aFloat4895,
					      (int) class446.aFloat4897,
					      -1335910809 * Class677.anInt8619,
					      2020563229)
			  - client.anInt11195 * -858398829),
			 Class381.anInt3930 * 1222586347, i_101_, i_102_,
			 600 + 3 * (i_101_ >> 3) << 2, i_97_, -4768124);
		} else if (Class700.anInt8779 * -174799205 == 2) {
		    int i_103_ = (int) client.aFloat11176;
		    if (466430475 * client.anInt11185 >> 8 > i_103_)
			i_103_ = client.anInt11185 * 466430475 >> 8;
		    if (client.aBoolArray11343[4]
			&& 128 + client.anIntArray11345[4] > i_103_)
			i_103_ = client.anIntArray11345[4] + 128;
		    int i_104_ = (int) client.aFloat11052 & 0x3fff;
		    Class492.method7994
			(1497781253 * Class275.anInt2867,
			 (Class335.method5855(client.anInt11174 * -914139697,
					      client.anInt11112 * -2064193877,
					      Class677.anInt8619 * -1335910809,
					      2020563229)
			  - client.anInt11195 * -858398829),
			 1222586347 * Class381.anInt3930, i_103_, i_104_,
			 600 + 3 * (i_103_ >> 3) << 2, i_97_, -4768124);
		} else if (-174799205 * Class700.anInt8779 == 4)
		    Class313_Sub2.method15732(i_97_, 1552651121);
		int i_105_ = Class477.anInt5200 * -469853907;
		int i_106_ = -142598869 * Class575.anInt7648;
		int i_107_ = Class475.anInt5179 * -1889707729;
		int i_108_ = Class689_Sub1.anInt11019 * 1201172629;
		int i_109_ = Class64.anInt695 * -684522141;
		for (int i_110_ = 0; i_110_ < 5; i_110_++) {
		    if (client.aBoolArray11343[i_110_]) {
			int i_111_
			    = (int) ((Math.random()
				      * (double) (1
						  + 2 * (client.anIntArray11344
							 [i_110_])))
				     - (double) client.anIntArray11344[i_110_]
				     + (Math.sin((double) (client
							   .anIntArray11088
							   [i_110_])
						 * ((double) (client
							      .anIntArray11346
							      [i_110_])
						    / 100.0))
					* (double) (client.anIntArray11345
						    [i_110_])));
			if (i_110_ == 0)
			    Class477.anInt5200 += 54795941 * (i_111_ << 2);
			if (i_110_ == 1)
			    Class575.anInt7648 += -1332233853 * (i_111_ << 2);
			if (i_110_ == 2)
			    Class475.anInt5179 += 662343119 * (i_111_ << 2);
			if (i_110_ == 3)
			    Class64.anInt695
				= (-1054956469
				   * (i_111_ + Class64.anInt695 * -684522141
				      & 0x3fff));
			if (i_110_ == 4) {
			    Class689_Sub1.anInt11019 += i_111_ * 784259773;
			    if (1201172629 * Class689_Sub1.anInt11019 < 1024)
				Class689_Sub1.anInt11019 = -76876800;
			    else if (Class689_Sub1.anInt11019 * 1201172629
				     > 3072)
				Class689_Sub1.anInt11019 = -230630400;
			}
		    }
		}
		if (-469853907 * Class477.anInt5200 < 0)
		    Class477.anInt5200 = 0;
		if (-469853907 * Class477.anInt5200
		    > ((client.aClass507_11137.method8358((byte) 75).anInt7210
			* 1761949661)
		       << 9) - 1)
		    Class477.anInt5200 = (((client.aClass507_11137.method8358
					    ((byte) 70).anInt7210) * 1761949661
					   << 9)
					  - 1) * 54795941;
		if (-1889707729 * Class475.anInt5179 < 0)
		    Class475.anInt5179 = 0;
		if (-1889707729 * Class475.anInt5179
		    > ((client.aClass507_11137.method8358((byte) 123).anInt7211
			* 947301287)
		       << 9) - 1)
		    Class475.anInt5179 = (((client.aClass507_11137.method8358
					    ((byte) 122).anInt7211) * 947301287
					   << 9)
					  - 1) * 662343119;
		if (Class198_Sub13.aClass525_Sub30_9973
			.aClass696_Sub6_10675.method17028((byte) 30)
		    == 2)
		    Class598.method9851(-1537392132);
		else if (Class198_Sub13.aClass525_Sub30_9973
			     .aClass696_Sub6_10675.method17028((byte) 116)
			 == 3)
		    Class671.method11047(-77560607);
		Class501.aClass182_5564.method3277(i, i_95_, i_96_, i_97_);
		Class501.aClass182_5564.method3186(true);
		Class501.aClass182_5564.method3184(i, i_95_, i_96_ + i,
						   i_95_ + i_97_);
		Class618 class618 = client.aClass507_11137.method8361
					((byte) 101).method10386((byte) 65);
		int i_112_ = class618.method10151((byte) 1);
		Class291 class291 = new Class291();
		Class600 class600
		    = client.aClass507_11137.method8350(-435876947);
		if (Class581.method9621((byte) 0))
		    Class44.aClass309_Sub1_345.method5479
			(class291, client.aClass444_11077,
			 client.aClass435_11076,
			 class600.anInt7858 * -1227002079 << 9,
			 1429253007 * class600.anInt7860 << 9, 1779734887);
		else if (Class700.anInt8779 * -174799205 == 5)
		    Class453_Sub3.aClass309_Sub1_10316.method5479
			(class291, client.aClass444_11077,
			 client.aClass435_11076,
			 class600.anInt7858 * -1227002079 << 9,
			 class600.anInt7860 * 1429253007 << 9, 428458355);
		else {
		    client.aClass444_11077.method7137
			((float) -(-469853907 * Class477.anInt5200),
			 (float) -(Class575.anInt7648 * -142598869),
			 (float) -(Class475.anInt5179 * -1889707729));
		    client.aClass444_11077.method7142
			(0.0F, -1.0F, 0.0F,
			 Class436.method7071(-(Class64.anInt695 * -684522141)
					     & 0x3fff));
		    client.aClass444_11077.method7142
			(-1.0F, 0.0F, 0.0F,
			 Class436.method7071(-(Class689_Sub1.anInt11019
					       * 1201172629) & 0x3fff));
		    client.aClass444_11077.method7142
			(0.0F, 0.0F, -1.0F,
			 Class436.method7071(-(ItemDefinitions.anInt137 * 688796877)
					     & 0x3fff));
		    Class696_Sub19.method17146
			(client.aClass435_11076, true, (float) (i_96_ / 2),
			 (float) (i_97_ / 2),
			 (float) (client.anInt11360 * -1251068933 << 1),
			 (float) (-1251068933 * client.anInt11360 << 1), i_96_,
			 i_97_, -1755600923);
		}
		Class501.aClass182_5564.method3233(client.aClass444_11077);
		Class501.aClass182_5564.method3252(client.aClass435_11076);
		if (class618.method10128(-905684451) != null) {
		    Class501.aClass182_5564.method3351(1.0F);
		    Class501.aClass182_5564.method3307(16777215, 0.0F, 0.0F,
						       1.0F, 0.0F, 0.0F);
		    if (Class700.anInt8779 * -174799205 == 5) {
			int i_113_ = (int) ((double) Class453_Sub3
							 .aClass309_Sub1_10316
							 .method5490(447913694)
					    * 2607.5945876176133);
			int i_114_ = (int) ((double) Class453_Sub3
							 .aClass309_Sub1_10316
							 .method5491((byte) 0)
					    * 2607.5945876176133);
			class618.method10128(-905684451).method8557
			    (Class501.aClass182_5564,
			     Class108.anInt1310 * -1288106571 << 3, i, i_95_,
			     i_96_, i_97_, i_113_, i_114_, 0, i_112_, true,
			     false, (byte) 2);
		    } else
			class618.method10128(-905684451).method8557
			    (Class501.aClass182_5564,
			     Class108.anInt1310 * -1288106571 << 3, i, i_95_,
			     i_96_, i_97_,
			     Class689_Sub1.anInt11019 * 1201172629,
			     Class64.anInt695 * -684522141,
			     ItemDefinitions.anInt137 * 688796877, i_112_, true, false,
			     (byte) -36);
		    Class501.aClass182_5564.method3218();
		} else
		    Class501.aClass182_5564.method3188(3, i_112_);
		Class501.aClass182_5564.method3186(false);
		Class579.method9587(client.aClass444_11077,
				    client.aClass435_11076, i_96_, i_97_,
				    (short) 255);
		client.aClass507_11137.method8361((byte) 50)
		    .method10382(client.aClass507_11137, 1572545242);
		int i_115_ = Class198_Sub13.aClass525_Sub30_9973
				 .aClass696_Sub6_10675.method17028((byte) 99);
		byte i_116_;
		if (2 == i_115_)
		    i_116_ = (byte) (client.anInt11267 * -1308155485);
		else if (i_115_ == 3)
		    i_116_ = (byte) (client.aBool11377 ? 1 : -1);
		else
		    i_116_ = (byte) 1;
		if (Class581.method9621((byte) 0)
		    || -174799205 * Class700.anInt8779 == 5)
		    client.aClass507_11137.method8358((byte) 121).method8978
			(client.anInt11083, class291.anInt3219 * 446228439,
			 -971457507 * class291.anInt3220,
			 class291.anInt3218 * 120391383,
			 client.aClass507_11137.method8417((byte) -80),
			 client.anIntArray11214, client.anIntArray11215,
			 client.anIntArray11316, client.anIntArray11321,
			 client.anIntArray11218,
			 1 + (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			      .aByte10867),
			 i_116_, (int) class446.aFloat4895 >> 9,
			 (int) class446.aFloat4897 >> 9,
			 (Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub5_10685.method17018(-632664957)
			  == 0),
			 true, 0, true);
		else
		    client.aClass507_11137.method8358((byte) 122).method8978
			(client.anInt11083, Class477.anInt5200 * -469853907,
			 Class575.anInt7648 * -142598869,
			 -1889707729 * Class475.anInt5179,
			 client.aClass507_11137.method8417((byte) 6),
			 client.anIntArray11214, client.anIntArray11215,
			 client.anIntArray11316, client.anIntArray11321,
			 client.anIntArray11218,
			 (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
			  .aByte10867) + 1,
			 i_116_, (int) class446.aFloat4895 >> 9,
			 (int) class446.aFloat4897 >> 9,
			 (Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub5_10685.method17018(1182380265)
			  == 0),
			 true, 0, true);
		client.anInt11097 += -1725606171;
		if (!Class501.aClass182_5564.method3250()
		    && 7 == client.anInt11075 * 1777895575)
		    Class525_Sub10.method16196(i, i_95_, i_96_, i_97_,
					       (byte) 52);
		client.aClass507_11137.method8358((byte) 70)
		    .method8958(2102205775);
		Class477.anInt5200 = i_105_ * 54795941;
		Class575.anInt7648 = -1332233853 * i_106_;
		Class475.anInt5179 = i_107_ * 662343119;
		Class689_Sub1.anInt11019 = i_108_ * 784259773;
		Class64.anInt695 = i_109_ * -1054956469;
		if (client.aBool11242
		    && Class94.aClass463_912.method7615((byte) -122) == 0)
		    client.aBool11242 = false;
		if (client.aBool11242) {
		    Class501.aClass182_5564.method3190(i, i_95_, i_96_, i_97_,
						       -16777216, (byte) -1);
		    Class666.method11016
			(Class53.aClass53_475.method1169(Class21.aClass666_213,
							 1552651121),
			 false, Class501.aClass182_5564, Class29.aClass175_293,
			 Class500.aClass7_5560, 99082536);
		}
		Class696_Sub19.method17146
		    (client.aClass435_11076, false, (float) (i_96_ / 2 + i),
		     (float) (i_95_ + i_97_ / 2),
		     (float) (-1251068933 * client.anInt11360 << 1),
		     (float) (client.anInt11360 * -1251068933 << 1), i_96_,
		     i_97_, -1755600923);
		Class501.aClass182_5564.method3252(client.aClass435_11076);
		Class394.method6515(client.aClass435_11076, 492122652);
	    }
	}
    }
    
    static final void method9136(Class683 class683, int i) {
	int i_117_ = (class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = ((ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
			    .method76(i_117_, 1487079777)).aString66;
    }
    
    static final void method9137(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class238.method4417(class259, class245, class683, (byte) 82);
    }
    
    public static void method9138
	(Class578 class578, int i, int i_118_,
	 Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, int i_119_,
	 int i_120_) {
	Class683 class683 = Class457.method7468(-485786200);
	class683.aClass656_Sub1_Sub3_Sub1_8654 = class656_sub1_sub3_sub1;
	class683.anInt8660 = -1050192045 * i_119_;
	Class587.method9691(class578, i, i_118_, class683, (byte) 33);
	class683.aClass656_Sub1_Sub3_Sub1_8654 = null;
	class683.anInt8660 = 1050192045;
    }
}
