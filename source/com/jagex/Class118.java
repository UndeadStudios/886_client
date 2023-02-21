/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class118
{
    public static Class182 method2091
	(Canvas canvas, Class180 class180, Interface24 interface24,
	 Interface47 interface47, Interface48 interface48,
	 Interface49 interface49, int i, int i_0_) {
	return new Class182_Sub2(canvas, class180, interface24, interface47,
				 interface48, interface49, i, i_0_);
    }
    
    public static Class182 method2092
	(Canvas canvas, Class180 class180, Interface24 interface24,
	 Interface47 interface47, Interface48 interface48,
	 Interface49 interface49, int i, int i_1_) {
	return new Class182_Sub2(canvas, class180, interface24, interface47,
				 interface48, interface49, i, i_1_);
    }
    
    Class118() throws Throwable {
	throw new Error();
    }
    
    static void method2093
	(Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2,
	 boolean bool, byte i) {
	if (Class61.anInt658 * -628070459 < 403) {
	    Class299 class299 = class656_sub1_sub3_sub1_sub2.aClass299_12255;
	    String string = class656_sub1_sub3_sub1_sub2.aString12264;
	    if (null != class299.anIntArray3323) {
		class299
		    = class299.method5386(Class532.aClass111_7170,
					  Class532.aClass111_7170, 2136440583);
		if (null == class299)
		    return;
		string = class299.aString3290;
	    }
	    if (class299.aBool3326) {
		if (class656_sub1_sub3_sub1_sub2.anInt12260 * 550404207 != 0) {
		    String string_2_
			= (Class668.aClass668_8577 == client.aClass668_11090
			   ? Class53.aClass53_517
				 .method1169(Class21.aClass666_213, 1552651121)
			   : Class53.aClass53_515.method1169((Class21
							      .aClass666_213),
							     1552651121));
		    string = new StringBuilder().append(string).append
				 (Class64.method1402
				  ((550404207
				    * class656_sub1_sub3_sub1_sub2.anInt12260),
				   (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				    .anInt12232) * -1609711421,
				   1167664585))
				 .append
				 (Class55.aString562).append
				 (string_2_).append
				 (class656_sub1_sub3_sub1_sub2.anInt12260
				  * 550404207)
				 .append
				 (Class55.aString561).toString();
		}
		if (client.aBool11358 && !bool) {
		    Class88 class88
			= ((Class88)
			   (1057400013 * Class434.anInt4828 != -1
			    ? (client.aClass40_Sub16_11201.method76
			       (1057400013 * Class434.anInt4828, -1460172808))
			    : null));
		    if ((Class30.anInt299 * 1136155797 & 0x2) != 0
			&& (class88 == null
			    || (class299.method5368((1057400013
						     * Class434.anInt4828),
						    (class88.anInt893
						     * 2053564367),
						    (byte) 1)
				!= class88.anInt893 * 2053564367)))
			Class564.method9454
			    (client.aString11258,
			     new StringBuilder().append
				 (client.aString11117).append
				 (" ").append
				 (Class55.aString564).append
				 (" ").append
				 (Class493.method8001(16776960, 1709315171))
				 .append
				 (string).toString(),
			     Class316.anInt3496 * -788352709, 8, -1,
			     (long) (class656_sub1_sub3_sub1_sub2.anInt11964
				     * 2032864281),
			     0, 0, true, false,
			     (long) (2032864281 * (class656_sub1_sub3_sub1_sub2
						   .anInt11964)),
			     false, (byte) 54);
		}
		if (!bool) {
		    String[] strings = class299.aStringArray3307;
		    boolean bool_3_ = false;
		    if (client.aBool11226)
			strings
			    = Class390_Sub1.method15807(strings, (byte) -9);
		    if (strings != null) {
		    while_26_:
			for (int i_4_ = strings.length - 1; i_4_ >= 0;
			     i_4_--) {
			    if (null != strings[i_4_]
				&& ((-757977319
				     * class656_sub1_sub3_sub1_sub2.anInt12271)
				    & 1 << i_4_) == 0) {
				short i_5_ = client.aShortArray11327[i_4_];
				int i_6_ = -228265633 * client.anInt11253;
				int i_7_
				    = class299.method5374(i_4_, 960505659);
				if (-1 != i_7_)
				    i_6_ = i_7_;
				boolean bool_8_
				    = (strings[i_4_].equalsIgnoreCase
				       (Class53.aClass53_510.method1169
					(Class21.aClass666_213, 1552651121)));
				boolean bool_9_
				    = (strings[i_4_].equalsIgnoreCase
				       (Class53.aClass53_509.method1169
					(Class21.aClass666_213, 1552651121)));
				if (bool_8_ || bool_9_) {
				    if (bool_3_)
					continue;
				    switch (client.aClass621_11237.anInt8091
					    * -1547226255) {
				    case 3:
					bool_3_ = true;
					continue while_26_;
				    case 0:
				    case 2:
					if (class299.aByte3350 == 1)
					    bool_3_ = true;
					else
					    break;
					continue while_26_;
				    case 1:
					if (!bool_8_)
					    break;
					continue while_26_;
				    }
				    if (bool_8_)
					i_6_
					    = class299.anInt3309 * -1955787725;
				}
				Class564.method9454
				    (strings[i_4_],
				     new StringBuilder().append
					 (Class493.method8001(16776960,
							      2088213080))
					 .append
					 (string).toString(),
				     i_6_, i_5_, -1,
				     (long) (2032864281
					     * (class656_sub1_sub3_sub1_sub2
						.anInt11964)),
				     0, 0, true, false,
				     (long) (2032864281
					     * (class656_sub1_sub3_sub1_sub2
						.anInt11964)),
				     false, (byte) 51);
			    }
			}
			if (bool_3_) {
			    for (int i_10_ = 0; i_10_ < strings.length;
				 i_10_++) {
				if (null != strings[i_10_]
				    && ((class656_sub1_sub3_sub1_sub2
					 .anInt12271) * -757977319
					& 1 << i_10_) == 0) {
				    boolean bool_11_
					= (strings[i_10_].equalsIgnoreCase
					   (Class53.aClass53_510.method1169
					    (Class21.aClass666_213,
					     1552651121)));
				    boolean bool_12_
					= (strings[i_10_].equalsIgnoreCase
					   (Class53.aClass53_509.method1169
					    (Class21.aClass666_213,
					     1552651121)));
				    if (bool_11_ || bool_12_) {
					short i_13_
					    = client.aShortArray11327[i_10_];
					int i_14_
					    = -228265633 * client.anInt11253;
					int i_15_
					    = class299.method5374(i_10_,
								  1604673800);
					if (-1 != i_15_)
					    i_14_ = i_15_;
					if ((Class621.aClass621_8089
					     == client.aClass621_11237)
					    || ((client.aClass621_11237
						 == Class621.aClass621_8087)
						&& ((550404207
						     * (class656_sub1_sub3_sub1_sub2
							.anInt12260))
						    > (-1609711421
						       * (Class581
							  .aClass656_Sub1_Sub3_Sub1_Sub1_7705
							  .anInt12232)))))
					    i_13_ += 2000;
					if (bool_11_)
					    i_14_ = (class299.anInt3309
						     * -1955787725);
					Class564.method9454
					    (strings[i_10_],
					     new StringBuilder().append
						 (Class493.method8001
						  (16776960, 1122593739))
						 .append
						 (string).toString(),
					     i_14_, i_13_, -1,
					     (long) (2032864281
						     * (class656_sub1_sub3_sub1_sub2
							.anInt11964)),
					     0, 0, true, false,
					     (long) (2032864281
						     * (class656_sub1_sub3_sub1_sub2
							.anInt11964)),
					     false, (byte) 47);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method2094(int i) {
	if (null == client.aClass259_11271) {
	    if (!Class61.aBool670) {
		if (Class525_Sub22_Sub1.aClass632_11646.aBool8220) {
		    if (Class198_Sub19.aClass525_Sub16_Sub16_9993 != null)
			return (2107184813
				* (Class198_Sub19.aClass525_Sub16_Sub16_9993
				   .anInt11859));
		} else if (null != Class307.aClass525_Sub16_Sub16_3418)
		    return (2107184813
			    * Class307.aClass525_Sub16_Sub16_3418.anInt11859);
	    } else {
		Class7 class7 = Class328.method5797((byte) -25);
		int i_16_ = Class509.aClass569_5662.method9498(812734823);
		int i_17_ = Class509.aClass569_5662.method9499(501271953);
		if (!Class61.aBool652) {
		    if (i_16_ > -305591171 * Class50.anInt374
			&& i_16_ < (-305591171 * Class50.anInt374
				    + Class49.anInt373 * 994365359)) {
			int i_18_ = -1;
			for (int i_19_ = 0;
			     i_19_ < -628070459 * Class61.anInt658; i_19_++) {
			    if (Class61.aBool645) {
				int i_20_
				    = (class7.anInt49 * 385749773
				       + (359058039 * Exception_Sub2.anInt11420
					  + 20)
				       + 1
				       + (Class61.anInt648 * -632680525
					  * (Class61.anInt658 * -628070459 - 1
					     - i_19_)));
				if ((i_17_
				     > i_20_ - 385749773 * class7.anInt49 - 1)
				    && (i_17_
					< i_20_ + class7.anInt51 * 1921008003))
				    i_18_ = i_19_;
			    } else {
				int i_21_
				    = ((Class61.anInt648 * -632680525
					* (Class61.anInt658 * -628070459 - 1
					   - i_19_))
				       + (Exception_Sub2.anInt11420 * 359058039
					  + 31));
				if ((i_17_
				     > i_21_ - 385749773 * class7.anInt49 - 1)
				    && (i_17_
					< i_21_ + 1921008003 * class7.anInt51))
				    i_18_ = i_19_;
			    }
			}
			if (-1 != i_18_) {
			    int i_22_ = 0;
			    Class699 class699
				= new Class699(Class61.aClass709_660);
			    for (Class525_Sub16_Sub16 class525_sub16_sub16
				     = ((Class525_Sub16_Sub16)
					class699.method14235(-1747070483));
				 null != class525_sub16_sub16;
				 class525_sub16_sub16 = ((Class525_Sub16_Sub16)
							 class699.next())) {
				if (i_22_++ == i_18_)
				    return (2107184813
					    * class525_sub16_sub16.anInt11859);
			    }
			}
		    }
		} else if (i_16_ > -305591171 * Class50.anInt374
			   && i_16_ < (Class49.anInt373 * 994365359
				       + Class50.anInt374 * -305591171)) {
		    int i_23_ = -1;
		    for (int i_24_ = 0; i_24_ < Class61.anInt659 * 1607854389;
			 i_24_++) {
			if (Class61.aBool645) {
			    int i_25_
				= (1
				   + (20
				      + 359058039 * Exception_Sub2.anInt11420
				      + 385749773 * class7.anInt49)
				   + i_24_ * (-632680525 * Class61.anInt648));
			    if (i_17_ > i_25_ - class7.anInt49 * 385749773 - 1
				&& i_17_ < i_25_ + class7.anInt51 * 1921008003)
				i_23_ = i_24_;
			} else {
			    int i_26_
				= (-632680525 * Class61.anInt648 * i_24_
				   + (359058039 * Exception_Sub2.anInt11420
				      + 31));
			    if (i_17_ > i_26_ - 385749773 * class7.anInt49 - 1
				&& i_17_ < i_26_ + 1921008003 * class7.anInt51)
				i_23_ = i_24_;
			}
		    }
		    if (-1 != i_23_) {
			int i_27_ = 0;
			Class700 class700
			    = new Class700(Class61.aClass697_656);
			for (Class525_Sub16_Sub7 class525_sub16_sub7
				 = ((Class525_Sub16_Sub7)
				    class700.method14239(1583573840));
			     class525_sub16_sub7 != null;
			     class525_sub16_sub7
				 = (Class525_Sub16_Sub7) class700.next()) {
			    if (i_27_++ == i_23_)
				return 2107184813 * (((Class525_Sub16_Sub16)
						      (class525_sub16_sub7
						       .aClass697_11778
						       .aClass525_Sub16_8766
						       .aClass525_Sub16_10554))
						     .anInt11859);
			}
		    }
		} else if (null != Class61.aClass525_Sub16_Sub7_668
			   && i_16_ > Class561.anInt7550 * 1048248753
			   && i_16_ < (Class561.anInt7550 * 1048248753
				       + -1153846815 * Class263.anInt2798)) {
		    int i_28_ = -1;
		    for (int i_29_ = 0;
			 i_29_ < 1624285615 * (Class61.aClass525_Sub16_Sub7_668
					       .anInt11780);
			 i_29_++) {
			if (Class61.aBool645) {
			    int i_30_ = (Class61.anInt648 * -632680525 * i_29_
					 + (1 + (385749773 * class7.anInt49
						 + (20 + (Class212.anInt2272
							  * -2121563769)))));
			    if (i_17_ > i_30_ - 385749773 * class7.anInt49 - 1
				&& i_17_ < i_30_ + 1921008003 * class7.anInt51)
				i_28_ = i_29_;
			} else {
			    int i_31_
				= (i_29_ * (Class61.anInt648 * -632680525)
				   + (-2121563769 * Class212.anInt2272 + 31));
			    if (i_17_ > i_31_ - 385749773 * class7.anInt49 - 1
				&& i_17_ < 1921008003 * class7.anInt51 + i_31_)
				i_28_ = i_29_;
			}
		    }
		    if (-1 != i_28_) {
			int i_32_ = 0;
			Class700 class700
			    = new Class700(Class61.aClass525_Sub16_Sub7_668
					   .aClass697_11778);
			for (Class525_Sub16_Sub16 class525_sub16_sub16
				 = ((Class525_Sub16_Sub16)
				    class700.method14239(1017721325));
			     class525_sub16_sub16 != null;
			     class525_sub16_sub16
				 = (Class525_Sub16_Sub16) class700.next()) {
			    if (i_32_++ == i_28_)
				return (class525_sub16_sub16.anInt11859
					* 2107184813);
			}
		    }
		}
	    }
	}
	return -1;
    }
}
