/* Class309_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class309_Sub1 extends Class309
{
    int anInt10138 = 0;
    
    public int method15748(int i) {
	anInt10138 += 25249695;
	if (164762719 * anInt10138 == 126)
	    anInt10138 = 0;
	return 164762719 * anInt10138;
    }
    
    public void method15749(RSBuffer class525_sub38, int i) {
	int i_0_ = -1133521593 * class525_sub38.index;
	int i_1_ = class525_sub38.readUnsignedByte(208317925);
	method5572(Class86.method1649(i_1_ & 0x1, (byte) 97), 1737444226);
	if ((i_1_ & 0x8) != 0) {
	    Class298 class298
		= Class295.method5352(class525_sub38.readUnsignedByte(845112505),
				      -1946561151);
	    if (aClass298_3430 != class298) {
		try {
		    method5578(class298, true, (byte) -83);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if (0 != (i_1_ & 0x10)) {
	    Class289 class289
		= Class538.method8883(class525_sub38.readUnsignedByte(1978108432),
				      16711935);
	    if (class289 != aClass289_3432) {
		try {
		    method5552(class289, true, 1196076041);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if ((i_1_ >> 7 & 0x1) == 1) {
	    int i_2_ = class525_sub38.readUnsignedShort((byte) 42);
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3264.anInt3273 & 0x1)
		== 1)
		aClass446_3438.method7215(class525_sub38);
	    if (1 == (i_2_ >> Class297.aClass297_3260.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3439.method7215(class525_sub38);
	    if (1 == (i_2_ >> Class297.aClass297_3258.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3441.method7215(class525_sub38);
	    if ((i_2_ >> Class297.aClass297_3261.anInt3273 * -1933461091 & 0x1)
		== 1)
		aClass446_3442.method7215(class525_sub38);
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3268.anInt3273 & 0x1)
		== 1) {
		aFloat3453 = class525_sub38.method16634(-1948902721);
		aFloat3436 = class525_sub38.method16634(-716753839);
	    }
	    if ((i_2_ >> Class297.aClass297_3263.anInt3273 * -1933461091 & 0x1)
		== 1) {
		aFloat3457 = class525_sub38.method16634(-141424780);
		aFloat3458 = class525_sub38.method16634(495554264);
	    }
	    if ((i_2_ >> Class297.aClass297_3272.anInt3273 * -1933461091 & 0x1)
		== 1)
		aClass311_3443
		    = Class233.method4396(class525_sub38
					      .readUnsignedByte(341604544),
					  (short) 12018);
	    if ((i_2_ >> Class297.aClass297_3265.anInt3273 * -1933461091 & 0x1)
		== 1) {
		anInt3447
		    = class525_sub38.method16834(-1994884458) * -1771211287;
		class525_sub38.readUnsignedByte(820220827);
	    }
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3266.anInt3273 & 0x1)
		== 1) {
		int i_3_ = class525_sub38.readUnsignedByte(1735994489);
		aBool3456 = 1 == (i_3_ & 0x1);
		aBool3460 = 2 == (i_3_ & 0x2);
	    }
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3267.anInt3273 & 0x1)
		== 1) {
		int i_4_ = class525_sub38.readUnsignedByte(966003267);
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    int i_6_ = class525_sub38.readUnsignedByte(2023094033);
		    int i_7_ = class525_sub38.readUnsignedByte(1408270868);
		    if (0 == i_6_)
			method5530(i_7_, -2077374889);
		    else {
			Class264 class264
			    = Class236.method4413(class525_sub38
						      .readUnsignedByte(1734782101),
						  (byte) -127);
			boolean bool = true;
			Iterator iterator = aClass10_3463.iterator();
			while (iterator.hasNext()) {
			    Class525_Sub16_Sub9 class525_sub16_sub9
				= (Class525_Sub16_Sub9) iterator.next();
			    if (i_7_ == (1940820665
					 * class525_sub16_sub9.anInt11794)) {
				class525_sub16_sub9.method18304(class525_sub38,
								2045499837);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method5551(Class536.method8874(i_7_, class264,
							   class525_sub38,
							   (byte) 15),
				       -377486597);
		    }
		}
	    }
	    if ((i_2_ >> Class297.aClass297_3259.anInt3273 * -1933461091 & 0x1)
		== 1) {
		anInt3461 = class525_sub38.readUnsignedShort((byte) 15) * 1804307341;
		aFloat3462 = class525_sub38.method16634(-1920696999);
	    }
	    if (1 == (i_2_ >> Class297.aClass297_3269.anInt3273 * -1933461091
		      & 0x1))
		aClass302_3455
		    = Class300.method5398(class525_sub38
					      .readUnsignedByte(1223332961),
					  (short) -32378);
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3270.anInt3273 & 0x1)
		== 1) {
		aClass446_3428.method7215(class525_sub38);
		aClass446_3450.method7215(class525_sub38);
		aFloat3451 = class525_sub38.method16634(479324167);
		aFloat3452 = class525_sub38.method16634(-51879662);
	    }
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3271.anInt3273 & 0x1)
		== 1)
		class525_sub38.method16634(-2112933781);
	    if ((i_2_ >> -1933461091 * Class297.aClass297_3262.anInt3273 & 0x1)
		== 1)
		aFloat3433 = class525_sub38.method16634(-501050559);
	}
	if (null != aClass704_3431 && 1 == (i_1_ >> 5 & 0x1))
	    aClass704_3431.method14285(class525_sub38, 1102994141);
	if (aClass350_3427 != null && 1 == (i_1_ >> 6 & 0x1))
	    aClass350_3427.method6145(class525_sub38, 527422965);
	if (-1133521593 * class525_sub38.index - i_0_ != i)
	    throw new RuntimeException(new StringBuilder().append
					   (-1133521593 * (class525_sub38
							   .index) - i_0_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public void method15750(RSBuffer class525_sub38, int i, int i_8_) {
	int i_9_ = -1133521593 * class525_sub38.index;
	int i_10_ = class525_sub38.readUnsignedByte(429920997);
	method5572(Class86.method1649(i_10_ & 0x1, (byte) 127), 2007303911);
	if ((i_10_ & 0x8) != 0) {
	    Class298 class298
		= Class295.method5352(class525_sub38.readUnsignedByte(2140458199),
				      273100651);
	    if (aClass298_3430 != class298) {
		try {
		    method5578(class298, true, (byte) -119);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if (0 != (i_10_ & 0x10)) {
	    Class289 class289
		= Class538.method8883(class525_sub38.readUnsignedByte(1576819510),
				      16711935);
	    if (class289 != aClass289_3432) {
		try {
		    method5552(class289, true, 1196076041);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if ((i_10_ >> 7 & 0x1) == 1) {
	    int i_11_ = class525_sub38.readUnsignedShort((byte) 113);
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3264.anInt3273
		 & 0x1)
		== 1)
		aClass446_3438.method7215(class525_sub38);
	    if (1 == (i_11_ >> Class297.aClass297_3260.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3439.method7215(class525_sub38);
	    if (1 == (i_11_ >> Class297.aClass297_3258.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3441.method7215(class525_sub38);
	    if ((i_11_ >> Class297.aClass297_3261.anInt3273 * -1933461091
		 & 0x1)
		== 1)
		aClass446_3442.method7215(class525_sub38);
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3268.anInt3273
		 & 0x1)
		== 1) {
		aFloat3453 = class525_sub38.method16634(850558040);
		aFloat3436 = class525_sub38.method16634(-125209647);
	    }
	    if ((i_11_ >> Class297.aClass297_3263.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		aFloat3457 = class525_sub38.method16634(-1218684350);
		aFloat3458 = class525_sub38.method16634(-713731195);
	    }
	    if ((i_11_ >> Class297.aClass297_3272.anInt3273 * -1933461091
		 & 0x1)
		== 1)
		aClass311_3443
		    = Class233.method4396(class525_sub38
					      .readUnsignedByte(1732181527),
					  (short) 17830);
	    if ((i_11_ >> Class297.aClass297_3265.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		anInt3447
		    = class525_sub38.method16834(-1994884458) * -1771211287;
		class525_sub38.readUnsignedByte(1798811397);
	    }
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3266.anInt3273
		 & 0x1)
		== 1) {
		int i_12_ = class525_sub38.readUnsignedByte(496637588);
		aBool3456 = 1 == (i_12_ & 0x1);
		aBool3460 = 2 == (i_12_ & 0x2);
	    }
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3267.anInt3273
		 & 0x1)
		== 1) {
		int i_13_ = class525_sub38.readUnsignedByte(1723652842);
		for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
		    int i_15_ = class525_sub38.readUnsignedByte(1841374364);
		    int i_16_ = class525_sub38.readUnsignedByte(141290837);
		    if (0 == i_15_)
			method5530(i_16_, -1559890163);
		    else {
			Class264 class264
			    = Class236.method4413(class525_sub38
						      .readUnsignedByte(617058556),
						  (byte) -24);
			boolean bool = true;
			Iterator iterator = aClass10_3463.iterator();
			while (iterator.hasNext()) {
			    Class525_Sub16_Sub9 class525_sub16_sub9
				= (Class525_Sub16_Sub9) iterator.next();
			    if (i_16_ == (1940820665
					  * class525_sub16_sub9.anInt11794)) {
				class525_sub16_sub9.method18304(class525_sub38,
								-851844892);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method5551(Class536.method8874(i_16_, class264,
							   class525_sub38,
							   (byte) 94),
				       613895797);
		    }
		}
	    }
	    if ((i_11_ >> Class297.aClass297_3259.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		anInt3461 = class525_sub38.readUnsignedShort((byte) 49) * 1804307341;
		aFloat3462 = class525_sub38.method16634(-1775010472);
	    }
	    if (1 == (i_11_ >> Class297.aClass297_3269.anInt3273 * -1933461091
		      & 0x1))
		aClass302_3455
		    = Class300.method5398(class525_sub38
					      .readUnsignedByte(787985737),
					  (short) -21679);
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3270.anInt3273
		 & 0x1)
		== 1) {
		aClass446_3428.method7215(class525_sub38);
		aClass446_3450.method7215(class525_sub38);
		aFloat3451 = class525_sub38.method16634(463767298);
		aFloat3452 = class525_sub38.method16634(550559869);
	    }
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3271.anInt3273
		 & 0x1)
		== 1)
		class525_sub38.method16634(35326657);
	    if ((i_11_ >> -1933461091 * Class297.aClass297_3262.anInt3273
		 & 0x1)
		== 1)
		aFloat3433 = class525_sub38.method16634(-2036313177);
	}
	if (null != aClass704_3431 && 1 == (i_10_ >> 5 & 0x1))
	    aClass704_3431.method14285(class525_sub38, 1619502838);
	if (aClass350_3427 != null && 1 == (i_10_ >> 6 & 0x1))
	    aClass350_3427.method6145(class525_sub38, 1162096091);
	if (-1133521593 * class525_sub38.index - i_9_ != i)
	    throw new RuntimeException(new StringBuilder().append
					   (-1133521593 * (class525_sub38
							   .index) - i_9_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public int method15751() {
	anInt10138 += 25249695;
	if (164762719 * anInt10138 == 126)
	    anInt10138 = 0;
	return 164762719 * anInt10138;
    }
    
    public Class309_Sub1(Interface30 interface30) {
	super(Class304.aClass304_3408, interface30);
    }
    
    public int method15752() {
	anInt10138 += 25249695;
	if (164762719 * anInt10138 == 126)
	    anInt10138 = 0;
	return 164762719 * anInt10138;
    }
    
    public void method15753(RSBuffer class525_sub38, int i) {
	int i_17_ = -1133521593 * class525_sub38.index;
	int i_18_ = class525_sub38.readUnsignedByte(1023990881);
	method5572(Class86.method1649(i_18_ & 0x1, (byte) 41), 1473604493);
	if ((i_18_ & 0x8) != 0) {
	    Class298 class298
		= Class295.method5352(class525_sub38.readUnsignedByte(864351972),
				      -590489895);
	    if (aClass298_3430 != class298) {
		try {
		    method5578(class298, true, (byte) -45);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if (0 != (i_18_ & 0x10)) {
	    Class289 class289
		= Class538.method8883(class525_sub38.readUnsignedByte(1274963655),
				      16711935);
	    if (class289 != aClass289_3432) {
		try {
		    method5552(class289, true, 1196076041);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if ((i_18_ >> 7 & 0x1) == 1) {
	    int i_19_ = class525_sub38.readUnsignedShort((byte) 44);
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3264.anInt3273
		 & 0x1)
		== 1)
		aClass446_3438.method7215(class525_sub38);
	    if (1 == (i_19_ >> Class297.aClass297_3260.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3439.method7215(class525_sub38);
	    if (1 == (i_19_ >> Class297.aClass297_3258.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3441.method7215(class525_sub38);
	    if ((i_19_ >> Class297.aClass297_3261.anInt3273 * -1933461091
		 & 0x1)
		== 1)
		aClass446_3442.method7215(class525_sub38);
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3268.anInt3273
		 & 0x1)
		== 1) {
		aFloat3453 = class525_sub38.method16634(-858148903);
		aFloat3436 = class525_sub38.method16634(-869496990);
	    }
	    if ((i_19_ >> Class297.aClass297_3263.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		aFloat3457 = class525_sub38.method16634(-1425705231);
		aFloat3458 = class525_sub38.method16634(875651786);
	    }
	    if ((i_19_ >> Class297.aClass297_3272.anInt3273 * -1933461091
		 & 0x1)
		== 1)
		aClass311_3443
		    = Class233.method4396(class525_sub38
					      .readUnsignedByte(1955478521),
					  (short) 30474);
	    if ((i_19_ >> Class297.aClass297_3265.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		anInt3447
		    = class525_sub38.method16834(-1994884458) * -1771211287;
		class525_sub38.readUnsignedByte(1182434077);
	    }
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3266.anInt3273
		 & 0x1)
		== 1) {
		int i_20_ = class525_sub38.readUnsignedByte(1906964181);
		aBool3456 = 1 == (i_20_ & 0x1);
		aBool3460 = 2 == (i_20_ & 0x2);
	    }
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3267.anInt3273
		 & 0x1)
		== 1) {
		int i_21_ = class525_sub38.readUnsignedByte(2104055395);
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
		    int i_23_ = class525_sub38.readUnsignedByte(1061341996);
		    int i_24_ = class525_sub38.readUnsignedByte(1391692456);
		    if (0 == i_23_)
			method5530(i_24_, -1699278698);
		    else {
			Class264 class264
			    = Class236.method4413(class525_sub38
						      .readUnsignedByte(1470151492),
						  (byte) -55);
			boolean bool = true;
			Iterator iterator = aClass10_3463.iterator();
			while (iterator.hasNext()) {
			    Class525_Sub16_Sub9 class525_sub16_sub9
				= (Class525_Sub16_Sub9) iterator.next();
			    if (i_24_ == (1940820665
					  * class525_sub16_sub9.anInt11794)) {
				class525_sub16_sub9.method18304(class525_sub38,
								-1725358056);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method5551(Class536.method8874(i_24_, class264,
							   class525_sub38,
							   (byte) 51),
				       -747536542);
		    }
		}
	    }
	    if ((i_19_ >> Class297.aClass297_3259.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		anInt3461
		    = class525_sub38.readUnsignedShort((byte) 102) * 1804307341;
		aFloat3462 = class525_sub38.method16634(220740337);
	    }
	    if (1 == (i_19_ >> Class297.aClass297_3269.anInt3273 * -1933461091
		      & 0x1))
		aClass302_3455
		    = Class300.method5398(class525_sub38
					      .readUnsignedByte(1792659896),
					  (short) -15527);
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3270.anInt3273
		 & 0x1)
		== 1) {
		aClass446_3428.method7215(class525_sub38);
		aClass446_3450.method7215(class525_sub38);
		aFloat3451 = class525_sub38.method16634(-1463740661);
		aFloat3452 = class525_sub38.method16634(-1273889319);
	    }
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3271.anInt3273
		 & 0x1)
		== 1)
		class525_sub38.method16634(-60757929);
	    if ((i_19_ >> -1933461091 * Class297.aClass297_3262.anInt3273
		 & 0x1)
		== 1)
		aFloat3433 = class525_sub38.method16634(278253732);
	}
	if (null != aClass704_3431 && 1 == (i_18_ >> 5 & 0x1))
	    aClass704_3431.method14285(class525_sub38, 1636549506);
	if (aClass350_3427 != null && 1 == (i_18_ >> 6 & 0x1))
	    aClass350_3427.method6145(class525_sub38, 989948399);
	if (-1133521593 * class525_sub38.index - i_17_ != i)
	    throw new RuntimeException(new StringBuilder().append
					   ((-1133521593
					     * class525_sub38.index)
					    - i_17_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public void method15754(RSBuffer class525_sub38, int i) {
	int i_25_ = -1133521593 * class525_sub38.index;
	int i_26_ = class525_sub38.readUnsignedByte(368000920);
	method5572(Class86.method1649(i_26_ & 0x1, (byte) 23), 2056374079);
	if ((i_26_ & 0x8) != 0) {
	    Class298 class298
		= Class295.method5352(class525_sub38.readUnsignedByte(1987752555),
				      -1217403527);
	    if (aClass298_3430 != class298) {
		try {
		    method5578(class298, true, (byte) -122);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if (0 != (i_26_ & 0x10)) {
	    Class289 class289
		= Class538.method8883(class525_sub38.readUnsignedByte(309305080),
				      16711935);
	    if (class289 != aClass289_3432) {
		try {
		    method5552(class289, true, 1196076041);
		} catch (Exception_Sub7 exception_sub7) {
		    exception_sub7.printStackTrace();
		}
	    }
	}
	if ((i_26_ >> 7 & 0x1) == 1) {
	    int i_27_ = class525_sub38.readUnsignedShort((byte) 32);
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3264.anInt3273
		 & 0x1)
		== 1)
		aClass446_3438.method7215(class525_sub38);
	    if (1 == (i_27_ >> Class297.aClass297_3260.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3439.method7215(class525_sub38);
	    if (1 == (i_27_ >> Class297.aClass297_3258.anInt3273 * -1933461091
		      & 0x1))
		aClass446_3441.method7215(class525_sub38);
	    if ((i_27_ >> Class297.aClass297_3261.anInt3273 * -1933461091
		 & 0x1)
		== 1)
		aClass446_3442.method7215(class525_sub38);
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3268.anInt3273
		 & 0x1)
		== 1) {
		aFloat3453 = class525_sub38.method16634(-1724091495);
		aFloat3436 = class525_sub38.method16634(-2000895604);
	    }
	    if ((i_27_ >> Class297.aClass297_3263.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		aFloat3457 = class525_sub38.method16634(-1833270220);
		aFloat3458 = class525_sub38.method16634(-1972708145);
	    }
	    if ((i_27_ >> Class297.aClass297_3272.anInt3273 * -1933461091
		 & 0x1)
		== 1)
		aClass311_3443
		    = Class233.method4396(class525_sub38
					      .readUnsignedByte(786207492),
					  (short) 14137);
	    if ((i_27_ >> Class297.aClass297_3265.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		anInt3447
		    = class525_sub38.method16834(-1994884458) * -1771211287;
		class525_sub38.readUnsignedByte(834206788);
	    }
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3266.anInt3273
		 & 0x1)
		== 1) {
		int i_28_ = class525_sub38.readUnsignedByte(704681937);
		aBool3456 = 1 == (i_28_ & 0x1);
		aBool3460 = 2 == (i_28_ & 0x2);
	    }
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3267.anInt3273
		 & 0x1)
		== 1) {
		int i_29_ = class525_sub38.readUnsignedByte(253323424);
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
		    int i_31_ = class525_sub38.readUnsignedByte(247761361);
		    int i_32_ = class525_sub38.readUnsignedByte(346175478);
		    if (0 == i_31_)
			method5530(i_32_, -963135449);
		    else {
			Class264 class264
			    = Class236.method4413(class525_sub38
						      .readUnsignedByte(147118519),
						  (byte) -39);
			boolean bool = true;
			Iterator iterator = aClass10_3463.iterator();
			while (iterator.hasNext()) {
			    Class525_Sub16_Sub9 class525_sub16_sub9
				= (Class525_Sub16_Sub9) iterator.next();
			    if (i_32_ == (1940820665
					  * class525_sub16_sub9.anInt11794)) {
				class525_sub16_sub9.method18304(class525_sub38,
								1920040445);
				bool = false;
				break;
			    }
			}
			if (bool)
			    method5551(Class536.method8874(i_32_, class264,
							   class525_sub38,
							   (byte) 91),
				       1728802459);
		    }
		}
	    }
	    if ((i_27_ >> Class297.aClass297_3259.anInt3273 * -1933461091
		 & 0x1)
		== 1) {
		anInt3461 = class525_sub38.readUnsignedShort((byte) 98) * 1804307341;
		aFloat3462 = class525_sub38.method16634(-266381146);
	    }
	    if (1 == (i_27_ >> Class297.aClass297_3269.anInt3273 * -1933461091
		      & 0x1))
		aClass302_3455
		    = Class300.method5398(class525_sub38.readUnsignedByte(93755992),
					  (short) -14932);
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3270.anInt3273
		 & 0x1)
		== 1) {
		aClass446_3428.method7215(class525_sub38);
		aClass446_3450.method7215(class525_sub38);
		aFloat3451 = class525_sub38.method16634(-2046969741);
		aFloat3452 = class525_sub38.method16634(320475184);
	    }
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3271.anInt3273
		 & 0x1)
		== 1)
		class525_sub38.method16634(-571844118);
	    if ((i_27_ >> -1933461091 * Class297.aClass297_3262.anInt3273
		 & 0x1)
		== 1)
		aFloat3433 = class525_sub38.method16634(-1696890047);
	}
	if (null != aClass704_3431 && 1 == (i_26_ >> 5 & 0x1))
	    aClass704_3431.method14285(class525_sub38, 1263197330);
	if (aClass350_3427 != null && 1 == (i_26_ >> 6 & 0x1))
	    aClass350_3427.method6145(class525_sub38, -2014229626);
	if (-1133521593 * class525_sub38.index - i_25_ != i)
	    throw new RuntimeException(new StringBuilder().append
					   ((-1133521593
					     * class525_sub38.index)
					    - i_25_)
					   .append
					   (",").append
					   (i).toString());
    }
    
    public int method15755() {
	anInt10138 += 25249695;
	if (164762719 * anInt10138 == 126)
	    anInt10138 = 0;
	return 164762719 * anInt10138;
    }
}
