/* Class463_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.Iterator;

public class Class463_Sub1 extends Class463
{
    Class559 aClass559_10321;
    
    void method7631(int i, int i_0_) {
	try {
	    aClass559_10321.method9381(1587575841);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass559_10321 = null;
	anInt5114 += 720316881;
	anInt5112 = 1092321667;
	aByte5110 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt5111 = 1064910113 * i;
	anInt5101 = -371593359 * i_0_;
    }
    
    public void method7639(boolean bool) {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(bool ? 2 : 3, -570116563);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1453394403);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1959745354);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public boolean method7632(int i) {
	if (null != aClass559_10321) {
	    long l = Class251.method4508((byte) 8);
	    int i_1_ = (int) (l - aLong5108 * 2738435472528092521L);
	    aLong5108 = l * -7583178366702996775L;
	    if (i_1_ > 200)
		i_1_ = 200;
	    anInt5107 += i_1_ * 984869273;
	    if (anInt5107 * -422356311 > 30000) {
		try {
		    aClass559_10321.method9381(1302344288);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
	    }
	}
	if (aClass559_10321 == null) {
	    if (method7615((byte) -122) == 0 && method7636(-2113255781) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5097.method14186((byte) -60));
		 null != class525_sub16_sub12_sub1;
		 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5097.method14201((byte) -1))) {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(1, -1848909448);
		aClass525_Sub38_5109.method16761(7105793357836614431L
						 * (class525_sub16_sub12_sub1
						    .aLong10553));
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1973766489);
		aClass697_5104.method14184(class525_sub16_sub12_sub1,
					   728171782);
	    }
	    for (Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5105.method14186((byte) -15));
		 null != class525_sub16_sub12_sub1;
		 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5105.method14201((byte) -1))) {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(0, -283040812);
		aClass525_Sub38_5109.method16761((class525_sub16_sub12_sub1
						  .aLong10553)
						 * 7105793357836614431L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1711037380);
		aClass697_5106.method14184(class525_sub16_sub12_sub1,
					   728171782);
	    }
	    for (int i_2_ = 0; i_2_ < 100; i_2_++) {
		int i_3_ = aClass559_10321.method9393(2035110381);
		if (i_3_ < 0)
		    throw new IOException();
		if (0 == i_3_)
		    break;
		anInt5107 = 0;
		if (aClass525_Sub16_Sub12_Sub1_5118 == null) {
		    int i_4_
			= 5 - -1133521593 * aClass525_Sub38_5115.pos;
		    if (i_4_ > i_3_)
			i_4_ = i_3_;
		    aClass559_10321.method9379
			(aClass525_Sub38_5115.buffer,
			 -1133521593 * aClass525_Sub38_5115.pos, i_4_,
			 (byte) -59);
		    if (aByte5110 != 0) {
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
			    aClass525_Sub38_5115.buffer
				[i_5_ + (-1133521593
					 * aClass525_Sub38_5115.pos)]
				^= aByte5110;
		    }
		    aClass525_Sub38_5115.pos += 339428471 * i_4_;
		    if (aClass525_Sub38_5115.pos * -1133521593 >= 5) {
			aClass525_Sub38_5115.pos = 0;
			int i_6_
			    = aClass525_Sub38_5115.readUnsignedByte(1656737350);
			int i_7_
			    = aClass525_Sub38_5115.readInt(1035706165);
			boolean bool_8_ = 0 != (i_7_ & ~0x7fffffff);
			int i_9_ = i_7_ & 0x7fffffff;
			long l = (long) i_9_ + ((long) i_6_ << 32);
			if (bool_8_) {
			    Iterator iterator = aClass697_5106.iterator();
			    while (iterator.hasNext()) {
				Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
				    = ((Class525_Sub16_Sub12_Sub1)
				       iterator.next());
				if (l == (7105793357836614431L
					  * (class525_sub16_sub12_sub1
					     .aLong10553))) {
				    aClass525_Sub16_Sub12_Sub1_5118
					= class525_sub16_sub12_sub1;
				    break;
				}
			    }
			} else {
			    Iterator iterator = aClass697_5104.iterator();
			    while (iterator.hasNext()) {
				Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
				    = ((Class525_Sub16_Sub12_Sub1)
				       iterator.next());
				if (l == (class525_sub16_sub12_sub1.aLong10553
					  * 7105793357836614431L)) {
				    aClass525_Sub16_Sub12_Sub1_5118
					= class525_sub16_sub12_sub1;
				    break;
				}
			    }
			}
			if (aClass525_Sub16_Sub12_Sub1_5118 == null)
			    throw new IOException();
			anInt5117 = 1594059483;
			aClass525_Sub38_5115.pos = 0;
			aClass525_Sub38_5113.pos = 0;
		    }
		} else {
		    RSBuffer class525_sub38
			= (aClass525_Sub16_Sub12_Sub1_5118
			   .aClass525_Sub38_12193);
		    if (null == class525_sub38) {
			int i_10_ = 5 - (aClass525_Sub38_5113.pos
					 * -1133521593);
			if (i_10_ > i_3_)
			    i_10_ = i_3_;
			aClass559_10321.method9379
			    (aClass525_Sub38_5113.buffer,
			     -1133521593 * aClass525_Sub38_5113.pos,
			     i_10_, (byte) -90);
			if (0 != aByte5110) {
			    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				aClass525_Sub38_5113.buffer
				    [i_11_ + (aClass525_Sub38_5113.pos
					      * -1133521593)]
				    ^= aByte5110;
			}
			aClass525_Sub38_5113.pos += i_10_ * 339428471;
			if (-1133521593 * aClass525_Sub38_5113.pos
			    >= 5) {
			    aClass525_Sub38_5113.pos = 0;
			    int i_12_
				= aClass525_Sub38_5113.readUnsignedByte(966229631);
			    int i_13_
				= aClass525_Sub38_5113.readInt(1611205622);
			    int i_14_ = 5;
			    if (i_12_ != Class472.aClass472_5152.method80())
				i_14_ = 9;
			    class525_sub38
				= aClass525_Sub16_Sub12_Sub1_5118
				      .aClass525_Sub38_12193
				= (new RSBuffer
				   (aClass525_Sub16_Sub12_Sub1_5118.aByte12192
				    + (i_14_ + i_13_)));
			    class525_sub38.method16735(i_12_, -320356711);
			    class525_sub38.method16605(i_13_, -1328143363);
			    anInt5117 += 1594059483;
			}
		    } else {
			int i_15_
			    = (class525_sub38.buffer.length
			       - aClass525_Sub16_Sub12_Sub1_5118.aByte12192);
			int i_16_ = 102400 - anInt5117 * 1987479199;
			if (i_16_
			    > i_15_ - -1133521593 * class525_sub38.pos)
			    i_16_ = i_15_ - (-1133521593
					     * class525_sub38.pos);
			if (i_16_ > i_3_)
			    i_16_ = i_3_;
			aClass559_10321.method9379
			    (class525_sub38.buffer,
			     -1133521593 * class525_sub38.pos, i_16_,
			     (byte) -8);
			if (0 != aByte5110) {
			    for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
				class525_sub38.buffer
				    [(class525_sub38.pos * -1133521593
				      + i_17_)]
				    ^= aByte5110;
			}
			class525_sub38.pos += i_16_ * 339428471;
			anInt5117 += 2036798815 * i_16_;
			if (class525_sub38.pos * -1133521593 == i_15_) {
			    aClass525_Sub16_Sub12_Sub1_5118
				.method16266(-1925745724);
			    aClass525_Sub16_Sub12_Sub1_5118.aBool11832 = false;
			    aClass525_Sub16_Sub12_Sub1_5118 = null;
			} else if (1987479199 * anInt5117 == 102400) {
			    anInt5117 = 0;
			    aClass525_Sub16_Sub12_Sub1_5118 = null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass559_10321.method9381(843200736);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	    anInt5114 += 720316881;
	    anInt5112 = -2110323962;
	    if (method7615((byte) -122) == 0 && method7636(-2029793548) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    public void method7618(Object object, boolean bool, int i) {
	if (aClass559_10321 != null) {
	    try {
		aClass559_10321.method9381(889322796);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	}
	aClass559_10321 = (Class559) object;
	method15945((byte) 35);
	method7619(bool, -312799294);
	aClass525_Sub38_5115.pos = 0;
	aClass525_Sub38_5113.pos = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5104.method14196(-1706944539));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5106.method14196(222278573));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	if (aByte5110 != 0) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(4, -1378635192);
		aClass525_Sub38_5109.method16735(aByte5110, -1868572597);
		aClass525_Sub38_5109.method16605(0, -2047726793);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1386562246);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(938007531);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
	anInt5107 = 0;
	aLong5108 = Class251.method4508((byte) 8) * -7583178366702996775L;
    }
    
    void method15945(byte i) {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(6, -828914873);
		aClass525_Sub38_5109.method16604(4, (byte) 1);
		aClass525_Sub38_5109.method16602(0, 1510401010);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1897276260);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(865847950);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7619(boolean bool, int i) {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(bool ? 2 : 3, -977330312);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 2135769024);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1154043058);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    void method15946() {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(6, -612042639);
		aClass525_Sub38_5109.method16604(4, (byte) 1);
		aClass525_Sub38_5109.method16602(0, 1883379147);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1757142437);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(2041285670);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7622(int i) {
	if (null != aClass559_10321)
	    aClass559_10321.method9378((byte) 2);
    }
    
    public void method7629(Object object, boolean bool) {
	if (aClass559_10321 != null) {
	    try {
		aClass559_10321.method9381(1325803188);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	}
	aClass559_10321 = (Class559) object;
	method15945((byte) 26);
	method7619(bool, -312799294);
	aClass525_Sub38_5115.pos = 0;
	aClass525_Sub38_5113.pos = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5104.method14196(1722938977));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5106.method14196(1061007294));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	if (aByte5110 != 0) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(4, -1716410403);
		aClass525_Sub38_5109.method16735(aByte5110, -1434829179);
		aClass525_Sub38_5109.method16605(0, -1911634203);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1967064835);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1761949966);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
	anInt5107 = 0;
	aLong5108 = Class251.method4508((byte) 8) * -7583178366702996775L;
    }
    
    public void method7628(boolean bool) {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(bool ? 2 : 3, -1143164759);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1580921241);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(2108048507);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7620(byte i) {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(7, -189992757);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1761242759);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(2137618603);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    void method7642(int i, int i_18_) {
	try {
	    aClass559_10321.method9381(1475124568);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass559_10321 = null;
	anInt5114 += 720316881;
	anInt5112 = 1092321667;
	aByte5110 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt5111 = 1064910113 * i;
	anInt5101 = -371593359 * i_18_;
    }
    
    public boolean method7633() {
	if (null != aClass559_10321) {
	    long l = Class251.method4508((byte) 8);
	    int i = (int) (l - aLong5108 * 2738435472528092521L);
	    aLong5108 = l * -7583178366702996775L;
	    if (i > 200)
		i = 200;
	    anInt5107 += i * 984869273;
	    if (anInt5107 * -422356311 > 30000) {
		try {
		    aClass559_10321.method9381(1693199493);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
	    }
	}
	if (aClass559_10321 == null) {
	    if (method7615((byte) -122) == 0 && method7636(-1839289529) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5097.method14186((byte) -37));
		 null != class525_sub16_sub12_sub1;
		 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5097.method14201((byte) -1))) {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(1, -1011208708);
		aClass525_Sub38_5109.method16761(7105793357836614431L
						 * (class525_sub16_sub12_sub1
						    .aLong10553));
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 987351013);
		aClass697_5104.method14184(class525_sub16_sub12_sub1,
					   728171782);
	    }
	    for (Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5105.method14186((byte) -24));
		 null != class525_sub16_sub12_sub1;
		 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5105.method14201((byte) -1))) {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(0, -1088798828);
		aClass525_Sub38_5109.method16761((class525_sub16_sub12_sub1
						  .aLong10553)
						 * 7105793357836614431L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1743458373);
		aClass697_5106.method14184(class525_sub16_sub12_sub1,
					   728171782);
	    }
	    for (int i = 0; i < 100; i++) {
		int i_19_ = aClass559_10321.method9393(2035110381);
		if (i_19_ < 0)
		    throw new IOException();
		if (0 == i_19_)
		    break;
		anInt5107 = 0;
		if (aClass525_Sub16_Sub12_Sub1_5118 == null) {
		    int i_20_
			= 5 - -1133521593 * aClass525_Sub38_5115.pos;
		    if (i_20_ > i_19_)
			i_20_ = i_19_;
		    aClass559_10321.method9379
			(aClass525_Sub38_5115.buffer,
			 -1133521593 * aClass525_Sub38_5115.pos, i_20_,
			 (byte) -74);
		    if (aByte5110 != 0) {
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
			    aClass525_Sub38_5115.buffer
				[i_21_ + (-1133521593
					  * aClass525_Sub38_5115.pos)]
				^= aByte5110;
		    }
		    aClass525_Sub38_5115.pos += 339428471 * i_20_;
		    if (aClass525_Sub38_5115.pos * -1133521593 >= 5) {
			aClass525_Sub38_5115.pos = 0;
			int i_22_
			    = aClass525_Sub38_5115.readUnsignedByte(826577422);
			int i_23_
			    = aClass525_Sub38_5115.readInt(1586985588);
			boolean bool_24_ = 0 != (i_23_ & ~0x7fffffff);
			int i_25_ = i_23_ & 0x7fffffff;
			long l = (long) i_25_ + ((long) i_22_ << 32);
			if (bool_24_) {
			    Iterator iterator = aClass697_5106.iterator();
			    while (iterator.hasNext()) {
				Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
				    = ((Class525_Sub16_Sub12_Sub1)
				       iterator.next());
				if (l == (7105793357836614431L
					  * (class525_sub16_sub12_sub1
					     .aLong10553))) {
				    aClass525_Sub16_Sub12_Sub1_5118
					= class525_sub16_sub12_sub1;
				    break;
				}
			    }
			} else {
			    Iterator iterator = aClass697_5104.iterator();
			    while (iterator.hasNext()) {
				Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
				    = ((Class525_Sub16_Sub12_Sub1)
				       iterator.next());
				if (l == (class525_sub16_sub12_sub1.aLong10553
					  * 7105793357836614431L)) {
				    aClass525_Sub16_Sub12_Sub1_5118
					= class525_sub16_sub12_sub1;
				    break;
				}
			    }
			}
			if (aClass525_Sub16_Sub12_Sub1_5118 == null)
			    throw new IOException();
			anInt5117 = 1594059483;
			aClass525_Sub38_5115.pos = 0;
			aClass525_Sub38_5113.pos = 0;
		    }
		} else {
		    RSBuffer class525_sub38
			= (aClass525_Sub16_Sub12_Sub1_5118
			   .aClass525_Sub38_12193);
		    if (null == class525_sub38) {
			int i_26_ = 5 - (aClass525_Sub38_5113.pos
					 * -1133521593);
			if (i_26_ > i_19_)
			    i_26_ = i_19_;
			aClass559_10321.method9379
			    (aClass525_Sub38_5113.buffer,
			     -1133521593 * aClass525_Sub38_5113.pos,
			     i_26_, (byte) -102);
			if (0 != aByte5110) {
			    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
				aClass525_Sub38_5113.buffer
				    [i_27_ + (aClass525_Sub38_5113.pos
					      * -1133521593)]
				    ^= aByte5110;
			}
			aClass525_Sub38_5113.pos += i_26_ * 339428471;
			if (-1133521593 * aClass525_Sub38_5113.pos
			    >= 5) {
			    aClass525_Sub38_5113.pos = 0;
			    int i_28_
				= aClass525_Sub38_5113.readUnsignedByte(-10454235);
			    int i_29_
				= aClass525_Sub38_5113.readInt(1786203794);
			    int i_30_ = 5;
			    if (i_28_ != Class472.aClass472_5152.method80())
				i_30_ = 9;
			    class525_sub38
				= aClass525_Sub16_Sub12_Sub1_5118
				      .aClass525_Sub38_12193
				= (new RSBuffer
				   (aClass525_Sub16_Sub12_Sub1_5118.aByte12192
				    + (i_30_ + i_29_)));
			    class525_sub38.method16735(i_28_, -356845136);
			    class525_sub38.method16605(i_29_, -751735169);
			    anInt5117 += 1594059483;
			}
		    } else {
			int i_31_
			    = (class525_sub38.buffer.length
			       - aClass525_Sub16_Sub12_Sub1_5118.aByte12192);
			int i_32_ = 102400 - anInt5117 * 1987479199;
			if (i_32_
			    > i_31_ - -1133521593 * class525_sub38.pos)
			    i_32_ = i_31_ - (-1133521593
					     * class525_sub38.pos);
			if (i_32_ > i_19_)
			    i_32_ = i_19_;
			aClass559_10321.method9379
			    (class525_sub38.buffer,
			     -1133521593 * class525_sub38.pos, i_32_,
			     (byte) -74);
			if (0 != aByte5110) {
			    for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				class525_sub38.buffer
				    [(class525_sub38.pos * -1133521593
				      + i_33_)]
				    ^= aByte5110;
			}
			class525_sub38.pos += i_32_ * 339428471;
			anInt5117 += 2036798815 * i_32_;
			if (class525_sub38.pos * -1133521593 == i_31_) {
			    aClass525_Sub16_Sub12_Sub1_5118
				.method16266(-1925745724);
			    aClass525_Sub16_Sub12_Sub1_5118.aBool11832 = false;
			    aClass525_Sub16_Sub12_Sub1_5118 = null;
			} else if (1987479199 * anInt5117 == 102400) {
			    anInt5117 = 0;
			    aClass525_Sub16_Sub12_Sub1_5118 = null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass559_10321.method9381(986520145);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	    anInt5114 += 720316881;
	    anInt5112 = -2110323962;
	    if (method7615((byte) -122) == 0 && method7636(-2129915545) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    public boolean method7626() {
	if (null != aClass559_10321) {
	    long l = Class251.method4508((byte) 8);
	    int i = (int) (l - aLong5108 * 2738435472528092521L);
	    aLong5108 = l * -7583178366702996775L;
	    if (i > 200)
		i = 200;
	    anInt5107 += i * 984869273;
	    if (anInt5107 * -422356311 > 30000) {
		try {
		    aClass559_10321.method9381(1875626068);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
	    }
	}
	if (aClass559_10321 == null) {
	    if (method7615((byte) -122) == 0 && method7636(-2096236677) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5097.method14186((byte) -105));
		 null != class525_sub16_sub12_sub1;
		 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5097.method14201((byte) -1))) {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(1, -2113131050);
		aClass525_Sub38_5109.method16761(7105793357836614431L
						 * (class525_sub16_sub12_sub1
						    .aLong10553));
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1560602314);
		aClass697_5104.method14184(class525_sub16_sub12_sub1,
					   728171782);
	    }
	    for (Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5105.method14186((byte) -107));
		 null != class525_sub16_sub12_sub1;
		 class525_sub16_sub12_sub1
		     = ((Class525_Sub16_Sub12_Sub1)
			aClass697_5105.method14201((byte) -1))) {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(0, -929167487);
		aClass525_Sub38_5109.method16761((class525_sub16_sub12_sub1
						  .aLong10553)
						 * 7105793357836614431L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1708710493);
		aClass697_5106.method14184(class525_sub16_sub12_sub1,
					   728171782);
	    }
	    for (int i = 0; i < 100; i++) {
		int i_34_ = aClass559_10321.method9393(2035110381);
		if (i_34_ < 0)
		    throw new IOException();
		if (0 == i_34_)
		    break;
		anInt5107 = 0;
		if (aClass525_Sub16_Sub12_Sub1_5118 == null) {
		    int i_35_
			= 5 - -1133521593 * aClass525_Sub38_5115.pos;
		    if (i_35_ > i_34_)
			i_35_ = i_34_;
		    aClass559_10321.method9379
			(aClass525_Sub38_5115.buffer,
			 -1133521593 * aClass525_Sub38_5115.pos, i_35_,
			 (byte) -126);
		    if (aByte5110 != 0) {
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
			    aClass525_Sub38_5115.buffer
				[i_36_ + (-1133521593
					  * aClass525_Sub38_5115.pos)]
				^= aByte5110;
		    }
		    aClass525_Sub38_5115.pos += 339428471 * i_35_;
		    if (aClass525_Sub38_5115.pos * -1133521593 >= 5) {
			aClass525_Sub38_5115.pos = 0;
			int i_37_
			    = aClass525_Sub38_5115.readUnsignedByte(231892486);
			int i_38_
			    = aClass525_Sub38_5115.readInt(2096430921);
			boolean bool_39_ = 0 != (i_38_ & ~0x7fffffff);
			int i_40_ = i_38_ & 0x7fffffff;
			long l = (long) i_40_ + ((long) i_37_ << 32);
			if (bool_39_) {
			    Iterator iterator = aClass697_5106.iterator();
			    while (iterator.hasNext()) {
				Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
				    = ((Class525_Sub16_Sub12_Sub1)
				       iterator.next());
				if (l == (7105793357836614431L
					  * (class525_sub16_sub12_sub1
					     .aLong10553))) {
				    aClass525_Sub16_Sub12_Sub1_5118
					= class525_sub16_sub12_sub1;
				    break;
				}
			    }
			} else {
			    Iterator iterator = aClass697_5104.iterator();
			    while (iterator.hasNext()) {
				Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
				    = ((Class525_Sub16_Sub12_Sub1)
				       iterator.next());
				if (l == (class525_sub16_sub12_sub1.aLong10553
					  * 7105793357836614431L)) {
				    aClass525_Sub16_Sub12_Sub1_5118
					= class525_sub16_sub12_sub1;
				    break;
				}
			    }
			}
			if (aClass525_Sub16_Sub12_Sub1_5118 == null)
			    throw new IOException();
			anInt5117 = 1594059483;
			aClass525_Sub38_5115.pos = 0;
			aClass525_Sub38_5113.pos = 0;
		    }
		} else {
		    RSBuffer class525_sub38
			= (aClass525_Sub16_Sub12_Sub1_5118
			   .aClass525_Sub38_12193);
		    if (null == class525_sub38) {
			int i_41_ = 5 - (aClass525_Sub38_5113.pos
					 * -1133521593);
			if (i_41_ > i_34_)
			    i_41_ = i_34_;
			aClass559_10321.method9379
			    (aClass525_Sub38_5113.buffer,
			     -1133521593 * aClass525_Sub38_5113.pos,
			     i_41_, (byte) -37);
			if (0 != aByte5110) {
			    for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
				aClass525_Sub38_5113.buffer
				    [i_42_ + (aClass525_Sub38_5113.pos
					      * -1133521593)]
				    ^= aByte5110;
			}
			aClass525_Sub38_5113.pos += i_41_ * 339428471;
			if (-1133521593 * aClass525_Sub38_5113.pos
			    >= 5) {
			    aClass525_Sub38_5113.pos = 0;
			    int i_43_
				= aClass525_Sub38_5113.readUnsignedByte(1533797228);
			    int i_44_
				= aClass525_Sub38_5113.readInt(1456832399);
			    int i_45_ = 5;
			    if (i_43_ != Class472.aClass472_5152.method80())
				i_45_ = 9;
			    class525_sub38
				= aClass525_Sub16_Sub12_Sub1_5118
				      .aClass525_Sub38_12193
				= (new RSBuffer
				   (aClass525_Sub16_Sub12_Sub1_5118.aByte12192
				    + (i_45_ + i_44_)));
			    class525_sub38.method16735(i_43_, -970144168);
			    class525_sub38.method16605(i_44_, -376949085);
			    anInt5117 += 1594059483;
			}
		    } else {
			int i_46_
			    = (class525_sub38.buffer.length
			       - aClass525_Sub16_Sub12_Sub1_5118.aByte12192);
			int i_47_ = 102400 - anInt5117 * 1987479199;
			if (i_47_
			    > i_46_ - -1133521593 * class525_sub38.pos)
			    i_47_ = i_46_ - (-1133521593
					     * class525_sub38.pos);
			if (i_47_ > i_34_)
			    i_47_ = i_34_;
			aClass559_10321.method9379
			    (class525_sub38.buffer,
			     -1133521593 * class525_sub38.pos, i_47_,
			     (byte) -77);
			if (0 != aByte5110) {
			    for (int i_48_ = 0; i_48_ < i_47_; i_48_++)
				class525_sub38.buffer
				    [(class525_sub38.pos * -1133521593
				      + i_48_)]
				    ^= aByte5110;
			}
			class525_sub38.pos += i_47_ * 339428471;
			anInt5117 += 2036798815 * i_47_;
			if (class525_sub38.pos * -1133521593 == i_46_) {
			    aClass525_Sub16_Sub12_Sub1_5118
				.method16266(-1925745724);
			    aClass525_Sub16_Sub12_Sub1_5118.aBool11832 = false;
			    aClass525_Sub16_Sub12_Sub1_5118 = null;
			} else if (1987479199 * anInt5117 == 102400) {
			    anInt5117 = 0;
			    aClass525_Sub16_Sub12_Sub1_5118 = null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass559_10321.method9381(1464617338);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	    anInt5114 += 720316881;
	    anInt5112 = -2110323962;
	    if (method7615((byte) -122) == 0 && method7636(-1910785104) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    public void method7635(Object object, boolean bool) {
	if (aClass559_10321 != null) {
	    try {
		aClass559_10321.method9381(1230439860);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	}
	aClass559_10321 = (Class559) object;
	method15945((byte) 53);
	method7619(bool, -312799294);
	aClass525_Sub38_5115.pos = 0;
	aClass525_Sub38_5113.pos = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5104.method14196(1110797792));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5106.method14196(235757401));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	if (aByte5110 != 0) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(4, -2108611964);
		aClass525_Sub38_5109.method16735(aByte5110, -766603919);
		aClass525_Sub38_5109.method16605(0, -895124404);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 2027382421);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(727009802);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
	anInt5107 = 0;
	aLong5108 = Class251.method4508((byte) 8) * -7583178366702996775L;
    }
    
    public void method7614(byte i) {
	if (null != aClass559_10321)
	    aClass559_10321.method9381(1211016874);
    }
    
    void method7638(int i, int i_49_) {
	try {
	    aClass559_10321.method9381(833511612);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass559_10321 = null;
	anInt5114 += 720316881;
	anInt5112 = 1092321667;
	aByte5110 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt5111 = 1064910113 * i;
	anInt5101 = -371593359 * i_49_;
    }
    
    public void method7637(Object object, boolean bool) {
	if (aClass559_10321 != null) {
	    try {
		aClass559_10321.method9381(733651349);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	}
	aClass559_10321 = (Class559) object;
	method15945((byte) 51);
	method7619(bool, -312799294);
	aClass525_Sub38_5115.pos = 0;
	aClass525_Sub38_5113.pos = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5104.method14196(-387633822));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5106.method14196(1536492704));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	if (aByte5110 != 0) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(4, -1416161703);
		aClass525_Sub38_5109.method16735(aByte5110, -895451926);
		aClass525_Sub38_5109.method16605(0, -11534183);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1224938046);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1210519663);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
	anInt5107 = 0;
	aLong5108 = Class251.method4508((byte) 8) * -7583178366702996775L;
    }
    
    public void method7634(Object object, boolean bool) {
	if (aClass559_10321 != null) {
	    try {
		aClass559_10321.method9381(1803232542);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	}
	aClass559_10321 = (Class559) object;
	method15945((byte) 126);
	method7619(bool, -312799294);
	aClass525_Sub38_5115.pos = 0;
	aClass525_Sub38_5113.pos = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5104.method14196(1605727787));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5106.method14196(1049613043));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	if (aByte5110 != 0) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(4, -1198501574);
		aClass525_Sub38_5109.method16735(aByte5110, -1224477865);
		aClass525_Sub38_5109.method16605(0, -1334888803);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1321486394);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1806401127);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
	anInt5107 = 0;
	aLong5108 = Class251.method4508((byte) 8) * -7583178366702996775L;
    }
    
    public void method7616(Object object, boolean bool) {
	if (aClass559_10321 != null) {
	    try {
		aClass559_10321.method9381(1419572257);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass559_10321 = null;
	}
	aClass559_10321 = (Class559) object;
	method15945((byte) 88);
	method7619(bool, -312799294);
	aClass525_Sub38_5115.pos = 0;
	aClass525_Sub38_5113.pos = 0;
	aClass525_Sub16_Sub12_Sub1_5118 = null;
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5104.method14196(-2110122165));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5097.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	for (;;) {
	    Class525_Sub16_Sub12_Sub1 class525_sub16_sub12_sub1
		= ((Class525_Sub16_Sub12_Sub1)
		   aClass697_5106.method14196(1646003617));
	    if (class525_sub16_sub12_sub1 == null)
		break;
	    class525_sub16_sub12_sub1.aClass525_Sub38_12193 = null;
	    aClass697_5105.method14184(class525_sub16_sub12_sub1, 728171782);
	}
	if (aByte5110 != 0) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(4, -1907350011);
		aClass525_Sub38_5109.method16735(aByte5110, -1075952822);
		aClass525_Sub38_5109.method16605(0, -875789096);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 995409891);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1544608414);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
	anInt5107 = 0;
	aLong5108 = Class251.method4508((byte) 8) * -7583178366702996775L;
    }
    
    public void method7641() {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(7, -855360991);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1284817368);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1597026136);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    void method7630(int i, int i_50_, int i_51_) {
	try {
	    aClass559_10321.method9381(2026964574);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass559_10321 = null;
	anInt5114 += 720316881;
	anInt5112 = 1092321667;
	aByte5110 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt5111 = 1064910113 * i;
	anInt5101 = -371593359 * i_50_;
    }
    
    public void method7617() {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(7, -1235096810);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1997485551);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(2027959390);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7643() {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(7, -719035606);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1559855540);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1092846286);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7644() {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(7, -961980249);
		aClass525_Sub38_5109.method16761(0L);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1173869586);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1896058720);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7645() {
	if (null != aClass559_10321)
	    aClass559_10321.method9378((byte) 14);
    }
    
    void method7640(int i, int i_52_) {
	try {
	    aClass559_10321.method9381(2038521103);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass559_10321 = null;
	anInt5114 += 720316881;
	anInt5112 = 1092321667;
	aByte5110 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt5111 = 1064910113 * i;
	anInt5101 = -371593359 * i_52_;
    }
    
    void method15947() {
	if (null != aClass559_10321) {
	    try {
		aClass525_Sub38_5109.pos = 0;
		aClass525_Sub38_5109.method16735(6, -218181081);
		aClass525_Sub38_5109.method16604(4, (byte) 1);
		aClass525_Sub38_5109.method16602(0, 2022512787);
		aClass559_10321.method9380
		    (aClass525_Sub38_5109.buffer, 0,
		     aClass525_Sub38_5109.buffer.length, 1643973285);
	    } catch (IOException ioexception) {
		try {
		    aClass559_10321.method9381(1980625882);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass559_10321 = null;
		anInt5114 += 720316881;
		anInt5112 = -2110323962;
	    }
	}
    }
    
    public void method7646() {
	if (null != aClass559_10321)
	    aClass559_10321.method9381(1677850619);
    }
    
    public static int method15948(byte i) {
	if (!Class116.method2057(90264403))
	    return 0;
	return -1875742129 * Class589.anInt7783;
    }
    
    static final void method15949(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class599.method9864(class259, class245, class683, 577549273);
    }
}
