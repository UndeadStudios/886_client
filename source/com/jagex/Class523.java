/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;

public class Class523
{
    public Class179 aClass179_7098;
    int anInt7099;
    static int anInt7100 = 0;
    int anInt7101;
    int[] anIntArray7102;
    int[] anIntArray7103;
    LinkedList aLinkedList7104;
    boolean aBool7105;
    
    void method8705(Class546 class546) {
	aLinkedList7104 = new LinkedList();
	Class475 class475 = client.aClass507_11137.method8360(1363809703);
	Class600 class600 = client.aClass507_11137.method8350(-1657517586);
	Class600 class600_0_
	    = new Class600(-1335910809 * Class677.anInt8619, anIntArray7102[0],
			   anIntArray7103[0]);
	for (int i = 1; i < anInt7101 * -1785282701; i++) {
	    Class600 class600_1_
		= new Class600(-1335910809 * Class677.anInt8619,
			       anIntArray7102[i], anIntArray7103[i]);
	    while ((-1227002079 * class600_0_.anInt7858
		    != -1227002079 * class600_1_.anInt7858)
		   || (1429253007 * class600_0_.anInt7860
		       != class600_1_.anInt7860 * 1429253007)) {
		if (-1227002079 * class600_0_.anInt7858
		    < class600_1_.anInt7858 * -1227002079)
		    class600_0_.anInt7858 += -568666911;
		else if (-1227002079 * class600_0_.anInt7858
			 > -1227002079 * class600_1_.anInt7858)
		    class600_0_.anInt7858 -= -568666911;
		if (1429253007 * class600_0_.anInt7860
		    < 1429253007 * class600_1_.anInt7860)
		    class600_0_.anInt7860 += 221647727;
		else if (1429253007 * class600_0_.anInt7860
			 > 1429253007 * class600_1_.anInt7860)
		    class600_0_.anInt7860 -= 221647727;
		int i_2_ = -1335910809 * Class677.anInt8619;
		int i_3_ = (-1227002079 * class600_0_.anInt7858
			    - class600.anInt7858 * -1227002079);
		int i_4_ = (class600_0_.anInt7860 * 1429253007
			    - class600.anInt7860 * 1429253007);
		if (i_3_ >= 0 && i_3_ < 1761949661 * class546.anInt7210
		    && i_4_ >= 0 && i_4_ < 947301287 * class546.anInt7211) {
		    int i_5_ = 256 + (i_3_ << 9);
		    int i_6_ = (i_4_ << 9) + 256;
		    if (class475.method7774(i_3_, i_4_, 1047155002))
			i_2_++;
		    aLinkedList7104.add(new Class656_Sub1_Sub3_Sub6
					(class546, this,
					 -1335910809 * Class677.anInt8619,
					 i_2_, i_5_,
					 Class335.method5855(i_5_, i_6_,
							     ((Class677
							       .anInt8619)
							      * -1335910809),
							     2020563229),
					 i_6_));
		}
	    }
	    class600_0_ = class600_1_;
	}
    }
    
    Class179 method8706(Class182 class182, byte i) {
	ModelDecoder class186 = ModelDecoder.method3644(WorldTile.aClass458_705,
						anInt7099 * 1216917229, 0);
	if (null == class186)
	    return null;
	if (class186.version < 13)
	    class186.method3651(2);
	return class182.method3556(class186, 2048, anInt7100 * -1607429369, 64,
				   768);
    }
    
    public void method8707(Class546 class546, byte i) {
	if (class546 != null && anInt7101 * -1785282701 > 0) {
	    method8717(class546, (short) 162);
	    Iterator iterator = aLinkedList7104.iterator();
	    while (iterator.hasNext()) {
		Class656_Sub1_Sub3_Sub6 class656_sub1_sub3_sub6
		    = (Class656_Sub1_Sub3_Sub6) iterator.next();
		class546.method8956(class656_sub1_sub3_sub6, false, (byte) 15);
	    }
	    aBool7105 = true;
	}
    }
    
    public void method8708(Class546 class546, int i) {
	if (class546 != null && aLinkedList7104 != null) {
	    Iterator iterator = aLinkedList7104.iterator();
	    while (iterator.hasNext()) {
		Class656_Sub1_Sub3_Sub6 class656_sub1_sub3_sub6
		    = (Class656_Sub1_Sub3_Sub6) iterator.next();
		class546.method8965(class656_sub1_sub3_sub6.aByte10867,
				    class656_sub1_sub3_sub6.aShort11923,
				    class656_sub1_sub3_sub6.aShort11925,
				    new Class543(class656_sub1_sub3_sub6),
				    620669831);
	    }
	}
    }
    
