/* Class671 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class671 implements Interface76
{
    int anInt8589;
    public static Class671 aClass671_8590;
    public static Class671 aClass671_8591 = new Class671(0, "");
    
    public int method57() {
	return -413075093 * anInt8589;
    }
    
    public int method80() {
	return -413075093 * anInt8589;
    }
    
    static {
	aClass671_8590 = new Class671(1, "");
    }
    
    Class671(int i, String string) {
	anInt8589 = i * -925013181;
    }
    
    public int method75() {
	return -413075093 * anInt8589;
    }
    
    static void method11046(Class96 class96, byte i) {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4373, class96.aClass6_1169,
				1977859884);
	class96.method1794(class525_sub15, (short) 5835);
	client.aBool11376 = true;
    }
    
    static final void method11047(int i) {
	client.aBool11377 = false;
	if (3 != -1335910809 * Class677.anInt8619) {
	    Class446 class446
		= (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method10818()
		   .aClass446_4807);
	    Class475 class475 = client.aClass507_11137.method8360(1576776355);
	    if (Class700.anInt8779 * -174799205 == 1
		|| 5 == -174799205 * Class700.anInt8779
		|| Class198_Sub3.anInt9911 * 1168779751 != -1) {
		Class600 class600
		    = client.aClass507_11137.method8350(1457314747);
		int i_0_;
		int i_1_;
		if (5 == -174799205 * Class700.anInt8779) {
		    Class446 class446_2_
			= Class453_Sub3.aClass309_Sub1_10316.method5482
			      (2104950477).method14299(-1237259973);
		    if (Float.isNaN(class446_2_.aFloat4895))
			return;
		    i_0_ = ((int) class446_2_.aFloat4895
			    - (-1227002079 * class600.anInt7858 << 9));
		    i_1_ = ((int) class446_2_.aFloat4897
			    - (class600.anInt7860 * 1429253007 << 9));
		    if (i_0_ < 0 || i_1_ < 0
			|| (i_0_ >> 9
			    >= (class475.aByteArrayArrayArray5178
				[Class677.anInt8619 * -1335910809]).length)
			|| i_1_ >> 9 >= (class475.aByteArrayArrayArray5178
					 [Class677.anInt8619 * -1335910809]
					 [i_0_ >> 9]).length)
			return;
		} else if (Class700.anInt8779 * -174799205 == 1) {
		    i_0_ = (int) class446.aFloat4895;
		    i_1_ = (int) class446.aFloat4897;
		} else {
		    i_0_ = 1168779751 * Class198_Sub3.anInt9911;
		    i_1_ = Class648.anInt8363 * -253433363;
		}
		if (0 != ((class475.aByteArrayArrayArray5178
			   [Class677.anInt8619 * -1335910809][i_0_ >> 9]
			   [i_1_ >> 9])
			  & 0x4))
		    client.aBool11377 = true;
		else {
		    int i_3_;
		    int i_4_;
		    if (5 == Class700.anInt8779 * -174799205) {
			Class446 class446_5_
			    = Class453_Sub3.aClass309_Sub1_10316.method5481
				  (-717714817).method6131(-540323995);
			i_3_ = (((int) class446_5_.aFloat4895 >> 9)
				- -1227002079 * class600.anInt7858);
			i_4_ = (((int) class446_5_.aFloat4897 >> 9)
				- 1429253007 * class600.anInt7860);
			if (i_3_ < 0 || i_4_ < 0
			    || (i_3_
				>= (class475.aByteArrayArrayArray5178
				    [-1335910809 * Class677.anInt8619]).length)
			    || i_4_ >= (class475.aByteArrayArrayArray5178
					[Class677.anInt8619 * -1335910809]
					[i_3_]).length)
			    return;
		    } else {
			i_3_ = -469853907 * Class477.anInt5200 >> 9;
			i_4_ = Class475.anInt5179 * -1889707729 >> 9;
		    }
		    int i_6_ = i_0_ >> 9;
		    int i_7_ = i_1_ >> 9;
		    if (class475.method7763(i_3_, i_4_, 2068051696)) {
			int i_8_ = Class335.method5855((Class477.anInt5200
							* -469853907),
						       (Class475.anInt5179
							* -1889707729),
						       3, 2020563229);
			if (Class575.anInt7648 * -142598869 >= i_8_)
			    client.aBool11377 = true;
		    } else {
		    while_111_:
			do {
			    if (Class689_Sub1.anInt11019 * 1201172629 < 2560) {
				int i_9_;
				if (i_6_ > i_3_)
				    i_9_ = i_6_ - i_3_;
				else
				    i_9_ = i_3_ - i_6_;
				int i_10_;
				if (i_7_ > i_4_)
				    i_10_ = i_7_ - i_4_;
				else
				    i_10_ = i_4_ - i_7_;
				if (0 == i_9_ && i_10_ == 0
				    || i_9_ <= -client.aClass507_11137
						    .method8412(952008878)
				    || i_9_ >= client.aClass507_11137
						   .method8412(1385764220)
				    || i_10_ <= -client.aClass507_11137
						     .method8352((byte) -87)
				    || i_10_ >= client.aClass507_11137
						    .method8352((byte) -18)) {
				    if (5 != -174799205 * Class700.anInt8779)
					Class525_Sub16_Sub13.method18448
					    (new StringBuilder().append
						 (i_3_).append
						 (Class55.aString560).append
						 (i_4_).append
						 (" ").append
						 (i_6_).append
						 (Class55.aString560).append
						 (i_7_).append
						 (" ").append
						 (class600.anInt7858
						  * -1227002079)
						 .append
						 (Class55.aString560).append
						 (class600.anInt7860
						  * 1429253007)
						 .toString(),
					     new RuntimeException(),
					     (byte) 44);
				    break;
				}
				if (i_9_ > i_10_) {
				    int i_11_ = 65536 * i_10_ / i_9_;
				    int i_12_ = 32768;
				while_110_:
				    do {
					for (;;) {
					    if (i_3_ == i_6_)
						break while_110_;
					    if (i_3_ < i_6_)
						i_3_++;
					    else if (i_3_ > i_6_)
						i_3_--;
					    if (((class475
						  .aByteArrayArrayArray5178
						  [(Class677.anInt8619
						    * -1335910809)]
						  [i_3_][i_4_])
						 & 0x4)
						!= 0) {
						client.aBool11377 = true;
						return;
					    }
					    if ((i_4_ + 1
						 < (class475
						    .aByteArrayArrayArray5178
						    [(Class677.anInt8619
						      * -1335910809)]
						    [i_3_]).length)
						&& ((class475
						     .aByteArrayArrayArray5178
						     [(-1335910809
						       * Class677.anInt8619)]
						     [i_3_][1 + i_4_])
						    & 0x4) != 0) {
						client.aBool11377 = true;
						return;
					    }
					    if (i_4_ > 0
						&& ((class475
						     .aByteArrayArrayArray5178
						     [(-1335910809
						       * Class677.anInt8619)]
						     [i_3_][i_4_ - 1])
						    & 0x4) != 0) {
						client.aBool11377 = true;
						return;
					    }
					    i_12_ += i_11_;
					    if (i_12_ >= 65536) {
						i_12_ -= 65536;
						if (i_4_ < i_7_) {
						    if ((++i_4_ + 1
							 < (class475
							    .aByteArrayArrayArray5178
							    [((Class677
							       .anInt8619)
							      * -1335910809)]
							    [i_3_]).length)
							&& (0
							    != ((class475
								 .aByteArrayArrayArray5178
								 [((Class677
								    .anInt8619)
								   * -1335910809)]
								 [i_3_]
								 [1 + i_4_])
								& 0x4))) {
							client.aBool11377
							    = true;
							return;
						    }
						} else if (i_4_ > i_7_
							   && --i_4_ > 0
							   && ((class475
								.aByteArrayArrayArray5178
								[((Class677
								   .anInt8619)
								  * -1335910809)]
								[i_3_]
								[i_4_ - 1])
							       & 0x4) != 0)
						    break;
					    }
					}
					client.aBool11377 = true;
					return;
				    } while (false);
				} else {
				    int i_13_ = i_9_ * 65536 / i_10_;
				    int i_14_ = 32768;
				    for (;;) {
					if (i_7_ == i_4_)
					    break while_111_;
					if (i_4_ < i_7_)
					    i_4_++;
					else if (i_4_ > i_7_)
					    i_4_--;
					if (0 != ((class475
						   .aByteArrayArrayArray5178
						   [(-1335910809
						     * Class677.anInt8619)]
						   [i_3_][i_4_])
						  & 0x4)) {
					    client.aBool11377 = true;
					    return;
					}
					if ((1 + i_3_
					     < (class475
						.aByteArrayArrayArray5178
						[(-1335910809
						  * (Class677
						     .anInt8619))]).length)
					    && 0 != ((class475
						      .aByteArrayArrayArray5178
						      [(Class677.anInt8619
							* -1335910809)]
						      [1 + i_3_][i_4_])
						     & 0x4)) {
					    client.aBool11377 = true;
					    return;
					}
					if (i_3_ > 0
					    && ((class475
						 .aByteArrayArrayArray5178
						 [(Class677.anInt8619
						   * -1335910809)]
						 [i_3_ - 1][i_4_])
						& 0x4) != 0) {
					    client.aBool11377 = true;
					    return;
					}
					i_14_ += i_13_;
					if (i_14_ >= 65536) {
					    i_14_ -= 65536;
					    if (i_3_ < i_6_) {
						i_3_++;
						if ((1 + i_3_
						     < (class475
							.aByteArrayArrayArray5178
							[(-1335910809
							  * (Class677
							     .anInt8619))]).length)
						    && (0
							!= ((class475
							     .aByteArrayArrayArray5178
							     [(-1335910809
							       * (Class677
								  .anInt8619))]
							     [i_3_ + 1][i_4_])
							    & 0x4))) {
						    client.aBool11377 = true;
						    return;
						}
					    } else if (i_3_ > i_6_
						       && --i_3_ > 0
						       && ((class475
							    .aByteArrayArrayArray5178
							    [(-1335910809
							      * (Class677
								 .anInt8619))]
							    [i_3_ - 1][i_4_])
							   & 0x4) != 0)
						break;
					}
				    }
				    client.aBool11377 = true;
				    break;
				}
			    }
			} while (false);
		    }
		}
	    } else {
		int i_15_
		    = Class335.method5855(-469853907 * Class477.anInt5200,
					  Class475.anInt5179 * -1889707729,
					  -1335910809 * Class677.anInt8619,
					  2020563229);
		if (i_15_ - -142598869 * Class575.anInt7648 < 3200
		    && ((class475.aByteArrayArrayArray5178
			 [-1335910809 * Class677.anInt8619]
			 [Class477.anInt5200 * -469853907 >> 9]
			 [-1889707729 * Class475.anInt5179 >> 9])
			& 0x4) != 0)
		    client.aBool11377 = true;
	    }
	}
    }
}
