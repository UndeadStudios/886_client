/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class178
{
    public static Class178 aClass178_1905;
    static Class178 aClass178_1906;
    static Class178 aClass178_1907 = new Class178(0, 1);
    static Class178 aClass178_1908;
    public static Class178 aClass178_1909;
    public int anInt1910;
    public static Class178 aClass178_1911;
    public static Class178 aClass178_1912;
    public static Class178 aClass178_1913;
    public static Class178 aClass178_1914;
    public int anInt1915;
    
    static int method2912(Class525_Sub38_Sub2 class525_sub38_sub2, int i) {
	int i_0_ = class525_sub38_sub2.method18496(2, 578733530);
	int i_1_;
	if (0 == i_0_)
	    i_1_ = 0;
	else if (1 == i_0_)
	    i_1_ = class525_sub38_sub2.method18496(5, 578733530);
	else if (i_0_ == 2)
	    i_1_ = class525_sub38_sub2.method18496(8, 578733530);
	else
	    i_1_ = class525_sub38_sub2.method18496(11, 578733530);
	return i_1_;
    }
    
    Class178(int i, int i_2_) {
	anInt1910 = i * -384796043;
	anInt1915 = i_2_ * -558523665;
    }
    
    static final void method2913
	(Class525_Sub38_Sub2 class525_sub38_sub2, int i,
	 Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1, int i_3_,
	 byte i_4_) {
	if (0 != (i_3_ & 0x200000)) {
	    class656_sub1_sub3_sub1_sub1.aByte12000
		= class525_sub38_sub2.method16662(-880411526);
	    class656_sub1_sub3_sub1_sub1.aByte12001
		= class525_sub38_sub2.method16662(-880411526);
	    class656_sub1_sub3_sub1_sub1.aByte12002
		= class525_sub38_sub2.method16739(907094016);
	    class656_sub1_sub3_sub1_sub1.aByte11979
		= (byte) class525_sub38_sub2.method16660(828583006);
	    class656_sub1_sub3_sub1_sub1.anInt11981
		= ((client.anInt11083
		    + class525_sub38_sub2.method16667(1622914881))
		   * -1693335625);
	    class656_sub1_sub3_sub1_sub1.anInt11999
		= (client.anInt11083
		   + class525_sub38_sub2.method16667(538991617)) * 1584360751;
	}
	if (0 != (i_3_ & 0x20)) {
	    int i_5_ = class525_sub38_sub2.method16624(804760639);
	    if (i_5_ > 0) {
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		    int i_7_ = -1;
		    int i_8_ = -1;
		    int i_9_ = -1;
		    int i_10_ = class525_sub38_sub2.readUnsignedSmart((byte) -40);
		    if (i_10_ == 32767) {
			i_10_ = class525_sub38_sub2.readUnsignedSmart((byte) -120);
			i_8_ = class525_sub38_sub2.readUnsignedSmart((byte) -22);
			i_7_ = class525_sub38_sub2.readUnsignedSmart((byte) -44);
			i_9_ = class525_sub38_sub2.readUnsignedSmart((byte) -63);
		    } else if (32766 != i_10_)
			i_8_ = class525_sub38_sub2.readUnsignedSmart((byte) -57);
		    else {
			i_10_ = -1;
			i_8_ = class525_sub38_sub2.method16607(-1571461918);
		    }
		    int i_11_ = class525_sub38_sub2.readUnsignedSmart((byte) -79);
		    class656_sub1_sub3_sub1_sub1.method18634(i_10_, i_8_, i_7_,
							     i_9_,
							     client.anInt11083,
							     i_11_, 881740862);
		}
	    }
	    int i_12_ = class525_sub38_sub2.readUnsignedByte(2059750594);
	    if (i_12_ > 0) {
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
		    int i_14_ = class525_sub38_sub2.readUnsignedSmart((byte) -62);
		    int i_15_ = class525_sub38_sub2.readUnsignedSmart((byte) -51);
		    if (i_15_ != 32767) {
			int i_16_
			    = class525_sub38_sub2.readUnsignedSmart((byte) -98);
			int i_17_
			    = class525_sub38_sub2.method16607(-1571461918);
			int i_18_
			    = (i_15_ > 0
			       ? class525_sub38_sub2.method16660(1593402137)
			       : i_17_);
			class656_sub1_sub3_sub1_sub1.method18605(i_14_,
								 (client
								  .anInt11083),
								 i_15_, i_16_,
								 i_17_, i_18_,
								 -2071819227);
		    } else
			class656_sub1_sub3_sub1_sub1.method18631(i_14_,
								 873090331);
		}
	    }
	}
	if ((i_3_ & 0x1) != 0) {
	    int i_19_ = class525_sub38_sub2.method16668((byte) 25);
	    int i_20_ = class525_sub38_sub2.method16677(-2067823721);
	    if (65535 == i_19_)
		i_19_ = -1;
	    int i_21_ = class525_sub38_sub2.readUnsignedByte(720552352);
	    int i_22_ = i_21_ & 0x7;
	    int i_23_ = i_21_ >> 3 & 0xf;
	    if (15 == i_23_)
		i_23_ = -1;
	    boolean bool = (i_21_ >> 7 & 0x1) == 1;
	    class656_sub1_sub3_sub1_sub1
		.method18602(i_19_, i_20_, i_22_, i_23_, bool, 0, 1737337725);
	}
	if ((i_3_ & 0x8000) != 0) {
	    int i_24_ = class525_sub38_sub2.method16624(1774330182);
	    byte[] is = new byte[i_24_];
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    class525_sub38_sub2.readBytes(is, 0, i_24_, 293660564);
	    Class104.aClass525_Sub38Array1282[i] = class525_sub38;
	    class656_sub1_sub3_sub1_sub1.method18904(class525_sub38,
						     2114877235);
	}
	if ((i_3_ & 0x100) != 0) {
	    int i_25_ = class525_sub38_sub2.method16660(2071492799);
	    int[] is = new int[i_25_];
	    int[] is_26_ = new int[i_25_];
	    int[] is_27_ = new int[i_25_];
	    for (int i_28_ = 0; i_28_ < i_25_; i_28_++) {
		is[i_28_] = class525_sub38_sub2.readBigSmart(-2043778683);
		is_26_[i_28_] = class525_sub38_sub2.method16624(-1938563037);
		is_27_[i_28_] = class525_sub38_sub2.method16668((byte) -53);
	    }
	    Class491.method7989(class656_sub1_sub3_sub1_sub1, is, is_26_,
				is_27_, (byte) -30);
	}
	if ((i_3_ & 0x10) != 0) {
	    class656_sub1_sub3_sub1_sub1.anInt11989
		= class525_sub38_sub2.method16739(907094016) * -1300706795;
	    class656_sub1_sub3_sub1_sub1.anInt11991
		= class525_sub38_sub2.method16663((byte) 83) * 1121862737;
	    class656_sub1_sub3_sub1_sub1.anInt11990
		= class525_sub38_sub2.method16663((byte) 9) * -140650319;
	    class656_sub1_sub3_sub1_sub1.anInt12018
		= class525_sub38_sub2.method16662(-880411526) * 748154517;
	    class656_sub1_sub3_sub1_sub1.anInt11993
		= class525_sub38_sub2.method16662(-880411526) * 31761437;
	    class656_sub1_sub3_sub1_sub1.anInt11968
		= class525_sub38_sub2.method16739(907094016) * -524750117;
	    class656_sub1_sub3_sub1_sub1.anInt11995
		= (class525_sub38_sub2.method16667(1843215382)
		   + client.anInt11083) * 1917157447;
	    class656_sub1_sub3_sub1_sub1.anInt11996
		= (class525_sub38_sub2.method16668((byte) -31)
		   + client.anInt11083) * -1392686703;
	    class656_sub1_sub3_sub1_sub1.anInt11997
		= class525_sub38_sub2.method16668((byte) -2) * -1631328201;
	    class656_sub1_sub3_sub1_sub1.anInt12015 = -901267287;
	    class656_sub1_sub3_sub1_sub1.anInt11970 = 0;
	    class656_sub1_sub3_sub1_sub1.anInt11989
		+= (class656_sub1_sub3_sub1_sub1.anIntArray12014[0]
		    * -1300706795);
	    class656_sub1_sub3_sub1_sub1.anInt11991
		+= (1121862737
		    * class656_sub1_sub3_sub1_sub1.anIntArray12017[0]);
	    class656_sub1_sub3_sub1_sub1.anInt11990
		+= (-140650319
		    * class656_sub1_sub3_sub1_sub1.anIntArray12014[0]);
	    class656_sub1_sub3_sub1_sub1.anInt12018
		+= class656_sub1_sub3_sub1_sub1.anIntArray12017[0] * 748154517;
	    class656_sub1_sub3_sub1_sub1.anInt11993
		+= 31761437 * class656_sub1_sub3_sub1_sub1.aByte10867;
	    class656_sub1_sub3_sub1_sub1.anInt11968
		+= -524750117 * class656_sub1_sub3_sub1_sub1.aByte10867;
	}
	if (0 != (i_3_ & 0x2000)) {
	    int i_29_ = class525_sub38_sub2.method16667(1145251608);
	    int i_30_ = class525_sub38_sub2.method16679((byte) -11);
	    if (i_29_ == 65535)
		i_29_ = -1;
	    int i_31_ = class525_sub38_sub2.method16624(776179875);
	    int i_32_ = i_31_ & 0x7;
	    int i_33_ = i_31_ >> 3 & 0xf;
	    if (15 == i_33_)
		i_33_ = -1;
	    boolean bool = 1 == (i_31_ >> 7 & 0x1);
	    class656_sub1_sub3_sub1_sub1
		.method18602(i_29_, i_30_, i_32_, i_33_, bool, 2, 1089799328);
	}
	if ((i_3_ & 0x800000) != 0)
	    class656_sub1_sub3_sub1_sub1.aBool12254
		= class525_sub38_sub2.readUnsignedByte(140823248) == 1;
	if ((i_3_ & 0x1000) != 0) {
	    int i_34_ = class525_sub38_sub2.method16667(1498200019);
	    int i_35_ = class525_sub38_sub2.readInt(1054899830);
	    if (i_34_ == 65535)
		i_34_ = -1;
	    int i_36_ = class525_sub38_sub2.method16660(1447377346);
	    int i_37_ = i_36_ & 0x7;
	    int i_38_ = i_36_ >> 3 & 0xf;
	    if (i_38_ == 15)
		i_38_ = -1;
	    boolean bool = 1 == (i_36_ >> 7 & 0x1);
	    class656_sub1_sub3_sub1_sub1
		.method18602(i_34_, i_35_, i_37_, i_38_, bool, 1, -1257882771);
	}
	if ((i_3_ & 0x40) != 0) {
	    class656_sub1_sub3_sub1_sub1.anInt12242
		= class525_sub38_sub2.readUnsignedShort((byte) 24) * -1066304989;
	    if (0 == -2046237799 * class656_sub1_sub3_sub1_sub1.anInt12015) {
		class656_sub1_sub3_sub1_sub1.method18625
		    (class656_sub1_sub3_sub1_sub1.anInt12242 * -1191180917,
		     (byte) 1);
		class656_sub1_sub3_sub1_sub1.anInt12242 = 1066304989;
	    }
	}
	if (0 != (i_3_ & 0x100000)) {
	    int i_39_ = class525_sub38_sub2.method16607(-1571461918);
	    int[] is = new int[i_39_];
	    int[] is_40_ = new int[i_39_];
	    for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
		int i_42_ = class525_sub38_sub2.method16680(-1308223894);
		if ((i_42_ & 0xc000) == 49152) {
		    int i_43_ = class525_sub38_sub2.method16667(136521767);
		    is[i_41_] = i_42_ << 16 | i_43_;
		} else
		    is[i_41_] = i_42_;
		is_40_[i_41_] = class525_sub38_sub2.method16680(-919296890);
	    }
	    class656_sub1_sub3_sub1_sub1.method18599(is, is_40_, -876184901);
	}
	if (0 != (i_3_ & 0x80)) {
	    int i_44_ = class525_sub38_sub2.method16668((byte) -22);
	    if (65535 == i_44_)
		i_44_ = -1;
	    class656_sub1_sub3_sub1_sub1.anInt11983 = 104662899 * i_44_;
	}
	if ((i_3_ & 0x20000) != 0) {
	    int i_45_ = class525_sub38_sub2.readUnsignedShort((byte) 122);
	    int i_46_ = class525_sub38_sub2.method16679((byte) 9);
	    if (65535 == i_45_)
		i_45_ = -1;
	    int i_47_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_48_ = i_47_ & 0x7;
	    int i_49_ = i_47_ >> 3 & 0xf;
	    if (i_49_ == 15)
		i_49_ = -1;
	    boolean bool = 1 == (i_47_ >> 7 & 0x1);
	    class656_sub1_sub3_sub1_sub1
		.method18602(i_45_, i_46_, i_48_, i_49_, bool, 4, -20415505);
	}
	if ((i_3_ & 0x10000) != 0) {
	    class656_sub1_sub3_sub1_sub1.anInterface3_11961
		.method19(-711664883);
	    class525_sub38_sub2.index += 678856942;
	    int i_50_ = ((class525_sub38_sub2.buffer
			  [((class525_sub38_sub2.index += 339428471)
			    * -1133521593) - 1])
			 & 0xff);
	    for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
		int i_52_ = class525_sub38_sub2.method16607(-1571461918);
		Class480 class480
		    = ((Class480)
		       Class539.method8888(Class480.method7811(1179778436),
					   i_52_, 440115030));
		Class447 class447
		    = (Class109.aClass106_Sub1_Sub1_1323.method14522
		       (class525_sub38_sub2, class480, 1005577089));
		class656_sub1_sub3_sub1_sub1.anInterface3_11961.method18
		    (-316828413 * class447.anInt4898, class447.anObject4899,
		     (byte) -59);
	    }
	}
	if ((i_3_ & 0x4) != 0) {
	    int[] is = new int[4];
	    for (int i_53_ = 0; i_53_ < 4; i_53_++)
		is[i_53_] = class525_sub38_sub2.readBigSmart(-2043778683);
	    int i_54_ = class525_sub38_sub2.method16660(78801856);
	    Class453_Sub2.method15917(class656_sub1_sub3_sub1_sub1, is, i_54_,
				      false, 1657402531);
	}
	if (0 != (i_3_ & 0x80000)) {
	    String string = class525_sub38_sub2.readString((byte) 102);
	    int i_55_ = class525_sub38_sub2.method16624(-68296783);
	    if (0 != (i_55_ & 0x1))
		Class240.method4427(2, i_55_,
				    class656_sub1_sub3_sub1_sub1
					.method18907(true, 1109442456),
				    class656_sub1_sub3_sub1_sub1
					.method18908(false, (byte) -30),
				    class656_sub1_sub3_sub1_sub1.aString12241,
				    string, null, 273611448);
	    class656_sub1_sub3_sub1_sub1.method18914(string, 0, 0,
						     -2006294479);
	}
	if (0 != (i_3_ & 0x200)) {
	    String string = class525_sub38_sub2.readString((byte) -3);
	    if (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
		== class656_sub1_sub3_sub1_sub1)
		Class240.method4427(2, 0,
				    class656_sub1_sub3_sub1_sub1
					.method18907(true, 1109442456),
				    class656_sub1_sub3_sub1_sub1
					.method18908(false, (byte) -28),
				    class656_sub1_sub3_sub1_sub1.aString12241,
				    string, null, -1465513561);
	    class656_sub1_sub3_sub1_sub1.method18914(string, 0, 0, -629184195);
	}
	if (0 != (i_3_ & 0x400)) {
	    class656_sub1_sub3_sub1_sub1.aClass243_12252
		= ((Class243)
		   Class539.method8888(Class243.method4451(-1898672882),
				       class525_sub38_sub2
					   .method16607(-1571461918),
				       -266094735));
	    if (null == class656_sub1_sub3_sub1_sub1.aClass243_12252)
		class656_sub1_sub3_sub1_sub1.aClass243_12252
		    = Class243.aClass243_2417;
	}
	if (0 != (i_3_ & 0x40000)) {
	    class525_sub38_sub2.index += 678856942;
	    int i_56_ = ((class525_sub38_sub2.buffer
			  [((class525_sub38_sub2.index += 339428471)
			    * -1133521593) - 1])
			 & 0xff);
	    for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
		int i_58_ = class525_sub38_sub2.method16660(490843922);
		Class480 class480
		    = ((Class480)
		       Class539.method8888(Class480.method7811(597148483),
					   i_58_, -1259226956));
		Class447 class447
		    = (Class109.aClass106_Sub1_Sub1_1323.method14522
		       (class525_sub38_sub2, class480, 1005577089));
		class656_sub1_sub3_sub1_sub1.anInterface3_11961.method18
		    (-316828413 * class447.anInt4898, class447.anObject4899,
		     (byte) -101);
	    }
	}
	if (0 != (i_3_ & 0x8)) {
	    int i_59_ = class525_sub38_sub2.method16607(-1571461918);
	    byte[] is = new byte[i_59_];
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    class525_sub38_sub2.method16759(is, 0, i_59_, (short) 1150);
	    Class104.aClass525_Sub38Array1290[i] = class525_sub38;
	    class656_sub1_sub3_sub1_sub1.method18903(class525_sub38, (byte) 5);
	}
	if ((i_3_ & 0x400000) != 0) {
	    int i_60_ = class525_sub38_sub2.method16668((byte) -26);
	    int i_61_ = class525_sub38_sub2.method16679((byte) 106);
	    if (i_60_ == 65535)
		i_60_ = -1;
	    int i_62_ = class525_sub38_sub2.method16607(-1571461918);
	    int i_63_ = i_62_ & 0x7;
	    int i_64_ = i_62_ >> 3 & 0xf;
	    if (15 == i_64_)
		i_64_ = -1;
	    boolean bool = (i_62_ >> 7 & 0x1) == 1;
	    class656_sub1_sub3_sub1_sub1
		.method18602(i_60_, i_61_, i_63_, i_64_, bool, 3, -1775895314);
	}
    }
    
    static {
	aClass178_1906 = new Class178(7, 2);
	aClass178_1908 = new Class178(3, 4);
	aClass178_1905 = new Class178(2, 1);
	aClass178_1909 = new Class178(4, 2);
	aClass178_1913 = new Class178(6, 3);
	aClass178_1911 = new Class178(8, 4);
	aClass178_1912 = new Class178(1, 2);
	aClass178_1914 = new Class178(5, 4);
    }
    
    static String method2914(Class259 class259, int i, int i_65_) {
	if (!client.method17531(class259).method16133(i, (short) 197)
	    && class259.anObjectArray2721 == null)
	    return null;
	if (class259.aStringArray2701 == null
	    || class259.aStringArray2701.length <= i
	    || null == class259.aStringArray2701[i]
	    || class259.aStringArray2701[i].trim().length() == 0) {
	    if (client.aBool11363)
		return new StringBuilder().append("Hidden-").append(i)
			   .toString();
	    return null;
	}
	return class259.aStringArray2701[i];
    }
    
    static boolean method2915(int i) {
	if (Class332.method5821(1777895575 * client.anInt11075, (byte) 87))
	    return false;
	return true;
    }
    
    static final void method2916(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class75.method1555(class259, class245, class683, (short) -2780);
    }
    
    static final void method2917(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2610
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * 1786909631;
    }
    
    static final void method2918(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class482.method7833(class259, class245, class683, 89814269);
    }
}