    Class179 method8709(Class182 class182) {
	ModelDecoder class186 = ModelDecoder.method3644(WorldTile.aClass458_705,
						anInt7099 * 1216917229, 0);
	if (null == class186)
	    return null;
	if (class186.version < 13)
	    class186.method3651(2);
	return class182.method3556(class186, 2048, anInt7100 * -1607429369, 64,
				   768);
    }
    
    public void method8710(int i) {
	aBool7105 = false;
	aClass179_7098 = null;
    }
    
    public boolean method8711(int i) {
	return aBool7105;
    }
    
    public boolean method8712(Class182 class182, int i) {
	aClass179_7098 = method8706(class182, (byte) 33);
	return null != aClass179_7098;
    }
    
    public void method8713(Class546 class546) {
	if (class546 != null && aLinkedList7104 != null) {
	    Iterator iterator = aLinkedList7104.iterator();
	    while (iterator.hasNext()) {
		Class656_Sub1_Sub3_Sub6 class656_sub1_sub3_sub6
		    = (Class656_Sub1_Sub3_Sub6) iterator.next();
		class546.method8965(class656_sub1_sub3_sub6.aByte10867,
				    class656_sub1_sub3_sub6.aShort11923,
				    class656_sub1_sub3_sub6.aShort11925,
				    new Class543(class656_sub1_sub3_sub6),
				    1445504447);
	    }
	}
    }
    
    public Class523(Class182 class182, RSBuffer class525_sub38, int i) {
	anInt7099 = -487399707 * i;
	anInt7101 = class525_sub38.readSmart3(993241788) * 993885627;
	anIntArray7102 = new int[anInt7101 * -1785282701];
	anIntArray7103 = new int[-1785282701 * anInt7101];
	int i_7_ = class525_sub38.readUnsignedShort((byte) 107);
	int i_8_ = class525_sub38.readUnsignedShort((byte) 79);
	for (int i_9_ = 0; i_9_ < -1785282701 * anInt7101; i_9_++) {
	    anIntArray7102[i_9_]
		= i_7_ + class525_sub38.readByte(-1150098071);
	    anIntArray7103[i_9_]
		= i_8_ + class525_sub38.readByte(-1150098071);
	}
	aClass179_7098 = method8706(class182, (byte) 33);
    }
    
    Class179 method8714(Class182 class182) {
	ModelDecoder class186 = ModelDecoder.method3644(WorldTile.aClass458_705,
						anInt7099 * 1216917229, 0);
	if (null == class186)
	    return null;
	if (class186.version < 13)
	    class186.method3651(2);
	return class182.method3556(class186, 2048, anInt7100 * -1607429369, 64,
				   768);
    }
    
    public void method8715(Class546 class546) {
	if (class546 != null && aLinkedList7104 != null) {
	    Iterator iterator = aLinkedList7104.iterator();
	    while (iterator.hasNext()) {
		Class656_Sub1_Sub3_Sub6 class656_sub1_sub3_sub6
		    = (Class656_Sub1_Sub3_Sub6) iterator.next();
		class546.method8965(class656_sub1_sub3_sub6.aByte10867,
				    class656_sub1_sub3_sub6.aShort11923,
				    class656_sub1_sub3_sub6.aShort11925,
				    new Class543(class656_sub1_sub3_sub6),
				    -256833260);
	    }
	}
    }
    
    Class179 method8716(Class182 class182) {
	ModelDecoder class186 = ModelDecoder.method3644(WorldTile.aClass458_705,
						anInt7099 * 1216917229, 0);
	if (null == class186)
	    return null;
	if (class186.version < 13)
	    class186.method3651(2);
	return class182.method3556(class186, 2048, anInt7100 * -1607429369, 64,
				   768);
    }
    
