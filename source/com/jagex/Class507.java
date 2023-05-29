/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Class507
{
    Class499 aClass499_5611;
    int anInt5612;
    Class499 aClass499_5613;
    Class290 aClass290_5614;
    Class455_Sub1 aClass455_Sub1_5615;
    int anInt5616;
    Class600 aClass600_5617 = new Class600();
    Class600 aClass600_5618 = new Class600();
    int anInt5619;
    int anInt5620;
    int anInt5621;
    int anInt5622;
    Class546 aClass546_5623;
    Class635 aClass635_5624;
    Class475 aClass475_5625;
    int anInt5626;
    int anInt5627;
    public boolean aBool5628;
    Class529 aClass529_5629;
    Class518 aClass518_5630 = new Class518(0, 0, 0, 0);
    float aFloat5631;
    Class40_Sub11 aClass40_Sub11_5632;
    int[][] anIntArrayArray5633;
    int[][] anIntArrayArray5634;
    Class525_Sub16_Sub6 aClass525_Sub16_Sub6_5635;
    Class504 aClass504_5636;
    public long aLong5637;
    byte[][] aByteArrayArray5638;
    byte[][] aByteArrayArray5639;
    int anInt5640;
    int anInt5641;
    int anInt5642;
    int[] anIntArray5643;
    int[] anIntArray5644;
    byte[][] aByteArrayArray5645;
    byte[][] aByteArrayArray5646;
    public int anInt5647;
    byte[][] aByteArrayArray5648;
    HashMap aHashMap5649;
    int anInt5650;
    public long aLong5651;
    Class455_Sub1 aClass455_Sub1_5652;
    boolean aBool5653;
    int[][][] anIntArrayArrayArray5654;
    byte[][][] aByteArrayArrayArray5655;
    
    public Class529 method8345(int i) {
	return aClass529_5629;
    }
    
    public Class499 method8346(int i) {
	return aClass499_5611;
    }
    
    void method8347(Class290 class290) {
	if (aClass290_5614 != class290) {
	    anInt5621
		= (anInt5622 = class290.anInt3217 * 1615052713) * 1173691603;
	    anIntArrayArrayArray5654
		= (new int[4][anInt5621 * -1681803501 >> 3]
		   [-455149399 * anInt5622 >> 3]);
	    anIntArrayArray5633
		= new int[anInt5621 * -1681803501][-455149399 * anInt5622];
	    anIntArrayArray5634
		= new int[-1681803501 * anInt5621][anInt5622 * -455149399];
	    aByteArrayArrayArray5655
		= new byte[4][anInt5621 * -1681803501][-455149399 * anInt5622];
	    aClass475_5625 = new Class475(4, -1681803501 * anInt5621,
					  anInt5622 * -455149399);
	    method8371(false, (byte) -50);
	    Class643.method10600((byte) 90);
	    aClass290_5614 = class290;
	}
    }
    
    void method8348(int i, int i_0_) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public int method8349(int i) {
	return 100 - anInt5620 * -1319588796 / (294671849 * anInt5640);
    }
    
    public Class600 method8350(int i) {
	return aClass600_5617;
    }
    
    void method8351() {
	int i = aByteArrayArray5639.length;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    if (aByteArrayArray5639[i_1_] != null) {
		int i_2_ = -1;
		for (int i_3_ = 0; i_3_ < -196462909 * client.anInt11129;
		     i_3_++) {
		    if (anIntArray5643[i_1_] == client.anIntArray11141[i_3_]) {
			i_2_ = i_3_;
			break;
		    }
		}
		if (-1 == i_2_) {
		    client.anIntArray11141[client.anInt11129 * -196462909]
			= anIntArray5643[i_1_];
		    i_2_ = (client.anInt11129 += -170677781) * -196462909 - 1;
		}
		RSBuffer class525_sub38
		    = new RSBuffer(aByteArrayArray5639[i_1_]);
		int i_4_ = 0;
		while ((-1133521593 * class525_sub38.index
			< aByteArrayArray5639[i_1_].length)
		       && i_4_ < 511
		       && client.anInt11216 * 1111866889 < 1023) {
		    int i_5_ = i_2_ | i_4_++ << 6;
		    int i_6_ = class525_sub38.readUnsignedShort((byte) 60);
		    int i_7_ = i_6_ >> 14;
		    int i_8_ = i_6_ >> 7 & 0x3f;
		    int i_9_ = i_6_ & 0x3f;
		    int i_10_
			= (64 * (anIntArray5643[i_1_] >> 8)
			   - -1227002079 * aClass600_5617.anInt7858 + i_8_);
		    int i_11_
			= (64 * (anIntArray5643[i_1_] & 0xff)
			   - aClass600_5617.anInt7860 * 1429253007 + i_9_);
		    NPCDefinitions class299
			= (NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				      (class525_sub38.readUnsignedShort((byte) 38),
				       480535565));
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i_5_));
		    if (null == class525_sub19
			&& (class299.aByte3335 & 0x1) > 0 && i_10_ >= 0
			&& (i_10_ + class299.anInt3291 * 1035256919
			    < anInt5621 * -1681803501)
			&& i_11_ >= 0
			&& (i_11_ + 1035256919 * class299.anInt3291
			    < anInt5622 * -455149399)) {
			Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			    = new Class656_Sub1_Sub3_Sub1_Sub2(aClass546_5623);
			class656_sub1_sub3_sub1_sub2.anInt11964
			    = -447377367 * i_5_;
			Class525_Sub19 class525_sub19_12_
			    = new Class525_Sub19(class656_sub1_sub3_sub1_sub2);
			client.aClass10_11121.method695(class525_sub19_12_,
							(long) i_5_);
			client.aClass525_Sub19Array11122[((client.anInt11276
							   += 2042937351)
							  * 1530572215) - 1]
			    = class525_sub19_12_;
			client.anIntArray11125[((client.anInt11216
						 += -639684551) * 1111866889
						- 1)]
			    = i_5_;
			class656_sub1_sub3_sub1_sub2.anInt12006
			    = client.anInt11083 * 473756327;
			class656_sub1_sub3_sub1_sub2.method18942(class299,
								 1419241144);
			class656_sub1_sub3_sub1_sub2.method18607
			    (1035256919 * (class656_sub1_sub3_sub1_sub2
					   .aClass299_12255.anInt3291),
			     133251852);
			class656_sub1_sub3_sub1_sub2.anInt12003
			    = (-1104516755
			       * (-412681569 * (class656_sub1_sub3_sub1_sub2
						.aClass299_12255.anInt3322)
				  << 3));
			class656_sub1_sub3_sub1_sub2.method18597
			    (class656_sub1_sub3_sub1_sub2.aClass299_12255
				 .aClass682_3284.method11222
				 (1550710614).method80() << 11 & 0x3fff,
			     true, (byte) 1);
			class656_sub1_sub3_sub1_sub2.method18945
			    (i_7_, i_10_, i_11_, true,
			     class656_sub1_sub3_sub1_sub2
				 .method18608((byte) 57),
			     -941756193);
		    }
		}
	    }
	}
    }
    
    public int method8352(byte i) {
	return -455149399 * anInt5622;
    }
    
    public void method8353(Class514 class514) {
	aClass499_5611 = class514.aClass499_5694;
	if (aClass499_5611 == Class499.aClass499_5550)
	    method8377(1153904220);
	else if (Class499.aClass499_5548 == aClass499_5611)
	    method8378(class514.aClass525_Sub38_Sub2_5695, 129773896);
	else if (aClass499_5611 == Class499.aClass499_5551)
	    method8380(2008282593);
	else if (aClass499_5611.method8164((short) 6968))
	    method8379(class514.aClass525_Sub38_Sub2_5695, (byte) 64);
    }
    
    public Class518 method8354(byte i) {
	return aClass518_5630;
    }
    
    public float method8355(int i) {
	return aFloat5631;
    }
    
    public int method8356(short i) {
	return -1219510345 * anInt5626;
    }
    
    public int method8357(int i) {
	return anInt5627 * -1686467073;
    }
    
    public Class546 method8358(byte i) {
	return aClass546_5623;
    }
    
    public Class455_Sub1 method8359(int i) {
	return aClass455_Sub1_5652;
    }
    
    public Class475 method8360(int i) {
	return aClass475_5625;
    }
    
    public Class635 method8361(byte i) {
	return aClass635_5624;
    }
    
    public Class40_Sub11 method8362(byte i) {
	return aClass40_Sub11_5632;
    }
    
    public int[][] method8363(int i) {
	return anIntArrayArray5633;
    }
    
    public int[][] method8364(int i) {
	return anIntArrayArray5634;
    }
    
    public void method8365() {
	aClass600_5617 = new Class600();
	anInt5650 = 0;
	anInt5619 = 0;
    }
    
    public int method8366() {
	return 100 - anInt5616 * 788172140 / (anInt5612 * -1427415721);
    }
    
    public float method8367() {
	return aFloat5631;
    }
    
    void method8368(Class455_Sub1 class455_sub1, byte[][] is) {
	int i = is.length;
	for (int i_13_ = 0; i_13_ < i; i_13_++) {
	    byte[] is_14_ = is[i_13_];
	    if (null != is_14_) {
		RSBuffer class525_sub38 = new RSBuffer(is_14_);
		int i_15_ = anIntArray5643[i_13_] >> 8;
		int i_16_ = anIntArray5643[i_13_] & 0xff;
		int i_17_
		    = i_15_ * 64 - -1227002079 * aClass600_5617.anInt7858;
		int i_18_ = i_16_ * 64 - aClass600_5617.anInt7860 * 1429253007;
		if (!aBool5653 && Class40_Sub20.aClass217_11050 != null)
		    Class40_Sub20.aClass217_11050.method4028(1829472846);
		class455_sub1.method7434(class525_sub38, i_17_, i_18_,
					 (-1227002079
					  * aClass600_5617.anInt7858),
					 1429253007 * aClass600_5617.anInt7860,
					 1638233477);
		class455_sub1.method15961(Class501.aClass182_5564,
					  class525_sub38, i_17_, i_18_,
					  (byte) -68);
	    }
	}
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    int i_20_ = ((anIntArray5643[i_19_] >> 8) * 64
			 - aClass600_5617.anInt7858 * -1227002079);
	    int i_21_ = ((anIntArray5643[i_19_] & 0xff) * 64
			 - aClass600_5617.anInt7860 * 1429253007);
	    byte[] is_22_ = is[i_19_];
	    if (is_22_ == null && -1479322619 * anInt5650 < 800) {
		if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
		    Class40_Sub20.aClass217_11050.method4028(1721995394);
		class455_sub1.method7377(i_20_, i_21_, 64, 64, -1478212136);
	    }
	}
    }
    
    public Class507(boolean bool) {
	anInt5616 = 0;
	anInt5612 = -855318937;
	anInt5620 = 0;
	anInt5640 = -286141863;
	anInt5642 = 0;
	aBool5628 = false;
	aLong5637 = 5709647995284375069L;
	aHashMap5649 = new HashMap();
	aBool5653 = bool;
    }
    
    public void method8369(int i) {
	if (aClass546_5623 != null) {
	    Class476.method7779((byte) 4);
	    aHashMap5649 = aClass546_5623.method9047(2123446209);
	    aClass546_5623.aClass557_7207.method9356(-2036629733);
	    aClass546_5623 = null;
	}
    }
    
    public void method8370(int i) {
	aClass504_5636 = Class504.aClass504_5601;
	anInt5616 = 0;
	anInt5612 = -855318937;
	anInt5620 = 0;
	anInt5640 = -286141863;
	anInt5641 = 0;
    }
    
    public void method8371(boolean bool, byte i) {
	Class645 class645 = null;
	if (null != aClass635_5624 && bool)
	    class645 = aClass635_5624.method10385(1483264608);
	aClass635_5624
	    = new Class635(Class501.aClass182_5564, Class462.idx_8,
			   -1681803501 * anInt5621 >> 3,
			   anInt5622 * -455149399 >> 3);
	if (null != class645)
	    aClass635_5624.method10384(this, class645, 0, (short) 255);
    }
    
    public void method8372(int i) {
	aClass635_5624.method10384(this, null, 0, (short) 255);
    }
    
    public float method8373() {
	return aFloat5631;
    }
    
    void method8374(Class507 class507_23_, int i) {
	boolean bool = class507_23_.aBool5653;
	class507_23_.aBool5653 = aBool5653;
	aBool5653 = bool;
	Class499 class499 = class507_23_.aClass499_5613;
	class507_23_.aClass499_5613 = aClass499_5613;
	aClass499_5613 = class499;
	class507_23_.aClass600_5618 = aClass600_5617;
	aClass600_5618 = class507_23_.aClass600_5617;
	aClass635_5624.method10400(class507_23_.method8361((byte) 23),
				   1708498274);
    }
    
    public void method8375(byte i) {
	if (aBool5653) {
	    method8370(-2053268822);
	    aLong5637 = 5709647995284375069L;
	    Class507 class507_24_ = client.aClass507_11137;
	    anInt5642 = class507_24_.anInt5642 * 1;
	    anIntArray5643 = class507_24_.anIntArray5643;
	    anIntArray5644 = class507_24_.anIntArray5644;
	    aByteArrayArray5645 = class507_24_.aByteArrayArray5645;
	    aByteArrayArray5646 = class507_24_.aByteArrayArray5646;
	    aByteArrayArray5639 = class507_24_.aByteArrayArray5639;
	    aByteArrayArray5648 = class507_24_.aByteArrayArray5648;
	    aByteArrayArray5638 = class507_24_.aByteArrayArray5638;
	    aClass475_5625 = class507_24_.aClass475_5625;
	    aClass635_5624 = class507_24_.aClass635_5624;
	    anIntArrayArrayArray5654 = class507_24_.anIntArrayArrayArray5654;
	    anInt5626 = class507_24_.anInt5626 * 1;
	    anInt5627 = class507_24_.anInt5627 * 1;
	    aClass525_Sub16_Sub6_5635 = class507_24_.aClass525_Sub16_Sub6_5635;
	    aClass529_5629 = class507_24_.aClass529_5629;
	    anIntArrayArray5633 = class507_24_.anIntArrayArray5633;
	    anIntArrayArray5634 = class507_24_.anIntArrayArray5634;
	    aByteArrayArrayArray5655 = class507_24_.aByteArrayArrayArray5655;
	    aClass499_5611 = class507_24_.aClass499_5611;
	    aClass290_5614 = class507_24_.aClass290_5614;
	    aClass600_5617 = class507_24_.aClass600_5617;
	    aClass600_5618 = class507_24_.aClass600_5618;
	    anInt5619 = 1 * class507_24_.anInt5619;
	    anInt5650 = class507_24_.anInt5650 * 1;
	    anInt5621 = 1 * class507_24_.anInt5621;
	    anInt5622 = 1 * class507_24_.anInt5622;
	} else if (1777895575 * client.anInt11075 == 1)
	    Class441.method7119(13, -1856567383);
	else if (client.anInt11075 * 1777895575 == 16)
	    Class441.method7119(18, 1590691583);
	else if (17 == client.anInt11075 * 1777895575)
	    Class441.method7119(15, -54105646);
	else if (1777895575 * client.anInt11075 == 7)
	    Class441.method7119(4, 743458063);
	else if (client.anInt11075 * 1777895575 == 9)
	    Class441.method7119(2, -203075362);
    }
    
    public void method8376(Class514 class514, int i) {
	aClass499_5611 = class514.aClass499_5694;
	if (aClass499_5611 == Class499.aClass499_5550)
	    method8377(1168219054);
	else if (Class499.aClass499_5548 == aClass499_5611)
	    method8378(class514.aClass525_Sub38_Sub2_5695, 39579045);
	else if (aClass499_5611 == Class499.aClass499_5551)
	    method8380(2008282593);
	else if (aClass499_5611.method8164((short) 4226))
	    method8379(class514.aClass525_Sub38_Sub2_5695, (byte) 39);
    }
    
    void method8377(int i) {
	method8382(Class683.method11230(Class198_Sub13.aClass525_Sub30_9973
					    .aClass696_Sub26_10682
					    .method17219((byte) -4),
					600669539),
		   -801053745);
	int i_25_ = aClass600_5617.anInt7858 * -1227002079;
	int i_26_ = 1429253007 * aClass600_5617.anInt7860;
	int i_27_ = (i_25_ >> 3) + (-469853907 * Class477.anInt5200 >> 12);
	int i_28_ = (i_26_ >> 3) + (Class475.anInt5179 * -1889707729 >> 12);
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867 = (byte) 0;
	Class677.anInt8619 = 0;
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method18910(8, 8,
								-2047442032);
	int i_29_ = 18;
	anIntArray5643 = new int[i_29_];
	anIntArray5644 = new int[i_29_];
	aByteArrayArray5645 = new byte[i_29_][];
	aByteArrayArray5646 = new byte[i_29_][];
	aByteArrayArray5639 = new byte[i_29_][];
	aByteArrayArray5648 = new byte[i_29_][];
	aByteArrayArray5638 = new byte[i_29_][];
	i_29_ = 0;
	for (int i_30_ = (i_27_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_30_ <= (i_27_ + (-1681803501 * anInt5621 >> 4)) / 8; i_30_++) {
	    for (int i_31_ = (i_28_ - (-455149399 * anInt5622 >> 4)) / 8;
		 i_31_ <= (i_28_ + (anInt5622 * -455149399 >> 4)) / 8;
		 i_31_++) {
		int i_32_ = (i_30_ << 8) + i_31_;
		if (Class322.idx_5.method7536
		    (method8469(i_30_, i_31_, (byte) 107),
		     -492920259 * Class474.aClass474_5162.anInt5171,
		     -1389535014)) {
		    anIntArray5643[i_29_] = i_32_;
		    anIntArray5644[i_29_]
			= method8469(i_30_, i_31_, (byte) 114);
		    i_29_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_29_;
	int i_33_;
	if (1777895575 * client.anInt11075 == 1)
	    i_33_ = 13;
	else if (client.anInt11075 * 1777895575 == 17)
	    i_33_ = 15;
	else if (16 == 1777895575 * client.anInt11075)
	    i_33_ = 18;
	else if (9 == 1777895575 * client.anInt11075)
	    i_33_ = 2;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1777895575 * client.anInt11075)
					   .toString());
	method8384(i_27_, i_28_, i_33_, false, (byte) 56);
    }
    
    void method8378(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	boolean bool = class525_sub38_sub2.method16660(693861596) == 1;
	int i_34_ = class525_sub38_sub2.method16668((byte) -11);
	int i_35_ = class525_sub38_sub2.readUnsignedByte(962551506);
	int i_36_ = class525_sub38_sub2.method16607(-1571461918);
	anInt5647 = class525_sub38_sub2.method16660(953733340) * 667477991;
	int i_37_ = class525_sub38_sub2.method16668((byte) 21);
	if (!aBool5653)
	    method8383((byte) 16);
	method8382(Class683.method11230(i_36_, 600669539), -248042630);
	anIntArray5643 = new int[i_35_];
	anIntArray5644 = new int[i_35_];
	aByteArrayArray5645 = new byte[i_35_][];
	aByteArrayArray5646 = new byte[i_35_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_35_][];
	aByteArrayArray5638 = new byte[i_35_][];
	i_35_ = 0;
	for (int i_38_ = (i_37_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_38_ <= (i_37_ + (anInt5621 * -1681803501 >> 4)) / 8; i_38_++) {
	    for (int i_39_ = (i_34_ - (anInt5622 * -455149399 >> 4)) / 8;
		 i_39_ <= ((anInt5622 * -455149399 >> 4) + i_34_) / 8;
		 i_39_++) {
		if (Class322.idx_5.method7536
		    (method8469(i_38_, i_39_, (byte) 22),
		     Class474.aClass474_5162.anInt5171 * -492920259,
		     1501451727)) {
		    anIntArray5643[i_35_] = (i_38_ << 8) + i_39_;
		    anIntArray5644[i_35_]
			= method8469(i_38_, i_39_, (byte) 92);
		    i_35_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_35_;
	method8384(i_37_, i_34_, 4, bool, (byte) -64);
    }
    
    void method8379(Class525_Sub38_Sub2 class525_sub38_sub2, byte i) {
	int i_40_ = class525_sub38_sub2.readUnsignedByte(1585881370);
	boolean bool = (i_40_ & 0x1) != 0;
	anInt5647 = class525_sub38_sub2.method16607(-1571461918) * 667477991;
	int i_41_ = class525_sub38_sub2.method16624(1262624431);
	if (i_41_ == 1)
	    aClass499_5611 = Class499.aClass499_5556;
	else if (2 == i_41_)
	    aClass499_5611 = Class499.aClass499_5547;
	else if (i_41_ == 3)
	    aClass499_5611 = Class499.aClass499_5552;
	else if (i_41_ == 4)
	    aClass499_5611 = Class499.aClass499_5553;
	int i_42_ = class525_sub38_sub2.method16624(-1608676588);
	int i_43_ = class525_sub38_sub2.method16667(2146911963);
	int i_44_ = class525_sub38_sub2.method16680(-1225482746);
	if (!aBool5653)
	    method8383((byte) 16);
	method8382(Class683.method11230(i_42_, 600669539), -636881445);
	class525_sub38_sub2.method18495(556996363);
	HashSet hashset = new HashSet();
	for (int i_45_ = 0; i_45_ < 4; i_45_++) {
	    for (int i_46_ = 0; i_46_ < anInt5621 * -1681803501 >> 3;
		 i_46_++) {
		for (int i_47_ = 0; i_47_ < -455149399 * anInt5622 >> 3;
		     i_47_++) {
		    int i_48_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (1 == i_48_) {
			int i_49_
			    = class525_sub38_sub2.method18496(26, 578733530);
			anIntArrayArrayArray5654[i_45_][i_46_][i_47_] = i_49_;
			int i_50_ = i_49_ >> 14 & 0x3ff;
			int i_51_ = i_49_ >> 3 & 0x7ff;
			int i_52_ = i_50_ >> 3 << 8 | i_51_ >> 3;
			hashset.add(Integer.valueOf(i_52_));
		    } else
			anIntArrayArrayArray5654[i_45_][i_46_][i_47_] = -1;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	int i_53_ = hashset.size();
	anIntArray5643 = new int[i_53_];
	anIntArray5644 = new int[i_53_];
	aByteArrayArray5645 = new byte[i_53_][];
	aByteArrayArray5646 = new byte[i_53_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_53_][];
	aByteArrayArray5638 = new byte[i_53_][];
	i_53_ = 0;
	for (int i_54_ = 0; i_54_ < 4; i_54_++) {
	    for (int i_55_ = 0; i_55_ < anInt5621 * -1681803501 >> 3;
		 i_55_++) {
		for (int i_56_ = 0; i_56_ < -455149399 * anInt5622 >> 3;
		     i_56_++) {
		    int i_57_ = anIntArrayArrayArray5654[i_54_][i_55_][i_56_];
		    if (-1 != i_57_) {
			int i_58_ = i_57_ >> 14 & 0x3ff;
			int i_59_ = i_57_ >> 3 & 0x7ff;
			int i_60_ = i_59_ / 8 + (i_58_ / 8 << 8);
			for (int i_61_ = 0; i_61_ < i_53_; i_61_++) {
			    if (i_60_ == anIntArray5643[i_61_]) {
				i_60_ = -1;
				break;
			    }
			}
			if (-1 != i_60_) {
			    int i_62_ = i_60_ >> 8 & 0xff;
			    int i_63_ = i_60_ & 0xff;
			    if (Class322.idx_5.method7536
				(method8469(i_62_, i_63_, (byte) 124),
				 (Class474.aClass474_5162.anInt5171
				  * -492920259),
				 -1299529218)) {
				anIntArray5643[i_53_] = i_60_;
				anIntArray5644[i_53_]
				    = method8469(i_62_, i_63_, (byte) 84);
				i_53_++;
			    }
			}
		    }
		}
	    }
	}
	anInt5642 = 1314030251 * i_53_;
	method8384(i_43_, i_44_, 4, bool, (byte) 88);
    }
    
    void method8380(int i) {
	aClass499_5613 = aClass499_5611;
	method8382(Class290.aClass290_3216, -1226392790);
	for (int i_64_ = 0; i_64_ < 4; i_64_++) {
	    for (int i_65_ = 0; i_65_ < anInt5621 * -1681803501 >> 3;
		 i_65_++) {
		for (int i_66_ = 0; i_66_ < -455149399 * anInt5622 >> 3;
		     i_66_++)
		    anIntArrayArrayArray5654[i_64_][i_65_][i_66_] = -1;
	    }
	}
	for (Class525_Sub24 class525_sub24
		 = ((Class525_Sub24)
		    Class201.aClass709_2201.method14372((short) -30344));
	     class525_sub24 != null;
	     class525_sub24 = (Class525_Sub24) Class201.aClass709_2201
						   .method14353(-2048135192)) {
	    int i_67_ = -95445911 * class525_sub24.anInt10587;
	    boolean bool = (i_67_ & 0x1) == 1;
	    int i_68_ = 668274669 * class525_sub24.anInt10592 >> 3;
	    int i_69_ = class525_sub24.anInt10589 * 990078991 >> 3;
	    int i_70_ = 1487182975 * class525_sub24.anInt10591;
	    int i_71_ = 1518229733 * class525_sub24.anInt10588;
	    int i_72_ = class525_sub24.anInt10594 * 1604978711;
	    int i_73_ = class525_sub24.anInt10590 * -1077894905;
	    int i_74_ = class525_sub24.anInt10593 * 375169847;
	    int i_75_ = class525_sub24.anInt10596 * 766151047;
	    int i_76_ = 0;
	    int i_77_ = 0;
	    int i_78_ = 1;
	    int i_79_ = 1;
	    if (1 == i_67_) {
		i_77_ = i_74_ - 1;
		i_78_ = -1;
	    } else if (2 == i_67_) {
		i_77_ = i_74_ - 1;
		i_76_ = i_75_ - 1;
		i_78_ = -1;
		i_79_ = -1;
	    } else if (i_67_ == 3) {
		i_76_ = i_75_ - 1;
		i_78_ = 1;
		i_79_ = -1;
	    }
	    int i_80_ = i_69_;
	    while (i_80_ < i_75_ + i_69_) {
		int i_81_ = i_77_;
		int i_82_ = i_68_;
		while (i_82_ < i_74_ + i_68_) {
		    if (bool)
			anIntArrayArrayArray5654[i_73_][i_76_ + i_70_]
			    [i_71_ + i_81_]
			    = (i_67_ << 1) + ((i_80_ << 3)
					      + ((i_72_ << 24)
						 + (i_82_ << 14)));
		    else
			anIntArrayArrayArray5654[i_73_][i_70_ + i_81_]
			    [i_71_ + i_76_]
			    = (i_67_ << 1) + ((i_82_ << 14) + (i_72_ << 24)
					      + (i_80_ << 3));
		    i_82_++;
		    i_81_ += i_78_;
		}
		i_80_++;
		i_76_ += i_79_;
	    }
	}
	int i_83_ = client.anInt11326 * 1320403841;
	anIntArray5643 = new int[i_83_];
	anIntArray5644 = new int[i_83_];
	aByteArrayArray5645 = new byte[i_83_][];
	aByteArrayArray5646 = new byte[i_83_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_83_][];
	aByteArrayArray5638 = new byte[i_83_][];
	i_83_ = 0;
	for (Class525_Sub24 class525_sub24
		 = ((Class525_Sub24)
		    Class201.aClass709_2201.method14372((short) -13478));
	     class525_sub24 != null;
	     class525_sub24 = (Class525_Sub24) Class201.aClass709_2201
						   .method14353(-2054502598)) {
	    int i_84_ = 668274669 * class525_sub24.anInt10592 >>> 3;
	    int i_85_ = class525_sub24.anInt10589 * 990078991 >>> 3;
	    int i_86_ = 375169847 * class525_sub24.anInt10593 + i_84_;
	    if (0 == (i_86_ & 0x7))
		i_86_--;
	    i_86_ >>>= 3;
	    int i_87_ = i_85_ + 766151047 * class525_sub24.anInt10596;
	    if ((i_87_ & 0x7) == 0)
		i_87_--;
	    i_87_ >>>= 3;
	    for (int i_88_ = i_84_ >>> 3; i_88_ <= i_86_; i_88_++) {
	    while_16_:
		for (int i_89_ = i_85_ >>> 3; i_89_ <= i_87_; i_89_++) {
		    int i_90_ = i_88_ << 8 | i_89_;
		    for (int i_91_ = 0; i_91_ < i_83_; i_91_++) {
			if (i_90_ == anIntArray5643[i_91_])
			    continue while_16_;
		    }
		    if (Class322.idx_5.method7536
			(method8469(i_88_, i_89_, (byte) 73),
			 -492920259 * Class474.aClass474_5162.anInt5171,
			 -1230990599)) {
			anIntArray5643[i_83_] = i_90_;
			anIntArray5644[i_83_]
			    = method8469(i_88_, i_89_, (byte) 114);
			i_83_++;
		    }
		}
	    }
	}
	anInt5642 = 1314030251 * i_83_;
	method8384(-1681803501 * anInt5621 >> 4, -455149399 * anInt5622 >> 4,
		   4, false, (byte) 47);
    }
    
    void method8381() {
	aClass499_5613 = aClass499_5611;
	method8382(Class290.aClass290_3216, -1108125315);
	for (int i = 0; i < 4; i++) {
	    for (int i_92_ = 0; i_92_ < anInt5621 * -1681803501 >> 3;
		 i_92_++) {
		for (int i_93_ = 0; i_93_ < -455149399 * anInt5622 >> 3;
		     i_93_++)
		    anIntArrayArrayArray5654[i][i_92_][i_93_] = -1;
	    }
	}
	for (Class525_Sub24 class525_sub24
		 = ((Class525_Sub24)
		    Class201.aClass709_2201.method14372((short) -5667));
	     class525_sub24 != null;
	     class525_sub24 = (Class525_Sub24) Class201.aClass709_2201
						   .method14353(-1718767573)) {
	    int i = -95445911 * class525_sub24.anInt10587;
	    boolean bool = (i & 0x1) == 1;
	    int i_94_ = 668274669 * class525_sub24.anInt10592 >> 3;
	    int i_95_ = class525_sub24.anInt10589 * 990078991 >> 3;
	    int i_96_ = 1487182975 * class525_sub24.anInt10591;
	    int i_97_ = 1518229733 * class525_sub24.anInt10588;
	    int i_98_ = class525_sub24.anInt10594 * 1604978711;
	    int i_99_ = class525_sub24.anInt10590 * -1077894905;
	    int i_100_ = class525_sub24.anInt10593 * 375169847;
	    int i_101_ = class525_sub24.anInt10596 * 766151047;
	    int i_102_ = 0;
	    int i_103_ = 0;
	    int i_104_ = 1;
	    int i_105_ = 1;
	    if (1 == i) {
		i_103_ = i_100_ - 1;
		i_104_ = -1;
	    } else if (2 == i) {
		i_103_ = i_100_ - 1;
		i_102_ = i_101_ - 1;
		i_104_ = -1;
		i_105_ = -1;
	    } else if (i == 3) {
		i_102_ = i_101_ - 1;
		i_104_ = 1;
		i_105_ = -1;
	    }
	    int i_106_ = i_95_;
	    while (i_106_ < i_101_ + i_95_) {
		int i_107_ = i_103_;
		int i_108_ = i_94_;
		while (i_108_ < i_100_ + i_94_) {
		    if (bool)
			anIntArrayArrayArray5654[i_99_][i_102_ + i_96_]
			    [i_97_ + i_107_]
			    = (i << 1) + ((i_106_ << 3)
					  + ((i_98_ << 24) + (i_108_ << 14)));
		    else
			anIntArrayArrayArray5654[i_99_][i_96_ + i_107_]
			    [i_97_ + i_102_]
			    = (i << 1) + ((i_108_ << 14) + (i_98_ << 24)
					  + (i_106_ << 3));
		    i_108_++;
		    i_107_ += i_104_;
		}
		i_106_++;
		i_102_ += i_105_;
	    }
	}
	int i = client.anInt11326 * 1320403841;
	anIntArray5643 = new int[i];
	anIntArray5644 = new int[i];
	aByteArrayArray5645 = new byte[i][];
	aByteArrayArray5646 = new byte[i][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i][];
	aByteArrayArray5638 = new byte[i][];
	i = 0;
	for (Class525_Sub24 class525_sub24
		 = ((Class525_Sub24)
		    Class201.aClass709_2201.method14372((short) -6742));
	     class525_sub24 != null;
	     class525_sub24 = (Class525_Sub24) Class201.aClass709_2201
						   .method14353(-1180119189)) {
	    int i_109_ = 668274669 * class525_sub24.anInt10592 >>> 3;
	    int i_110_ = class525_sub24.anInt10589 * 990078991 >>> 3;
	    int i_111_ = 375169847 * class525_sub24.anInt10593 + i_109_;
	    if (0 == (i_111_ & 0x7))
		i_111_--;
	    i_111_ >>>= 3;
	    int i_112_ = i_110_ + 766151047 * class525_sub24.anInt10596;
	    if ((i_112_ & 0x7) == 0)
		i_112_--;
	    i_112_ >>>= 3;
	    for (int i_113_ = i_109_ >>> 3; i_113_ <= i_111_; i_113_++) {
	    while_18_:
		for (int i_114_ = i_110_ >>> 3; i_114_ <= i_112_; i_114_++) {
		    int i_115_ = i_113_ << 8 | i_114_;
		    for (int i_116_ = 0; i_116_ < i; i_116_++) {
			if (i_115_ == anIntArray5643[i_116_])
			    continue while_18_;
		    }
		    if (Class322.idx_5.method7536
			(method8469(i_113_, i_114_, (byte) 127),
			 -492920259 * Class474.aClass474_5162.anInt5171,
			 1678794696)) {
			anIntArray5643[i] = i_115_;
			anIntArray5644[i]
			    = method8469(i_113_, i_114_, (byte) 123);
			i++;
		    }
		}
	    }
	}
	anInt5642 = 1314030251 * i;
	method8384(-1681803501 * anInt5621 >> 4, -455149399 * anInt5622 >> 4,
		   4, false, (byte) -96);
    }
    
    void method8382(Class290 class290, int i) {
	if (aClass290_5614 != class290) {
	    anInt5621
		= (anInt5622 = class290.anInt3217 * 1615052713) * 1173691603;
	    anIntArrayArrayArray5654
		= (new int[4][anInt5621 * -1681803501 >> 3]
		   [-455149399 * anInt5622 >> 3]);
	    anIntArrayArray5633
		= new int[anInt5621 * -1681803501][-455149399 * anInt5622];
	    anIntArrayArray5634
		= new int[-1681803501 * anInt5621][anInt5622 * -455149399];
	    aByteArrayArrayArray5655
		= new byte[4][anInt5621 * -1681803501][-455149399 * anInt5622];
	    aClass475_5625 = new Class475(4, -1681803501 * anInt5621,
					  anInt5622 * -455149399);
	    method8371(false, (byte) -48);
	    Class643.method10600((byte) 115);
	    aClass290_5614 = class290;
	}
    }
    
    void method8383(byte i) {
	if (Class499.aClass499_5551 != aClass499_5611
	    && Class499.aClass499_5551 != aClass499_5613) {
	    if (Class499.aClass499_5556 == aClass499_5611
		|| Class499.aClass499_5552 == aClass499_5611
		|| (aClass499_5611 != aClass499_5613
		    && (Class499.aClass499_5548 == aClass499_5611
			|| aClass499_5613 == Class499.aClass499_5548))) {
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    Class222.method4240(((Class656_Sub1_Sub3_Sub1_Sub2)
					 class525_sub19.anObject10571),
					65280);
		}
		client.anInt11216 = 0;
		client.anInt11276 = 0;
		client.aClass10_11121.method688((short) -18521);
	    }
	    aClass499_5613 = aClass499_5611;
	}
    }
    
    void method8384(int i, int i_117_, int i_118_, boolean bool, byte i_119_) {
	if (3 == client.anInt11145 * 1874190559) {
	    if (aBool5653)
		throw new IllegalStateException();
	    client.anInt11145 = -356132065;
	    client.anInt11280 = 1550521413;
	}
	if (bool || anInt5619 * -195931011 != i
	    || i_117_ != anInt5650 * -1479322619) {
	    anInt5619 = -1290746667 * i;
	    anInt5650 = i_117_ * 345266381;
	    if (!aBool5653) {
		Class441.method7119(i_118_, 579815622);
		Class666.method11016
		    (Class53.aClass53_475.method1169(Class21.aClass666_213,
						     1552651121),
		     true, Class501.aClass182_5564, Class29.aClass175_293,
		     Class500.aClass7_5560, -153086001);
	    }
	    if (null != aClass600_5617)
		aClass600_5618 = aClass600_5617;
	    else
		aClass600_5618 = new Class600(0, 0, 0);
	    aClass600_5617
		= new Class600(0,
			       (-195931011 * anInt5619
				- (anInt5621 * -1681803501 >> 4)) * 8,
			       (anInt5650 * -1479322619
				- (anInt5622 * -455149399 >> 4)) * 8);
	    aClass525_Sub16_Sub6_5635
		= Class556.method9249((anInt5621 * -1681803501 / 2
				       + (-1227002079
					  * aClass600_5617.anInt7858)),
				      (-1681803501 * anInt5621 / 2
				       + (aClass600_5617.anInt7860
					  * 1429253007)));
	    aClass529_5629 = null;
	    aLong5637 = 5709647995284375069L;
	    if (!aBool5653)
		method8468(i_118_, 2010024);
	}
    }
    
    public void method8385() {
	if (aClass546_5623 != null) {
	    Class476.method7779((byte) 107);
	    aHashMap5649 = aClass546_5623.method9047(657745657);
	    aClass546_5623.aClass557_7207.method9356(-399711551);
	    aClass546_5623 = null;
	}
    }
    
    public int method8386() {
	return -455149399 * anInt5622;
    }
    
    public boolean method8387(int i) {
	if (!aBool5653)
	    Class585_Sub1.method16485(false, -1313801656);
	if (-1L == 9085280138254570443L * aLong5637)
	    aLong5637 = Class251.method4508((byte) 8) * -5709647995284375069L;
	anInt5616 = 0;
	for (int i_120_ = 0; i_120_ < 1742301187 * anInt5642; i_120_++) {
	    if (!Class322.idx_5.method7558(anIntArray5644[i_120_],
						    (byte) 60))
		anInt5616 += -1575171941;
	}
	if (null == aClass529_5629) {
	    if (aClass525_Sub16_Sub6_5635 != null
		&& (Class597.idx_41.method7493
		    (aClass525_Sub16_Sub6_5635.aString11776, 65280))) {
		if (!Class597.idx_41.method7486
		     (aClass525_Sub16_Sub6_5635.aString11776, 632296453))
		    anInt5616 += -1575171941;
		else
		    aClass529_5629
			= Class496.method8157(Class597.idx_41,
					      (aClass525_Sub16_Sub6_5635
					       .aString11776),
					      client.aBool11230, -1821456790);
	    } else
		aClass529_5629 = new Class529(0);
	}
	if (437378451 * anInt5616 > 0) {
	    if (-1427415721 * anInt5612 < anInt5616 * 437378451)
		anInt5612 = anInt5616 * 681680933;
	    aClass504_5636 = Class504.aClass504_5602;
	    return false;
	}
	for (int i_121_ = 0; i_121_ < 1742301187 * anInt5642; i_121_++) {
	    if (null == aByteArrayArray5645[i_121_])
		aByteArrayArray5645[i_121_]
		    = (Class322.idx_5.getFile
		       (anIntArray5644[i_121_],
			Class474.aClass474_5162.anInt5171 * -492920259,
			1598189882));
	    if (aByteArrayArray5646[i_121_] == null)
		aByteArrayArray5646[i_121_]
		    = (Class322.idx_5.getFile
		       (anIntArray5644[i_121_],
			-492920259 * Class474.aClass474_5163.anInt5171,
			319968193));
	    if (aByteArrayArray5648[i_121_] == null)
		aByteArrayArray5648[i_121_]
		    = (Class322.idx_5.getFile
		       (anIntArray5644[i_121_],
			-492920259 * Class474.aClass474_5164.anInt5171,
			1880404520));
	    if (aByteArrayArray5638[i_121_] == null)
		aByteArrayArray5638[i_121_]
		    = (Class322.idx_5.getFile
		       (anIntArray5644[i_121_],
			-492920259 * Class474.aClass474_5165.anInt5171,
			88359298));
	    if (aByteArrayArray5639 != null
		&& null == aByteArrayArray5639[i_121_])
		aByteArrayArray5639[i_121_]
		    = (Class322.idx_5.getFile
		       (anIntArray5644[i_121_],
			-492920259 * Class474.aClass474_5168.anInt5171,
			347862197));
	}
	int i_122_ = 29753785 * anInt5620;
	Class641 class641 = new Class641(-1);
	Class641 class641_123_ = new Class641(-1);
	anInt5620 = 0;
	for (int i_124_ = 0; i_124_ < anInt5642 * 1742301187; i_124_++) {
	    byte[] is = aByteArrayArray5646[i_124_];
	    if (is != null) {
		int i_125_ = ((anIntArray5643[i_124_] >> 8) * 64
			      - -1227002079 * aClass600_5617.anInt7858);
		int i_126_ = (64 * (anIntArray5643[i_124_] & 0xff)
			      - aClass600_5617.anInt7860 * 1429253007);
		if (aClass499_5611.method8164((short) -2783)) {
		    i_125_ = 10;
		    i_126_ = 10;
		}
		int i_127_
		    = Class25.method874(aClass40_Sub11_5632, is, i_125_,
					i_126_, anInt5621 * -1681803501,
					-455149399 * anInt5622, class641_123_,
					class641, (byte) 96);
		if (i_127_ > 0)
		    anInt5620 += i_127_ * -1209289591;
	    }
	    is = aByteArrayArray5638[i_124_];
	    if (null != is) {
		int i_128_ = (64 * (anIntArray5643[i_124_] >> 8)
			      - -1227002079 * aClass600_5617.anInt7858);
		int i_129_ = (64 * (anIntArray5643[i_124_] & 0xff)
			      - 1429253007 * aClass600_5617.anInt7860);
		if (aClass499_5611.method8164((short) -3444)) {
		    i_128_ = 10;
		    i_129_ = 10;
		}
		int i_130_
		    = Class25.method874(aClass40_Sub11_5632, is, i_128_,
					i_129_, anInt5621 * -1681803501,
					anInt5622 * -455149399, class641_123_,
					class641, (byte) 19);
		if (i_130_ > 0)
		    anInt5620 += i_130_ * -1209289591;
	    }
	}
	if (anInt5620 * 29753785 > 0) {
	    if (i_122_ == 29753785 * anInt5620) {
		if (0 != anInt5641 * 1239635535
		    && 1000 == client.anInt11083 - anInt5641 * 1239635535) {
		    Class84.method1615(class641_123_.anInt8322 * 435566763,
				       class641.anInt8322 * 435566763,
				       29753785 * anInt5620, -1734863101);
		    Class225.method4251(937807905);
		}
	    } else
		anInt5641 = client.anInt11083 * -622329681;
	    if (anInt5640 * 294671849 < anInt5620 * 29753785)
		anInt5640 = -1469490351 * anInt5620;
	    aClass504_5636 = Class504.aClass504_5603;
	    return false;
	}
	if (!aBool5653 && aClass504_5636 != Class504.aClass504_5601)
	    Class666.method11016
		(new StringBuilder().append
		     (Class53.aClass53_475.method1169(Class21.aClass666_213,
						      1552651121))
		     .append
		     (Class55.aString565).append
		     ("(100%)").toString(),
		 true, Class501.aClass182_5564, Class29.aClass175_293,
		 Class500.aClass7_5560, -909267704);
	aClass504_5636 = Class504.aClass504_5604;
	if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
	    Class40_Sub20.aClass217_11050.method4028(1049676809);
	if (!aBool5653) {
	    for (int i_131_ = 0; i_131_ < 2048; i_131_++) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_131_];
		if (class656_sub1_sub3_sub1_sub1 != null)
		    class656_sub1_sub3_sub1_sub1.aClass546_10872 = null;
	    }
	    for (int i_132_ = 0;
		 i_132_ < client.aClass525_Sub19Array11122.length; i_132_++) {
		Class525_Sub19 class525_sub19
		    = client.aClass525_Sub19Array11122[i_132_];
		if (class525_sub19 != null)
		    ((Class656_Sub1)
		     class525_sub19.anObject10571).aClass546_10872
			= null;
	    }
	}
	if (!aBool5653)
	    Class514.method8552(true, 1811388205);
	boolean bool = false;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		.method17074(-1895832079)
	    == 2) {
	    for (int i_133_ = 0; i_133_ < 1742301187 * anInt5642; i_133_++) {
		if (null != aByteArrayArray5638[i_133_]
		    || aByteArrayArray5648[i_133_] != null) {
		    bool = true;
		    break;
		}
	    }
	}
	int i_134_ = (Class404.method6609(Class198_Sub13
					      .aClass525_Sub30_9973
					      .aClass696_Sub19_10684
					      .method17144(-29047449),
					  2052519115).anInt3412
		      * 1868971768);
	if (Class501.aClass182_5564.method3146())
	    i_134_++;
	method8426(1527411928);
	method8436(1167756961);
	aClass546_5623
	    = new Class546(Class501.aClass182_5564, 9, 4,
			   -1681803501 * anInt5621, anInt5622 * -455149399,
			   i_134_, bool,
			   Class501.aClass182_5564.method3242() > 0);
	aClass546_5623.method8946(false, 627794123);
	aClass546_5623.method8954(client.anInt11096 * 502828181, -1480441488);
	aClass546_5623.method8993(aHashMap5649, 1504376031);
	if (0 != client.anInt11096 * 502828181)
	    aClass546_5623.method8937(Class222.aClass175_2338, -707129966);
	else
	    aClass546_5623.method8937(null, -2143721781);
	aClass518_5630 = new Class518();
	aFloat5631 = -0.05F + (float) (Math.random() / 10.0);
	aClass455_Sub1_5652
	    = new Class455_Sub1(aClass546_5623, aClass40_Sub11_5632, 4,
				-1681803501 * anInt5621,
				-455149399 * anInt5622, false, aClass475_5625,
				aClass635_5624);
	aClass455_Sub1_5652.method7381(-1709081613);
	aClass455_Sub1_5652.anInt4957
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		  .method17108(2057856618) * -1193814877;
	aClass455_Sub1_5652.aBool4953
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		  .method17074(-981792938) == 2;
	aClass455_Sub1_5652.aBool4959
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		  .method17050(501271953) == 1;
	aClass455_Sub1_5652.aBool4960
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687
		  .method17197((byte) 57) == 1;
	aClass455_Sub1_5652.aBool4961
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		  .method16985(-2003861793) == 1;
	if (!aClass499_5611.method8164((short) -8723))
	    method8446(aClass455_Sub1_5652, aByteArrayArray5645, (byte) -69);
	else
	    method8390(aClass455_Sub1_5652, aByteArrayArray5645, -1240212515);
	if (aBool5653)
	    method8348(50, -620930099);
	aClass635_5624.method10394(anInt5621 * -1681803501 >> 4,
				   -455149399 * anInt5622 >> 4, -808516962);
	aClass635_5624.method10382(this, 2010172344);
	if (bool) {
	    aClass546_5623.method8946(true, 2043510170);
	    aClass455_Sub1_5615
		= new Class455_Sub1(aClass546_5623, aClass40_Sub11_5632, 1,
				    anInt5621 * -1681803501,
				    -455149399 * anInt5622, true,
				    aClass475_5625, aClass635_5624);
	    aClass455_Sub1_5615.method7381(-1709081613);
	    aClass455_Sub1_5615.anInt4957
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		      .method17108(1937206007) * -1193814877;
	    aClass455_Sub1_5615.aBool4953
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		      .method17074(-521899726) == 2;
	    aClass455_Sub1_5615.aBool4959
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		      .method17050(501271953) == 1;
	    aClass455_Sub1_5615.aBool4960
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687
		      .method17197((byte) 74) == 1;
	    aClass455_Sub1_5615.aBool4961
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		      .method16985(-1499139904) == 1;
	    if (!aClass499_5611.method8164((short) 3941)) {
		method8446(aClass455_Sub1_5615, aByteArrayArray5648,
			   (byte) -115);
		if (!aBool5653)
		    Class585_Sub1.method16485(true, 546547962);
	    } else {
		method8390(aClass455_Sub1_5615, aByteArrayArray5648,
			   -686135412);
		if (!aBool5653)
		    Class585_Sub1.method16485(true, 639163467);
	    }
	    aClass455_Sub1_5615.method7382(0,
					   (aClass455_Sub1_5652
					    .anIntArrayArrayArray4966[0]),
					   495677998);
	    aClass455_Sub1_5615.method7420(Class501.aClass182_5564, null,
					   1813215426);
	    aClass546_5623.method8946(false, 1365759079);
	    if (aBool5653)
		method8348(50, 1563382271);
	}
	aClass455_Sub1_5652.method7420(Class501.aClass182_5564,
				       (bool
					? (aClass455_Sub1_5615
					   .anIntArrayArrayArray4966)
					: null),
				       1846666713);
	if (!aClass499_5611.method8164((short) 5789)) {
	    if (!aBool5653)
		Class585_Sub1.method16485(true, 103701494);
	    method8391(aClass455_Sub1_5652, aByteArrayArray5646, 1710922767);
	    if (null != aByteArrayArray5639)
		method8484((byte) -13);
	} else {
	    if (!aBool5653)
		Class585_Sub1.method16485(true, 868952966);
	    method8392(aClass455_Sub1_5652, aByteArrayArray5646, -1357887226);
	}
	if (!aBool5653)
	    Class585_Sub1.method16485(true, 1185146179);
	aClass455_Sub1_5652.method7384(Class501.aClass182_5564,
				       (bool
					? aClass546_5623.aClass161Array7249[0]
					: null),
				       null, (byte) -3);
	if (aBool5653)
	    method8348(75, -594898872);
	aClass455_Sub1_5652.method15969(Class501.aClass182_5564, false,
					-1635405603);
	if (aBool5653)
	    method8348(75, 158556567);
	if (!aBool5653)
	    Class585_Sub1.method16485(true, 31550426);
	if (bool) {
	    aClass546_5623.method8946(true, -1304887743);
	    if (!aBool5653)
		Class585_Sub1.method16485(true, 2142254036);
	    if (!aClass499_5611.method8164((short) -16466))
		method8391(aClass455_Sub1_5615, aByteArrayArray5638,
			   2114616276);
	    else
		method8392(aClass455_Sub1_5615, aByteArrayArray5638,
			   -1527331969);
	    if (!aBool5653)
		Class585_Sub1.method16485(true, -283895040);
	    aClass455_Sub1_5615.method7384(Class501.aClass182_5564, null,
					   (aClass546_5623.aClass161Array7215
					    [0]),
					   (byte) 77);
	    aClass455_Sub1_5615.method15969(Class501.aClass182_5564, true,
					    1914254839);
	    if (!aBool5653)
		Class585_Sub1.method16485(true, -924450568);
	    aClass546_5623.method8946(false, -556137334);
	    if (aBool5653)
		method8348(50, 413372723);
	}
	aClass455_Sub1_5652.method7376(-2054268609);
	if (aClass455_Sub1_5615 != null)
	    aClass455_Sub1_5615.method7376(-1452818579);
	aClass546_5623.method8939(-1973353591);
	if (aBool5653) {
	    Class251.method4508((byte) 8);
	    while (!Class501.aClass182_5564.method3231(-97855108))
		method8348(1, 1130366037);
	}
	boolean bool_135_ = false;
	if (aBool5653) {
	    Class507 class507_136_ = client.aClass507_11137;
	    method8374(class507_136_, 1954657765);
	    Class45.aClass500_349.method8173(class507_136_, (byte) 96);
	    bool_135_ = true;
	    Class251.method4508((byte) 8);
	    synchronized (client.anObject11140) {
		client.aBool11138 = true;
		try {
		    client.anObject11140.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	    client.aClass507_11137 = this;
	    class507_136_.method8436(902189336);
	    method8468(4, 2010024);
	    method8383((byte) 16);
	} else {
	    Class40_Sub20.aClass217_11050.method4028(1852517389);
	    aClass635_5624.method10401((short) 8704);
	    Class473.method7753((byte) 2);
	}
	for (int i_137_ = 0; i_137_ < 4; i_137_++) {
	    for (int i_138_ = 0; i_138_ < -1681803501 * anInt5621; i_138_++) {
		for (int i_139_ = 0; i_139_ < -455149399 * anInt5622; i_139_++)
		    Class685.method11253(i_137_, i_138_, i_139_, 1848426641);
	    }
	}
	for (int i_140_ = 0; i_140_ < client.aClass523Array11183.length;
	     i_140_++) {
	    if (client.aClass523Array11183[i_140_] != null)
		client.aClass523Array11183[i_140_].method8710(1425817786);
	}
	Class559.method9401((byte) -107);
	Class531_Sub4.method15956((short) -7964);
	if (Class669.method11036(718132812) == Class508.aClass508_5657
	    && client.aClass96_11085.method1799((byte) 0) != null
	    && 4 == client.anInt11075 * 1777895575) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4375,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16605(1057001181,
								  -381748354);
	    client.aClass96_11085.method1794(class525_sub15, (short) 23164);
	}
	if (!aClass499_5611.method8164((short) -27248)) {
	    int i_141_
		= ((-195931011 * anInt5619 - (anInt5621 * -1681803501 >> 4))
		   / 8);
	    int i_142_
		= (((anInt5621 * -1681803501 >> 4) + anInt5619 * -195931011)
		   / 8);
	    int i_143_
		= ((anInt5650 * -1479322619 - (anInt5622 * -455149399 >> 4))
		   / 8);
	    int i_144_
		= ((anInt5650 * -1479322619 + (-455149399 * anInt5622 >> 4))
		   / 8);
	    for (int i_145_ = i_141_ - 1; i_145_ <= 1 + i_142_; i_145_++) {
		for (int i_146_ = i_143_ - 1; i_146_ <= i_144_ + 1; i_146_++) {
		    if (i_145_ < i_141_ || i_145_ > i_142_ || i_146_ < i_143_
			|| i_146_ > i_144_)
			Class322.idx_5.method7475
			    (method8469(i_145_, i_146_, (byte) 98), 365301245);
		}
	    }
	}
	long l
	    = Class251.method4508((byte) 8) - aLong5637 * 9085280138254570443L;
	if (13 == client.anInt11075 * 1777895575)
	    Class441.method7119(1, -973918265);
	else if (1777895575 * client.anInt11075 == 18)
	    Class441.method7119(16, 2042033387);
	else if (15 == client.anInt11075 * 1777895575)
	    Class441.method7119(17, 2064635399);
	else if (1777895575 * client.anInt11075 == 2)
	    Class441.method7119(9, 1710499632);
	else {
	    Class441.method7119(7, -2118052184);
	    if (client.aClass96_11085.method1799((byte) 0) != null) {
		Class525_Sub15 class525_sub15
		    = Class16.method767(Class412.aClass412_4378,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16605((int) l, -1231123576);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 11214);
	    }
	}
	if (aBool5628) {
	    Class268.method4961(Long.toString(Class251.method4508((byte) 8)
					      - (aLong5651
						 * -342806333469470689L)),
				1776084888);
	    aBool5628 = false;
	}
	if (bool_135_) {
	    synchronized (client.anObject11123) {
		client.anObject11123.notify();
	    }
	}
	return true;
    }
    
    public void method8388() {
	anInt5626 = 956102008;
	if (0 == anInt5621 * -1681803501)
	    anInt5627 = -1427277230;
	else
	    anInt5627 = ((int) (34.46 * (double) (-1681803501 * anInt5621))
			 * 96563711);
	anInt5627 = (-1686467073 * anInt5627 << 2) * 96563711;
	if (Class501.aClass182_5564.method3146())
	    anInt5627 += -2098987520;
    }
    
    public Class600 method8389() {
	return aClass600_5617;
    }
    
    void method8390(Class455_Sub1 class455_sub1, byte[][] is, int i) {
	for (int i_147_ = 0; i_147_ < -155906383 * class455_sub1.anInt4987;
	     i_147_++) {
	    if (!aBool5653)
		Class40_Sub20.aClass217_11050.method4028(1365810097);
	    for (int i_148_ = 0; i_148_ < anInt5621 * -1681803501 >> 3;
		 i_148_++) {
		for (int i_149_ = 0; i_149_ < -455149399 * anInt5622 >> 3;
		     i_149_++) {
		    int i_150_
			= anIntArrayArrayArray5654[i_147_][i_148_][i_149_];
		    if (-1 != i_150_) {
			int i_151_ = i_150_ >> 24 & 0x3;
			if (!class455_sub1.aBool4965 || i_151_ == 0) {
			    int i_152_ = i_150_ >> 1 & 0x3;
			    int i_153_ = i_150_ >> 14 & 0x3ff;
			    int i_154_ = i_150_ >> 3 & 0x7ff;
			    int i_155_ = (i_153_ / 8 << 8) + i_154_ / 8;
			    for (int i_156_ = 0;
				 i_156_ < anIntArray5643.length; i_156_++) {
				if (i_155_ == anIntArray5643[i_156_]
				    && null != is[i_156_]) {
				    RSBuffer class525_sub38
					= new RSBuffer(is[i_156_]);
				    class455_sub1.method7392(class525_sub38,
							     i_147_,
							     i_148_ * 8,
							     i_149_ * 8,
							     i_151_, i_153_,
							     i_154_, i_152_,
							     (byte) 126);
				    class455_sub1.method15960
					(Class501.aClass182_5564,
					 class525_sub38, i_147_, 8 * i_148_,
					 i_149_ * 8, i_151_, i_153_, i_154_,
					 i_152_, 1986724861);
				    break;
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i_157_ = 0; i_157_ < -155906383 * class455_sub1.anInt4987;
	     i_157_++) {
	    if (!aBool5653)
		Class40_Sub20.aClass217_11050.method4028(1003068258);
	    for (int i_158_ = 0; i_158_ < anInt5621 * -1681803501 >> 3;
		 i_158_++) {
		for (int i_159_ = 0; i_159_ < -455149399 * anInt5622 >> 3;
		     i_159_++) {
		    int i_160_
			= anIntArrayArrayArray5654[i_157_][i_158_][i_159_];
		    if (-1 == i_160_)
			class455_sub1.method7378(i_157_, i_158_ * 8,
						 8 * i_159_, 8, 8,
						 -2142719430);
		}
	    }
	}
    }
    
    void method8391(Class455_Sub1 class455_sub1, byte[][] is, int i) {
	for (int i_161_ = 0; i_161_ < anInt5642 * 1742301187; i_161_++) {
	    byte[] is_162_ = is[i_161_];
	    if (null != is_162_) {
		int i_163_ = ((anIntArray5643[i_161_] >> 8) * 64
			      - aClass600_5617.anInt7858 * -1227002079);
		int i_164_ = ((anIntArray5643[i_161_] & 0xff) * 64
			      - 1429253007 * aClass600_5617.anInt7860);
		if (!aBool5653)
		    Class40_Sub20.aClass217_11050.method4028(2044702160);
		class455_sub1.method15963(Class501.aClass182_5564, is_162_,
					  i_163_, i_164_, 790069618);
		if (aBool5653)
		    method8348(10, -1318796407);
	    }
	}
    }
    
    void method8392(Class455_Sub1 class455_sub1, byte[][] is, int i) {
	for (int i_165_ = 0; i_165_ < class455_sub1.anInt4987 * -155906383;
	     i_165_++) {
	    if (!aBool5653)
		Class40_Sub20.aClass217_11050.method4028(2063954957);
	    for (int i_166_ = 0; i_166_ < -1681803501 * anInt5621 >> 3;
		 i_166_++) {
		for (int i_167_ = 0; i_167_ < -455149399 * anInt5622 >> 3;
		     i_167_++) {
		    int i_168_
			= anIntArrayArrayArray5654[i_165_][i_166_][i_167_];
		    if (-1 != i_168_) {
			int i_169_ = i_168_ >> 24 & 0x3;
			if (!class455_sub1.aBool4965 || i_169_ == 0) {
			    int i_170_ = i_168_ >> 1 & 0x3;
			    int i_171_ = i_168_ >> 14 & 0x3ff;
			    int i_172_ = i_168_ >> 3 & 0x7ff;
			    int i_173_ = i_172_ / 8 + (i_171_ / 8 << 8);
			    for (int i_174_ = 0;
				 i_174_ < anIntArray5643.length; i_174_++) {
				if (i_173_ == anIntArray5643[i_174_]
				    && is[i_174_] != null) {
				    class455_sub1.method15967
					(Class501.aClass182_5564, is[i_174_],
					 i_165_, i_166_ * 8, 8 * i_167_,
					 i_169_, 8 * (i_171_ & 0x7),
					 8 * (i_172_ & 0x7), i_170_,
					 -1074967930);
				    break;
				}
			    }
			}
		    }
		    if (aBool5653)
			method8348(5, -1736277136);
		}
	    }
	}
    }
    
    public Class529 method8393() {
	return aClass529_5629;
    }
    
    void method8394(Class525_Sub38_Sub2 class525_sub38_sub2) {
	int i = class525_sub38_sub2.readUnsignedByte(-12956876);
	boolean bool = (i & 0x1) != 0;
	anInt5647 = class525_sub38_sub2.method16607(-1571461918) * 667477991;
	int i_175_ = class525_sub38_sub2.method16624(-1872423099);
	if (i_175_ == 1)
	    aClass499_5611 = Class499.aClass499_5556;
	else if (2 == i_175_)
	    aClass499_5611 = Class499.aClass499_5547;
	else if (i_175_ == 3)
	    aClass499_5611 = Class499.aClass499_5552;
	else if (i_175_ == 4)
	    aClass499_5611 = Class499.aClass499_5553;
	int i_176_ = class525_sub38_sub2.method16624(-398592385);
	int i_177_ = class525_sub38_sub2.method16667(1477214216);
	int i_178_ = class525_sub38_sub2.method16680(-2116269016);
	if (!aBool5653)
	    method8383((byte) 16);
	method8382(Class683.method11230(i_176_, 600669539), -400344860);
	class525_sub38_sub2.method18495(-1721270345);
	HashSet hashset = new HashSet();
	for (int i_179_ = 0; i_179_ < 4; i_179_++) {
	    for (int i_180_ = 0; i_180_ < anInt5621 * -1681803501 >> 3;
		 i_180_++) {
		for (int i_181_ = 0; i_181_ < -455149399 * anInt5622 >> 3;
		     i_181_++) {
		    int i_182_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (1 == i_182_) {
			int i_183_
			    = class525_sub38_sub2.method18496(26, 578733530);
			anIntArrayArrayArray5654[i_179_][i_180_][i_181_]
			    = i_183_;
			int i_184_ = i_183_ >> 14 & 0x3ff;
			int i_185_ = i_183_ >> 3 & 0x7ff;
			int i_186_ = i_184_ >> 3 << 8 | i_185_ >> 3;
			hashset.add(Integer.valueOf(i_186_));
		    } else
			anIntArrayArrayArray5654[i_179_][i_180_][i_181_] = -1;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	int i_187_ = hashset.size();
	anIntArray5643 = new int[i_187_];
	anIntArray5644 = new int[i_187_];
	aByteArrayArray5645 = new byte[i_187_][];
	aByteArrayArray5646 = new byte[i_187_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_187_][];
	aByteArrayArray5638 = new byte[i_187_][];
	i_187_ = 0;
	for (int i_188_ = 0; i_188_ < 4; i_188_++) {
	    for (int i_189_ = 0; i_189_ < anInt5621 * -1681803501 >> 3;
		 i_189_++) {
		for (int i_190_ = 0; i_190_ < -455149399 * anInt5622 >> 3;
		     i_190_++) {
		    int i_191_
			= anIntArrayArrayArray5654[i_188_][i_189_][i_190_];
		    if (-1 != i_191_) {
			int i_192_ = i_191_ >> 14 & 0x3ff;
			int i_193_ = i_191_ >> 3 & 0x7ff;
			int i_194_ = i_193_ / 8 + (i_192_ / 8 << 8);
			for (int i_195_ = 0; i_195_ < i_187_; i_195_++) {
			    if (i_194_ == anIntArray5643[i_195_]) {
				i_194_ = -1;
				break;
			    }
			}
			if (-1 != i_194_) {
			    int i_196_ = i_194_ >> 8 & 0xff;
			    int i_197_ = i_194_ & 0xff;
			    if (Class322.idx_5.method7536
				(method8469(i_196_, i_197_, (byte) 10),
				 (Class474.aClass474_5162.anInt5171
				  * -492920259),
				 -1491853227)) {
				anIntArray5643[i_187_] = i_194_;
				anIntArray5644[i_187_]
				    = method8469(i_196_, i_197_, (byte) 29);
				i_187_++;
			    }
			}
		    }
		}
	    }
	}
	anInt5642 = 1314030251 * i_187_;
	method8384(i_177_, i_178_, 4, bool, (byte) -20);
    }
    
    void method8395(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public int method8396() {
	return 100 - anInt5620 * -1319588796 / (294671849 * anInt5640);
    }
    
    public Class600 method8397() {
	return aClass600_5617;
    }
    
    public void method8398(Class40_Sub11 class40_sub11, int i) {
	aClass40_Sub11_5632 = class40_sub11;
    }
    
    public Class600 method8399() {
	return aClass600_5617;
    }
    
    public Class600 method8400() {
	return aClass600_5617;
    }
    
    public void method8401() {
	if (aBool5653) {
	    method8370(182852275);
	    aLong5637 = 5709647995284375069L;
	    Class507 class507_198_ = client.aClass507_11137;
	    anInt5642 = class507_198_.anInt5642 * 1;
	    anIntArray5643 = class507_198_.anIntArray5643;
	    anIntArray5644 = class507_198_.anIntArray5644;
	    aByteArrayArray5645 = class507_198_.aByteArrayArray5645;
	    aByteArrayArray5646 = class507_198_.aByteArrayArray5646;
	    aByteArrayArray5639 = class507_198_.aByteArrayArray5639;
	    aByteArrayArray5648 = class507_198_.aByteArrayArray5648;
	    aByteArrayArray5638 = class507_198_.aByteArrayArray5638;
	    aClass475_5625 = class507_198_.aClass475_5625;
	    aClass635_5624 = class507_198_.aClass635_5624;
	    anIntArrayArrayArray5654 = class507_198_.anIntArrayArrayArray5654;
	    anInt5626 = class507_198_.anInt5626 * 1;
	    anInt5627 = class507_198_.anInt5627 * 1;
	    aClass525_Sub16_Sub6_5635
		= class507_198_.aClass525_Sub16_Sub6_5635;
	    aClass529_5629 = class507_198_.aClass529_5629;
	    anIntArrayArray5633 = class507_198_.anIntArrayArray5633;
	    anIntArrayArray5634 = class507_198_.anIntArrayArray5634;
	    aByteArrayArrayArray5655 = class507_198_.aByteArrayArrayArray5655;
	    aClass499_5611 = class507_198_.aClass499_5611;
	    aClass290_5614 = class507_198_.aClass290_5614;
	    aClass600_5617 = class507_198_.aClass600_5617;
	    aClass600_5618 = class507_198_.aClass600_5618;
	    anInt5619 = 1 * class507_198_.anInt5619;
	    anInt5650 = class507_198_.anInt5650 * 1;
	    anInt5621 = 1 * class507_198_.anInt5621;
	    anInt5622 = 1 * class507_198_.anInt5622;
	} else if (1777895575 * client.anInt11075 == 1)
	    Class441.method7119(13, 237746965);
	else if (client.anInt11075 * 1777895575 == 16)
	    Class441.method7119(18, -951746400);
	else if (17 == client.anInt11075 * 1777895575)
	    Class441.method7119(15, -258295248);
	else if (1777895575 * client.anInt11075 == 7)
	    Class441.method7119(4, -278291948);
	else if (client.anInt11075 * 1777895575 == 9)
	    Class441.method7119(2, 379815315);
    }
    
    public int method8402() {
	return -1681803501 * anInt5621;
    }
    
    void method8403(int i, int i_199_, int i_200_, boolean bool) {
	if (3 == client.anInt11145 * 1874190559) {
	    if (aBool5653)
		throw new IllegalStateException();
	    client.anInt11145 = -356132065;
	    client.anInt11280 = 1550521413;
	}
	if (bool || anInt5619 * -195931011 != i
	    || i_199_ != anInt5650 * -1479322619) {
	    anInt5619 = -1290746667 * i;
	    anInt5650 = i_199_ * 345266381;
	    if (!aBool5653) {
		Class441.method7119(i_200_, -1150397951);
		Class666.method11016
		    (Class53.aClass53_475.method1169(Class21.aClass666_213,
						     1552651121),
		     true, Class501.aClass182_5564, Class29.aClass175_293,
		     Class500.aClass7_5560, 2232750);
	    }
	    if (null != aClass600_5617)
		aClass600_5618 = aClass600_5617;
	    else
		aClass600_5618 = new Class600(0, 0, 0);
	    aClass600_5617
		= new Class600(0,
			       (-195931011 * anInt5619
				- (anInt5621 * -1681803501 >> 4)) * 8,
			       (anInt5650 * -1479322619
				- (anInt5622 * -455149399 >> 4)) * 8);
	    aClass525_Sub16_Sub6_5635
		= Class556.method9249((anInt5621 * -1681803501 / 2
				       + (-1227002079
					  * aClass600_5617.anInt7858)),
				      (-1681803501 * anInt5621 / 2
				       + (aClass600_5617.anInt7860
					  * 1429253007)));
	    aClass529_5629 = null;
	    aLong5637 = 5709647995284375069L;
	    if (!aBool5653)
		method8468(i_200_, 2010024);
	}
    }
    
    public Class504 method8404(int i) {
	return aClass504_5636;
    }
    
    public void method8405(int i) {
	aClass600_5617 = new Class600();
	anInt5650 = 0;
	anInt5619 = 0;
    }
    
    public Class529 method8406() {
	return aClass529_5629;
    }
    
    public Class518 method8407() {
	return aClass518_5630;
    }
    
    void method8408(int i, int i_201_, int i_202_, boolean bool) {
	if (3 == client.anInt11145 * 1874190559) {
	    if (aBool5653)
		throw new IllegalStateException();
	    client.anInt11145 = -356132065;
	    client.anInt11280 = 1550521413;
	}
	if (bool || anInt5619 * -195931011 != i
	    || i_201_ != anInt5650 * -1479322619) {
	    anInt5619 = -1290746667 * i;
	    anInt5650 = i_201_ * 345266381;
	    if (!aBool5653) {
		Class441.method7119(i_202_, 1172156006);
		Class666.method11016
		    (Class53.aClass53_475.method1169(Class21.aClass666_213,
						     1552651121),
		     true, Class501.aClass182_5564, Class29.aClass175_293,
		     Class500.aClass7_5560, -1230554452);
	    }
	    if (null != aClass600_5617)
		aClass600_5618 = aClass600_5617;
	    else
		aClass600_5618 = new Class600(0, 0, 0);
	    aClass600_5617
		= new Class600(0,
			       (-195931011 * anInt5619
				- (anInt5621 * -1681803501 >> 4)) * 8,
			       (anInt5650 * -1479322619
				- (anInt5622 * -455149399 >> 4)) * 8);
	    aClass525_Sub16_Sub6_5635
		= Class556.method9249((anInt5621 * -1681803501 / 2
				       + (-1227002079
					  * aClass600_5617.anInt7858)),
				      (-1681803501 * anInt5621 / 2
				       + (aClass600_5617.anInt7860
					  * 1429253007)));
	    aClass529_5629 = null;
	    aLong5637 = 5709647995284375069L;
	    if (!aBool5653)
		method8468(i_202_, 2010024);
	}
    }
    
    public int method8409() {
	return -1219510345 * anInt5626;
    }
    
    public void method8410() {
	anInt5626 = 956102008;
	if (0 == anInt5621 * -1681803501)
	    anInt5627 = -1427277230;
	else
	    anInt5627 = ((int) (34.46 * (double) (-1681803501 * anInt5621))
			 * 96563711);
	anInt5627 = (-1686467073 * anInt5627 << 2) * 96563711;
	if (Class501.aClass182_5564.method3146())
	    anInt5627 += -2098987520;
    }
    
    public int method8411() {
	return anInt5627 * -1686467073;
    }
    
    public int method8412(int i) {
	return -1681803501 * anInt5621;
    }
    
    public Class546 method8413() {
	return aClass546_5623;
    }
    
    void method8414() {
	int i = aByteArrayArray5639.length;
	for (int i_203_ = 0; i_203_ < i; i_203_++) {
	    if (aByteArrayArray5639[i_203_] != null) {
		int i_204_ = -1;
		for (int i_205_ = 0; i_205_ < -196462909 * client.anInt11129;
		     i_205_++) {
		    if (anIntArray5643[i_203_]
			== client.anIntArray11141[i_205_]) {
			i_204_ = i_205_;
			break;
		    }
		}
		if (-1 == i_204_) {
		    client.anIntArray11141[client.anInt11129 * -196462909]
			= anIntArray5643[i_203_];
		    i_204_
			= (client.anInt11129 += -170677781) * -196462909 - 1;
		}
		RSBuffer class525_sub38
		    = new RSBuffer(aByteArrayArray5639[i_203_]);
		int i_206_ = 0;
		while ((-1133521593 * class525_sub38.index
			< aByteArrayArray5639[i_203_].length)
		       && i_206_ < 511
		       && client.anInt11216 * 1111866889 < 1023) {
		    int i_207_ = i_204_ | i_206_++ << 6;
		    int i_208_ = class525_sub38.readUnsignedShort((byte) 57);
		    int i_209_ = i_208_ >> 14;
		    int i_210_ = i_208_ >> 7 & 0x3f;
		    int i_211_ = i_208_ & 0x3f;
		    int i_212_
			= (64 * (anIntArray5643[i_203_] >> 8)
			   - -1227002079 * aClass600_5617.anInt7858 + i_210_);
		    int i_213_
			= (64 * (anIntArray5643[i_203_] & 0xff)
			   - aClass600_5617.anInt7860 * 1429253007 + i_211_);
		    NPCDefinitions class299
			= (NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				      (class525_sub38.readUnsignedShort((byte) 44),
				       -1838224201));
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i_207_));
		    if (null == class525_sub19
			&& (class299.aByte3335 & 0x1) > 0 && i_212_ >= 0
			&& (i_212_ + class299.anInt3291 * 1035256919
			    < anInt5621 * -1681803501)
			&& i_213_ >= 0
			&& (i_213_ + 1035256919 * class299.anInt3291
			    < anInt5622 * -455149399)) {
			Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			    = new Class656_Sub1_Sub3_Sub1_Sub2(aClass546_5623);
			class656_sub1_sub3_sub1_sub2.anInt11964
			    = -447377367 * i_207_;
			Class525_Sub19 class525_sub19_214_
			    = new Class525_Sub19(class656_sub1_sub3_sub1_sub2);
			client.aClass10_11121.method695(class525_sub19_214_,
							(long) i_207_);
			client.aClass525_Sub19Array11122[((client.anInt11276
							   += 2042937351)
							  * 1530572215) - 1]
			    = class525_sub19_214_;
			client.anIntArray11125[((client.anInt11216
						 += -639684551) * 1111866889
						- 1)]
			    = i_207_;
			class656_sub1_sub3_sub1_sub2.anInt12006
			    = client.anInt11083 * 473756327;
			class656_sub1_sub3_sub1_sub2.method18942(class299,
								 2127511525);
			class656_sub1_sub3_sub1_sub2.method18607
			    (1035256919 * (class656_sub1_sub3_sub1_sub2
					   .aClass299_12255.anInt3291),
			     133251852);
			class656_sub1_sub3_sub1_sub2.anInt12003
			    = (-1104516755
			       * (-412681569 * (class656_sub1_sub3_sub1_sub2
						.aClass299_12255.anInt3322)
				  << 3));
			class656_sub1_sub3_sub1_sub2.method18597
			    (class656_sub1_sub3_sub1_sub2.aClass299_12255
				 .aClass682_3284.method11222
				 (-1632902955).method80() << 11 & 0x3fff,
			     true, (byte) 1);
			class656_sub1_sub3_sub1_sub2.method18945
			    (i_209_, i_212_, i_213_, true,
			     class656_sub1_sub3_sub1_sub2
				 .method18608((byte) 60),
			     207115614);
		    }
		}
	    }
	}
    }
    
    public byte[][] method8415(int i) {
	if (aClass455_Sub1_5652 != null
	    && null != aClass455_Sub1_5652.aByteArrayArrayArray4967
	    && aClass455_Sub1_5652.aByteArrayArrayArray4967[i] != null)
	    return aClass455_Sub1_5652.aByteArrayArrayArray4967[i];
	return null;
    }
    
    public byte[][] method8416(int i) {
	if (aClass455_Sub1_5652 != null
	    && null != aClass455_Sub1_5652.aByteArrayArrayArray4967
	    && aClass455_Sub1_5652.aByteArrayArrayArray4967[i] != null)
	    return aClass455_Sub1_5652.aByteArrayArrayArray4967[i];
	return null;
    }
    
    public byte[][][] method8417(byte i) {
	return aByteArrayArrayArray5655;
    }
    
    public Class635 method8418() {
	return aClass635_5624;
    }
    
    public Class635 method8419() {
	return aClass635_5624;
    }
    
    public int[][] method8420() {
	return anIntArrayArray5633;
    }
    
    public int[][] method8421() {
	return anIntArrayArray5633;
    }
    
    public int[][] method8422() {
	return anIntArrayArray5634;
    }
    
    public int[][] method8423() {
	return anIntArrayArray5634;
    }
    
    public byte[][][] method8424() {
	return aByteArrayArrayArray5655;
    }
    
    public void method8425() {
	aClass600_5617 = new Class600();
	anInt5650 = 0;
	anInt5619 = 0;
    }
    
    public void method8426(int i) {
	anInt5626 = 956102008;
	if (0 == anInt5621 * -1681803501)
	    anInt5627 = -1427277230;
	else
	    anInt5627 = ((int) (34.46 * (double) (-1681803501 * anInt5621))
			 * 96563711);
	anInt5627 = (-1686467073 * anInt5627 << 2) * 96563711;
	if (Class501.aClass182_5564.method3146())
	    anInt5627 += -2098987520;
    }
    
    public void method8427(byte[][][] is) {
	aByteArrayArrayArray5655 = is;
    }
    
    public void method8428(byte[][][] is) {
	aByteArrayArrayArray5655 = is;
    }
    
    public Class455_Sub1 method8429() {
	return aClass455_Sub1_5652;
    }
    
    public void method8430(Class40_Sub11 class40_sub11) {
	aClass40_Sub11_5632 = class40_sub11;
    }
    
    public void method8431() {
	if (aBool5653) {
	    method8370(1444877103);
	    aLong5637 = 5709647995284375069L;
	    Class507 class507_215_ = client.aClass507_11137;
	    anInt5642 = class507_215_.anInt5642 * 1;
	    anIntArray5643 = class507_215_.anIntArray5643;
	    anIntArray5644 = class507_215_.anIntArray5644;
	    aByteArrayArray5645 = class507_215_.aByteArrayArray5645;
	    aByteArrayArray5646 = class507_215_.aByteArrayArray5646;
	    aByteArrayArray5639 = class507_215_.aByteArrayArray5639;
	    aByteArrayArray5648 = class507_215_.aByteArrayArray5648;
	    aByteArrayArray5638 = class507_215_.aByteArrayArray5638;
	    aClass475_5625 = class507_215_.aClass475_5625;
	    aClass635_5624 = class507_215_.aClass635_5624;
	    anIntArrayArrayArray5654 = class507_215_.anIntArrayArrayArray5654;
	    anInt5626 = class507_215_.anInt5626 * 1;
	    anInt5627 = class507_215_.anInt5627 * 1;
	    aClass525_Sub16_Sub6_5635
		= class507_215_.aClass525_Sub16_Sub6_5635;
	    aClass529_5629 = class507_215_.aClass529_5629;
	    anIntArrayArray5633 = class507_215_.anIntArrayArray5633;
	    anIntArrayArray5634 = class507_215_.anIntArrayArray5634;
	    aByteArrayArrayArray5655 = class507_215_.aByteArrayArrayArray5655;
	    aClass499_5611 = class507_215_.aClass499_5611;
	    aClass290_5614 = class507_215_.aClass290_5614;
	    aClass600_5617 = class507_215_.aClass600_5617;
	    aClass600_5618 = class507_215_.aClass600_5618;
	    anInt5619 = 1 * class507_215_.anInt5619;
	    anInt5650 = class507_215_.anInt5650 * 1;
	    anInt5621 = 1 * class507_215_.anInt5621;
	    anInt5622 = 1 * class507_215_.anInt5622;
	} else if (1777895575 * client.anInt11075 == 1)
	    Class441.method7119(13, 1640947133);
	else if (client.anInt11075 * 1777895575 == 16)
	    Class441.method7119(18, -191770537);
	else if (17 == client.anInt11075 * 1777895575)
	    Class441.method7119(15, 951395782);
	else if (1777895575 * client.anInt11075 == 7)
	    Class441.method7119(4, 274687601);
	else if (client.anInt11075 * 1777895575 == 9)
	    Class441.method7119(2, 964453141);
    }
    
    void method8432() {
	if (Class499.aClass499_5551 != aClass499_5611
	    && Class499.aClass499_5551 != aClass499_5613) {
	    if (Class499.aClass499_5556 == aClass499_5611
		|| Class499.aClass499_5552 == aClass499_5611
		|| (aClass499_5611 != aClass499_5613
		    && (Class499.aClass499_5548 == aClass499_5611
			|| aClass499_5613 == Class499.aClass499_5548))) {
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    Class222.method4240(((Class656_Sub1_Sub3_Sub1_Sub2)
					 class525_sub19.anObject10571),
					65280);
		}
		client.anInt11216 = 0;
		client.anInt11276 = 0;
		client.aClass10_11121.method688((short) 8782);
	    }
	    aClass499_5613 = aClass499_5611;
	}
    }
    
    public void method8433(byte[][][] is) {
	aByteArrayArrayArray5655 = is;
    }
    
    public void method8434() {
	if (aClass546_5623 != null) {
	    Class476.method7779((byte) 28);
	    aHashMap5649 = aClass546_5623.method9047(-1275511980);
	    aClass546_5623.aClass557_7207.method9356(-1369699288);
	    aClass546_5623 = null;
	}
    }
    
    public void method8435() {
	aClass504_5636 = Class504.aClass504_5601;
	anInt5616 = 0;
	anInt5612 = -855318937;
	anInt5620 = 0;
	anInt5640 = -286141863;
	anInt5641 = 0;
    }
    
    void method8436(int i) {
	aClass455_Sub1_5615 = null;
	aClass455_Sub1_5652 = null;
	if (null != aClass475_5625)
	    aClass475_5625.method7764(-569278595);
	if (aClass635_5624 != null)
	    aClass635_5624.method10393((byte) -43);
	if (null != aClass546_5623) {
	    aClass546_5623.aClass557_7207.method9356(1877613787);
	    aClass546_5623 = null;
	}
    }
    
    public void method8437(boolean bool) {
	Class645 class645 = null;
	if (null != aClass635_5624 && bool)
	    class645 = aClass635_5624.method10385(1038906002);
	aClass635_5624
	    = new Class635(Class501.aClass182_5564, Class462.idx_8,
			   -1681803501 * anInt5621 >> 3,
			   anInt5622 * -455149399 >> 3);
	if (null != class645)
	    aClass635_5624.method10384(this, class645, 0, (short) 255);
    }
    
    public void method8438() {
	aClass635_5624.method10384(this, null, 0, (short) 255);
    }
    
    public Class518 method8439() {
	return aClass518_5630;
    }
    
    void method8440(Class290 class290) {
	if (aClass290_5614 != class290) {
	    anInt5621
		= (anInt5622 = class290.anInt3217 * 1615052713) * 1173691603;
	    anIntArrayArrayArray5654
		= (new int[4][anInt5621 * -1681803501 >> 3]
		   [-455149399 * anInt5622 >> 3]);
	    anIntArrayArray5633
		= new int[anInt5621 * -1681803501][-455149399 * anInt5622];
	    anIntArrayArray5634
		= new int[-1681803501 * anInt5621][anInt5622 * -455149399];
	    aByteArrayArrayArray5655
		= new byte[4][anInt5621 * -1681803501][-455149399 * anInt5622];
	    aClass475_5625 = new Class475(4, -1681803501 * anInt5621,
					  anInt5622 * -455149399);
	    method8371(false, (byte) -93);
	    Class643.method10600((byte) 89);
	    aClass290_5614 = class290;
	}
    }
    
    public void method8441() {
	anInt5626 = 956102008;
	if (0 == anInt5621 * -1681803501)
	    anInt5627 = -1427277230;
	else
	    anInt5627 = ((int) (34.46 * (double) (-1681803501 * anInt5621))
			 * 96563711);
	anInt5627 = (-1686467073 * anInt5627 << 2) * 96563711;
	if (Class501.aClass182_5564.method3146())
	    anInt5627 += -2098987520;
    }
    
    public void method8442() {
	anInt5626 = 956102008;
	if (0 == anInt5621 * -1681803501)
	    anInt5627 = -1427277230;
	else
	    anInt5627 = ((int) (34.46 * (double) (-1681803501 * anInt5621))
			 * 96563711);
	anInt5627 = (-1686467073 * anInt5627 << 2) * 96563711;
	if (Class501.aClass182_5564.method3146())
	    anInt5627 += -2098987520;
    }
    
    public void method8443(byte[][][] is, int i) {
	aByteArrayArrayArray5655 = is;
    }
    
    void method8444(Class507 class507_216_) {
	boolean bool = class507_216_.aBool5653;
	class507_216_.aBool5653 = aBool5653;
	aBool5653 = bool;
	Class499 class499 = class507_216_.aClass499_5613;
	class507_216_.aClass499_5613 = aClass499_5613;
	aClass499_5613 = class499;
	class507_216_.aClass600_5618 = aClass600_5617;
	aClass600_5618 = class507_216_.aClass600_5617;
	aClass635_5624.method10400(class507_216_.method8361((byte) 48),
				   1841398961);
    }
    
    void method8445(Class507 class507_217_) {
	boolean bool = class507_217_.aBool5653;
	class507_217_.aBool5653 = aBool5653;
	aBool5653 = bool;
	Class499 class499 = class507_217_.aClass499_5613;
	class507_217_.aClass499_5613 = aClass499_5613;
	aClass499_5613 = class499;
	class507_217_.aClass600_5618 = aClass600_5617;
	aClass600_5618 = class507_217_.aClass600_5617;
	aClass635_5624.method10400(class507_217_.method8361((byte) 14),
				   1952253027);
    }
    
    void method8446(Class455_Sub1 class455_sub1, byte[][] is, byte i) {
	int i_218_ = is.length;
	for (int i_219_ = 0; i_219_ < i_218_; i_219_++) {
	    byte[] is_220_ = is[i_219_];
	    if (null != is_220_) {
		RSBuffer class525_sub38 = new RSBuffer(is_220_);
		int i_221_ = anIntArray5643[i_219_] >> 8;
		int i_222_ = anIntArray5643[i_219_] & 0xff;
		int i_223_
		    = i_221_ * 64 - -1227002079 * aClass600_5617.anInt7858;
		int i_224_
		    = i_222_ * 64 - aClass600_5617.anInt7860 * 1429253007;
		if (!aBool5653 && Class40_Sub20.aClass217_11050 != null)
		    Class40_Sub20.aClass217_11050.method4028(1239878527);
		class455_sub1.method7434(class525_sub38, i_223_, i_224_,
					 (-1227002079
					  * aClass600_5617.anInt7858),
					 1429253007 * aClass600_5617.anInt7860,
					 1638233477);
		class455_sub1.method15961(Class501.aClass182_5564,
					  class525_sub38, i_223_, i_224_,
					  (byte) -59);
	    }
	}
	for (int i_225_ = 0; i_225_ < i_218_; i_225_++) {
	    int i_226_ = ((anIntArray5643[i_225_] >> 8) * 64
			  - aClass600_5617.anInt7858 * -1227002079);
	    int i_227_ = ((anIntArray5643[i_225_] & 0xff) * 64
			  - aClass600_5617.anInt7860 * 1429253007);
	    byte[] is_228_ = is[i_225_];
	    if (is_228_ == null && -1479322619 * anInt5650 < 800) {
		if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
		    Class40_Sub20.aClass217_11050.method4028(1268443545);
		class455_sub1.method7377(i_226_, i_227_, 64, 64, -1958021428);
	    }
	}
    }
    
    void method8447() {
	aClass455_Sub1_5615 = null;
	aClass455_Sub1_5652 = null;
	if (null != aClass475_5625)
	    aClass475_5625.method7764(-569278595);
	if (aClass635_5624 != null)
	    aClass635_5624.method10393((byte) 1);
	if (null != aClass546_5623) {
	    aClass546_5623.aClass557_7207.method9356(1899811629);
	    aClass546_5623 = null;
	}
    }
    
    public void method8448(Class514 class514) {
	aClass499_5611 = class514.aClass499_5694;
	if (aClass499_5611 == Class499.aClass499_5550)
	    method8377(723694795);
	else if (Class499.aClass499_5548 == aClass499_5611)
	    method8378(class514.aClass525_Sub38_Sub2_5695, 903179626);
	else if (aClass499_5611 == Class499.aClass499_5551)
	    method8380(2008282593);
	else if (aClass499_5611.method8164((short) -6586))
	    method8379(class514.aClass525_Sub38_Sub2_5695, (byte) 107);
    }
    
    public void method8449(Class514 class514) {
	aClass499_5611 = class514.aClass499_5694;
	if (aClass499_5611 == Class499.aClass499_5550)
	    method8377(703037820);
	else if (Class499.aClass499_5548 == aClass499_5611)
	    method8378(class514.aClass525_Sub38_Sub2_5695, 920114774);
	else if (aClass499_5611 == Class499.aClass499_5551)
	    method8380(2008282593);
	else if (aClass499_5611.method8164((short) -14900))
	    method8379(class514.aClass525_Sub38_Sub2_5695, (byte) 2);
    }
    
    public byte[][] method8450(int i, byte i_229_) {
	if (aClass455_Sub1_5652 != null
	    && null != aClass455_Sub1_5652.aByteArrayArrayArray4967
	    && aClass455_Sub1_5652.aByteArrayArrayArray4967[i] != null)
	    return aClass455_Sub1_5652.aByteArrayArrayArray4967[i];
	return null;
    }
    
    void method8451() {
	method8382(Class683.method11230(Class198_Sub13.aClass525_Sub30_9973
					    .aClass696_Sub26_10682
					    .method17219((byte) -29),
					600669539),
		   -985227904);
	int i = aClass600_5617.anInt7858 * -1227002079;
	int i_230_ = 1429253007 * aClass600_5617.anInt7860;
	int i_231_ = (i >> 3) + (-469853907 * Class477.anInt5200 >> 12);
	int i_232_ = (i_230_ >> 3) + (Class475.anInt5179 * -1889707729 >> 12);
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867 = (byte) 0;
	Class677.anInt8619 = 0;
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method18910(8, 8,
								-66127525);
	int i_233_ = 18;
	anIntArray5643 = new int[i_233_];
	anIntArray5644 = new int[i_233_];
	aByteArrayArray5645 = new byte[i_233_][];
	aByteArrayArray5646 = new byte[i_233_][];
	aByteArrayArray5639 = new byte[i_233_][];
	aByteArrayArray5648 = new byte[i_233_][];
	aByteArrayArray5638 = new byte[i_233_][];
	i_233_ = 0;
	for (int i_234_ = (i_231_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_234_ <= (i_231_ + (-1681803501 * anInt5621 >> 4)) / 8;
	     i_234_++) {
	    for (int i_235_ = (i_232_ - (-455149399 * anInt5622 >> 4)) / 8;
		 i_235_ <= (i_232_ + (anInt5622 * -455149399 >> 4)) / 8;
		 i_235_++) {
		int i_236_ = (i_234_ << 8) + i_235_;
		if (Class322.idx_5.method7536
		    (method8469(i_234_, i_235_, (byte) 79),
		     -492920259 * Class474.aClass474_5162.anInt5171,
		     2099432290)) {
		    anIntArray5643[i_233_] = i_236_;
		    anIntArray5644[i_233_]
			= method8469(i_234_, i_235_, (byte) 84);
		    i_233_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_233_;
	int i_237_;
	if (1777895575 * client.anInt11075 == 1)
	    i_237_ = 13;
	else if (client.anInt11075 * 1777895575 == 17)
	    i_237_ = 15;
	else if (16 == 1777895575 * client.anInt11075)
	    i_237_ = 18;
	else if (9 == 1777895575 * client.anInt11075)
	    i_237_ = 2;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1777895575 * client.anInt11075)
					   .toString());
	method8384(i_231_, i_232_, i_237_, false, (byte) -40);
    }
    
    void method8452() {
	method8382(Class683.method11230(Class198_Sub13.aClass525_Sub30_9973
					    .aClass696_Sub26_10682
					    .method17219((byte) 4),
					600669539),
		   -2133148474);
	int i = aClass600_5617.anInt7858 * -1227002079;
	int i_238_ = 1429253007 * aClass600_5617.anInt7860;
	int i_239_ = (i >> 3) + (-469853907 * Class477.anInt5200 >> 12);
	int i_240_ = (i_238_ >> 3) + (Class475.anInt5179 * -1889707729 >> 12);
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867 = (byte) 0;
	Class677.anInt8619 = 0;
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method18910(8, 8,
								-912522675);
	int i_241_ = 18;
	anIntArray5643 = new int[i_241_];
	anIntArray5644 = new int[i_241_];
	aByteArrayArray5645 = new byte[i_241_][];
	aByteArrayArray5646 = new byte[i_241_][];
	aByteArrayArray5639 = new byte[i_241_][];
	aByteArrayArray5648 = new byte[i_241_][];
	aByteArrayArray5638 = new byte[i_241_][];
	i_241_ = 0;
	for (int i_242_ = (i_239_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_242_ <= (i_239_ + (-1681803501 * anInt5621 >> 4)) / 8;
	     i_242_++) {
	    for (int i_243_ = (i_240_ - (-455149399 * anInt5622 >> 4)) / 8;
		 i_243_ <= (i_240_ + (anInt5622 * -455149399 >> 4)) / 8;
		 i_243_++) {
		int i_244_ = (i_242_ << 8) + i_243_;
		if (Class322.idx_5.method7536
		    (method8469(i_242_, i_243_, (byte) 106),
		     -492920259 * Class474.aClass474_5162.anInt5171,
		     -836185175)) {
		    anIntArray5643[i_241_] = i_244_;
		    anIntArray5644[i_241_]
			= method8469(i_242_, i_243_, (byte) 86);
		    i_241_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_241_;
	int i_245_;
	if (1777895575 * client.anInt11075 == 1)
	    i_245_ = 13;
	else if (client.anInt11075 * 1777895575 == 17)
	    i_245_ = 15;
	else if (16 == 1777895575 * client.anInt11075)
	    i_245_ = 18;
	else if (9 == 1777895575 * client.anInt11075)
	    i_245_ = 2;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1777895575 * client.anInt11075)
					   .toString());
	method8384(i_239_, i_240_, i_245_, false, (byte) 35);
    }
    
    void method8453() {
	method8382(Class683.method11230(Class198_Sub13.aClass525_Sub30_9973
					    .aClass696_Sub26_10682
					    .method17219((byte) -74),
					600669539),
		   -640359363);
	int i = aClass600_5617.anInt7858 * -1227002079;
	int i_246_ = 1429253007 * aClass600_5617.anInt7860;
	int i_247_ = (i >> 3) + (-469853907 * Class477.anInt5200 >> 12);
	int i_248_ = (i_246_ >> 3) + (Class475.anInt5179 * -1889707729 >> 12);
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867 = (byte) 0;
	Class677.anInt8619 = 0;
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method18910(8, 8,
								-1373393995);
	int i_249_ = 18;
	anIntArray5643 = new int[i_249_];
	anIntArray5644 = new int[i_249_];
	aByteArrayArray5645 = new byte[i_249_][];
	aByteArrayArray5646 = new byte[i_249_][];
	aByteArrayArray5639 = new byte[i_249_][];
	aByteArrayArray5648 = new byte[i_249_][];
	aByteArrayArray5638 = new byte[i_249_][];
	i_249_ = 0;
	for (int i_250_ = (i_247_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_250_ <= (i_247_ + (-1681803501 * anInt5621 >> 4)) / 8;
	     i_250_++) {
	    for (int i_251_ = (i_248_ - (-455149399 * anInt5622 >> 4)) / 8;
		 i_251_ <= (i_248_ + (anInt5622 * -455149399 >> 4)) / 8;
		 i_251_++) {
		int i_252_ = (i_250_ << 8) + i_251_;
		if (Class322.idx_5.method7536
		    (method8469(i_250_, i_251_, (byte) 96),
		     -492920259 * Class474.aClass474_5162.anInt5171,
		     -4871663)) {
		    anIntArray5643[i_249_] = i_252_;
		    anIntArray5644[i_249_]
			= method8469(i_250_, i_251_, (byte) 118);
		    i_249_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_249_;
	int i_253_;
	if (1777895575 * client.anInt11075 == 1)
	    i_253_ = 13;
	else if (client.anInt11075 * 1777895575 == 17)
	    i_253_ = 15;
	else if (16 == 1777895575 * client.anInt11075)
	    i_253_ = 18;
	else if (9 == 1777895575 * client.anInt11075)
	    i_253_ = 2;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1777895575 * client.anInt11075)
					   .toString());
	method8384(i_247_, i_248_, i_253_, false, (byte) -7);
    }
    
    void method8454() {
	method8382(Class683.method11230(Class198_Sub13.aClass525_Sub30_9973
					    .aClass696_Sub26_10682
					    .method17219((byte) -99),
					600669539),
		   -1808147752);
	int i = aClass600_5617.anInt7858 * -1227002079;
	int i_254_ = 1429253007 * aClass600_5617.anInt7860;
	int i_255_ = (i >> 3) + (-469853907 * Class477.anInt5200 >> 12);
	int i_256_ = (i_254_ >> 3) + (Class475.anInt5179 * -1889707729 >> 12);
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867 = (byte) 0;
	Class677.anInt8619 = 0;
	Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.method18910(8, 8,
								-611359094);
	int i_257_ = 18;
	anIntArray5643 = new int[i_257_];
	anIntArray5644 = new int[i_257_];
	aByteArrayArray5645 = new byte[i_257_][];
	aByteArrayArray5646 = new byte[i_257_][];
	aByteArrayArray5639 = new byte[i_257_][];
	aByteArrayArray5648 = new byte[i_257_][];
	aByteArrayArray5638 = new byte[i_257_][];
	i_257_ = 0;
	for (int i_258_ = (i_255_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_258_ <= (i_255_ + (-1681803501 * anInt5621 >> 4)) / 8;
	     i_258_++) {
	    for (int i_259_ = (i_256_ - (-455149399 * anInt5622 >> 4)) / 8;
		 i_259_ <= (i_256_ + (anInt5622 * -455149399 >> 4)) / 8;
		 i_259_++) {
		int i_260_ = (i_258_ << 8) + i_259_;
		if (Class322.idx_5.method7536
		    (method8469(i_258_, i_259_, (byte) 125),
		     -492920259 * Class474.aClass474_5162.anInt5171,
		     1242230592)) {
		    anIntArray5643[i_257_] = i_260_;
		    anIntArray5644[i_257_]
			= method8469(i_258_, i_259_, (byte) 82);
		    i_257_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_257_;
	int i_261_;
	if (1777895575 * client.anInt11075 == 1)
	    i_261_ = 13;
	else if (client.anInt11075 * 1777895575 == 17)
	    i_261_ = 15;
	else if (16 == 1777895575 * client.anInt11075)
	    i_261_ = 18;
	else if (9 == 1777895575 * client.anInt11075)
	    i_261_ = 2;
	else
	    throw new RuntimeException(new StringBuilder().append("").append
					   (1777895575 * client.anInt11075)
					   .toString());
	method8384(i_255_, i_256_, i_261_, false, (byte) -22);
    }
    
    public Class475 method8455() {
	return aClass475_5625;
    }
    
    void method8456(Class525_Sub38_Sub2 class525_sub38_sub2) {
	int i = class525_sub38_sub2.readUnsignedByte(1842667457);
	boolean bool = (i & 0x1) != 0;
	anInt5647 = class525_sub38_sub2.method16607(-1571461918) * 667477991;
	int i_262_ = class525_sub38_sub2.method16624(-801728113);
	if (i_262_ == 1)
	    aClass499_5611 = Class499.aClass499_5556;
	else if (2 == i_262_)
	    aClass499_5611 = Class499.aClass499_5547;
	else if (i_262_ == 3)
	    aClass499_5611 = Class499.aClass499_5552;
	else if (i_262_ == 4)
	    aClass499_5611 = Class499.aClass499_5553;
	int i_263_ = class525_sub38_sub2.method16624(259906986);
	int i_264_ = class525_sub38_sub2.method16667(1461469308);
	int i_265_ = class525_sub38_sub2.method16680(-937047333);
	if (!aBool5653)
	    method8383((byte) 16);
	method8382(Class683.method11230(i_263_, 600669539), -2127346634);
	class525_sub38_sub2.method18495(41375984);
	HashSet hashset = new HashSet();
	for (int i_266_ = 0; i_266_ < 4; i_266_++) {
	    for (int i_267_ = 0; i_267_ < anInt5621 * -1681803501 >> 3;
		 i_267_++) {
		for (int i_268_ = 0; i_268_ < -455149399 * anInt5622 >> 3;
		     i_268_++) {
		    int i_269_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (1 == i_269_) {
			int i_270_
			    = class525_sub38_sub2.method18496(26, 578733530);
			anIntArrayArrayArray5654[i_266_][i_267_][i_268_]
			    = i_270_;
			int i_271_ = i_270_ >> 14 & 0x3ff;
			int i_272_ = i_270_ >> 3 & 0x7ff;
			int i_273_ = i_271_ >> 3 << 8 | i_272_ >> 3;
			hashset.add(Integer.valueOf(i_273_));
		    } else
			anIntArrayArrayArray5654[i_266_][i_267_][i_268_] = -1;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	int i_274_ = hashset.size();
	anIntArray5643 = new int[i_274_];
	anIntArray5644 = new int[i_274_];
	aByteArrayArray5645 = new byte[i_274_][];
	aByteArrayArray5646 = new byte[i_274_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_274_][];
	aByteArrayArray5638 = new byte[i_274_][];
	i_274_ = 0;
	for (int i_275_ = 0; i_275_ < 4; i_275_++) {
	    for (int i_276_ = 0; i_276_ < anInt5621 * -1681803501 >> 3;
		 i_276_++) {
		for (int i_277_ = 0; i_277_ < -455149399 * anInt5622 >> 3;
		     i_277_++) {
		    int i_278_
			= anIntArrayArrayArray5654[i_275_][i_276_][i_277_];
		    if (-1 != i_278_) {
			int i_279_ = i_278_ >> 14 & 0x3ff;
			int i_280_ = i_278_ >> 3 & 0x7ff;
			int i_281_ = i_280_ / 8 + (i_279_ / 8 << 8);
			for (int i_282_ = 0; i_282_ < i_274_; i_282_++) {
			    if (i_281_ == anIntArray5643[i_282_]) {
				i_281_ = -1;
				break;
			    }
			}
			if (-1 != i_281_) {
			    int i_283_ = i_281_ >> 8 & 0xff;
			    int i_284_ = i_281_ & 0xff;
			    if (Class322.idx_5.method7536
				(method8469(i_283_, i_284_, (byte) 74),
				 (Class474.aClass474_5162.anInt5171
				  * -492920259),
				 643587509)) {
				anIntArray5643[i_274_] = i_281_;
				anIntArray5644[i_274_]
				    = method8469(i_283_, i_284_, (byte) 15);
				i_274_++;
			    }
			}
		    }
		}
	    }
	}
	anInt5642 = 1314030251 * i_274_;
	method8384(i_264_, i_265_, 4, bool, (byte) 31);
    }
    
    void method8457(Class525_Sub38_Sub2 class525_sub38_sub2) {
	int i = class525_sub38_sub2.readUnsignedByte(1370935803);
	boolean bool = (i & 0x1) != 0;
	anInt5647 = class525_sub38_sub2.method16607(-1571461918) * 667477991;
	int i_285_ = class525_sub38_sub2.method16624(-1894584709);
	if (i_285_ == 1)
	    aClass499_5611 = Class499.aClass499_5556;
	else if (2 == i_285_)
	    aClass499_5611 = Class499.aClass499_5547;
	else if (i_285_ == 3)
	    aClass499_5611 = Class499.aClass499_5552;
	else if (i_285_ == 4)
	    aClass499_5611 = Class499.aClass499_5553;
	int i_286_ = class525_sub38_sub2.method16624(459763560);
	int i_287_ = class525_sub38_sub2.method16667(1953302353);
	int i_288_ = class525_sub38_sub2.method16680(-896622737);
	if (!aBool5653)
	    method8383((byte) 16);
	method8382(Class683.method11230(i_286_, 600669539), -1868491931);
	class525_sub38_sub2.method18495(-845084769);
	HashSet hashset = new HashSet();
	for (int i_289_ = 0; i_289_ < 4; i_289_++) {
	    for (int i_290_ = 0; i_290_ < anInt5621 * -1681803501 >> 3;
		 i_290_++) {
		for (int i_291_ = 0; i_291_ < -455149399 * anInt5622 >> 3;
		     i_291_++) {
		    int i_292_ = class525_sub38_sub2.method18496(1, 578733530);
		    if (1 == i_292_) {
			int i_293_
			    = class525_sub38_sub2.method18496(26, 578733530);
			anIntArrayArrayArray5654[i_289_][i_290_][i_291_]
			    = i_293_;
			int i_294_ = i_293_ >> 14 & 0x3ff;
			int i_295_ = i_293_ >> 3 & 0x7ff;
			int i_296_ = i_294_ >> 3 << 8 | i_295_ >> 3;
			hashset.add(Integer.valueOf(i_296_));
		    } else
			anIntArrayArrayArray5654[i_289_][i_290_][i_291_] = -1;
		}
	    }
	}
	class525_sub38_sub2.method18497(-2061790185);
	int i_297_ = hashset.size();
	anIntArray5643 = new int[i_297_];
	anIntArray5644 = new int[i_297_];
	aByteArrayArray5645 = new byte[i_297_][];
	aByteArrayArray5646 = new byte[i_297_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_297_][];
	aByteArrayArray5638 = new byte[i_297_][];
	i_297_ = 0;
	for (int i_298_ = 0; i_298_ < 4; i_298_++) {
	    for (int i_299_ = 0; i_299_ < anInt5621 * -1681803501 >> 3;
		 i_299_++) {
		for (int i_300_ = 0; i_300_ < -455149399 * anInt5622 >> 3;
		     i_300_++) {
		    int i_301_
			= anIntArrayArrayArray5654[i_298_][i_299_][i_300_];
		    if (-1 != i_301_) {
			int i_302_ = i_301_ >> 14 & 0x3ff;
			int i_303_ = i_301_ >> 3 & 0x7ff;
			int i_304_ = i_303_ / 8 + (i_302_ / 8 << 8);
			for (int i_305_ = 0; i_305_ < i_297_; i_305_++) {
			    if (i_304_ == anIntArray5643[i_305_]) {
				i_304_ = -1;
				break;
			    }
			}
			if (-1 != i_304_) {
			    int i_306_ = i_304_ >> 8 & 0xff;
			    int i_307_ = i_304_ & 0xff;
			    if (Class322.idx_5.method7536
				(method8469(i_306_, i_307_, (byte) 82),
				 (Class474.aClass474_5162.anInt5171
				  * -492920259),
				 1948459848)) {
				anIntArray5643[i_297_] = i_304_;
				anIntArray5644[i_297_]
				    = method8469(i_306_, i_307_, (byte) 25);
				i_297_++;
			    }
			}
		    }
		}
	    }
	}
	anInt5642 = 1314030251 * i_297_;
	method8384(i_287_, i_288_, 4, bool, (byte) -55);
    }
    
    public Class546 method8458() {
	return aClass546_5623;
    }
    
    public int method8459(int i) {
	return 100 - anInt5616 * 788172140 / (anInt5612 * -1427415721);
    }
    
    void method8460() {
	aClass455_Sub1_5615 = null;
	aClass455_Sub1_5652 = null;
	if (null != aClass475_5625)
	    aClass475_5625.method7764(-569278595);
	if (aClass635_5624 != null)
	    aClass635_5624.method10393((byte) -31);
	if (null != aClass546_5623) {
	    aClass546_5623.aClass557_7207.method9356(-815118521);
	    aClass546_5623 = null;
	}
    }
    
    void method8461(Class290 class290) {
	if (aClass290_5614 != class290) {
	    anInt5621
		= (anInt5622 = class290.anInt3217 * 1615052713) * 1173691603;
	    anIntArrayArrayArray5654
		= (new int[4][anInt5621 * -1681803501 >> 3]
		   [-455149399 * anInt5622 >> 3]);
	    anIntArrayArray5633
		= new int[anInt5621 * -1681803501][-455149399 * anInt5622];
	    anIntArrayArray5634
		= new int[-1681803501 * anInt5621][anInt5622 * -455149399];
	    aByteArrayArrayArray5655
		= new byte[4][anInt5621 * -1681803501][-455149399 * anInt5622];
	    aClass475_5625 = new Class475(4, -1681803501 * anInt5621,
					  anInt5622 * -455149399);
	    method8371(false, (byte) 66);
	    Class643.method10600((byte) 95);
	    aClass290_5614 = class290;
	}
    }
    
    void method8462(Class507 class507_308_) {
	boolean bool = class507_308_.aBool5653;
	class507_308_.aBool5653 = aBool5653;
	aBool5653 = bool;
	Class499 class499 = class507_308_.aClass499_5613;
	class507_308_.aClass499_5613 = aClass499_5613;
	aClass499_5613 = class499;
	class507_308_.aClass600_5618 = aClass600_5617;
	aClass600_5618 = class507_308_.aClass600_5617;
	aClass635_5624.method10400(class507_308_.method8361((byte) 8),
				   1803469363);
    }
    
    void method8463(Class290 class290) {
	if (aClass290_5614 != class290) {
	    anInt5621
		= (anInt5622 = class290.anInt3217 * 1615052713) * 1173691603;
	    anIntArrayArrayArray5654
		= (new int[4][anInt5621 * -1681803501 >> 3]
		   [-455149399 * anInt5622 >> 3]);
	    anIntArrayArray5633
		= new int[anInt5621 * -1681803501][-455149399 * anInt5622];
	    anIntArrayArray5634
		= new int[-1681803501 * anInt5621][anInt5622 * -455149399];
	    aByteArrayArrayArray5655
		= new byte[4][anInt5621 * -1681803501][-455149399 * anInt5622];
	    aClass475_5625 = new Class475(4, -1681803501 * anInt5621,
					  anInt5622 * -455149399);
	    method8371(false, (byte) -1);
	    Class643.method10600((byte) 36);
	    aClass290_5614 = class290;
	}
    }
    
    void method8464() {
	if (Class499.aClass499_5551 != aClass499_5611
	    && Class499.aClass499_5551 != aClass499_5613) {
	    if (Class499.aClass499_5556 == aClass499_5611
		|| Class499.aClass499_5552 == aClass499_5611
		|| (aClass499_5611 != aClass499_5613
		    && (Class499.aClass499_5548 == aClass499_5611
			|| aClass499_5613 == Class499.aClass499_5548))) {
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    Class222.method4240(((Class656_Sub1_Sub3_Sub1_Sub2)
					 class525_sub19.anObject10571),
					65280);
		}
		client.anInt11216 = 0;
		client.anInt11276 = 0;
		client.aClass10_11121.method688((short) 27814);
	    }
	    aClass499_5613 = aClass499_5611;
	}
    }
    
    void method8465() {
	if (Class499.aClass499_5551 != aClass499_5611
	    && Class499.aClass499_5551 != aClass499_5613) {
	    if (Class499.aClass499_5556 == aClass499_5611
		|| Class499.aClass499_5552 == aClass499_5611
		|| (aClass499_5611 != aClass499_5613
		    && (Class499.aClass499_5548 == aClass499_5611
			|| aClass499_5613 == Class499.aClass499_5548))) {
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    Class222.method4240(((Class656_Sub1_Sub3_Sub1_Sub2)
					 class525_sub19.anObject10571),
					65280);
		}
		client.anInt11216 = 0;
		client.anInt11276 = 0;
		client.aClass10_11121.method688((short) 6969);
	    }
	    aClass499_5613 = aClass499_5611;
	}
    }
    
    public void method8466() {
	aClass504_5636 = Class504.aClass504_5601;
	anInt5616 = 0;
	anInt5612 = -855318937;
	anInt5620 = 0;
	anInt5640 = -286141863;
	anInt5641 = 0;
    }
    
    void method8467() {
	if (Class499.aClass499_5551 != aClass499_5611
	    && Class499.aClass499_5551 != aClass499_5613) {
	    if (Class499.aClass499_5556 == aClass499_5611
		|| Class499.aClass499_5552 == aClass499_5611
		|| (aClass499_5611 != aClass499_5613
		    && (Class499.aClass499_5548 == aClass499_5611
			|| aClass499_5613 == Class499.aClass499_5548))) {
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    Class222.method4240(((Class656_Sub1_Sub3_Sub1_Sub2)
					 class525_sub19.anObject10571),
					65280);
		}
		client.anInt11216 = 0;
		client.anInt11276 = 0;
		client.aClass10_11121.method688((short) 1881);
	    }
	    aClass499_5613 = aClass499_5611;
	}
    }
    
    void method8468(int i, int i_309_) {
	int i_310_ = (aClass600_5617.anInt7858 * -1227002079
		      - -1227002079 * aClass600_5618.anInt7858);
	int i_311_ = (aClass600_5617.anInt7860 * 1429253007
		      - aClass600_5618.anInt7860 * 1429253007);
	if (4 == i) {
	    for (int i_312_ = 0; i_312_ < 1530572215 * client.anInt11276;
		 i_312_++) {
		Class525_Sub19 class525_sub19
		    = client.aClass525_Sub19Array11122[i_312_];
		if (null != class525_sub19) {
		    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			= ((Class656_Sub1_Sub3_Sub1_Sub2)
			   class525_sub19.anObject10571);
		    for (int i_313_ = 0;
			 i_313_ < (class656_sub1_sub3_sub1_sub2
				   .anIntArray12014).length;
			 i_313_++) {
			class656_sub1_sub3_sub1_sub2.anIntArray12014[i_313_]
			    -= i_310_;
			class656_sub1_sub3_sub1_sub2.anIntArray12017[i_313_]
			    -= i_311_;
		    }
		    Class446 class446
			= Class446.method7209(class656_sub1_sub3_sub1_sub2
						  .method10818
					      ().aClass446_4807);
		    class446.aFloat4895 -= (float) (i_310_ * 512);
		    class446.aFloat4897 -= (float) (i_311_ * 512);
		    class656_sub1_sub3_sub1_sub2.method10823(class446);
		    class446.method7260();
		}
	    }
	} else {
	    boolean bool = false;
	    client.anInt11216 = 0;
	    int i_314_ = -2089933312 * anInt5621 - 512;
	    int i_315_ = -1108258304 * anInt5622 - 512;
	    for (int i_316_ = 0; i_316_ < 1530572215 * client.anInt11276;
		 i_316_++) {
		Class525_Sub19 class525_sub19
		    = client.aClass525_Sub19Array11122[i_316_];
		if (class525_sub19 != null) {
		    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			= ((Class656_Sub1_Sub3_Sub1_Sub2)
			   class525_sub19.anObject10571);
		    Class446 class446
			= Class446.method7209(class656_sub1_sub3_sub1_sub2
						  .method10818
					      ().aClass446_4807);
		    class446.aFloat4895 -= (float) (i_310_ * 512);
		    class446.aFloat4897 -= (float) (i_311_ * 512);
		    class656_sub1_sub3_sub1_sub2.method10823(class446);
		    if ((int) class446.aFloat4895 < 0
			|| (int) class446.aFloat4895 > i_314_
			|| (int) class446.aFloat4897 < 0
			|| (int) class446.aFloat4897 > i_315_) {
			class656_sub1_sub3_sub1_sub2.method18942(null,
								 1532939719);
			class525_sub19.method8755(-1933461091);
			bool = true;
		    } else {
			boolean bool_317_ = true;
			for (int i_318_ = 0;
			     i_318_ < (class656_sub1_sub3_sub1_sub2
				       .anIntArray12014).length;
			     i_318_++) {
			    class656_sub1_sub3_sub1_sub2.anIntArray12014
				[i_318_]
				-= i_310_;
			    class656_sub1_sub3_sub1_sub2.anIntArray12017
				[i_318_]
				-= i_311_;
			    if ((class656_sub1_sub3_sub1_sub2.anIntArray12014
				 [i_318_]) < 0
				|| ((class656_sub1_sub3_sub1_sub2
				     .anIntArray12014[i_318_])
				    >= -1681803501 * anInt5621)
				|| (class656_sub1_sub3_sub1_sub2
				    .anIntArray12017[i_318_]) < 0
				|| ((class656_sub1_sub3_sub1_sub2
				     .anIntArray12017[i_318_])
				    >= -455149399 * anInt5622))
				bool_317_ = false;
			}
			if (bool_317_)
			    client.anIntArray11125[((client.anInt11216
						     += -639684551)
						    * 1111866889) - 1]
				= (2032864281
				   * class656_sub1_sub3_sub1_sub2.anInt11964);
			else {
			    class656_sub1_sub3_sub1_sub2
				.method18942(null, -91331223);
			    class525_sub19.method8755(-1933461091);
			    bool = true;
			}
		    }
		    class446.method7260();
		}
	    }
	    if (bool) {
		client.anInt11276
		    = (client.aClass10_11121.method687(-1528359067)
		       * 2042937351);
		int i_319_ = 0;
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    client.aClass525_Sub19Array11122[i_319_++]
			= class525_sub19;
		}
	    }
	}
	for (int i_320_ = 0; i_320_ < 2048; i_320_++) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_320_];
	    if (class656_sub1_sub3_sub1_sub1 != null) {
		for (int i_321_ = 0;
		     (i_321_
		      < class656_sub1_sub3_sub1_sub1.anIntArray12014.length);
		     i_321_++) {
		    class656_sub1_sub3_sub1_sub1.anIntArray12014[i_321_]
			-= i_310_;
		    class656_sub1_sub3_sub1_sub1.anIntArray12017[i_321_]
			-= i_311_;
		}
		Class446 class446
		    = Class446.method7209(class656_sub1_sub3_sub1_sub1
					      .method10818().aClass446_4807);
		class446.aFloat4895 -= (float) (512 * i_310_);
		class446.aFloat4897 -= (float) (i_311_ * 512);
		class656_sub1_sub3_sub1_sub1.method10823(class446);
		class446.method7260();
	    }
	}
	Class109[] class109s = client.aClass109Array11089;
	for (int i_322_ = 0; i_322_ < class109s.length; i_322_++) {
	    Class109 class109 = class109s[i_322_];
	    if (class109 != null) {
		class109.anInt1313 -= i_310_ * 1089475072;
		class109.anInt1314 -= i_311_ * -231335424;
	    }
	}
	for (Class525_Sub12 class525_sub12
		 = (Class525_Sub12) Class525_Sub12.aClass709_10525
					.method14372((short) -19560);
	     class525_sub12 != null;
	     class525_sub12 = (Class525_Sub12) Class525_Sub12
						   .aClass709_10525
						   .method14353(-1155082107)) {
	    class525_sub12.anInt10514 -= 527073445 * i_310_;
	    class525_sub12.anInt10512 -= 681315175 * i_311_;
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_5632.method76((class525_sub12.anInt10519
						 * -1427028605),
						810328535));
	    int i_323_;
	    int i_324_;
	    if ((class525_sub12.anInt10520 * 471577503 & 0x1) == 0) {
		i_323_ = -2084474039 * class602.anInt7885;
		i_324_ = 1437840657 * class602.anInt7886;
	    } else {
		i_323_ = class602.anInt7886 * 1437840657;
		i_324_ = -2084474039 * class602.anInt7885;
	    }
	    if (aClass499_5611 != Class499.aClass499_5553
		&& (i_323_ + class525_sub12.anInt10514 * -1168021715 <= 0
		    || -1370300329 * class525_sub12.anInt10512 + i_324_ <= 0
		    || (class525_sub12.anInt10514 * -1168021715
			>= -1681803501 * anInt5621)
		    || (class525_sub12.anInt10512 * -1370300329
			>= anInt5622 * -455149399)))
		class525_sub12.method8755(-1933461091);
	}
	for (Class525_Sub12 class525_sub12
		 = ((Class525_Sub12)
		    Class525_Sub12.aClass709_10526.method14372((short) -5590));
	     null != class525_sub12;
	     class525_sub12 = (Class525_Sub12) Class525_Sub12
						   .aClass709_10526
						   .method14353(-2000377243)) {
	    class525_sub12.anInt10514 -= i_310_ * 527073445;
	    class525_sub12.anInt10512 -= 681315175 * i_311_;
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_5632.method76((-1427028605
						 * class525_sub12.anInt10519),
						1765614898));
	    int i_325_;
	    int i_326_;
	    if ((471577503 * class525_sub12.anInt10520 & 0x1) == 0) {
		i_325_ = class602.anInt7885 * -2084474039;
		i_326_ = 1437840657 * class602.anInt7886;
	    } else {
		i_325_ = class602.anInt7886 * 1437840657;
		i_326_ = -2084474039 * class602.anInt7885;
	    }
	    if (Class499.aClass499_5553 != aClass499_5611
		&& (-1168021715 * class525_sub12.anInt10514 + i_325_ <= 0
		    || i_326_ + -1370300329 * class525_sub12.anInt10512 <= 0
		    || (class525_sub12.anInt10514 * -1168021715
			>= anInt5621 * -1681803501)
		    || (-1370300329 * class525_sub12.anInt10512
			>= anInt5622 * -455149399)))
		class525_sub12.method8755(-1933461091);
	}
	for (Class525_Sub23 class525_sub23
		 = (Class525_Sub23) client.aClass10_11246.method689(77438266);
	     null != class525_sub23;
	     class525_sub23 = ((Class525_Sub23)
			       client.aClass10_11246.method690((byte) 68))) {
	    int i_327_
		= (int) (-5126207504388691097L * class525_sub23.aLong7113 >> 28
			 & 0x3L);
	    int i_328_
		= (int) (class525_sub23.aLong7113 * -5126207504388691097L
			 & 0x3fffL);
	    int i_329_ = i_328_ - aClass600_5617.anInt7858 * -1227002079;
	    int i_330_
		= (int) (-5126207504388691097L * class525_sub23.aLong7113 >> 14
			 & 0x3fffL);
	    int i_331_ = i_330_ - aClass600_5617.anInt7860 * 1429253007;
	    if (null != aClass546_5623) {
		if (i_329_ < 0 || i_331_ < 0
		    || i_329_ >= anInt5621 * -1681803501
		    || i_331_ >= anInt5622 * -455149399
		    || i_329_ >= 1761949661 * aClass546_5623.anInt7210
		    || i_331_ >= 947301287 * aClass546_5623.anInt7211) {
		    if (aClass499_5611 != Class499.aClass499_5553)
			class525_sub23.method8755(-1933461091);
		} else if (null != aClass546_5623.aClass547ArrayArrayArray7263)
		    aClass546_5623.method8964(i_327_, i_329_, i_331_,
					      2079309566);
	    }
	}
	if (0 != -183945107 * Class98.anInt1200) {
	    Class98.anInt1200 -= i_310_ * -1046245019;
	    Class98.anInt1201 -= i_311_ * -671956915;
	}
	Class384.method6437(false, -1087572352);
	if (4 == i) {
	    client.anInt11174 -= i_310_ * -819831296;
	    client.anInt11112 -= i_311_ * 63440384;
	    Class275.anInt2867 -= i_310_ * 1387371008;
	    Class381.anInt3930 -= -1224636928 * i_311_;
	    if (2 != -174799205 * Class700.anInt8779
		&& 5 != -174799205 * Class700.anInt8779)
		Class202.method3853(Class152_Sub1.method14533(-137516413),
				    (byte) 26);
	} else {
	    Class50.anInt376 -= -833230687 * i_310_;
	    Class695.anInt8758 -= 446037575 * i_311_;
	    Class326.anInt3562 -= i_310_ * 618864241;
	    Class198_Sub16.anInt9979 -= 282518497 * i_311_;
	    Class477.anInt5200 -= -2009249280 * i_310_;
	    Class475.anInt5179 -= -182739456 * i_311_;
	    if (Math.abs(i_310_) > anInt5621 * -1681803501
		|| Math.abs(i_311_) > anInt5622 * -455149399)
		aClass635_5624.method10398(-562988201);
	}
	Class616.method10109(1024660303);
	Class587.method9690(-182903195);
	client.aClass10_11248.method688((short) -3198);
	client.aClass709_11247.method14344(320904965);
	client.aClass708_11293.method14324(-1877215472);
	Class87.method1658(-1113629431);
    }
    
    int method8469(int i, int i_332_, byte i_333_) {
	return i | i_332_ << 7;
    }
    
    void method8470(int i, int i_334_, int i_335_, boolean bool) {
	if (3 == client.anInt11145 * 1874190559) {
	    if (aBool5653)
		throw new IllegalStateException();
	    client.anInt11145 = -356132065;
	    client.anInt11280 = 1550521413;
	}
	if (bool || anInt5619 * -195931011 != i
	    || i_334_ != anInt5650 * -1479322619) {
	    anInt5619 = -1290746667 * i;
	    anInt5650 = i_334_ * 345266381;
	    if (!aBool5653) {
		Class441.method7119(i_335_, 668265320);
		Class666.method11016
		    (Class53.aClass53_475.method1169(Class21.aClass666_213,
						     1552651121),
		     true, Class501.aClass182_5564, Class29.aClass175_293,
		     Class500.aClass7_5560, -928209138);
	    }
	    if (null != aClass600_5617)
		aClass600_5618 = aClass600_5617;
	    else
		aClass600_5618 = new Class600(0, 0, 0);
	    aClass600_5617
		= new Class600(0,
			       (-195931011 * anInt5619
				- (anInt5621 * -1681803501 >> 4)) * 8,
			       (anInt5650 * -1479322619
				- (anInt5622 * -455149399 >> 4)) * 8);
	    aClass525_Sub16_Sub6_5635
		= Class556.method9249((anInt5621 * -1681803501 / 2
				       + (-1227002079
					  * aClass600_5617.anInt7858)),
				      (-1681803501 * anInt5621 / 2
				       + (aClass600_5617.anInt7860
					  * 1429253007)));
	    aClass529_5629 = null;
	    aLong5637 = 5709647995284375069L;
	    if (!aBool5653)
		method8468(i_335_, 2010024);
	}
    }
    
    void method8471(int i) {
	int i_336_ = (aClass600_5617.anInt7858 * -1227002079
		      - -1227002079 * aClass600_5618.anInt7858);
	int i_337_ = (aClass600_5617.anInt7860 * 1429253007
		      - aClass600_5618.anInt7860 * 1429253007);
	if (4 == i) {
	    for (int i_338_ = 0; i_338_ < 1530572215 * client.anInt11276;
		 i_338_++) {
		Class525_Sub19 class525_sub19
		    = client.aClass525_Sub19Array11122[i_338_];
		if (null != class525_sub19) {
		    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			= ((Class656_Sub1_Sub3_Sub1_Sub2)
			   class525_sub19.anObject10571);
		    for (int i_339_ = 0;
			 i_339_ < (class656_sub1_sub3_sub1_sub2
				   .anIntArray12014).length;
			 i_339_++) {
			class656_sub1_sub3_sub1_sub2.anIntArray12014[i_339_]
			    -= i_336_;
			class656_sub1_sub3_sub1_sub2.anIntArray12017[i_339_]
			    -= i_337_;
		    }
		    Class446 class446
			= Class446.method7209(class656_sub1_sub3_sub1_sub2
						  .method10818
					      ().aClass446_4807);
		    class446.aFloat4895 -= (float) (i_336_ * 512);
		    class446.aFloat4897 -= (float) (i_337_ * 512);
		    class656_sub1_sub3_sub1_sub2.method10823(class446);
		    class446.method7260();
		}
	    }
	} else {
	    boolean bool = false;
	    client.anInt11216 = 0;
	    int i_340_ = -2089933312 * anInt5621 - 512;
	    int i_341_ = -1108258304 * anInt5622 - 512;
	    for (int i_342_ = 0; i_342_ < 1530572215 * client.anInt11276;
		 i_342_++) {
		Class525_Sub19 class525_sub19
		    = client.aClass525_Sub19Array11122[i_342_];
		if (class525_sub19 != null) {
		    Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			= ((Class656_Sub1_Sub3_Sub1_Sub2)
			   class525_sub19.anObject10571);
		    Class446 class446
			= Class446.method7209(class656_sub1_sub3_sub1_sub2
						  .method10818
					      ().aClass446_4807);
		    class446.aFloat4895 -= (float) (i_336_ * 512);
		    class446.aFloat4897 -= (float) (i_337_ * 512);
		    class656_sub1_sub3_sub1_sub2.method10823(class446);
		    if ((int) class446.aFloat4895 < 0
			|| (int) class446.aFloat4895 > i_340_
			|| (int) class446.aFloat4897 < 0
			|| (int) class446.aFloat4897 > i_341_) {
			class656_sub1_sub3_sub1_sub2.method18942(null,
								 771678685);
			class525_sub19.method8755(-1933461091);
			bool = true;
		    } else {
			boolean bool_343_ = true;
			for (int i_344_ = 0;
			     i_344_ < (class656_sub1_sub3_sub1_sub2
				       .anIntArray12014).length;
			     i_344_++) {
			    class656_sub1_sub3_sub1_sub2.anIntArray12014
				[i_344_]
				-= i_336_;
			    class656_sub1_sub3_sub1_sub2.anIntArray12017
				[i_344_]
				-= i_337_;
			    if ((class656_sub1_sub3_sub1_sub2.anIntArray12014
				 [i_344_]) < 0
				|| ((class656_sub1_sub3_sub1_sub2
				     .anIntArray12014[i_344_])
				    >= -1681803501 * anInt5621)
				|| (class656_sub1_sub3_sub1_sub2
				    .anIntArray12017[i_344_]) < 0
				|| ((class656_sub1_sub3_sub1_sub2
				     .anIntArray12017[i_344_])
				    >= -455149399 * anInt5622))
				bool_343_ = false;
			}
			if (bool_343_)
			    client.anIntArray11125[((client.anInt11216
						     += -639684551)
						    * 1111866889) - 1]
				= (2032864281
				   * class656_sub1_sub3_sub1_sub2.anInt11964);
			else {
			    class656_sub1_sub3_sub1_sub2
				.method18942(null, 1213716038);
			    class525_sub19.method8755(-1933461091);
			    bool = true;
			}
		    }
		    class446.method7260();
		}
	    }
	    if (bool) {
		client.anInt11276
		    = client.aClass10_11121.method687(-555730760) * 2042937351;
		int i_345_ = 0;
		Iterator iterator = client.aClass10_11121.iterator();
		while (iterator.hasNext()) {
		    Class525_Sub19 class525_sub19
			= (Class525_Sub19) iterator.next();
		    client.aClass525_Sub19Array11122[i_345_++]
			= class525_sub19;
		}
	    }
	}
	for (int i_346_ = 0; i_346_ < 2048; i_346_++) {
	    Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		= client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_346_];
	    if (class656_sub1_sub3_sub1_sub1 != null) {
		for (int i_347_ = 0;
		     (i_347_
		      < class656_sub1_sub3_sub1_sub1.anIntArray12014.length);
		     i_347_++) {
		    class656_sub1_sub3_sub1_sub1.anIntArray12014[i_347_]
			-= i_336_;
		    class656_sub1_sub3_sub1_sub1.anIntArray12017[i_347_]
			-= i_337_;
		}
		Class446 class446
		    = Class446.method7209(class656_sub1_sub3_sub1_sub1
					      .method10818().aClass446_4807);
		class446.aFloat4895 -= (float) (512 * i_336_);
		class446.aFloat4897 -= (float) (i_337_ * 512);
		class656_sub1_sub3_sub1_sub1.method10823(class446);
		class446.method7260();
	    }
	}
	Class109[] class109s = client.aClass109Array11089;
	for (int i_348_ = 0; i_348_ < class109s.length; i_348_++) {
	    Class109 class109 = class109s[i_348_];
	    if (class109 != null) {
		class109.anInt1313 -= i_336_ * 1089475072;
		class109.anInt1314 -= i_337_ * -231335424;
	    }
	}
	for (Class525_Sub12 class525_sub12
		 = ((Class525_Sub12)
		    Class525_Sub12.aClass709_10525.method14372((short) -5730));
	     class525_sub12 != null;
	     class525_sub12 = (Class525_Sub12) Class525_Sub12
						   .aClass709_10525
						   .method14353(-1504693843)) {
	    class525_sub12.anInt10514 -= 527073445 * i_336_;
	    class525_sub12.anInt10512 -= 681315175 * i_337_;
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_5632.method76((class525_sub12.anInt10519
						 * -1427028605),
						-666340588));
	    int i_349_;
	    int i_350_;
	    if ((class525_sub12.anInt10520 * 471577503 & 0x1) == 0) {
		i_349_ = -2084474039 * class602.anInt7885;
		i_350_ = 1437840657 * class602.anInt7886;
	    } else {
		i_349_ = class602.anInt7886 * 1437840657;
		i_350_ = -2084474039 * class602.anInt7885;
	    }
	    if (aClass499_5611 != Class499.aClass499_5553
		&& (i_349_ + class525_sub12.anInt10514 * -1168021715 <= 0
		    || -1370300329 * class525_sub12.anInt10512 + i_350_ <= 0
		    || (class525_sub12.anInt10514 * -1168021715
			>= -1681803501 * anInt5621)
		    || (class525_sub12.anInt10512 * -1370300329
			>= anInt5622 * -455149399)))
		class525_sub12.method8755(-1933461091);
	}
	for (Class525_Sub12 class525_sub12
		 = (Class525_Sub12) Class525_Sub12.aClass709_10526
					.method14372((short) -29815);
	     null != class525_sub12;
	     class525_sub12 = (Class525_Sub12) Class525_Sub12
						   .aClass709_10526
						   .method14353(-2010379273)) {
	    class525_sub12.anInt10514 -= i_336_ * 527073445;
	    class525_sub12.anInt10512 -= 681315175 * i_337_;
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   aClass40_Sub11_5632.method76((-1427028605
						 * class525_sub12.anInt10519),
						-46217116));
	    int i_351_;
	    int i_352_;
	    if ((471577503 * class525_sub12.anInt10520 & 0x1) == 0) {
		i_351_ = class602.anInt7885 * -2084474039;
		i_352_ = 1437840657 * class602.anInt7886;
	    } else {
		i_351_ = class602.anInt7886 * 1437840657;
		i_352_ = -2084474039 * class602.anInt7885;
	    }
	    if (Class499.aClass499_5553 != aClass499_5611
		&& (-1168021715 * class525_sub12.anInt10514 + i_351_ <= 0
		    || i_352_ + -1370300329 * class525_sub12.anInt10512 <= 0
		    || (class525_sub12.anInt10514 * -1168021715
			>= anInt5621 * -1681803501)
		    || (-1370300329 * class525_sub12.anInt10512
			>= anInt5622 * -455149399)))
		class525_sub12.method8755(-1933461091);
	}
	for (Class525_Sub23 class525_sub23
		 = ((Class525_Sub23)
		    client.aClass10_11246.method689(1047781130));
	     null != class525_sub23;
	     class525_sub23 = ((Class525_Sub23)
			       client.aClass10_11246.method690((byte) -81))) {
	    int i_353_
		= (int) (-5126207504388691097L * class525_sub23.aLong7113 >> 28
			 & 0x3L);
	    int i_354_
		= (int) (class525_sub23.aLong7113 * -5126207504388691097L
			 & 0x3fffL);
	    int i_355_ = i_354_ - aClass600_5617.anInt7858 * -1227002079;
	    int i_356_
		= (int) (-5126207504388691097L * class525_sub23.aLong7113 >> 14
			 & 0x3fffL);
	    int i_357_ = i_356_ - aClass600_5617.anInt7860 * 1429253007;
	    if (null != aClass546_5623) {
		if (i_355_ < 0 || i_357_ < 0
		    || i_355_ >= anInt5621 * -1681803501
		    || i_357_ >= anInt5622 * -455149399
		    || i_355_ >= 1761949661 * aClass546_5623.anInt7210
		    || i_357_ >= 947301287 * aClass546_5623.anInt7211) {
		    if (aClass499_5611 != Class499.aClass499_5553)
			class525_sub23.method8755(-1933461091);
		} else if (null != aClass546_5623.aClass547ArrayArrayArray7263)
		    aClass546_5623.method8964(i_353_, i_355_, i_357_,
					      2075460550);
	    }
	}
	if (0 != -183945107 * Class98.anInt1200) {
	    Class98.anInt1200 -= i_336_ * -1046245019;
	    Class98.anInt1201 -= i_337_ * -671956915;
	}
	Class384.method6437(false, -1936215710);
	if (4 == i) {
	    client.anInt11174 -= i_336_ * -819831296;
	    client.anInt11112 -= i_337_ * 63440384;
	    Class275.anInt2867 -= i_336_ * 1387371008;
	    Class381.anInt3930 -= -1224636928 * i_337_;
	    if (2 != -174799205 * Class700.anInt8779
		&& 5 != -174799205 * Class700.anInt8779)
		Class202.method3853(Class152_Sub1.method14533(-2090453561),
				    (byte) 25);
	} else {
	    Class50.anInt376 -= -833230687 * i_336_;
	    Class695.anInt8758 -= 446037575 * i_337_;
	    Class326.anInt3562 -= i_336_ * 618864241;
	    Class198_Sub16.anInt9979 -= 282518497 * i_337_;
	    Class477.anInt5200 -= -2009249280 * i_336_;
	    Class475.anInt5179 -= -182739456 * i_337_;
	    if (Math.abs(i_336_) > anInt5621 * -1681803501
		|| Math.abs(i_337_) > anInt5622 * -455149399)
		aClass635_5624.method10398(-2012200419);
	}
	Class616.method10109(883030180);
	Class587.method9690(-1359041653);
	client.aClass10_11248.method688((short) -14026);
	client.aClass709_11247.method14344(381228594);
	client.aClass708_11293.method14324(-1030890952);
	Class87.method1658(1252232373);
    }
    
    public int method8472() {
	return -1681803501 * anInt5621;
    }
    
    void method8473() {
	aClass455_Sub1_5615 = null;
	aClass455_Sub1_5652 = null;
	if (null != aClass475_5625)
	    aClass475_5625.method7764(-569278595);
	if (aClass635_5624 != null)
	    aClass635_5624.method10393((byte) -12);
	if (null != aClass546_5623) {
	    aClass546_5623.aClass557_7207.method9356(147712563);
	    aClass546_5623 = null;
	}
    }
    
    void method8474() {
	aClass455_Sub1_5615 = null;
	aClass455_Sub1_5652 = null;
	if (null != aClass475_5625)
	    aClass475_5625.method7764(-569278595);
	if (aClass635_5624 != null)
	    aClass635_5624.method10393((byte) -50);
	if (null != aClass546_5623) {
	    aClass546_5623.aClass557_7207.method9356(-1702240583);
	    aClass546_5623 = null;
	}
    }
    
    public Class529 method8475() {
	return aClass529_5629;
    }
    
    public boolean method8476() {
	if (!aBool5653)
	    Class585_Sub1.method16485(false, -33793837);
	if (-1L == 9085280138254570443L * aLong5637)
	    aLong5637 = Class251.method4508((byte) 8) * -5709647995284375069L;
	anInt5616 = 0;
	for (int i = 0; i < 1742301187 * anInt5642; i++) {
	    if (!Class322.idx_5.method7558(anIntArray5644[i],
						    (byte) 97))
		anInt5616 += -1575171941;
	}
	if (null == aClass529_5629) {
	    if (aClass525_Sub16_Sub6_5635 != null
		&& (Class597.idx_41.method7493
		    (aClass525_Sub16_Sub6_5635.aString11776, 65280))) {
		if (!Class597.idx_41.method7486
		     (aClass525_Sub16_Sub6_5635.aString11776, 1695338901))
		    anInt5616 += -1575171941;
		else
		    aClass529_5629
			= Class496.method8157(Class597.idx_41,
					      (aClass525_Sub16_Sub6_5635
					       .aString11776),
					      client.aBool11230, -2140755758);
	    } else
		aClass529_5629 = new Class529(0);
	}
	if (437378451 * anInt5616 > 0) {
	    if (-1427415721 * anInt5612 < anInt5616 * 437378451)
		anInt5612 = anInt5616 * 681680933;
	    aClass504_5636 = Class504.aClass504_5602;
	    return false;
	}
	for (int i = 0; i < 1742301187 * anInt5642; i++) {
	    if (null == aByteArrayArray5645[i])
		aByteArrayArray5645[i]
		    = Class322.idx_5.getFile(anIntArray5644[i],
							 ((Class474
							   .aClass474_5162
							   .anInt5171)
							  * -492920259),
							 1682052910);
	    if (aByteArrayArray5646[i] == null)
		aByteArrayArray5646[i]
		    = Class322.idx_5.getFile(anIntArray5644[i],
							 (-492920259
							  * (Class474
							     .aClass474_5163
							     .anInt5171)),
							 724589374);
	    if (aByteArrayArray5648[i] == null)
		aByteArrayArray5648[i]
		    = Class322.idx_5.getFile(anIntArray5644[i],
							 (-492920259
							  * (Class474
							     .aClass474_5164
							     .anInt5171)),
							 691891406);
	    if (aByteArrayArray5638[i] == null)
		aByteArrayArray5638[i]
		    = Class322.idx_5.getFile(anIntArray5644[i],
							 (-492920259
							  * (Class474
							     .aClass474_5165
							     .anInt5171)),
							 1948824161);
	    if (aByteArrayArray5639 != null && null == aByteArrayArray5639[i])
		aByteArrayArray5639[i]
		    = Class322.idx_5.getFile(anIntArray5644[i],
							 (-492920259
							  * (Class474
							     .aClass474_5168
							     .anInt5171)),
							 563874811);
	}
	int i = 29753785 * anInt5620;
	Class641 class641 = new Class641(-1);
	Class641 class641_358_ = new Class641(-1);
	anInt5620 = 0;
	for (int i_359_ = 0; i_359_ < anInt5642 * 1742301187; i_359_++) {
	    byte[] is = aByteArrayArray5646[i_359_];
	    if (is != null) {
		int i_360_ = ((anIntArray5643[i_359_] >> 8) * 64
			      - -1227002079 * aClass600_5617.anInt7858);
		int i_361_ = (64 * (anIntArray5643[i_359_] & 0xff)
			      - aClass600_5617.anInt7860 * 1429253007);
		if (aClass499_5611.method8164((short) 1519)) {
		    i_360_ = 10;
		    i_361_ = 10;
		}
		int i_362_
		    = Class25.method874(aClass40_Sub11_5632, is, i_360_,
					i_361_, anInt5621 * -1681803501,
					-455149399 * anInt5622, class641_358_,
					class641, (byte) 125);
		if (i_362_ > 0)
		    anInt5620 += i_362_ * -1209289591;
	    }
	    is = aByteArrayArray5638[i_359_];
	    if (null != is) {
		int i_363_ = (64 * (anIntArray5643[i_359_] >> 8)
			      - -1227002079 * aClass600_5617.anInt7858);
		int i_364_ = (64 * (anIntArray5643[i_359_] & 0xff)
			      - 1429253007 * aClass600_5617.anInt7860);
		if (aClass499_5611.method8164((short) -5141)) {
		    i_363_ = 10;
		    i_364_ = 10;
		}
		int i_365_
		    = Class25.method874(aClass40_Sub11_5632, is, i_363_,
					i_364_, anInt5621 * -1681803501,
					anInt5622 * -455149399, class641_358_,
					class641, (byte) 123);
		if (i_365_ > 0)
		    anInt5620 += i_365_ * -1209289591;
	    }
	}
	if (anInt5620 * 29753785 > 0) {
	    if (i == 29753785 * anInt5620) {
		if (0 != anInt5641 * 1239635535
		    && 1000 == client.anInt11083 - anInt5641 * 1239635535) {
		    Class84.method1615(class641_358_.anInt8322 * 435566763,
				       class641.anInt8322 * 435566763,
				       29753785 * anInt5620, 1580612310);
		    Class225.method4251(351547061);
		}
	    } else
		anInt5641 = client.anInt11083 * -622329681;
	    if (anInt5640 * 294671849 < anInt5620 * 29753785)
		anInt5640 = -1469490351 * anInt5620;
	    aClass504_5636 = Class504.aClass504_5603;
	    return false;
	}
	if (!aBool5653 && aClass504_5636 != Class504.aClass504_5601)
	    Class666.method11016
		(new StringBuilder().append
		     (Class53.aClass53_475.method1169(Class21.aClass666_213,
						      1552651121))
		     .append
		     (Class55.aString565).append
		     ("(100%)").toString(),
		 true, Class501.aClass182_5564, Class29.aClass175_293,
		 Class500.aClass7_5560, 306953828);
	aClass504_5636 = Class504.aClass504_5604;
	if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
	    Class40_Sub20.aClass217_11050.method4028(1377048968);
	if (!aBool5653) {
	    for (int i_366_ = 0; i_366_ < 2048; i_366_++) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_366_];
		if (class656_sub1_sub3_sub1_sub1 != null)
		    class656_sub1_sub3_sub1_sub1.aClass546_10872 = null;
	    }
	    for (int i_367_ = 0;
		 i_367_ < client.aClass525_Sub19Array11122.length; i_367_++) {
		Class525_Sub19 class525_sub19
		    = client.aClass525_Sub19Array11122[i_367_];
		if (class525_sub19 != null)
		    ((Class656_Sub1)
		     class525_sub19.anObject10571).aClass546_10872
			= null;
	    }
	}
	if (!aBool5653)
	    Class514.method8552(true, 1889586239);
	boolean bool = false;
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		.method17074(1827740515)
	    == 2) {
	    for (int i_368_ = 0; i_368_ < 1742301187 * anInt5642; i_368_++) {
		if (null != aByteArrayArray5638[i_368_]
		    || aByteArrayArray5648[i_368_] != null) {
		    bool = true;
		    break;
		}
	    }
	}
	int i_369_ = (Class404.method6609(Class198_Sub13
					      .aClass525_Sub30_9973
					      .aClass696_Sub19_10684
					      .method17144(-29047449),
					  744632419).anInt3412
		      * 1868971768);
	if (Class501.aClass182_5564.method3146())
	    i_369_++;
	method8426(1080325497);
	method8436(1164169458);
	aClass546_5623
	    = new Class546(Class501.aClass182_5564, 9, 4,
			   -1681803501 * anInt5621, anInt5622 * -455149399,
			   i_369_, bool,
			   Class501.aClass182_5564.method3242() > 0);
	aClass546_5623.method8946(false, -78289466);
	aClass546_5623.method8954(client.anInt11096 * 502828181, -615467184);
	aClass546_5623.method8993(aHashMap5649, 1470439717);
	if (0 != client.anInt11096 * 502828181)
	    aClass546_5623.method8937(Class222.aClass175_2338, 262796371);
	else
	    aClass546_5623.method8937(null, -761985179);
	aClass518_5630 = new Class518();
	aFloat5631 = -0.05F + (float) (Math.random() / 10.0);
	aClass455_Sub1_5652
	    = new Class455_Sub1(aClass546_5623, aClass40_Sub11_5632, 4,
				-1681803501 * anInt5621,
				-455149399 * anInt5622, false, aClass475_5625,
				aClass635_5624);
	aClass455_Sub1_5652.method7381(-1709081613);
	aClass455_Sub1_5652.anInt4957
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		  .method17108(444741645) * -1193814877;
	aClass455_Sub1_5652.aBool4953
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		  .method17074(387416227) == 2;
	aClass455_Sub1_5652.aBool4959
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		  .method17050(501271953) == 1;
	aClass455_Sub1_5652.aBool4960
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687
		  .method17197((byte) 110) == 1;
	aClass455_Sub1_5652.aBool4961
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		  .method16985(-2116318486) == 1;
	if (!aClass499_5611.method8164((short) -17500))
	    method8446(aClass455_Sub1_5652, aByteArrayArray5645, (byte) -84);
	else
	    method8390(aClass455_Sub1_5652, aByteArrayArray5645, 1546475413);
	if (aBool5653)
	    method8348(50, 1719883138);
	aClass635_5624.method10394(anInt5621 * -1681803501 >> 4,
				   -455149399 * anInt5622 >> 4, -867047341);
	aClass635_5624.method10382(this, 2023159996);
	if (bool) {
	    aClass546_5623.method8946(true, 1031271851);
	    aClass455_Sub1_5615
		= new Class455_Sub1(aClass546_5623, aClass40_Sub11_5632, 1,
				    anInt5621 * -1681803501,
				    -455149399 * anInt5622, true,
				    aClass475_5625, aClass635_5624);
	    aClass455_Sub1_5615.method7381(-1709081613);
	    aClass455_Sub1_5615.anInt4957
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub15_10715
		      .method17108(1003818834) * -1193814877;
	    aClass455_Sub1_5615.aBool4953
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub12_10698
		      .method17074(-251793530) == 2;
	    aClass455_Sub1_5615.aBool4959
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		      .method17050(501271953) == 1;
	    aClass455_Sub1_5615.aBool4960
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687
		      .method17197((byte) 30) == 1;
	    aClass455_Sub1_5615.aBool4961
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub4_10728
		      .method16985(960569624) == 1;
	    if (!aClass499_5611.method8164((short) -20789)) {
		method8446(aClass455_Sub1_5615, aByteArrayArray5648,
			   (byte) -43);
		if (!aBool5653)
		    Class585_Sub1.method16485(true, 154138925);
	    } else {
		method8390(aClass455_Sub1_5615, aByteArrayArray5648,
			   -99437594);
		if (!aBool5653)
		    Class585_Sub1.method16485(true, -2136619867);
	    }
	    aClass455_Sub1_5615.method7382(0,
					   (aClass455_Sub1_5652
					    .anIntArrayArrayArray4966[0]),
					   1488795813);
	    aClass455_Sub1_5615.method7420(Class501.aClass182_5564, null,
					   1861371506);
	    aClass546_5623.method8946(false, 506287119);
	    if (aBool5653)
		method8348(50, -1152456065);
	}
	aClass455_Sub1_5652.method7420(Class501.aClass182_5564,
				       (bool
					? (aClass455_Sub1_5615
					   .anIntArrayArrayArray4966)
					: null),
				       1797207639);
	if (!aClass499_5611.method8164((short) -31456)) {
	    if (!aBool5653)
		Class585_Sub1.method16485(true, 1179230700);
	    method8391(aClass455_Sub1_5652, aByteArrayArray5646, 1336632543);
	    if (null != aByteArrayArray5639)
		method8484((byte) -6);
	} else {
	    if (!aBool5653)
		Class585_Sub1.method16485(true, -669065333);
	    method8392(aClass455_Sub1_5652, aByteArrayArray5646, -2008151317);
	}
	if (!aBool5653)
	    Class585_Sub1.method16485(true, -120664964);
	aClass455_Sub1_5652.method7384(Class501.aClass182_5564,
				       (bool
					? aClass546_5623.aClass161Array7249[0]
					: null),
				       null, (byte) 11);
	if (aBool5653)
	    method8348(75, 911341850);
	aClass455_Sub1_5652.method15969(Class501.aClass182_5564, false,
					870220807);
	if (aBool5653)
	    method8348(75, -212194164);
	if (!aBool5653)
	    Class585_Sub1.method16485(true, -682933326);
	if (bool) {
	    aClass546_5623.method8946(true, 1375874912);
	    if (!aBool5653)
		Class585_Sub1.method16485(true, -929208894);
	    if (!aClass499_5611.method8164((short) 5621))
		method8391(aClass455_Sub1_5615, aByteArrayArray5638,
			   2022443282);
	    else
		method8392(aClass455_Sub1_5615, aByteArrayArray5638,
			   -2016728998);
	    if (!aBool5653)
		Class585_Sub1.method16485(true, 119537835);
	    aClass455_Sub1_5615.method7384(Class501.aClass182_5564, null,
					   (aClass546_5623.aClass161Array7215
					    [0]),
					   (byte) -42);
	    aClass455_Sub1_5615.method15969(Class501.aClass182_5564, true,
					    1071201953);
	    if (!aBool5653)
		Class585_Sub1.method16485(true, -1020103924);
	    aClass546_5623.method8946(false, 194652226);
	    if (aBool5653)
		method8348(50, -787695702);
	}
	aClass455_Sub1_5652.method7376(-1419218615);
	if (aClass455_Sub1_5615 != null)
	    aClass455_Sub1_5615.method7376(-1980382298);
	aClass546_5623.method8939(-1627562176);
	if (aBool5653) {
	    Class251.method4508((byte) 8);
	    while (!Class501.aClass182_5564.method3231(1440774979))
		method8348(1, -206075359);
	}
	boolean bool_370_ = false;
	if (aBool5653) {
	    Class507 class507_371_ = client.aClass507_11137;
	    method8374(class507_371_, 1954657765);
	    Class45.aClass500_349.method8173(class507_371_, (byte) 124);
	    bool_370_ = true;
	    Class251.method4508((byte) 8);
	    synchronized (client.anObject11140) {
		client.aBool11138 = true;
		try {
		    client.anObject11140.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	    client.aClass507_11137 = this;
	    class507_371_.method8436(619743978);
	    method8468(4, 2010024);
	    method8383((byte) 16);
	} else {
	    Class40_Sub20.aClass217_11050.method4028(2036303640);
	    aClass635_5624.method10401((short) 8704);
	    Class473.method7753((byte) 2);
	}
	for (int i_372_ = 0; i_372_ < 4; i_372_++) {
	    for (int i_373_ = 0; i_373_ < -1681803501 * anInt5621; i_373_++) {
		for (int i_374_ = 0; i_374_ < -455149399 * anInt5622; i_374_++)
		    Class685.method11253(i_372_, i_373_, i_374_, 1428719603);
	    }
	}
	for (int i_375_ = 0; i_375_ < client.aClass523Array11183.length;
	     i_375_++) {
	    if (client.aClass523Array11183[i_375_] != null)
		client.aClass523Array11183[i_375_].method8710(1425817786);
	}
	Class559.method9401((byte) -92);
	Class531_Sub4.method15956((short) -6089);
	if (Class669.method11036(200612845) == Class508.aClass508_5657
	    && client.aClass96_11085.method1799((byte) 0) != null
	    && 4 == client.anInt11075 * 1777895575) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4375,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16605(1057001181,
								  -1332635917);
	    client.aClass96_11085.method1794(class525_sub15, (short) 31635);
	}
	if (!aClass499_5611.method8164((short) -11616)) {
	    int i_376_
		= ((-195931011 * anInt5619 - (anInt5621 * -1681803501 >> 4))
		   / 8);
	    int i_377_
		= (((anInt5621 * -1681803501 >> 4) + anInt5619 * -195931011)
		   / 8);
	    int i_378_
		= ((anInt5650 * -1479322619 - (anInt5622 * -455149399 >> 4))
		   / 8);
	    int i_379_
		= ((anInt5650 * -1479322619 + (-455149399 * anInt5622 >> 4))
		   / 8);
	    for (int i_380_ = i_376_ - 1; i_380_ <= 1 + i_377_; i_380_++) {
		for (int i_381_ = i_378_ - 1; i_381_ <= i_379_ + 1; i_381_++) {
		    if (i_380_ < i_376_ || i_380_ > i_377_ || i_381_ < i_378_
			|| i_381_ > i_379_)
			Class322.idx_5.method7475
			    (method8469(i_380_, i_381_, (byte) 33), 365301245);
		}
	    }
	}
	long l
	    = Class251.method4508((byte) 8) - aLong5637 * 9085280138254570443L;
	if (13 == client.anInt11075 * 1777895575)
	    Class441.method7119(1, 936969528);
	else if (1777895575 * client.anInt11075 == 18)
	    Class441.method7119(16, 1330782803);
	else if (15 == client.anInt11075 * 1777895575)
	    Class441.method7119(17, 766354702);
	else if (1777895575 * client.anInt11075 == 2)
	    Class441.method7119(9, -1831733930);
	else {
	    Class441.method7119(7, 540452727);
	    if (client.aClass96_11085.method1799((byte) 0) != null) {
		Class525_Sub15 class525_sub15
		    = Class16.method767(Class412.aClass412_4378,
					client.aClass96_11085.aClass6_1169,
					1977859884);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16605((int) l, -2127151935);
		client.aClass96_11085.method1794(class525_sub15,
						 (short) 27370);
	    }
	}
	if (aBool5628) {
	    Class268.method4961(Long.toString(Class251.method4508((byte) 8)
					      - (aLong5651
						 * -342806333469470689L)),
				1808129797);
	    aBool5628 = false;
	}
	if (bool_370_) {
	    synchronized (client.anObject11123) {
		client.anObject11123.notify();
	    }
	}
	return true;
    }
    
    void method8477(Class525_Sub38_Sub2 class525_sub38_sub2) {
	boolean bool = class525_sub38_sub2.method16660(229301913) == 1;
	int i = class525_sub38_sub2.method16668((byte) -50);
	int i_382_ = class525_sub38_sub2.readUnsignedByte(95009463);
	int i_383_ = class525_sub38_sub2.method16607(-1571461918);
	anInt5647 = class525_sub38_sub2.method16660(1322584510) * 667477991;
	int i_384_ = class525_sub38_sub2.method16668((byte) -26);
	if (!aBool5653)
	    method8383((byte) 16);
	method8382(Class683.method11230(i_383_, 600669539), -1851629855);
	anIntArray5643 = new int[i_382_];
	anIntArray5644 = new int[i_382_];
	aByteArrayArray5645 = new byte[i_382_][];
	aByteArrayArray5646 = new byte[i_382_][];
	aByteArrayArray5639 = null;
	aByteArrayArray5648 = new byte[i_382_][];
	aByteArrayArray5638 = new byte[i_382_][];
	i_382_ = 0;
	for (int i_385_ = (i_384_ - (-1681803501 * anInt5621 >> 4)) / 8;
	     i_385_ <= (i_384_ + (anInt5621 * -1681803501 >> 4)) / 8;
	     i_385_++) {
	    for (int i_386_ = (i - (anInt5622 * -455149399 >> 4)) / 8;
		 i_386_ <= ((anInt5622 * -455149399 >> 4) + i) / 8; i_386_++) {
		if (Class322.idx_5.method7536
		    (method8469(i_385_, i_386_, (byte) 117),
		     Class474.aClass474_5162.anInt5171 * -492920259,
		     343254093)) {
		    anIntArray5643[i_382_] = (i_385_ << 8) + i_386_;
		    anIntArray5644[i_382_]
			= method8469(i_385_, i_386_, (byte) 31);
		    i_382_++;
		}
	    }
	}
	anInt5642 = 1314030251 * i_382_;
	method8384(i_384_, i, 4, bool, (byte) -84);
    }
    
    void method8478(int i) {
	try {
	    Thread.sleep((long) i);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method8479(Class455_Sub1 class455_sub1, byte[][] is) {
	int i = is.length;
	for (int i_387_ = 0; i_387_ < i; i_387_++) {
	    byte[] is_388_ = is[i_387_];
	    if (null != is_388_) {
		RSBuffer class525_sub38 = new RSBuffer(is_388_);
		int i_389_ = anIntArray5643[i_387_] >> 8;
		int i_390_ = anIntArray5643[i_387_] & 0xff;
		int i_391_
		    = i_389_ * 64 - -1227002079 * aClass600_5617.anInt7858;
		int i_392_
		    = i_390_ * 64 - aClass600_5617.anInt7860 * 1429253007;
		if (!aBool5653 && Class40_Sub20.aClass217_11050 != null)
		    Class40_Sub20.aClass217_11050.method4028(1354021379);
		class455_sub1.method7434(class525_sub38, i_391_, i_392_,
					 (-1227002079
					  * aClass600_5617.anInt7858),
					 1429253007 * aClass600_5617.anInt7860,
					 1638233477);
		class455_sub1.method15961(Class501.aClass182_5564,
					  class525_sub38, i_391_, i_392_,
					  (byte) -32);
	    }
	}
	for (int i_393_ = 0; i_393_ < i; i_393_++) {
	    int i_394_ = ((anIntArray5643[i_393_] >> 8) * 64
			  - aClass600_5617.anInt7858 * -1227002079);
	    int i_395_ = ((anIntArray5643[i_393_] & 0xff) * 64
			  - aClass600_5617.anInt7860 * 1429253007);
	    byte[] is_396_ = is[i_393_];
	    if (is_396_ == null && -1479322619 * anInt5650 < 800) {
		if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
		    Class40_Sub20.aClass217_11050.method4028(1153772603);
		class455_sub1.method7377(i_394_, i_395_, 64, 64, 291078942);
	    }
	}
    }
    
    void method8480(Class455_Sub1 class455_sub1, byte[][] is) {
	int i = is.length;
	for (int i_397_ = 0; i_397_ < i; i_397_++) {
	    byte[] is_398_ = is[i_397_];
	    if (null != is_398_) {
		RSBuffer class525_sub38 = new RSBuffer(is_398_);
		int i_399_ = anIntArray5643[i_397_] >> 8;
		int i_400_ = anIntArray5643[i_397_] & 0xff;
		int i_401_
		    = i_399_ * 64 - -1227002079 * aClass600_5617.anInt7858;
		int i_402_
		    = i_400_ * 64 - aClass600_5617.anInt7860 * 1429253007;
		if (!aBool5653 && Class40_Sub20.aClass217_11050 != null)
		    Class40_Sub20.aClass217_11050.method4028(1791660623);
		class455_sub1.method7434(class525_sub38, i_401_, i_402_,
					 (-1227002079
					  * aClass600_5617.anInt7858),
					 1429253007 * aClass600_5617.anInt7860,
					 1638233477);
		class455_sub1.method15961(Class501.aClass182_5564,
					  class525_sub38, i_401_, i_402_,
					  (byte) -99);
	    }
	}
	for (int i_403_ = 0; i_403_ < i; i_403_++) {
	    int i_404_ = ((anIntArray5643[i_403_] >> 8) * 64
			  - aClass600_5617.anInt7858 * -1227002079);
	    int i_405_ = ((anIntArray5643[i_403_] & 0xff) * 64
			  - aClass600_5617.anInt7860 * 1429253007);
	    byte[] is_406_ = is[i_403_];
	    if (is_406_ == null && -1479322619 * anInt5650 < 800) {
		if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
		    Class40_Sub20.aClass217_11050.method4028(1579905966);
		class455_sub1.method7377(i_404_, i_405_, 64, 64, -1382084892);
	    }
	}
    }
    
    public byte[][][] method8481() {
	return aByteArrayArrayArray5655;
    }
    
    void method8482(Class455_Sub1 class455_sub1, byte[][] is) {
	int i = is.length;
	for (int i_407_ = 0; i_407_ < i; i_407_++) {
	    byte[] is_408_ = is[i_407_];
	    if (null != is_408_) {
		RSBuffer class525_sub38 = new RSBuffer(is_408_);
		int i_409_ = anIntArray5643[i_407_] >> 8;
		int i_410_ = anIntArray5643[i_407_] & 0xff;
		int i_411_
		    = i_409_ * 64 - -1227002079 * aClass600_5617.anInt7858;
		int i_412_
		    = i_410_ * 64 - aClass600_5617.anInt7860 * 1429253007;
		if (!aBool5653 && Class40_Sub20.aClass217_11050 != null)
		    Class40_Sub20.aClass217_11050.method4028(1517842084);
		class455_sub1.method7434(class525_sub38, i_411_, i_412_,
					 (-1227002079
					  * aClass600_5617.anInt7858),
					 1429253007 * aClass600_5617.anInt7860,
					 1638233477);
		class455_sub1.method15961(Class501.aClass182_5564,
					  class525_sub38, i_411_, i_412_,
					  (byte) -66);
	    }
	}
	for (int i_413_ = 0; i_413_ < i; i_413_++) {
	    int i_414_ = ((anIntArray5643[i_413_] >> 8) * 64
			  - aClass600_5617.anInt7858 * -1227002079);
	    int i_415_ = ((anIntArray5643[i_413_] & 0xff) * 64
			  - aClass600_5617.anInt7860 * 1429253007);
	    byte[] is_416_ = is[i_413_];
	    if (is_416_ == null && -1479322619 * anInt5650 < 800) {
		if (!aBool5653 && null != Class40_Sub20.aClass217_11050)
		    Class40_Sub20.aClass217_11050.method4028(927710451);
		class455_sub1.method7377(i_414_, i_415_, 64, 64, 747701659);
	    }
	}
    }
    
    void method8483(Class455_Sub1 class455_sub1, byte[][] is) {
	for (int i = 0; i < anInt5642 * 1742301187; i++) {
	    byte[] is_417_ = is[i];
	    if (null != is_417_) {
		int i_418_ = ((anIntArray5643[i] >> 8) * 64
			      - aClass600_5617.anInt7858 * -1227002079);
		int i_419_ = ((anIntArray5643[i] & 0xff) * 64
			      - 1429253007 * aClass600_5617.anInt7860);
		if (!aBool5653)
		    Class40_Sub20.aClass217_11050.method4028(1545233520);
		class455_sub1.method15963(Class501.aClass182_5564, is_417_,
					  i_418_, i_419_, 2138488333);
		if (aBool5653)
		    method8348(10, -1323012494);
	    }
	}
    }
    
    void method8484(byte i) {
	int i_420_ = aByteArrayArray5639.length;
	for (int i_421_ = 0; i_421_ < i_420_; i_421_++) {
	    if (aByteArrayArray5639[i_421_] != null) {
		int i_422_ = -1;
		for (int i_423_ = 0; i_423_ < -196462909 * client.anInt11129;
		     i_423_++) {
		    if (anIntArray5643[i_421_]
			== client.anIntArray11141[i_423_]) {
			i_422_ = i_423_;
			break;
		    }
		}
		if (-1 == i_422_) {
		    client.anIntArray11141[client.anInt11129 * -196462909]
			= anIntArray5643[i_421_];
		    i_422_
			= (client.anInt11129 += -170677781) * -196462909 - 1;
		}
		RSBuffer class525_sub38
		    = new RSBuffer(aByteArrayArray5639[i_421_]);
		int i_424_ = 0;
		while ((-1133521593 * class525_sub38.index
			< aByteArrayArray5639[i_421_].length)
		       && i_424_ < 511
		       && client.anInt11216 * 1111866889 < 1023) {
		    int i_425_ = i_422_ | i_424_++ << 6;
		    int i_426_ = class525_sub38.readUnsignedShort((byte) 87);
		    int i_427_ = i_426_ >> 14;
		    int i_428_ = i_426_ >> 7 & 0x3f;
		    int i_429_ = i_426_ & 0x3f;
		    int i_430_
			= (64 * (anIntArray5643[i_421_] >> 8)
			   - -1227002079 * aClass600_5617.anInt7858 + i_428_);
		    int i_431_
			= (64 * (anIntArray5643[i_421_] & 0xff)
			   - aClass600_5617.anInt7860 * 1429253007 + i_429_);
		    NPCDefinitions class299
			= (NPCDefinitions) (Class168_Sub1.aClass40_Sub7_9112.method76
				      (class525_sub38.readUnsignedShort((byte) 105),
				       -1833054331));
		    Class525_Sub19 class525_sub19
			= ((Class525_Sub19)
			   client.aClass10_11121.method684((long) i_425_));
		    if (null == class525_sub19
			&& (class299.aByte3335 & 0x1) > 0 && i_430_ >= 0
			&& (i_430_ + class299.anInt3291 * 1035256919
			    < anInt5621 * -1681803501)
			&& i_431_ >= 0
			&& (i_431_ + 1035256919 * class299.anInt3291
			    < anInt5622 * -455149399)) {
			Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
			    = new Class656_Sub1_Sub3_Sub1_Sub2(aClass546_5623);
			class656_sub1_sub3_sub1_sub2.anInt11964
			    = -447377367 * i_425_;
			Class525_Sub19 class525_sub19_432_
			    = new Class525_Sub19(class656_sub1_sub3_sub1_sub2);
			client.aClass10_11121.method695(class525_sub19_432_,
							(long) i_425_);
			client.aClass525_Sub19Array11122[((client.anInt11276
							   += 2042937351)
							  * 1530572215) - 1]
			    = class525_sub19_432_;
			client.anIntArray11125[((client.anInt11216
						 += -639684551) * 1111866889
						- 1)]
			    = i_425_;
			class656_sub1_sub3_sub1_sub2.anInt12006
			    = client.anInt11083 * 473756327;
			class656_sub1_sub3_sub1_sub2.method18942(class299,
								 852804627);
			class656_sub1_sub3_sub1_sub2.method18607
			    (1035256919 * (class656_sub1_sub3_sub1_sub2
					   .aClass299_12255.anInt3291),
			     133251852);
			class656_sub1_sub3_sub1_sub2.anInt12003
			    = (-1104516755
			       * (-412681569 * (class656_sub1_sub3_sub1_sub2
						.aClass299_12255.anInt3322)
				  << 3));
			class656_sub1_sub3_sub1_sub2.method18597
			    (class656_sub1_sub3_sub1_sub2.aClass299_12255
				 .aClass682_3284.method11222
				 (-992188829).method80() << 11 & 0x3fff,
			     true, (byte) 1);
			class656_sub1_sub3_sub1_sub2.method18945
			    (i_427_, i_430_, i_431_, true,
			     class656_sub1_sub3_sub1_sub2
				 .method18608((byte) 85),
			     1763920890);
		    }
		}
	    }
	}
    }
    
    public int method8485() {
	return 100 - anInt5616 * 788172140 / (anInt5612 * -1427415721);
    }
    
    static final void method8486(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 2054207119 * class259.anInt2598;
    }
    
    static final void method8487(Class683 class683, int i) {
	Class603_Sub1 class603_sub1 = Class584.method9643(33664141);
	if (null != class603_sub1) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1721515947 * class603_sub1.anInt10883;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 36102555 * class603_sub1.anInt7951;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.aString10881;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.method16997(-1076584796);
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.method16995((byte) 92);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt7953 * 1234139243;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class603_sub1.anInt10882 * 1803394105;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class603_sub1.aString10880;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	}
    }
    
    public static boolean method8488(int i, int i_433_) {
	return ((i >= -1214990409 * Class608.aClass608_7981.anInt7995
		 && i <= Class608.aClass608_7979.anInt7995 * -1214990409)
		|| i == Class608.aClass608_7980.anInt7995 * -1214990409);
    }
    
    static final int method8489(int i, int i_434_, int i_435_) {
	int i_436_
	    = (Class514.method8553(i + 45365, 91923 + i_434_, 4, 137842404)
	       - 128
	       + (Class514.method8553(10294 + i, 37821 + i_434_, 2,
				      1533190749) - 128
		  >> 1)
	       + (Class514.method8553(i, i_434_, 1, -453443845) - 128 >> 2));
	i_436_ = 35 + (int) ((double) i_436_ * 0.3);
	if (i_436_ < 10)
	    i_436_ = 10;
	else if (i_436_ > 60)
	    i_436_ = 60;
	return i_436_;
    }
}
