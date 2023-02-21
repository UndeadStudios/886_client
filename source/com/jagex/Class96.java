/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Class96
{
    Class416 aClass416_1165;
    Class709 aClass709_1166 = new Class709();
    public int anInt1167 = 0;
    Class525_Sub38_Sub2 aClass525_Sub38_Sub2_1168;
    public Class6 aClass6_1169;
    Class559 aClass559_1170;
    Class6 aClass6_1171;
    Class416 aClass416_1172;
    int anInt1173;
    RSBuffer aClass525_Sub38_1174 = new RSBuffer(1700);
    int anInt1175;
    boolean aBool1176;
    int anInt1177;
    int anInt1178;
    int anInt1179;
    int anInt1180;
    Class416 aClass416_1181;
    public int anInt1182;
    Class416 aClass416_1183;
    public boolean aBool1184;
    Class49 aClass49_1185;
    public static Frame aFrame1186;
    
    final void method1791(int i) {
	aClass709_1166.method14344(-1764917319);
	anInt1167 = 0;
    }
    
    public final void method1792(int i) throws IOException {
	if (aClass559_1170 != null && anInt1167 * 1624093005 > 0) {
	    aClass525_Sub38_1174.pos = 0;
	    for (;;) {
		Class525_Sub15 class525_sub15
		    = ((Class525_Sub15)
		       aClass709_1166.method14372((short) -10451));
		if (null == class525_sub15
		    || (-1528429171 * class525_sub15.anInt10548
			> (aClass525_Sub38_1174.buffer.length
			   - aClass525_Sub38_1174.pos * -1133521593)))
		    break;
		aClass525_Sub38_1174.method16614
		    (class525_sub15.aClass525_Sub38_Sub2_10546.buffer,
		     0, -1528429171 * class525_sub15.anInt10548, 109742766);
		anInt1167 -= 1246463297 * class525_sub15.anInt10548;
		class525_sub15.method8755(-1933461091);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16627(1865478555);
		class525_sub15.method16252(-1799595415);
	    }
	    aClass559_1170.method9380(aClass525_Sub38_1174.buffer, 0,
				      (-1133521593
				       * aClass525_Sub38_1174.pos),
				      1943442590);
	    anInt1177 += aClass525_Sub38_1174.pos * 1796087375;
	    anInt1182 = 0;
	}
    }
    
    void method1793() {
	if (client.anInt11083 % 50 == 0) {
	    anInt1179 = 163595125 * anInt1177;
	    anInt1177 = 0;
	    anInt1180 = 67885231 * anInt1178;
	    anInt1178 = 0;
	}
    }
    
    public final void method1794(Class525_Sub15 class525_sub15, short i) {
	aClass709_1166.method14345(class525_sub15, (byte) 0);
	class525_sub15.anInt10548
	    = (-1730863325
	       * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	class525_sub15.aClass525_Sub38_Sub2_10546.pos = 0;
	anInt1167 += class525_sub15.anInt10548 * 1246463297;
    }
    
    void method1795(int i) {
	if (client.anInt11083 % 50 == 0) {
	    anInt1179 = 163595125 * anInt1177;
	    anInt1177 = 0;
	    anInt1180 = 67885231 * anInt1178;
	    anInt1178 = 0;
	}
    }
    
    void method1796(Class559 class559, String string, int i) {
	aClass559_1170 = class559;
	aClass49_1185.method1115(string, -2075302757);
    }
    
    void method1797(Class559 class559, String string) {
	aClass559_1170 = class559;
	aClass49_1185.method1115(string, -1018771420);
    }
    
    void method1798(byte i) {
	aClass559_1170 = null;
	aClass49_1185.method1115(null, -1615750228);
    }
    
    public Class559 method1799(byte i) {
	return aClass559_1170;
    }
    
    final void method1800() {
	aClass709_1166.method14344(-1943347870);
	anInt1167 = 0;
    }
    
    Class96() {
	aClass525_Sub38_Sub2_1168 = new Class525_Sub38_Sub2(40000);
	aClass416_1172 = null;
	anInt1173 = 0;
	aBool1176 = true;
	anInt1175 = 0;
	anInt1182 = 0;
	aBool1184 = false;
	aClass49_1185 = new Class49();
	Thread thread = new Thread(aClass49_1185);
	thread.setDaemon(true);
	thread.setPriority(1);
	thread.start();
    }
    
    final void method1801() {
	aClass709_1166.method14344(-1732867233);
	anInt1167 = 0;
    }
    
    void method1802(short i) {
	if (null != aClass559_1170) {
	    aClass559_1170.method9381(1229571244);
	    aClass559_1170 = null;
	}
	aClass49_1185.method1115(null, -1772882575);
    }
    
    public final void method1803() throws IOException {
	if (aClass559_1170 != null && anInt1167 * 1624093005 > 0) {
	    aClass525_Sub38_1174.pos = 0;
	    for (;;) {
		Class525_Sub15 class525_sub15
		    = ((Class525_Sub15)
		       aClass709_1166.method14372((short) -32555));
		if (null == class525_sub15
		    || (-1528429171 * class525_sub15.anInt10548
			> (aClass525_Sub38_1174.buffer.length
			   - aClass525_Sub38_1174.pos * -1133521593)))
		    break;
		aClass525_Sub38_1174.method16614
		    (class525_sub15.aClass525_Sub38_Sub2_10546.buffer,
		     0, -1528429171 * class525_sub15.anInt10548, 1361322900);
		anInt1167 -= 1246463297 * class525_sub15.anInt10548;
		class525_sub15.method8755(-1933461091);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16627(353085286);
		class525_sub15.method16252(-1799595415);
	    }
	    aClass559_1170.method9380(aClass525_Sub38_1174.buffer, 0,
				      (-1133521593
				       * aClass525_Sub38_1174.pos),
				      1599974491);
	    anInt1177 += aClass525_Sub38_1174.pos * 1796087375;
	    anInt1182 = 0;
	}
    }
    
    public final void method1804(Class525_Sub15 class525_sub15) {
	aClass709_1166.method14345(class525_sub15, (byte) 0);
	class525_sub15.anInt10548
	    = (-1730863325
	       * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	class525_sub15.aClass525_Sub38_Sub2_10546.pos = 0;
	anInt1167 += class525_sub15.anInt10548 * 1246463297;
    }
    
    public final void method1805(Class525_Sub15 class525_sub15) {
	aClass709_1166.method14345(class525_sub15, (byte) 0);
	class525_sub15.anInt10548
	    = (-1730863325
	       * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	class525_sub15.aClass525_Sub38_Sub2_10546.pos = 0;
	anInt1167 += class525_sub15.anInt10548 * 1246463297;
    }
    
    void method1806() {
	aClass559_1170 = null;
	aClass49_1185.method1115(null, -1360990806);
    }
    
    final void method1807() {
	aClass709_1166.method14344(-1577684987);
	anInt1167 = 0;
    }
    
    void method1808() {
	if (null != aClass559_1170) {
	    aClass559_1170.method9381(2076515549);
	    aClass559_1170 = null;
	}
	aClass49_1185.method1115(null, -1995428142);
    }
    
    final void method1809() {
	aClass709_1166.method14344(1073343290);
	anInt1167 = 0;
    }
    
    public Class559 method1810() {
	return aClass559_1170;
    }
    
    public Class559 method1811() {
	return aClass559_1170;
    }
    
    public Class559 method1812() {
	return aClass559_1170;
    }
    
    public static Class395[] method1813(int i) {
	return (new Class395[]
		{ Class395.aClass395_4100, Class395.aClass395_4101,
		  Class395.aClass395_4102 });
    }
    
    static void method1814(Class182 class182, int i, int i_0_, int i_1_,
			   int i_2_, int i_3_, int i_4_, int i_5_) {
	class182.method3190(i, i_0_, i_1_, i_2_, i_3_, (byte) -1);
	class182.method3190(i + 1, i_0_ + 1, i_1_ - 2, 16, i_4_, (byte) -1);
	class182.method3189(1 + i, i_0_ + 18, i_1_ - 2, i_2_ - 19, i_4_,
			    -480234225);
    }
    
    public static Class609[] method1815(byte i) {
	return (new Class609[]
		{ Class609.aClass609_8001, Class609.aClass609_8007,
		  Class609.aClass609_8006, Class609.aClass609_8003,
		  Class609.aClass609_8004, Class609.aClass609_8002 });
    }
    
    public static void method1816(int i) {
	Class579.method9585((short) -25715);
	Class654.aClass652_Sub2_8398.method10768((byte) 100);
	Class654.aClass652_Sub1_8399.method10768((byte) 52);
	if (client.anInt11273 * 1353095005 > 0) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4333,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16602(1117412724 * client.anInt11273, 2035902982);
	    for (int i_6_ = 0; i_6_ < 1353095005 * client.anInt11273; i_6_++) {
		Interface64 interface64 = client.anInterface64Array11106[i_6_];
		long l = (interface64.method422(396910421)
			  - 2266328018382184561L * Class654.aLong8400);
		if (l > 16777215L)
		    l = 16777215L;
		Class654.aLong8400 = (interface64.method422(-1550062054)
				      * 5611731449678946449L);
		class525_sub15.aClass525_Sub38_Sub2_10546.method16735
		    (interface64.method413(-1405409000), -1491178993);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16604((int) l, (byte) 1);
	    }
	    client.aClass96_11085.method1794(class525_sub15, (short) 22845);
	}
	if (Class654.anInt8396 * 1348481885 > 0)
	    Class654.anInt8396 -= -1630226187;
	if (client.aBool11364 && 1348481885 * Class654.anInt8396 <= 0) {
	    Class654.anInt8396 = 1755214628;
	    client.aBool11364 = false;
	    int i_7_;
	    int i_8_;
	    if (5 == -174799205 * Class700.anInt8779) {
		if (Class453_Sub3.aClass309_Sub1_10316.method5485(394192430)
		    == Class289.aClass289_3202) {
		    Class350_Sub1 class350_sub1
			= (Class350_Sub1) Class453_Sub3
					      .aClass309_Sub1_10316
					      .method5481(-2011681937);
		    i_7_ = Class511.method8531(class350_sub1.aClass429_10201,
					       19722651) >> 3;
		    int i_9_ = 1024;
		    i_8_ = (i_9_ * 3 - (Class308.method5449((class350_sub1
							     .aClass429_10201),
							    214367582)
					>> 3)) % (i_9_ * 2);
		} else {
		    i_7_ = 0;
		    i_8_ = 0;
		}
	    } else {
		i_7_ = (int) client.aFloat11176 >> 3;
		i_8_ = (int) client.aFloat11052 >> 3;
	    }
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4301,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16664(i_8_,
								  -37584254);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16664(i_7_,
								  -1639431406);
	    client.aClass96_11085.method1794(class525_sub15, (short) 17915);
	}
	if (Class280.aBool3001 != Class654.aBool8397) {
	    Class654.aBool8397 = Class280.aBool3001;
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4360,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16735(Class280.aBool3001 ? 1 : 0, -951072032);
	    client.aClass96_11085.method1794(class525_sub15, (short) 14239);
	}
	if (!client.aBool11084) {
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4267,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0,
								  -1520268184);
	    int i_10_ = (class525_sub15.aClass525_Sub38_Sub2_10546.pos
			 * -1133521593);
	    RSBuffer class525_sub38
		= Class198_Sub13.aClass525_Sub30_9973.method16501(-1746585929);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16614
		(class525_sub38.buffer, 0,
		 class525_sub38.pos * -1133521593, 1547120529);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16617
		(-1133521593 * (class525_sub15.aClass525_Sub38_Sub2_10546
				.pos) - i_10_,
		 (byte) 7);
	    client.aClass96_11085.method1794(class525_sub15, (short) 27549);
	    client.aBool11084 = true;
	}
	if (!client.aBool11251
	    && Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701
		   .method17160(800754255) == 1) {
	    int[] is = Class501.aClass182_5564.method3541();
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4278,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602(0,
								  706782676);
	    int i_11_
		= (-1133521593
		   * class525_sub15.aClass525_Sub38_Sub2_10546.pos);
	    if (null != is && is.length != 0) {
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(1, -1375301247);
		Class130[] class130s = Class130.method2279((byte) 69);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
		    boolean bool = false;
		    for (int i_13_ = 0; i_13_ < class130s.length; i_13_++) {
			if (class130s[i_13_].anInt1580 == is[i_12_]) {
			    hashset.add(class130s[i_13_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_12_]));
		}
		Class106_Sub1.method14528(hashset,
					  (class525_sub15
					   .aClass525_Sub38_Sub2_10546),
					  -1525199266);
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16642(arraylist.size(), (byte) 121);
		if (arraylist.size() > 0) {
		    int i_14_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_14_)
			    i_14_ = integer.intValue();
		    }
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16620(i_14_, (byte) 19);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_14_)
			    class525_sub15.aClass525_Sub38_Sub2_10546
				.method16620
				(integer.intValue() - i_14_, (byte) 19);
		    }
		}
	    } else
		class525_sub15.aClass525_Sub38_Sub2_10546
		    .method16735(0, -270231975);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16616
		((class525_sub15.aClass525_Sub38_Sub2_10546.pos
		  * -1133521593) - i_11_,
		 -767028398);
	    client.aClass96_11085.method1794(class525_sub15, (short) 29976);
	    client.aBool11251 = true;
	}
    }
    
    public static String method1817(long l, int i, boolean bool,
				    Class666 class666, int i_15_) {
	char c = ',';
	char c_16_ = '.';
	if (Class666.aClass666_8562 == class666) {
	    c = '.';
	    c_16_ = ',';
	}
	if (class666 == Class666.aClass666_8561)
	    c_16_ = '\u00a0';
	boolean bool_17_ = false;
	if (l < 0L) {
	    bool_17_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_18_ = 0; i_18_ < i; i_18_++) {
		int i_19_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_19_ + 48 - 10 * (int) l));
	    }
	    stringbuilder.append(c);
	}
	int i_20_ = 0;
	for (;;) {
	    int i_21_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (48 + i_21_ - 10 * (int) l));
	    if (0L == l)
		break;
	    if (bool && ++i_20_ % 3 == 0)
		stringbuilder.append(c_16_);
	}
	if (bool_17_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    static void method1818(int i, int i_22_, int i_23_,
			   Class525_Sub13 class525_sub13, int i_24_) {
	long l = (long) (i << 28 | i_23_ << 14 | i_22_);
	Class525_Sub23 class525_sub23
	    = (Class525_Sub23) client.aClass10_11246.method684(l);
	if (class525_sub23 == null) {
	    class525_sub23 = new Class525_Sub23();
	    client.aClass10_11246.method695(class525_sub23, l);
	    class525_sub23.aClass709_10586.method14345(class525_sub13,
						       (byte) 0);
	} else {
	    Class8 class8
		= ((Class8)
		   (Class313_Sub2.aClass40_Sub22_10106.method76
		    (-840401163 * class525_sub13.anInt10528, -1561438553)));
	    int i_25_ = 1345227511 * class8.anInt73;
	    if (1051584679 * class8.anInt56 == 1)
		i_25_ *= 659628993 * class525_sub13.anInt10529 + 1;
	    for (Class525_Sub13 class525_sub13_26_
		     = (Class525_Sub13) class525_sub23.aClass709_10586
					    .method14372((short) -11051);
		 null != class525_sub13_26_;
		 class525_sub13_26_
		     = (Class525_Sub13) class525_sub23.aClass709_10586
					    .method14353(-2077765834)) {
		class8 = (Class8) (Class313_Sub2.aClass40_Sub22_10106.method76
				   (class525_sub13_26_.anInt10528 * -840401163,
				    -1712911668));
		int i_27_ = 1345227511 * class8.anInt73;
		if (1 == 1051584679 * class8.anInt56)
		    i_27_ *= 659628993 * class525_sub13_26_.anInt10529 + 1;
		if (i_25_ > i_27_) {
		    Class51.method1138(class525_sub13, class525_sub13_26_,
				       -863996260);
		    return;
		}
	    }
	    class525_sub23.aClass709_10586.method14345(class525_sub13,
						       (byte) 0);
	}
    }
}