    void method8717(Class546 class546, short i) {
	aLinkedList7104 = new LinkedList();
	Class475 class475 = client.aClass507_11137.method8360(1636437439);
	Class600 class600 = client.aClass507_11137.method8350(933372636);
	Class600 class600_10_
	    = new Class600(-1335910809 * Class677.anInt8619, anIntArray7102[0],
			   anIntArray7103[0]);
	for (int i_11_ = 1; i_11_ < anInt7101 * -1785282701; i_11_++) {
	    Class600 class600_12_
		= new Class600(-1335910809 * Class677.anInt8619,
			       anIntArray7102[i_11_], anIntArray7103[i_11_]);
	    while ((-1227002079 * class600_10_.anInt7858
		    != -1227002079 * class600_12_.anInt7858)
		   || (1429253007 * class600_10_.anInt7860
		       != class600_12_.anInt7860 * 1429253007)) {
		if (-1227002079 * class600_10_.anInt7858
		    < class600_12_.anInt7858 * -1227002079)
		    class600_10_.anInt7858 += -568666911;
		else if (-1227002079 * class600_10_.anInt7858
			 > -1227002079 * class600_12_.anInt7858)
		    class600_10_.anInt7858 -= -568666911;
		if (1429253007 * class600_10_.anInt7860
		    < 1429253007 * class600_12_.anInt7860)
		    class600_10_.anInt7860 += 221647727;
		else if (1429253007 * class600_10_.anInt7860
			 > 1429253007 * class600_12_.anInt7860)
		    class600_10_.anInt7860 -= 221647727;
		int i_13_ = -1335910809 * Class677.anInt8619;
		int i_14_ = (-1227002079 * class600_10_.anInt7858
			     - class600.anInt7858 * -1227002079);
		int i_15_ = (class600_10_.anInt7860 * 1429253007
			     - class600.anInt7860 * 1429253007);
		if (i_14_ >= 0 && i_14_ < 1761949661 * class546.anInt7210
		    && i_15_ >= 0 && i_15_ < 947301287 * class546.anInt7211) {
		    int i_16_ = 256 + (i_14_ << 9);
		    int i_17_ = (i_15_ << 9) + 256;
		    if (class475.method7774(i_14_, i_15_, 728717057))
			i_13_++;
		    aLinkedList7104.add(new Class656_Sub1_Sub3_Sub6
					(class546, this,
					 -1335910809 * Class677.anInt8619,
					 i_13_, i_16_,
					 Class335.method5855(i_16_, i_17_,
							     ((Class677
							       .anInt8619)
							      * -1335910809),
							     2020563229),
					 i_17_));
		}
	    }
	    class600_10_ = class600_12_;
	}
    }
    
    public static void method8718(int i) {
	anInt7100 = 619342519 * i;
    }
    
    public static void method8719(int i) {
	anInt7100 = 619342519 * i;
    }
    
    public static void method8720(int i) {
	anInt7100 = 619342519 * i;
    }
    
    public void method8721() {
	aBool7105 = false;
	aClass179_7098 = null;
    }
    
    public boolean method8722() {
	return aBool7105;
    }
    
    public boolean method8723() {
	return aBool7105;
    }
    
    public boolean method8724(Class182 class182) {
	aClass179_7098 = method8706(class182, (byte) 33);
	return null != aClass179_7098;
    }
    
    public boolean method8725(Class182 class182) {
	aClass179_7098 = method8706(class182, (byte) 33);
	return null != aClass179_7098;
    }
    
    public boolean method8726(Class182 class182) {
	aClass179_7098 = method8706(class182, (byte) 33);
	return null != aClass179_7098;
    }
    
    static final void method8727(Class683 class683, byte i) {
	int i_18_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_18_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_18_ >> 16];
	Class601.method9901(class259, class245, class683,
			    Class238.aClass238_2399, (byte) 9);
    }
    
    static final void method8728(Class683 class683, byte i)
	throws Exception_Sub7 {
	class683.anInt8662 -= 1915637188;
	int i_19_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_20_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_21_
	    = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	Class446 class446
	    = Class446.method7208((float) i_19_, (float) i_20_, (float) i_21_);
	Class453_Sub3.aClass309_Sub1_10316.method5465(class446, -2139022416);
	class446.method7260();
    }
    
    static final void method8729(Class683 class683, int i) {
	int i_22_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub2_10694, i_22_,
	     (byte) -124);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    static final void method8730(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class559.method9400(class259, class245, class683, (short) -13869);
    }
    
    public static boolean method8731(int i, int i_23_) {
	return i == 1 || 3 == i || i == 5;
    }
    
    static void method8732(int i, int i_24_) {
	if (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub46_10718
		.method17437(-780512888)
	    == 0)
	    i = -1;
	if (i != 1496264193 * client.anInt11254) {
	    if (i != -1) {
		Class648 class648
		    = ((Class648)
		       Class635.aClass40_Sub6_8274.method76(i, 923551672));
		Class173 class173 = class648.method10697(-1551668856);
		if (class173 != null) {
		    Class198_Sub22.aClass498_10017.setcustomcursor
			(Class532.aCanvas7169, class173.method2778(true),
			 class173.method2771(), class173.method2819(),
			 new Point(class648.anInt8362 * 224467409,
				   class648.anInt8361 * -1321171895));
		    client.anInt11254 = i * 1528091137;
		} else
		    i = -1;
	    }
	    if (i == -1 && client.anInt11254 * 1496264193 != -1) {
		Class198_Sub22.aClass498_10017.setcustomcursor((Class532
								.aCanvas7169),
							       null, -1, -1,
							       new Point());
		client.anInt11254 = -1528091137;
	    }
	}
    }
}
