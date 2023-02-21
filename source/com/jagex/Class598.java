/* Class598 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class598 implements Interface66
{
    int[] anIntArray7847;
    
    public boolean method430(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551, int i_0_) {
	int[] is = anIntArray7847;
	for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
	    int i_2_ = is[i_1_];
	    if (!class551.method9149(i_2_, 2145304141))
		return false;
	}
	return true;
    }
    
    public boolean method431(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	int[] is = anIntArray7847;
	for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
	    int i_4_ = is[i_3_];
	    if (!class551.method9149(i_4_, 666677735))
		return false;
	}
	return true;
    }
    
    public boolean method432(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	int[] is = anIntArray7847;
	for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
	    int i_6_ = is[i_5_];
	    if (!class551.method9149(i_6_, 1525382423))
		return false;
	}
	return true;
    }
    
    Class598(int[] is) {
	anIntArray7847 = is;
    }
    
    public boolean method429(Class525_Sub41 class525_sub41,
			     Interface64[] interface64s, int i,
			     Class551 class551) {
	int[] is = anIntArray7847;
	for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
	    int i_8_ = is[i_7_];
	    if (!class551.method9149(i_8_, 2035288181))
		return false;
	}
	return true;
    }
    
    public static Class598 method9846(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(1082643707);
	int[] is = new int[i];
	for (int i_9_ = 0; i_9_ < i; i_9_++)
	    is[i_9_] = class525_sub38.readUnsignedByte(741311702);
	return new Class598(is);
    }
    
    public static Class598 method9847(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(780425133);
	int[] is = new int[i];
	for (int i_10_ = 0; i_10_ < i; i_10_++)
	    is[i_10_] = class525_sub38.readUnsignedByte(1213768505);
	return new Class598(is);
    }
    
    public static void method9848(int i, int i_11_) {
	Class325.anInt3557 = -1595104511 * i;
	synchronized (Class637.aClass200_8305) {
	    Class637.aClass200_8305.method3791((byte) -51);
	}
	synchronized (Class637.aClass200_8292) {
	    Class637.aClass200_8292.method3791((byte) -43);
	}
    }
    
    static void method9849(Class683 class683, byte i) {
	class683.anIntArray8661[501271953 * class683.anInt8662 - 2]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [((501271953
							 * class683.anInt8662)
							- 2)]),
						     -1877410429))
	       .anIntArrayArray2839
	       [class683.anIntArray8661[class683.anInt8662 * 501271953 - 1]]
	       [1]);
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method9850(Class259 class259, Class245 class245,
				 Class683 class683, byte i) {
	class259.anInt2638
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * 515078717;
	Class649.method10708(class259, (byte) 0);
	if (1534974651 * class259.anInt2576 == -1 && !class245.aBool2428)
	    Class427.method6787(1984678839 * class259.anInt2588,
				(short) 26058);
    }
    
    static final void method9851(int i) {
	byte[][][] is = client.aClass507_11137.method8417((byte) -54);
	byte i_12_ = (byte) (-1308155485 * client.anInt11267 - 4 & 0xff);
	int i_13_ = (-1308155485 * client.anInt11267
		     % client.aClass507_11137.method8412(77104546));
	for (int i_14_ = 0; i_14_ < 4; i_14_++) {
	    for (int i_15_ = 0;
		 i_15_ < client.aClass507_11137.method8352((byte) -81);
		 i_15_++)
		is[i_14_][i_13_][i_15_] = i_12_;
	}
	if (Class677.anInt8619 * -1335910809 != 3) {
	    for (int i_16_ = 0; i_16_ < 2; i_16_++) {
		client.anIntArray11214[i_16_] = -1000000;
		client.anIntArray11215[i_16_] = 1000000;
		client.anIntArray11316[i_16_] = 0;
		client.anIntArray11218[i_16_] = 1000000;
		client.anIntArray11321[i_16_] = 0;
	    }
	    Class446 class446
		= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818()
		   .aClass446_4807);
	    Class475 class475 = client.aClass507_11137.method8360(2126209394);
	    Class546 class546 = client.aClass507_11137.method8358((byte) 10);
	    if (-174799205 * Class700.anInt8779 == 1
		|| 5 == Class700.anInt8779 * -174799205
		|| -1 != Class198_Sub3.anInt9911 * 1168779751) {
		Class600 class600
		    = client.aClass507_11137.method8350(-2097152561);
		int i_17_;
		int i_18_;
		if (-174799205 * Class700.anInt8779 == 5) {
		    Class446 class446_19_
			= Class453_Sub3.aClass309_Sub1_10316.method5482
			      (-1422002284).method14299(-336574498);
		    if (Float.isNaN(class446_19_.aFloat4895))
			return;
		    i_17_ = ((int) class446_19_.aFloat4895
			     - (-1227002079 * class600.anInt7858 << 9));
		    i_18_ = ((int) class446_19_.aFloat4897
			     - (1429253007 * class600.anInt7860 << 9));
		    if (i_17_ < 0 || i_18_ < 0
			|| (i_17_ >> 9
			    >= (class475.aByteArrayArrayArray5178
				[Class677.anInt8619 * -1335910809]).length)
			|| i_18_ >> 9 >= (class475.aByteArrayArrayArray5178
					  [-1335910809 * Class677.anInt8619]
					  [i_17_ >> 9]).length)
			return;
		} else if (-174799205 * Class700.anInt8779 == 1) {
		    i_17_ = (int) class446.aFloat4895;
		    i_18_ = (int) class446.aFloat4897;
		} else {
		    i_17_ = Class198_Sub3.anInt9911 * 1168779751;
		    i_18_ = Class648.anInt8363 * -253433363;
		}
		if (((class475.aByteArrayArrayArray5178
		      [-1335910809 * Class677.anInt8619][i_17_ >> 9]
		      [i_18_ >> 9])
		     & 0x4)
		    != 0)
		    Class410.method6665(class546.aClass547ArrayArrayArray7263,
					0, i_17_ >> 9, i_18_ >> 9, false,
					(byte) 24);
		else {
		    int i_20_;
		    int i_21_;
		    if (Class700.anInt8779 * -174799205 == 5) {
			Class446 class446_22_
			    = Class453_Sub3.aClass309_Sub1_10316.method5481
				  (-376212217).method6131(-1265309875);
			i_20_ = (((int) class446_22_.aFloat4895 >> 9)
				 - -1227002079 * class600.anInt7858);
			i_21_ = (((int) class446_22_.aFloat4897 >> 9)
				 - class600.anInt7860 * 1429253007);
			if (i_20_ < 0 || i_21_ < 0
			    || (i_20_
				>= (class475.aByteArrayArrayArray5178
				    [-1335910809 * Class677.anInt8619]).length)
			    || i_21_ >= (class475.aByteArrayArrayArray5178
					 [-1335910809 * Class677.anInt8619]
					 [i_20_]).length)
			    return;
		    } else {
			i_20_ = -469853907 * Class477.anInt5200 >> 9;
			i_21_ = -1889707729 * Class475.anInt5179 >> 9;
		    }
		    int i_23_ = i_17_ >> 9;
		    int i_24_ = i_18_ >> 9;
		    if (class475.method7763(i_20_, i_21_, 2109478040)) {
			int i_25_ = Class335.method5855((Class477.anInt5200
							 * -469853907),
							(-1889707729
							 * Class475.anInt5179),
							3, 2020563229);
			if (Class575.anInt7648 * -142598869 >= i_25_)
			    Class410.method6665
				(class546.aClass547ArrayArrayArray7263, 1,
				 i_20_, i_21_, false, (byte) -28);
		    } else {
		    while_24_:
			do {
			    if (1201172629 * Class689_Sub1.anInt11019 < 2560) {
				int i_26_;
				if (i_23_ > i_20_)
				    i_26_ = i_23_ - i_20_;
				else
				    i_26_ = i_20_ - i_23_;
				int i_27_;
				if (i_24_ > i_21_)
				    i_27_ = i_24_ - i_21_;
				else
				    i_27_ = i_21_ - i_24_;
				if (i_26_ == 0 && 0 == i_27_
				    || i_26_ <= -client.aClass507_11137
						     .method8412(254042302)
				    || i_26_ >= client.aClass507_11137
						    .method8412(982244004)
				    || i_27_ <= -client.aClass507_11137
						     .method8352((byte) -48)
				    || i_27_ >= client.aClass507_11137
						    .method8352((byte) -81)) {
				    if (Class700.anInt8779 * -174799205 != 5)
					Class525_Sub16_Sub13.method18448
					    (new StringBuilder().append
						 (i_20_).append
						 (Class55.aString560).append
						 (i_21_).append
						 (" ").append
						 (i_23_).append
						 (Class55.aString560).append
						 (i_24_).append
						 (" ").append
						 (-1227002079
						  * class600.anInt7858)
						 .append
						 (Class55.aString560).append
						 (1429253007
						  * class600.anInt7860)
						 .toString(),
					     new RuntimeException(),
					     (byte) 40);
				    break;
				}
				if (i_26_ > i_27_) {
				    int i_28_ = 65536 * i_27_ / i_26_;
				    int i_29_ = 32768;
				while_23_:
				    do {
					for (;;) {
					    if (i_23_ == i_20_)
						break while_23_;
					    if (i_20_ < i_23_)
						i_20_++;
					    else if (i_20_ > i_23_)
						i_20_--;
					    if (0
						!= ((class475
						     .aByteArrayArrayArray5178
						     [(Class677.anInt8619
						       * -1335910809)]
						     [i_20_][i_21_])
						    & 0x4)) {
						Class410.method6665
						    ((class546
						      .aClass547ArrayArrayArray7263),
						     1, i_20_, i_21_, false,
						     (byte) -3);
						break while_23_;
					    }
					    if ((i_21_ + 1
						 < (class475
						    .aByteArrayArrayArray5178
						    [(-1335910809
						      * Class677.anInt8619)]
						    [i_20_]).length)
						&& (0
						    != ((class475
							 .aByteArrayArrayArray5178
							 [(Class677.anInt8619
							   * -1335910809)]
							 [i_20_][i_21_ + 1])
							& 0x4))) {
						Class410.method6665
						    ((class546
						      .aClass547ArrayArrayArray7263),
						     1, i_20_, i_21_ + 1,
						     false, (byte) -87);
						break while_23_;
					    }
					    if (i_21_ > 0
						&& (0
						    != ((class475
							 .aByteArrayArrayArray5178
							 [(-1335910809
							   * (Class677
							      .anInt8619))]
							 [i_20_][i_21_ - 1])
							& 0x4))) {
						Class410.method6665
						    ((class546
						      .aClass547ArrayArrayArray7263),
						     1, i_20_, i_21_ - 1,
						     false, (byte) -13);
						break while_23_;
					    }
					    i_29_ += i_28_;
					    if (i_29_ >= 65536) {
						i_29_ -= 65536;
						if (i_21_ < i_24_) {
						    i_21_++;
						    if ((1 + i_21_
							 < (class475
							    .aByteArrayArrayArray5178
							    [(-1335910809
							      * (Class677
								 .anInt8619))]
							    [i_20_]).length)
							&& (0
							    != ((class475
								 .aByteArrayArrayArray5178
								 [((Class677
								    .anInt8619)
								   * -1335910809)]
								 [i_20_]
								 [1 + i_21_])
								& 0x4))) {
							Class410.method6665
							    ((class546
							      .aClass547ArrayArrayArray7263),
							     1, i_20_,
							     i_21_ + 1, false,
							     (byte) 57);
							break while_23_;
						    }
						} else if (i_21_ > i_24_
							   && --i_21_ > 0
							   && (0
							       != ((class475
								    .aByteArrayArrayArray5178
								    [(-1335910809
								      * (Class677
									 .anInt8619))]
								    [i_20_]
								    [(i_21_
								      - 1)])
								   & 0x4)))
						    break;
					    }
					}
					Class410.method6665
					    ((class546
					      .aClass547ArrayArrayArray7263),
					     1, i_20_, i_21_ - 1, false,
					     (byte) -27);
				    } while (false);
				} else {
				    int i_30_ = 65536 * i_26_ / i_27_;
				    int i_31_ = 32768;
				    for (;;) {
					if (i_24_ == i_21_)
					    break while_24_;
					if (i_21_ < i_24_)
					    i_21_++;
					else if (i_21_ > i_24_)
					    i_21_--;
					if (0 != ((class475
						   .aByteArrayArrayArray5178
						   [(-1335910809
						     * Class677.anInt8619)]
						   [i_20_][i_21_])
						  & 0x4)) {
					    Class410.method6665
						((class546
						  .aClass547ArrayArrayArray7263),
						 1, i_20_, i_21_, false,
						 (byte) 32);
					    break while_24_;
					}
					if ((1 + i_20_
					     < (class475
						.aByteArrayArrayArray5178
						[(-1335910809
						  * (Class677
						     .anInt8619))]).length)
					    && ((class475
						 .aByteArrayArrayArray5178
						 [(-1335910809
						   * Class677.anInt8619)]
						 [1 + i_20_][i_21_])
						& 0x4) != 0) {
					    Class410.method6665
						((class546
						  .aClass547ArrayArrayArray7263),
						 1, i_20_ + 1, i_21_, false,
						 (byte) -20);
					    break while_24_;
					}
					if (i_20_ > 0
					    && 0 != ((class475
						      .aByteArrayArrayArray5178
						      [(-1335910809
							* Class677.anInt8619)]
						      [i_20_ - 1][i_21_])
						     & 0x4)) {
					    Class410.method6665
						((class546
						  .aClass547ArrayArrayArray7263),
						 1, i_20_ - 1, i_21_, false,
						 (byte) 47);
					    break while_24_;
					}
					i_31_ += i_30_;
					if (i_31_ >= 65536) {
					    i_31_ -= 65536;
					    if (i_20_ < i_23_) {
						if ((++i_20_ + 1
						     < (class475
							.aByteArrayArrayArray5178
							[(-1335910809
							  * (Class677
							     .anInt8619))]).length)
						    && ((class475
							 .aByteArrayArrayArray5178
							 [(Class677.anInt8619
							   * -1335910809)]
							 [i_20_ + 1][i_21_])
							& 0x4) != 0) {
						    Class410.method6665
							((class546
							  .aClass547ArrayArrayArray7263),
							 1, 1 + i_20_, i_21_,
							 false, (byte) 48);
						    break while_24_;
						}
					    } else if (i_20_ > i_23_
						       && --i_20_ > 0
						       && (0
							   != ((class475
								.aByteArrayArrayArray5178
								[(-1335910809
								  * (Class677
								     .anInt8619))]
								[i_20_ - 1]
								[i_21_])
							       & 0x4)))
						break;
					}
				    }
				    Class410.method6665
					(class546.aClass547ArrayArrayArray7263,
					 1, i_20_ - 1, i_21_, false,
					 (byte) -39);
				}
			    }
			} while (false);
		    }
		}
	    } else {
		int i_32_
		    = Class335.method5855(-469853907 * Class477.anInt5200,
					  Class475.anInt5179 * -1889707729,
					  -1335910809 * Class677.anInt8619,
					  2020563229);
		if (i_32_ - -142598869 * Class575.anInt7648 < 3200
		    && ((class475.aByteArrayArrayArray5178
			 [-1335910809 * Class677.anInt8619]
			 [-469853907 * Class477.anInt5200 >> 9]
			 [-1889707729 * Class475.anInt5179 >> 9])
			& 0x4) != 0)
		    Class410.method6665(class546.aClass547ArrayArrayArray7263,
					1,
					-469853907 * Class477.anInt5200 >> 9,
					-1889707729 * Class475.anInt5179 >> 9,
					false, (byte) 16);
	    }
	}
    }
    
    static final void method9852(Class683 class683, byte i) {
	class683.anInt8644 -= -1723845246;
	String string
	    = ((String)
	       class683.anObjectArray8636[1373599041 * class683.anInt8644]);
	String string_33_ = (String) (class683.anObjectArray8636
				      [1 + 1373599041 * class683.anInt8644]);
	Class350_Sub3.method15914(string, string_33_, (byte) 0);
    }
    
    static int method9853(Iterable iterable, int i) {
	int i_34_ = -1;
	Iterator iterator = iterable.iterator();
	while (iterator.hasNext()) {
	    Interface76 interface76 = (Interface76) iterator.next();
	    if (interface76.method80() > i_34_)
		i_34_ = interface76.method80();
	}
	return (8 + i_34_) / 8;
    }
    
    static void method9854(int[] is, float[] fs, float[] fs_35_, int i,
			   int i_36_, byte i_37_) {
	if (i < i_36_) {
	    int i_38_ = (i_36_ + i) / 2;
	    int i_39_ = i;
	    int i_40_ = is[i_38_];
	    is[i_38_] = is[i_36_];
	    is[i_36_] = i_40_;
	    float f = fs[i_38_];
	    fs[i_38_] = fs[i_36_];
	    fs[i_36_] = f;
	    float f_41_ = fs_35_[i_38_];
	    fs_35_[i_38_] = fs_35_[i_36_];
	    fs_35_[i_36_] = f_41_;
	    int i_42_ = (long) i_40_ == 9223372036854775807L ? 0 : 1;
	    for (int i_43_ = i; i_43_ < i_36_; i_43_++) {
		if (is[i_43_] < (i_43_ & i_42_) + i_40_) {
		    int i_44_ = is[i_43_];
		    is[i_43_] = is[i_39_];
		    is[i_39_] = i_44_;
		    float f_45_ = fs[i_43_];
		    fs[i_43_] = fs[i_39_];
		    fs[i_39_] = f_45_;
		    float f_46_ = fs_35_[i_43_];
		    fs_35_[i_43_] = fs_35_[i_39_];
		    fs_35_[i_39_] = f_46_;
		    i_39_++;
		}
	    }
	    is[i_36_] = is[i_39_];
	    is[i_39_] = i_40_;
	    fs[i_36_] = fs[i_39_];
	    fs[i_39_] = f;
	    fs_35_[i_36_] = fs_35_[i_39_];
	    fs_35_[i_39_] = f_41_;
	    method9854(is, fs, fs_35_, i, i_39_ - 1, (byte) -40);
	    method9854(is, fs, fs_35_, i_39_ + 1, i_36_, (byte) -85);
	}
    }
}
