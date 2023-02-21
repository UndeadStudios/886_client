/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class488
{
    Class372 aClass372_5251;
    Interface69 anInterface69_5252;
    Class482 aClass482_5253 = Class482.aClass482_5230;
    boolean aBool5254 = false;
    float aFloat5255;
    float aFloat5256;
    int anInt5257;
    Class446 aClass446_5258;
    boolean aBool5259;
    Object anObject5260;
    float aFloat5261;
    Interface57 anInterface57_5262;
    int anInt5263;
    float aFloat5264;
    List aList5265;
    boolean aBool5266;
    Object anObject5267;
    int anInt5268 = 0;
    int anInt5269;
    
    public void method7868(boolean bool, int i) {
	aBool5259 = bool;
	anInt5257 = 2138286051 * i;
    }
    
    void method7869(int i) {
	anInterface69_5252 = null;
	aClass482_5253 = Class482.aClass482_5230;
	aBool5254 = false;
	aList5265.clear();
	anObject5260 = null;
	aClass446_5258 = null;
	anInt5263 = -1281060957;
	aBool5259 = false;
	anInt5257 = 0;
	aFloat5261 = 0.0F;
	anInterface57_5262 = null;
	aFloat5255 = 0.0F;
	aFloat5264 = 0.0F;
	anInt5269 = 0;
	aBool5266 = false;
	anObject5267 = null;
	anInt5268 = 0;
	aFloat5256 = 1.0F;
    }
    
    public void method7870(Interface69 interface69, int i) {
	anInterface69_5252 = interface69;
	aFloat5261 = 0.0F;
	aClass482_5253 = Class482.aClass482_5228;
    }
    
    public void method7871(int i) {
	if (Class482.aClass482_5229 != aClass482_5253
	    && Class482.aClass482_5224 != aClass482_5253)
	    method7916(0, (byte) -54);
	Iterator iterator = aList5265.iterator();
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) 76) != this)
		iterator.remove();
	    else
		class494.method8010(-779007654);
	}
	method7869(-688903669);
	aClass482_5253 = Class482.aClass482_5232;
    }
    
    public void method7872(byte i) {
	if (!aBool5254
	    && (aClass482_5253 != Class482.aClass482_5231
		&& Class482.aClass482_5232 != aClass482_5253
		&& aClass482_5253 != Class482.aClass482_5230
		&& Class482.aClass482_5223 != aClass482_5253)
	    && ((aClass482_5253.anInt5233 * 2052841425
		 <= 2052841425 * Class482.aClass482_5228.anInt5233)
		|| (aClass482_5253.anInt5233 * 2052841425
		    >= 2052841425 * Class482.aClass482_5229.anInt5233)))
	    aClass482_5253 = Class482.aClass482_5225;
    }
    
    public Interface69 method7873() {
	return anInterface69_5252;
    }
    
    public void method7874(Object object) {
	anObject5260 = object;
    }
    
    public void method7875(Class446 class446, int i) {
	aClass446_5258 = class446;
    }
    
    public boolean method7876() {
	aBool5266 = false;
	return 1234498503 * anInt5269 != 0;
    }
    
    public void method7877(Interface57 interface57, byte i) {
	anInterface57_5262 = interface57;
    }
    
    public void method7878(byte i) {
	if (aClass482_5253 == Class482.aClass482_5225) {
	    Class595 class595 = anInterface69_5252.method471(1907987376);
	    if (class595 == Class595.aClass595_7838)
		aClass482_5253 = Class482.aClass482_5226;
	}
	if (aClass482_5253 == Class482.aClass482_5226 && true == aBool5254) {
	    Class494 class494
		= aClass372_5251.method6337(anInterface69_5252
						.method438((byte) -81),
					    -1589659313);
	    if (null != class494) {
		boolean bool = anInterface69_5252.method474((byte) -31);
		Class485 class485 = new Class485(this);
		boolean bool_0_
		    = (class494.method8013
		       ((bool ? null
			 : anInterface69_5252.method436(0, -1168021715)),
			bool ? class485 : null, anInt5263 * -979901451,
			-1602065433 * anInt5268 > 0 ? 0.0F : aFloat5261, false,
			aBool5259, 1478415819 * anInt5257, aFloat5256, this,
			(byte) -49));
		if (true == bool_0_) {
		    aClass482_5253 = Class482.aClass482_5227;
		    class494.method8016(anInterface57_5262, (short) -8314);
		    class494.method8021(aFloat5261, anInt5268 * -1602065433,
					1601571656);
		    class494.method8014(-1026656979);
		    aList5265.add(class494);
		    aBool5254 = false;
		} else {
		    if (class494.method8038((byte) 118)
			== Class491.aClass491_5290)
			aClass482_5253 = Class482.aClass482_5224;
		    class494.method8010(-10710911);
		}
	    }
	}
	Iterator iterator = aList5265.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -64) != this)
		iterator.remove();
	    else {
		if (Class482.aClass482_5223 == aClass482_5253) {
		    if (class494.method8012(-770127279) == 0.0F)
			class494.method8109((byte) -117);
		    else
			bool = false;
		}
		if (class494.method8022((byte) -11) == true
		    || class494.method8096(1496638892) == true) {
		    class494.method8010(301467763);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2052841425 * aClass482_5253.anInt5233
		>= Class482.aClass482_5227.anInt5233 * 2052841425)
	    && (aClass482_5253.anInt5233 * 2052841425
		< Class482.aClass482_5229.anInt5233 * 2052841425)) {
	    if (aClass482_5253 == Class482.aClass482_5223)
		aClass482_5253 = Class482.aClass482_5229;
	    else
		aClass482_5253 = Class482.aClass482_5224;
	}
    }
    
    public Class482 method7879(byte i) {
	return aClass482_5253;
    }
    
    public void method7880() {
	if (!aBool5254
	    && (aClass482_5253 != Class482.aClass482_5231
		&& Class482.aClass482_5232 != aClass482_5253
		&& aClass482_5253 != Class482.aClass482_5230
		&& Class482.aClass482_5223 != aClass482_5253)
	    && ((aClass482_5253.anInt5233 * 2052841425
		 <= 2052841425 * Class482.aClass482_5228.anInt5233)
		|| (aClass482_5253.anInt5233 * 2052841425
		    >= 2052841425 * Class482.aClass482_5229.anInt5233)))
	    aClass482_5253 = Class482.aClass482_5225;
    }
    
    public Object method7881(int i) {
	return anObject5260;
    }
    
    public void method7882(Object object, byte i) {
	anObject5267 = object;
    }
    
    public int method7883() {
	return anInt5263 * -979901451;
    }
    
    public int method7884(byte i) {
	return anInt5263 * -979901451;
    }
    
    public Class482 method7885() {
	return aClass482_5253;
    }
    
    public void method7886(int i) {
	if (aClass482_5253.anInt5233 * 2052841425
	    < Class482.aClass482_5229.anInt5233 * 2052841425) {
	    if (aClass482_5253.anInt5233 * 2052841425
		< Class482.aClass482_5227.anInt5233 * 2052841425) {
		aClass482_5253 = Class482.aClass482_5229;
		aBool5254 = false;
	    } else if (i <= 0) {
		Iterator iterator = aList5265.iterator();
		while (iterator.hasNext()) {
		    Class494 class494 = (Class494) iterator.next();
		    if (class494.method8050((byte) -82) != this)
			iterator.remove();
		    else
			class494.method8109((byte) -118);
		}
		aClass482_5253 = Class482.aClass482_5229;
		aBool5254 = false;
	    } else {
		aClass482_5253 = Class482.aClass482_5223;
		Iterator iterator = aList5265.iterator();
		while (iterator.hasNext()) {
		    Class494 class494 = (Class494) iterator.next();
		    if (class494.method8050((byte) -42) != this)
			iterator.remove();
		    else
			class494.method8021(0.0F, i, 1580862234);
		}
	    }
	}
    }
    
    public Class446 method7887() {
	return aClass446_5258;
    }
    
    public void method7888(float f, int i) {
	aFloat5255 = f;
    }
    
    public void method7889(Object object) {
	anObject5267 = object;
    }
    
    public void method7890(Object object) {
	anObject5267 = object;
    }
    
    public void method7891(byte i) {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5225;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -57) == this)
		class494.method8029((byte) -27);
	}
    }
    
    public void method7892() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5225;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) 30) == this)
		class494.method8029((byte) -25);
	}
    }
    
    public void method7893(float f, int i) {
	aFloat5264 = f;
    }
    
    public void method7894(int i, boolean bool, byte i_1_) {
	aBool5266 = bool;
	anInt5269 = i * -763699721;
    }
    
    public void method7895() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5225;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) 28) == this)
		class494.method8029((byte) -76);
	}
    }
    
    public void method7896(int i) {
	if (anInt5269 * 1234498503 > -1 && !aBool5266)
	    anInt5269 -= -763699721;
	if (anInt5269 * 1234498503 == 0)
	    method7928(-1511638572);
    }
    
    public Interface69 method7897(byte i) {
	return anInterface69_5252;
    }
    
    public void method7898(boolean bool, int i, int i_2_) {
	aBool5259 = bool;
	anInt5257 = 2138286051 * i;
    }
    
    public void method7899() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5229;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -80) == this)
		class494.method8081((byte) -120);
	}
    }
    
    public void method7900(Interface69 interface69) {
	anInterface69_5252 = interface69;
	aFloat5261 = 0.0F;
	aClass482_5253 = Class482.aClass482_5228;
    }
    
    public void method7901(Interface69 interface69) {
	anInterface69_5252 = interface69;
	aFloat5261 = 0.0F;
	aClass482_5253 = Class482.aClass482_5228;
    }
    
    public Class446 method7902() {
	return aClass446_5258;
    }
    
    public void method7903() {
	if (Class482.aClass482_5229 != aClass482_5253
	    && Class482.aClass482_5224 != aClass482_5253)
	    method7916(0, (byte) -23);
	Iterator iterator = aList5265.iterator();
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -19) != this)
		iterator.remove();
	    else
		class494.method8010(-1666297875);
	}
	method7869(-688903669);
	aClass482_5253 = Class482.aClass482_5232;
    }
    
    public void method7904() {
	if (Class482.aClass482_5229 != aClass482_5253
	    && Class482.aClass482_5224 != aClass482_5253)
	    method7916(0, (byte) -10);
	Iterator iterator = aList5265.iterator();
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -82) != this)
		iterator.remove();
	    else
		class494.method8010(-1144674772);
	}
	method7869(-688903669);
	aClass482_5253 = Class482.aClass482_5232;
    }
    
    public void method7905(Interface57 interface57) {
	anInterface57_5262 = interface57;
    }
    
    public void method7906() {
	if (Class482.aClass482_5231 != aClass482_5253
	    && Class482.aClass482_5232 != aClass482_5253
	    && Class482.aClass482_5230 != aClass482_5253
	    && Class482.aClass482_5223 != aClass482_5253) {
	    if ((Class482.aClass482_5225 == aClass482_5253
		 || Class482.aClass482_5226 == aClass482_5253)
		&& false == aBool5254)
		aBool5254 = true;
	    else if ((aClass482_5253.anInt5233 * 2052841425
		      < Class482.aClass482_5225.anInt5233 * 2052841425)
		     || (aClass482_5253.anInt5233 * 2052841425
			 >= Class482.aClass482_5229.anInt5233 * 2052841425)) {
		aClass482_5253 = Class482.aClass482_5225;
		aBool5254 = true;
	    }
	}
    }
    
    public Class488(Class372 class372) {
	aClass372_5251 = class372;
	aList5265 = new ArrayList();
    }
    
    public void method7907() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5229;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -4) == this)
		class494.method8081((byte) -42);
	}
    }
    
    public float method7908() {
	return aFloat5264;
    }
    
    public void method7909() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5229;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) 41) == this)
		class494.method8081((byte) -76);
	}
    }
    
    public Object method7910(int i) {
	return anObject5267;
    }
    
    public void method7911() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5225;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -15) == this)
		class494.method8029((byte) -118);
	}
    }
    
    public void method7912() {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5225;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) 51) == this)
		class494.method8029((byte) -11);
	}
    }
    
    public void method7913(Interface69 interface69) {
	anInterface69_5252 = interface69;
	aFloat5261 = 0.0F;
	aClass482_5253 = Class482.aClass482_5228;
    }
    
    public void method7914(Interface57 interface57) {
	anInterface57_5262 = interface57;
    }
    
    public void method7915(boolean bool, int i) {
	/* empty */
    }
    
    public void method7916(int i, byte i_3_) {
	if (aClass482_5253.anInt5233 * 2052841425
	    < Class482.aClass482_5229.anInt5233 * 2052841425) {
	    if (aClass482_5253.anInt5233 * 2052841425
		< Class482.aClass482_5227.anInt5233 * 2052841425) {
		aClass482_5253 = Class482.aClass482_5229;
		aBool5254 = false;
	    } else if (i <= 0) {
		Iterator iterator = aList5265.iterator();
		while (iterator.hasNext()) {
		    Class494 class494 = (Class494) iterator.next();
		    if (class494.method8050((byte) -19) != this)
			iterator.remove();
		    else
			class494.method8109((byte) -45);
		}
		aClass482_5253 = Class482.aClass482_5229;
		aBool5254 = false;
	    } else {
		aClass482_5253 = Class482.aClass482_5223;
		Iterator iterator = aList5265.iterator();
		while (iterator.hasNext()) {
		    Class494 class494 = (Class494) iterator.next();
		    if (class494.method8050((byte) -36) != this)
			iterator.remove();
		    else
			class494.method8021(0.0F, i, 1919735969);
		}
	    }
	}
    }
    
    public void method7917() {
	if (aClass482_5253 == Class482.aClass482_5225) {
	    Class595 class595 = anInterface69_5252.method471(-927487730);
	    if (class595 == Class595.aClass595_7838)
		aClass482_5253 = Class482.aClass482_5226;
	}
	if (aClass482_5253 == Class482.aClass482_5226 && true == aBool5254) {
	    Class494 class494
		= aClass372_5251.method6337(anInterface69_5252
						.method438((byte) -118),
					    -1903593816);
	    if (null != class494) {
		boolean bool = anInterface69_5252.method474((byte) 16);
		Class485 class485 = new Class485(this);
		boolean bool_4_
		    = (class494.method8013
		       ((bool ? null
			 : anInterface69_5252.method436(0, -1168021715)),
			bool ? class485 : null, anInt5263 * -979901451,
			-1602065433 * anInt5268 > 0 ? 0.0F : aFloat5261, false,
			aBool5259, 1478415819 * anInt5257, aFloat5256, this,
			(byte) -56));
		if (true == bool_4_) {
		    aClass482_5253 = Class482.aClass482_5227;
		    class494.method8016(anInterface57_5262, (short) -32331);
		    class494.method8021(aFloat5261, anInt5268 * -1602065433,
					2107016736);
		    class494.method8014(-219591978);
		    aList5265.add(class494);
		    aBool5254 = false;
		} else {
		    if (class494.method8038((byte) 101)
			== Class491.aClass491_5290)
			aClass482_5253 = Class482.aClass482_5224;
		    class494.method8010(-140306177);
		}
	    }
	}
	Iterator iterator = aList5265.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -25) != this)
		iterator.remove();
	    else {
		if (Class482.aClass482_5223 == aClass482_5253) {
		    if (class494.method8012(-2107134163) == 0.0F)
			class494.method8109((byte) -29);
		    else
			bool = false;
		}
		if (class494.method8022((byte) -12) == true
		    || class494.method8096(583235958) == true) {
		    class494.method8010(-936734845);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2052841425 * aClass482_5253.anInt5233
		>= Class482.aClass482_5227.anInt5233 * 2052841425)
	    && (aClass482_5253.anInt5233 * 2052841425
		< Class482.aClass482_5229.anInt5233 * 2052841425)) {
	    if (aClass482_5253 == Class482.aClass482_5223)
		aClass482_5253 = Class482.aClass482_5229;
	    else
		aClass482_5253 = Class482.aClass482_5224;
	}
    }
    
    public Class482 method7918() {
	return aClass482_5253;
    }
    
    public float method7919(byte i) {
	return aFloat5255;
    }
    
    public void method7920(Object object) {
	anObject5260 = object;
    }
    
    public void method7921() {
	if (aClass482_5253 == Class482.aClass482_5225) {
	    Class595 class595 = anInterface69_5252.method471(-944766441);
	    if (class595 == Class595.aClass595_7838)
		aClass482_5253 = Class482.aClass482_5226;
	}
	if (aClass482_5253 == Class482.aClass482_5226 && true == aBool5254) {
	    Class494 class494
		= aClass372_5251.method6337(anInterface69_5252
						.method438((byte) -68),
					    -1414474802);
	    if (null != class494) {
		boolean bool = anInterface69_5252.method474((byte) 15);
		Class485 class485 = new Class485(this);
		boolean bool_5_
		    = (class494.method8013
		       ((bool ? null
			 : anInterface69_5252.method436(0, -1168021715)),
			bool ? class485 : null, anInt5263 * -979901451,
			-1602065433 * anInt5268 > 0 ? 0.0F : aFloat5261, false,
			aBool5259, 1478415819 * anInt5257, aFloat5256, this,
			(byte) -30));
		if (true == bool_5_) {
		    aClass482_5253 = Class482.aClass482_5227;
		    class494.method8016(anInterface57_5262, (short) -29606);
		    class494.method8021(aFloat5261, anInt5268 * -1602065433,
					2126751134);
		    class494.method8014(-769360973);
		    aList5265.add(class494);
		    aBool5254 = false;
		} else {
		    if (class494.method8038((byte) 98)
			== Class491.aClass491_5290)
			aClass482_5253 = Class482.aClass482_5224;
		    class494.method8010(-1390149549);
		}
	    }
	}
	Iterator iterator = aList5265.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -15) != this)
		iterator.remove();
	    else {
		if (Class482.aClass482_5223 == aClass482_5253) {
		    if (class494.method8012(-1452371826) == 0.0F)
			class494.method8109((byte) -39);
		    else
			bool = false;
		}
		if (class494.method8022((byte) 1) == true
		    || class494.method8096(708273374) == true) {
		    class494.method8010(-1881004858);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (2052841425 * aClass482_5253.anInt5233
		>= Class482.aClass482_5227.anInt5233 * 2052841425)
	    && (aClass482_5253.anInt5233 * 2052841425
		< Class482.aClass482_5229.anInt5233 * 2052841425)) {
	    if (aClass482_5253 == Class482.aClass482_5223)
		aClass482_5253 = Class482.aClass482_5229;
	    else
		aClass482_5253 = Class482.aClass482_5224;
	}
    }
    
    public Object method7922() {
	return anObject5260;
    }
    
    public Object method7923() {
	return anObject5260;
    }
    
    public float method7924(int i) {
	return aFloat5264;
    }
    
    public float method7925() {
	return aFloat5255;
    }
    
    public void method7926(Object object) {
	anObject5267 = object;
    }
    
    public Object method7927() {
	return anObject5267;
    }
    
    public void method7928(int i) {
	if (Class482.aClass482_5231 != aClass482_5253
	    && Class482.aClass482_5232 != aClass482_5253
	    && Class482.aClass482_5230 != aClass482_5253
	    && Class482.aClass482_5223 != aClass482_5253) {
	    if ((Class482.aClass482_5225 == aClass482_5253
		 || Class482.aClass482_5226 == aClass482_5253)
		&& false == aBool5254)
		aBool5254 = true;
	    else if ((aClass482_5253.anInt5233 * 2052841425
		      < Class482.aClass482_5225.anInt5233 * 2052841425)
		     || (aClass482_5253.anInt5233 * 2052841425
			 >= Class482.aClass482_5229.anInt5233 * 2052841425)) {
		aClass482_5253 = Class482.aClass482_5225;
		aBool5254 = true;
	    }
	}
    }
    
    public void method7929(int i) {
	anInt5263 = 1281060957 * i;
    }
    
    public void method7930(boolean bool) {
	/* empty */
    }
    
    public Class446 method7931(int i) {
	return aClass446_5258;
    }
    
    public void method7932(Class446 class446) {
	aClass446_5258 = class446;
    }
    
    public void method7933(float f) {
	aFloat5255 = f;
    }
    
    public Class446 method7934() {
	return aClass446_5258;
    }
    
    public void method7935(int i) {
	Iterator iterator = aList5265.iterator();
	aClass482_5253 = Class482.aClass482_5229;
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -16) == this)
		class494.method8081((byte) -44);
	}
    }
    
    public void method7936() {
	if (anInt5269 * 1234498503 > -1 && !aBool5266)
	    anInt5269 -= -763699721;
	if (anInt5269 * 1234498503 == 0)
	    method7928(-1048079362);
    }
    
    public Class446 method7937() {
	return aClass446_5258;
    }
    
    public float method7938() {
	return aFloat5255;
    }
    
    public boolean method7939(int i) {
	aBool5266 = false;
	return 1234498503 * anInt5269 != 0;
    }
    
    public float method7940() {
	return aFloat5264;
    }
    
    public void method7941(float f, int i) {
	if (!(f < 0.0F))
	    aFloat5256 = f;
    }
    
    public float method7942() {
	return aFloat5264;
    }
    
    public void method7943(Object object, int i) {
	anObject5260 = object;
    }
    
    public float method7944() {
	return aFloat5264;
    }
    
    public void method7945(Class446 class446) {
	aClass446_5258 = class446;
    }
    
    public void method7946(float f) {
	aFloat5255 = f;
    }
    
    public void method7947(float f) {
	aFloat5255 = f;
    }
    
    public void method7948(float f) {
	aFloat5264 = f;
    }
    
    public void method7949(float f) {
	aFloat5264 = f;
    }
    
    public void method7950(float f) {
	aFloat5264 = f;
    }
    
    public void method7951(int i, boolean bool) {
	aBool5266 = bool;
	anInt5269 = i * -763699721;
    }
    
    public float method7952() {
	return aFloat5264;
    }
    
    public void method7953(int i, int i_6_) {
	anInt5263 = 1281060957 * i;
    }
    
    public void method7954() {
	if (anInt5269 * 1234498503 > -1 && !aBool5266)
	    anInt5269 -= -763699721;
	if (anInt5269 * 1234498503 == 0)
	    method7928(-1585490227);
    }
    
    public void method7955() {
	if (anInt5269 * 1234498503 > -1 && !aBool5266)
	    anInt5269 -= -763699721;
	if (anInt5269 * 1234498503 == 0)
	    method7928(-1898685942);
    }
    
    public void method7956(float f, int i) {
	aFloat5261 = f;
	int i_7_ = 0;
	Iterator iterator = aList5265.iterator();
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) -8) != this)
		aList5265.remove(class494);
	    else {
		class494.method8021(aFloat5261, i, 1696752490);
		i_7_++;
	    }
	}
	if (0 == i_7_)
	    anInt5268 = i * -1722189865;
    }
    
    public void method7957(float f, int i, byte i_8_) {
	aFloat5261 = f;
	int i_9_ = 0;
	Iterator iterator = aList5265.iterator();
	while (iterator.hasNext()) {
	    Class494 class494 = (Class494) iterator.next();
	    if (class494.method8050((byte) 11) != this)
		aList5265.remove(class494);
	    else {
		class494.method8021(aFloat5261, i, 1981202191);
		i_9_++;
	    }
	}
	if (0 == i_9_)
	    anInt5268 = i * -1722189865;
    }
    
    public void method7958(boolean bool, int i) {
	aBool5259 = bool;
	anInt5257 = 2138286051 * i;
    }
    
    static final void method7959(Class683 class683, int i) {
	int i_10_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (null != Class556_Sub1.aClass10_10640) {
	    Class525 class525
		= Class556_Sub1.aClass10_10640.method684((long) i_10_);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= null != class525 ? 1 : 0;
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
}
