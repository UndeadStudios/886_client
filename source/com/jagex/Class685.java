/* Class685 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashSet;
import java.util.Set;

public class Class685 implements Interface76
{
    static Class685 aClass685_8674;
    static Class685 aClass685_8675;
    public static Class685 aClass685_8676;
    public static Class685 aClass685_8677;
    public static Class685 aClass685_8678;
    public static Class685 aClass685_8679;
    int anInt8680;
    static Class685 aClass685_8681;
    static Class685 aClass685_8682;
    public static Class685 aClass685_8683;
    static Class685 aClass685_8684;
    public static Class157 aClass157_8685;
    public static Class685 aClass685_8686
	= new Class685("", 0, new Class667[] { Class667.aClass667_8573 });
    static Class685 aClass685_8687;
    Set aSet8688;
    public static Class685 aClass685_8689
	= new Class685("", 1, new Class667[] { Class667.aClass667_8574,
					       Class667.aClass667_8573 });
    public static Class40 aClass40_8690;
    public static Class40_Sub8 aClass40_Sub8_8691;
    public static Class630 aClass630_8692;
    
    public int method57() {
	return 1374280985 * anInt8680;
    }
    
    Class685(String string, int i) {
	aSet8688 = new HashSet();
	anInt8680 = -1944834263 * i;
    }
    
    public static Class685[] method11247(int i) {
	return new Class685[] { aClass685_8677, aClass685_8682, aClass685_8687,
				aClass685_8679, aClass685_8675, aClass685_8686,
				aClass685_8681, aClass685_8689, aClass685_8674,
				aClass685_8683, aClass685_8678, aClass685_8676,
				aClass685_8684 };
    }
    
    Class685(String string, int i, Class667[] class667s) {
	aSet8688 = new HashSet();
	anInt8680 = -1944834263 * i;
	Class667[] class667s_0_ = class667s;
	for (int i_1_ = 0; i_1_ < class667s_0_.length; i_1_++) {
	    Class667 class667 = class667s_0_[i_1_];
	    aSet8688.add(class667);
	}
    }
    
    public boolean method11248(Class667 class667, int i) {
	return aSet8688.contains(class667);
    }
    
    static {
	aClass685_8676
	    = new Class685("", 2, new Class667[] { Class667.aClass667_8574,
						   Class667.aClass667_8575 });
	aClass685_8677
	    = new Class685("", 3, new Class667[] { Class667.aClass667_8574 });
	aClass685_8678 = new Class685("", 4);
	aClass685_8679
	    = new Class685("", 5, new Class667[] { Class667.aClass667_8574,
						   Class667.aClass667_8573 });
	aClass685_8675
	    = new Class685("", 6, new Class667[] { Class667.aClass667_8573 });
	aClass685_8681
	    = new Class685("", 8, new Class667[] { Class667.aClass667_8574,
						   Class667.aClass667_8573 });
	aClass685_8682
	    = new Class685("", 9, new Class667[] { Class667.aClass667_8574,
						   Class667.aClass667_8575 });
	aClass685_8683
	    = new Class685("", 10, new Class667[] { Class667.aClass667_8574 });
	aClass685_8684
	    = new Class685("", 11, new Class667[] { Class667.aClass667_8574 });
	aClass685_8687
	    = new Class685("", 12, new Class667[] { Class667.aClass667_8574,
						    Class667.aClass667_8573 });
	aClass685_8674
	    = new Class685("", 13, new Class667[] { Class667.aClass667_8574 });
	method11247(-864841511);
    }
    
    static Class571 method11249(RSBuffer class525_sub38, int i) {
	int i_2_ = class525_sub38.readUnsignedByte(1927752862);
	int i_3_ = class525_sub38.readUnsignedByte(111683433);
	int i_4_ = class525_sub38.readUnsignedByte(1176010882);
	int[] is = new int[i_4_];
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
	    is[i_5_] = class525_sub38.readUnsignedByte(1609505247);
	return new Class571(i_2_, i_3_, is);
    }
    
    public int method80() {
	return 1374280985 * anInt8680;
    }
    
    public static Class685[] method11250() {
	return new Class685[] { aClass685_8677, aClass685_8682, aClass685_8687,
				aClass685_8679, aClass685_8675, aClass685_8686,
				aClass685_8681, aClass685_8689, aClass685_8674,
				aClass685_8683, aClass685_8678, aClass685_8676,
				aClass685_8684 };
    }
    
    public int method75() {
	return 1374280985 * anInt8680;
    }
    
    static final void method11251(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_6_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_7_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	Class259 class259 = Class147.method2388(i_6_, i_7_, -591235649);
	Class382.method6429(1771493886);
	Class525_Sub8 class525_sub8 = client.method17531(class259);
	Class328.method5796(class259, class525_sub8.method16132(-251009971),
			    class525_sub8.anInt10489 * -997142025,
			    (short) 6144);
    }
    
    static final void method11252(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = -664017801 * client.anInt11332;
    }
    
    public static void method11253(int i, int i_8_, int i_9_, int i_10_) {
	Class600 class600 = client.aClass507_11137.method8350(1391685529);
	int i_11_ = i_8_ + -1227002079 * class600.anInt7858;
	int i_12_ = 1429253007 * class600.anInt7860 + i_9_;
	if (client.aClass507_11137.method8358((byte) 64) != null
	    && (client.aClass507_11137.method8346(-1698045909)
		!= Class499.aClass499_5551)
	    && i_8_ >= 0 && i_9_ >= 0
	    && i_8_ < client.aClass507_11137.method8412(1372349477)
	    && i_9_ < client.aClass507_11137.method8352((byte) -57)) {
	    long l = (long) (i << 28 | i_12_ << 14 | i_11_);
	    Class525_Sub23 class525_sub23
		= (Class525_Sub23) client.aClass10_11246.method684(l);
	    if (null == class525_sub23)
		client.aClass507_11137.method8358((byte) 9)
		    .method8964(i, i_8_, i_9_, 1008610975);
	    else {
		Class525_Sub13 class525_sub13
		    = (Class525_Sub13) class525_sub23.aClass709_10586
					   .method14372((short) -32764);
		if (null == class525_sub13)
		    client.aClass507_11137.method8358((byte) 93)
			.method8964(i, i_8_, i_9_, 913808731);
		else {
		    int i_13_ = -1;
		    int i_14_ = -1;
		    int i_15_ = -1;
		    Class444 class444 = null;
		    Class444 class444_16_ = null;
		    Class444 class444_17_ = null;
		    Class656_Sub1_Sub2_Sub1 class656_sub1_sub2_sub1
			= ((Class656_Sub1_Sub2_Sub1)
			   client.aClass507_11137.method8358((byte) 111)
			       .method8964(i, i_8_, i_9_, 1838226635));
		    if (null == class656_sub1_sub2_sub1)
			class656_sub1_sub2_sub1
			    = (new Class656_Sub1_Sub2_Sub1
			       (client.aClass507_11137.method8358((byte) 84),
				i_8_ << 9,
				client.aClass507_11137.method8358
				    ((byte) 71).aClass161Array7226[i]
				    .method2577(i_8_, i_9_, (byte) -56),
				i_9_ << 9, i, i));
		    else {
			i_13_ = 266184859 * class656_sub1_sub2_sub1.anInt12222;
			i_14_
			    = class656_sub1_sub2_sub1.anInt12212 * 1490609639;
			i_15_ = class656_sub1_sub2_sub1.anInt12217 * 597265379;
			class444 = class656_sub1_sub2_sub1.aClass444_12216;
			class444_16_ = class656_sub1_sub2_sub1.aClass444_12220;
			class444_17_ = class656_sub1_sub2_sub1.aClass444_12218;
			Class656_Sub1_Sub2_Sub1 class656_sub1_sub2_sub1_18_
			    = class656_sub1_sub2_sub1;
			class656_sub1_sub2_sub1.anInt12217 = 1149496885;
			class656_sub1_sub2_sub1_18_.anInt12212 = -148790743;
			class656_sub1_sub2_sub1.aClass546_10872
			    = client.aClass507_11137.method8358((byte) 67);
		    }
		    class656_sub1_sub2_sub1.anInt12222
			= -1632499793 * class525_sub13.anInt10528;
		    class656_sub1_sub2_sub1.anInt12211
			= class525_sub13.anInt10529 * -140069481;
		while_112_:
		    do {
			Class525_Sub13 class525_sub13_19_;
			do {
			    class525_sub13_19_
				= ((Class525_Sub13)
				   class525_sub23.aClass709_10586
				       .method14353(-1741966460));
			    if (class525_sub13_19_ == null)
				break while_112_;
			} while (class525_sub13_19_.anInt10528 * -840401163
				 == (class656_sub1_sub2_sub1.anInt12222
				     * 266184859));
			class656_sub1_sub2_sub1.anInt12212
			    = class525_sub13_19_.anInt10528 * 618111171;
			class656_sub1_sub2_sub1.anInt12209
			    = 544473143 * class525_sub13_19_.anInt10529;
			for (;;) {
			    Class525_Sub13 class525_sub13_20_
				= ((Class525_Sub13)
				   class525_sub23.aClass709_10586
				       .method14353(-1879512015));
			    if (null == class525_sub13_20_)
				break;
			    if ((class656_sub1_sub2_sub1.anInt12222 * 266184859
				 != -840401163 * class525_sub13_20_.anInt10528)
				&& (class525_sub13_20_.anInt10528 * -840401163
				    != (class656_sub1_sub2_sub1.anInt12212
					* 1490609639))) {
				class656_sub1_sub2_sub1.anInt12217
				    = (762769735
				       * class525_sub13_20_.anInt10528);
				class656_sub1_sub2_sub1.anInt12215
				    = (489738211
				       * class525_sub13_20_.anInt10529);
			    }
			}
		    } while (false);
		    int i_21_ = Class335.method5855((i_8_ << 9) + 256,
						    (i_9_ << 9) + 256, i,
						    2020563229);
		    class656_sub1_sub2_sub1.method10824((float) (i_8_ << 9),
							(float) i_21_,
							(float) (i_9_ << 9));
		    if (i_13_
			!= class656_sub1_sub2_sub1.anInt12222 * 266184859) {
			if (266184859 * class656_sub1_sub2_sub1.anInt12222
			    == i_14_)
			    class656_sub1_sub2_sub1.aClass444_12216
				= class444_16_;
			else if (i_15_ == 266184859 * (class656_sub1_sub2_sub1
						       .anInt12222))
			    class656_sub1_sub2_sub1.aClass444_12216
				= class444_17_;
			else if (((Class8)
				  (Class313_Sub2.aClass40_Sub22_10106.method76
				   ((class656_sub1_sub2_sub1.anInt12222
				     * 266184859),
				    -1121314429)))
				 .aBool134)
			    class656_sub1_sub2_sub1.aClass444_12216
				= Class406.method6616(-1791873590);
			else
			    class656_sub1_sub2_sub1.aClass444_12216 = null;
		    }
		    if (-1 == 1490609639 * class656_sub1_sub2_sub1.anInt12212)
			class656_sub1_sub2_sub1.aClass444_12220 = null;
		    else if (class656_sub1_sub2_sub1.anInt12212 * 1490609639
			     != i_14_) {
			if (i_13_
			    == class656_sub1_sub2_sub1.anInt12212 * 1490609639)
			    class656_sub1_sub2_sub1.aClass444_12220 = class444;
			else if (i_15_ == (class656_sub1_sub2_sub1.anInt12212
					   * 1490609639))
			    class656_sub1_sub2_sub1.aClass444_12220
				= class444_17_;
			else if (((Class8)
				  (Class313_Sub2.aClass40_Sub22_10106.method76
				   ((1490609639
				     * class656_sub1_sub2_sub1.anInt12212),
				    -695100940)))
				 .aBool134)
			    class656_sub1_sub2_sub1.aClass444_12220
				= Class406.method6616(-748213568);
			else
			    class656_sub1_sub2_sub1.aClass444_12220 = null;
		    }
		    if (597265379 * class656_sub1_sub2_sub1.anInt12217 == -1)
			class656_sub1_sub2_sub1.aClass444_12218 = null;
		    else if (class656_sub1_sub2_sub1.anInt12217 * 597265379
			     != i_15_) {
			if (i_13_
			    == class656_sub1_sub2_sub1.anInt12217 * 597265379)
			    class656_sub1_sub2_sub1.aClass444_12218 = class444;
			else if (i_14_ == (class656_sub1_sub2_sub1.anInt12217
					   * 597265379))
			    class656_sub1_sub2_sub1.aClass444_12218
				= class444_16_;
			else if (((Class8)
				  (Class313_Sub2.aClass40_Sub22_10106.method76
				   ((597265379
				     * class656_sub1_sub2_sub1.anInt12217),
				    -190945869)))
				 .aBool134)
			    class656_sub1_sub2_sub1.aClass444_12218
				= Class406.method6616(-898920782);
			else
			    class656_sub1_sub2_sub1.aClass444_12218 = null;
		    }
		    class656_sub1_sub2_sub1.anInt12219 = 0;
		    class656_sub1_sub2_sub1.aByte10867 = (byte) i;
		    class656_sub1_sub2_sub1.aByte10870 = (byte) i;
		    if (client.aClass507_11137.method8360(2115711343)
			    .method7774(i_8_, i_9_, 534921427))
			class656_sub1_sub2_sub1.aByte10870++;
		    client.aClass507_11137.method8358((byte) 68).method8953
			(i, i_8_, i_9_, i_21_, class656_sub1_sub2_sub1,
			 1882616697);
		}
	    }
	}
    }
}
