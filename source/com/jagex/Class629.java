/* Class629 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class629 implements Iterable
{
    Class622[] aClass622Array8158;
    Class620[] aClass620Array8159;
    public static int anInt8160;
    static long aLong8161;
    public static Class458 aClass458_8162;
    
    public Class629(Class458 class458) {
	method10289(class458.method7484((Class638.aClass638_8307.anInt8316
					 * 2028004077),
					1995101737),
		    171426179);
    }
    
    void method10287(int i) {
	aClass622Array8158 = null;
    }
    
    public Iterator iterator() {
	return new Class628(aClass622Array8158);
    }
    
    public int method10288(int i) {
	return aClass622Array8158.length;
    }
    
    void method10289(byte[] is, int i) {
	method10287(654123809);
	if (is == null)
	    aClass622Array8158 = new Class622[0];
	else
	    method10291(new RSBuffer(is), (byte) 12);
    }
    
    public Class622 method10290(int i, int i_0_) {
	return aClass622Array8158[i];
    }
    
    void method10291(RSBuffer class525_sub38, byte i) {
	for (;;) {
	    int i_1_ = class525_sub38.readUnsignedByte(459092388);
	    if (i_1_ == 0)
		break;
	    if (i_1_ == 1) {
		int i_2_ = class525_sub38.readUnsignedByte(1997223528);
		int i_3_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
		    int i_5_ = class525_sub38.readUnsignedByte(888142976);
		    int i_6_ = class525_sub38.readUnsignedShort((byte) 118);
		    int i_7_ = class525_sub38.readUnsignedByte(1121912076);
		    int i_8_ = 0;
		    Class620 class620 = Class620.aClass620_8086;
		    byte i_9_ = 1;
		    boolean bool = (i_7_ & 0x1) != 0;
		    if ((i_7_ & 0x2) != 0)
			i_8_ = class525_sub38.readUnsignedByte(1001498278);
		    if (0 != (i_7_ & 0x4))
			class620 = (aClass620Array8159
				    [class525_sub38.readUnsignedByte(-12343622)]);
		    if (0 != (i_7_ & 0x8))
			i_9_ = class525_sub38.readByte(-1150098071);
		    boolean bool_10_
			= class525_sub38.readUnsignedByte(1669052555) == 1;
		    linkedlist.add(new Class622(i_5_, i_6_, bool, bool_10_,
						i_8_, class620, i_9_));
		    if (i_5_ > i_3_)
			i_3_ = i_5_;
		}
		aClass622Array8158 = new Class622[1 + i_3_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class622 class622 = (Class622) iterator.next();
		    aClass622Array8158[class622.method10190(7181858)]
			= class622;
		}
	    } else if (2 == i_1_) {
		aClass620Array8159
		    = new Class620[class525_sub38.readUnsignedByte(1162638917)];
		for (int i_11_ = class525_sub38.readUnsignedByte(1110329030);
			 255 != i_11_;
			 i_11_ = class525_sub38.readUnsignedByte(507277548)) {
		    int[] is = new int[class525_sub38.readUnsignedShort((byte) 61)];
		    for (int i_12_ = 0; i_12_ < is.length; i_12_++)
			is[i_12_] = class525_sub38.readInt(1068780631);
		    aClass620Array8159[i_11_] = new Class620(is);
		}
	    }
	}
    }
    
    public Iterator method10292() {
	return new Class628(aClass622Array8158);
    }
    
    public int method10293() {
	return aClass622Array8158.length;
    }
    
    void method10294() {
	aClass622Array8158 = null;
    }
    
    void method10295(byte[] is) {
	method10287(271186337);
	if (is == null)
	    aClass622Array8158 = new Class622[0];
	else
	    method10291(new RSBuffer(is), (byte) -86);
    }
    
    void method10296(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1358936175);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_13_ = class525_sub38.readUnsignedByte(274612547);
		int i_14_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
		    int i_16_ = class525_sub38.readUnsignedByte(392303734);
		    int i_17_ = class525_sub38.readUnsignedShort((byte) 91);
		    int i_18_ = class525_sub38.readUnsignedByte(1404708984);
		    int i_19_ = 0;
		    Class620 class620 = Class620.aClass620_8086;
		    byte i_20_ = 1;
		    boolean bool = (i_18_ & 0x1) != 0;
		    if ((i_18_ & 0x2) != 0)
			i_19_ = class525_sub38.readUnsignedByte(1702943860);
		    if (0 != (i_18_ & 0x4))
			class620 = (aClass620Array8159
				    [class525_sub38.readUnsignedByte(178728569)]);
		    if (0 != (i_18_ & 0x8))
			i_20_ = class525_sub38.readByte(-1150098071);
		    boolean bool_21_
			= class525_sub38.readUnsignedByte(2003685218) == 1;
		    linkedlist.add(new Class622(i_16_, i_17_, bool, bool_21_,
						i_19_, class620, i_20_));
		    if (i_16_ > i_14_)
			i_14_ = i_16_;
		}
		aClass622Array8158 = new Class622[1 + i_14_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class622 class622 = (Class622) iterator.next();
		    aClass622Array8158[class622.method10190(-2127381639)]
			= class622;
		}
	    } else if (2 == i) {
		aClass620Array8159
		    = new Class620[class525_sub38.readUnsignedByte(982237252)];
		for (int i_22_ = class525_sub38.readUnsignedByte(34900023);
			 255 != i_22_;
			 i_22_ = class525_sub38.readUnsignedByte(535517271)) {
		    int[] is = new int[class525_sub38.readUnsignedShort((byte) 119)];
		    for (int i_23_ = 0; i_23_ < is.length; i_23_++)
			is[i_23_] = class525_sub38.readInt(831306307);
		    aClass620Array8159[i_22_] = new Class620(is);
		}
	    }
	}
    }
    
    public int method10297() {
	return aClass622Array8158.length;
    }
    
    void method10298(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1362607353);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_24_ = class525_sub38.readUnsignedByte(865100074);
		int i_25_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
		    int i_27_ = class525_sub38.readUnsignedByte(59179336);
		    int i_28_ = class525_sub38.readUnsignedShort((byte) 21);
		    int i_29_ = class525_sub38.readUnsignedByte(1027042724);
		    int i_30_ = 0;
		    Class620 class620 = Class620.aClass620_8086;
		    byte i_31_ = 1;
		    boolean bool = (i_29_ & 0x1) != 0;
		    if ((i_29_ & 0x2) != 0)
			i_30_ = class525_sub38.readUnsignedByte(1904830196);
		    if (0 != (i_29_ & 0x4))
			class620 = (aClass620Array8159
				    [class525_sub38.readUnsignedByte(1497149235)]);
		    if (0 != (i_29_ & 0x8))
			i_31_ = class525_sub38.readByte(-1150098071);
		    boolean bool_32_
			= class525_sub38.readUnsignedByte(305999143) == 1;
		    linkedlist.add(new Class622(i_27_, i_28_, bool, bool_32_,
						i_30_, class620, i_31_));
		    if (i_27_ > i_25_)
			i_25_ = i_27_;
		}
		aClass622Array8158 = new Class622[1 + i_25_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class622 class622 = (Class622) iterator.next();
		    aClass622Array8158[class622.method10190(-702048819)]
			= class622;
		}
	    } else if (2 == i) {
		aClass620Array8159
		    = new Class620[class525_sub38.readUnsignedByte(1848690910)];
		for (int i_33_ = class525_sub38.readUnsignedByte(994130806);
			 255 != i_33_;
			 i_33_ = class525_sub38.readUnsignedByte(1282808)) {
		    int[] is = new int[class525_sub38.readUnsignedShort((byte) 86)];
		    for (int i_34_ = 0; i_34_ < is.length; i_34_++)
			is[i_34_] = class525_sub38.readInt(1723063661);
		    aClass620Array8159[i_33_] = new Class620(is);
		}
	    }
	}
    }
    
    public Iterator method10299() {
	return new Class628(aClass622Array8158);
    }
    
    void method10300(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1854033096);
	    if (i == 0)
		break;
	    if (i == 1) {
		int i_35_ = class525_sub38.readUnsignedByte(382057392);
		int i_36_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
		    int i_38_ = class525_sub38.readUnsignedByte(1282435549);
		    int i_39_ = class525_sub38.readUnsignedShort((byte) 127);
		    int i_40_ = class525_sub38.readUnsignedByte(324035620);
		    int i_41_ = 0;
		    Class620 class620 = Class620.aClass620_8086;
		    byte i_42_ = 1;
		    boolean bool = (i_40_ & 0x1) != 0;
		    if ((i_40_ & 0x2) != 0)
			i_41_ = class525_sub38.readUnsignedByte(810200481);
		    if (0 != (i_40_ & 0x4))
			class620 = (aClass620Array8159
				    [class525_sub38.readUnsignedByte(1006248618)]);
		    if (0 != (i_40_ & 0x8))
			i_42_ = class525_sub38.readByte(-1150098071);
		    boolean bool_43_
			= class525_sub38.readUnsignedByte(501518629) == 1;
		    linkedlist.add(new Class622(i_38_, i_39_, bool, bool_43_,
						i_41_, class620, i_42_));
		    if (i_38_ > i_36_)
			i_36_ = i_38_;
		}
		aClass622Array8158 = new Class622[1 + i_36_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class622 class622 = (Class622) iterator.next();
		    aClass622Array8158[class622.method10190(1567910613)]
			= class622;
		}
	    } else if (2 == i) {
		aClass620Array8159
		    = new Class620[class525_sub38.readUnsignedByte(-6182181)];
		for (int i_44_ = class525_sub38.readUnsignedByte(1899382235);
			 255 != i_44_;
			 i_44_ = class525_sub38.readUnsignedByte(157635575)) {
		    int[] is = new int[class525_sub38.readUnsignedShort((byte) 93)];
		    for (int i_45_ = 0; i_45_ < is.length; i_45_++)
			is[i_45_] = class525_sub38.readInt(1032027406);
		    aClass620Array8159[i_44_] = new Class620(is);
		}
	    }
	}
    }
    
    public int method10301() {
	return aClass622Array8158.length;
    }
    
    public Class622 method10302(int i) {
	return aClass622Array8158[i];
    }
    
    static final void method10303(Class683 class683, int i) {
	int i_46_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class8 class8
	    = ((Class8)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_46_, 639899452));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class8.aBool90 ? 1 : 0;
    }
    
    static final void method10304(Class683 class683, int i) {
	int i_47_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (i_47_ < 0 || i_47_ > 1)
	    i_47_ = 0;
	Class345.method6051(i_47_ == 1, (byte) 8);
    }
    
    static final void method10305(Class683 class683, int i) {
	int i_48_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_48_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_48_ >> 16];
	Class503.method8308(class259, class245, class683, -154509791);
    }
    
    static final void method10306(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_49_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_50_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (Class562.aClass471_7557.method7736(i_49_, 1825661115)
	       .aCharArray11916[i_50_]);
    }
}
