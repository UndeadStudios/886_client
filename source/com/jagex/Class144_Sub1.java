/* Class144_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class Class144_Sub1 extends Class144
{
    Class450[] aClass450Array9131;
    public boolean aBool9132 = false;
    public long aLong9133 = -8219613812274829465L;
    boolean aBool9134 = false;
    Class447[] aClass447Array9135;
    Set aSet9136;
    long aLong9137 = -2057664652524391377L;
    int anInt9138 = 0;
    static final int anInt9139 = 1;
    public static Map aMap9140;
    public static int anInt9141;
    
    public void method14623() {
	anInt9138 = 0;
    }
    
    public void method88(Class163 class163, int i, int i_0_) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if ((Class450.aClass450_4924
		  == aClass450Array9131[class163.anInt1766 * 248546353])
		 && method104(class163, 623775022) != i) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method88(class163, i, 1097262447);
    }
    
    public void method100(Class163 class163, long l) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[248546353 * class163.anInt1766])
	    aBool9132 = true;
	else if ((aClass450Array9131[class163.anInt1766 * 248546353]
		  == Class450.aClass450_4924)
		 && method101(class163, -345524464) != l) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method100(class163, l);
    }
    
    public void method92(Class163 class163, Object object, byte i) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if (aClass450Array9131[class163.anInt1766 * 248546353]
		 == Class450.aClass450_4924) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_1_ = method91(class163, -683053903);
	    if (null != object && null != object_1_
		&& !object.equals(object_1_)) {
		aBool9134 = true;
		aSet9136.add(Integer.valueOf(class163.anInt1766 * 248546353));
	    } else if ((null == object_1_) != (null == object)) {
		aBool9134 = true;
		aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	    }
	}
	super.method92(class163, object, (byte) -25);
    }
    
    public void method14624(byte i) {
	for (int i_2_ = 0; i_2_ < aClass450Array9131.length; i_2_++) {
	    if (aClass450Array9131[i_2_] == Class450.aClass450_4922
		|| aClass450Array9131[i_2_] == Class450.aClass450_4924)
		anInterface3_1667.method28(i_2_, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    public void method14625(int i) {
	anInt9138 = 0;
    }
    
    public void method14626() {
	for (int i = 0; i < aClass450Array9131.length; i++) {
	    if (aClass450Array9131[i] == Class450.aClass450_4922
		|| aClass450Array9131[i] == Class450.aClass450_4924)
		anInterface3_1667.method28(i, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    public void method14627(Class42 class42, byte i) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class42.method1048(-2009963701)];
		    int i_3_;
		    for (int i_4_ = 0; i_4_ < is.length; i_4_ += i_3_) {
			i_3_ = class42.method1049(is, i_4_, is.length - i_4_,
						  (byte) 106);
			if (-1 == i_3_)
			    throw new EOFException();
		    }
		    RSBuffer class525_sub38 = new RSBuffer(is);
		    if ((class525_sub38.buffer.length
			 - -1133521593 * class525_sub38.pos)
			< 1) {
			try {
			    class42.method1047(310103569);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_5_ = class525_sub38.readUnsignedByte(154781525);
		    if (i_5_ < 0 || i_5_ > 1) {
			try {
			    class42.method1047(1340614365);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class525_sub38.buffer.length
			 - class525_sub38.pos * -1133521593)
			< 2) {
			try {
			    class42.method1047(-1205580420);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_6_ = class525_sub38.readUnsignedShort((byte) 78);
		    if ((class525_sub38.buffer.length
			 - -1133521593 * class525_sub38.pos)
			< 6 * i_6_) {
			try {
			    class42.method1047(-847971348);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			Class447 class447
			    = Class198_Sub4.aClass106_Sub1_Sub2_9917
				  .method14515(class525_sub38, (byte) -1);
			if ((Class450.aClass450_4923
			     == (aClass450Array9131
				 [-316828413 * class447.anInt4898]))
			    && (((Class163)
				 (Class198_Sub4.aClass106_Sub1_Sub2_9917
				      .method76
				  (class447.anInt4898 * -316828413,
				   -1072020005)))
				    .aClass495_1765.method8131
				    (1656117429).aClass5217.isAssignableFrom
				(class447.anObject4899.getClass())))
			    anInterface3_1667.method18((-316828413
							* class447.anInt4898),
						       class447.anObject4899,
						       (byte) -59);
		    }
		} catch (Exception exception) {
		    try {
			class42.method1047(-1263125998);
		    } catch (Exception exception_8_) {
			exception = exception_8_;
		    }
		    break;
		}
		try {
		    class42.method1047(-1379524953);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Object object) {
		try {
		    class42.method1047(531191251);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method14628(int i) {
	if (Class251.method4508((byte) 8)
	    >= 6294238972414668081L * aLong9137) {
	    if (aClass447Array9135 == null) {
		if (!aBool9134)
		    return;
		aClass447Array9135 = new Class447[aSet9136.size()];
		int i_9_ = 0;
		Iterator iterator = aSet9136.iterator();
		while (iterator.hasNext()) {
		    int i_10_ = ((Integer) iterator.next()).intValue();
		    aClass447Array9135[i_9_++]
			= new Class447(i_10_,
				       anInterface3_1667.method17(i_10_,
								  -828651549));
		}
		anInt9138 = 0;
		aBool9134 = false;
		aSet9136.clear();
	    }
	    if (null != aClass447Array9135
		&& -1147891035 * anInt9138 < aClass447Array9135.length) {
		Class96 class96 = Class111.method1979(-1785694871);
		if (1624093005 * class96.anInt1167 <= 1200) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4323,
					    class96.aClass6_1169, 1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16602(0, 749602508);
		    int i_11_ = (-1133521593
				 * (class525_sub15.aClass525_Sub38_Sub2_10546
				    .pos));
		    class525_sub15.aClass525_Sub38_Sub2_10546.pos
			+= 339428471;
		    for (/**/;
			 anInt9138 * -1147891035 < aClass447Array9135.length;
			 anInt9138 += -1176435411) {
			Class447 class447
			    = aClass447Array9135[anInt9138 * -1147891035];
			if ((class96.anInt1167 * 1624093005
			     + -1133521593 * (class525_sub15
					      .aClass525_Sub38_Sub2_10546
					      .pos)
			     + Class198_Sub4.aClass106_Sub1_Sub2_9917
				   .method14514(class447, (byte) 10))
			    > 1500)
			    break;
			Class198_Sub4.aClass106_Sub1_Sub2_9917.method14517
			    (class525_sub15.aClass525_Sub38_Sub2_10546,
			     class447, (byte) 94);
		    }
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16616
			(-1133521593 * (class525_sub15
					.aClass525_Sub38_Sub2_10546
					.pos) - i_11_,
			 -1083690277);
		    if (anInt9138 * -1147891035 >= aClass447Array9135.length)
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .buffer[i_11_]
			    = (byte) 1;
		    else
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .buffer[i_11_]
			    = (byte) 0;
		    class96.method1794(class525_sub15, (short) 13854);
		    aLong9137 = ((Class251.method4508((byte) 8) + 1000L)
				 * 2057664652524391377L);
		}
	    }
	}
    }
    
    public void method14629(Class42 class42) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class42.method1048(-1916003493)];
		    int i;
		    for (int i_12_ = 0; i_12_ < is.length; i_12_ += i) {
			i = class42.method1049(is, i_12_, is.length - i_12_,
					       (byte) 111);
			if (-1 == i)
			    throw new EOFException();
		    }
		    RSBuffer class525_sub38 = new RSBuffer(is);
		    if ((class525_sub38.buffer.length
			 - -1133521593 * class525_sub38.pos)
			< 1) {
			try {
			    class42.method1047(372179784);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_13_ = class525_sub38.readUnsignedByte(2070681568);
		    if (i_13_ < 0 || i_13_ > 1) {
			try {
			    class42.method1047(363650764);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class525_sub38.buffer.length
			 - class525_sub38.pos * -1133521593)
			< 2) {
			try {
			    class42.method1047(1594100824);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_14_ = class525_sub38.readUnsignedShort((byte) 110);
		    if ((class525_sub38.buffer.length
			 - -1133521593 * class525_sub38.pos)
			< 6 * i_14_) {
			try {
			    class42.method1047(-1336115881);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
			Class447 class447
			    = Class198_Sub4.aClass106_Sub1_Sub2_9917
				  .method14515(class525_sub38, (byte) -1);
			if ((Class450.aClass450_4923
			     == (aClass450Array9131
				 [-316828413 * class447.anInt4898]))
			    && (((Class163)
				 (Class198_Sub4.aClass106_Sub1_Sub2_9917
				      .method76
				  (class447.anInt4898 * -316828413,
				   569451062)))
				    .aClass495_1765.method8131
				    (1070750936).aClass5217.isAssignableFrom
				(class447.anObject4899.getClass())))
			    anInterface3_1667.method18((-316828413
							* class447.anInt4898),
						       class447.anObject4899,
						       (byte) -84);
		    }
		} catch (Exception exception) {
		    try {
			class42.method1047(279845441);
		    } catch (Exception exception_16_) {
			exception = exception_16_;
		    }
		    break;
		}
		try {
		    class42.method1047(-2077609448);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Object object) {
		try {
		    class42.method1047(-1694054803);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method109(Class163 class163, Object object) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if (aClass450Array9131[class163.anInt1766 * 248546353]
		 == Class450.aClass450_4924) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_17_ = method91(class163, -1239049966);
	    if (null != object && null != object_17_
		&& !object.equals(object_17_)) {
		aBool9134 = true;
		aSet9136.add(Integer.valueOf(class163.anInt1766 * 248546353));
	    } else if ((null == object_17_) != (null == object)) {
		aBool9134 = true;
		aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	    }
	}
	super.method92(class163, object, (byte) -89);
    }
    
    public void method102(Class163 class163, long l) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[248546353 * class163.anInt1766])
	    aBool9132 = true;
	else if ((aClass450Array9131[class163.anInt1766 * 248546353]
		  == Class450.aClass450_4924)
		 && method101(class163, 593642760) != l) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method100(class163, l);
    }
    
    public void method108(Class163 class163, Object object) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if (aClass450Array9131[class163.anInt1766 * 248546353]
		 == Class450.aClass450_4924) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_18_ = method91(class163, -2030362003);
	    if (null != object && null != object_18_
		&& !object.equals(object_18_)) {
		aBool9134 = true;
		aSet9136.add(Integer.valueOf(class163.anInt1766 * 248546353));
	    } else if ((null == object_18_) != (null == object)) {
		aBool9134 = true;
		aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	    }
	}
	super.method92(class163, object, (byte) -126);
    }
    
    public void method14630() {
	if (aClass447Array9135 != null
	    && -1147891035 * anInt9138 >= aClass447Array9135.length) {
	    aClass447Array9135 = null;
	    anInt9138 = 0;
	}
    }
    
    public void method105(Class163 class163, int i) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if ((Class450.aClass450_4924
		  == aClass450Array9131[class163.anInt1766 * 248546353])
		 && method104(class163, 623775022) != i) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method88(class163, i, 1793242608);
    }
    
    public void method94(Class163 class163, int i) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if ((Class450.aClass450_4924
		  == aClass450Array9131[class163.anInt1766 * 248546353])
		 && method104(class163, 623775022) != i) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method88(class163, i, 911724546);
    }
    
    public void method14631(Class42 class42, int i) {
	do {
	    try {
		try {
		    int i_19_ = 3;
		    int i_20_ = 0;
		    Iterator iterator = anInterface3_1667.iterator();
		    while (iterator.hasNext()) {
			Class447 class447 = (Class447) iterator.next();
			if (aClass450Array9131[-316828413 * class447.anInt4898]
			    == Class450.aClass450_4923) {
			    i_19_ += Class198_Sub4.aClass106_Sub1_Sub2_9917
					 .method14514(class447, (byte) 10);
			    i_20_++;
			}
		    }
		    RSBuffer class525_sub38 = new RSBuffer(i_19_);
		    class525_sub38.method16735(1, -626264421);
		    class525_sub38.method16602(i_20_, 644172777);
		    Iterator iterator_21_ = anInterface3_1667.iterator();
		    while (iterator_21_.hasNext()) {
			Class447 class447 = (Class447) iterator_21_.next();
			if (aClass450Array9131[class447.anInt4898 * -316828413]
			    == Class450.aClass450_4923)
			    Class198_Sub4.aClass106_Sub1_Sub2_9917.method14517
				(class525_sub38, class447, (byte) 88);
		    }
		    class42.method1051(class525_sub38.buffer, 0,
				       -1133521593 * class525_sub38.pos,
				       -289160488);
		} catch (Exception exception) {
		    try {
			class42.method1047(666513474);
		    } catch (Exception exception_22_) {
			exception = exception_22_;
		    }
		    break;
		}
		try {
		    class42.method1047(1470937761);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Object object) {
		try {
		    class42.method1047(-22531506);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong9133 = Class251.method4508((byte) 8) * 8219613812274829465L;
	aBool9132 = false;
    }
    
    public void method90(Class163 class163, long l) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[248546353 * class163.anInt1766])
	    aBool9132 = true;
	else if ((aClass450Array9131[class163.anInt1766 * 248546353]
		  == Class450.aClass450_4924)
		 && method101(class163, 604588435) != l) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method100(class163, l);
    }
    
    public Class144_Sub1(Class106_Sub1 class106_sub1) {
	super(class106_sub1);
	aClass450Array9131 = new Class450[class106_sub1.method72(-2114176505)];
	for (int i = 0; i < class106_sub1.method72(-1498795953); i++)
	    aClass450Array9131[i]
		= (((Class163) class106_sub1.method76(i, -1550570809))
		   .aClass450_1768);
	aSet9136 = new HashSet(class106_sub1.method72(8609399));
    }
    
    public void method14632() {
	for (int i = 0; i < aClass450Array9131.length; i++) {
	    if (aClass450Array9131[i] == Class450.aClass450_4922
		|| aClass450Array9131[i] == Class450.aClass450_4924)
		anInterface3_1667.method28(i, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    public void method14633(byte i) {
	if (aClass447Array9135 != null
	    && -1147891035 * anInt9138 >= aClass447Array9135.length) {
	    aClass447Array9135 = null;
	    anInt9138 = 0;
	}
    }
    
    public void method14634() {
	for (int i = 0; i < aClass450Array9131.length; i++) {
	    if (aClass450Array9131[i] == Class450.aClass450_4922
		|| aClass450Array9131[i] == Class450.aClass450_4924)
		anInterface3_1667.method28(i, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    public void method14635() {
	for (int i = 0; i < aClass450Array9131.length; i++) {
	    if (aClass450Array9131[i] == Class450.aClass450_4922
		|| aClass450Array9131[i] == Class450.aClass450_4924)
		anInterface3_1667.method28(i, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    public void method14636() {
	for (int i = 0; i < aClass450Array9131.length; i++) {
	    if (aClass450Array9131[i] == Class450.aClass450_4922
		|| aClass450Array9131[i] == Class450.aClass450_4924)
		anInterface3_1667.method28(i, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    public void method14637() {
	anInt9138 = 0;
    }
    
    public void method14638() {
	if (Class251.method4508((byte) 8)
	    >= 6294238972414668081L * aLong9137) {
	    if (aClass447Array9135 == null) {
		if (!aBool9134)
		    return;
		aClass447Array9135 = new Class447[aSet9136.size()];
		int i = 0;
		Iterator iterator = aSet9136.iterator();
		while (iterator.hasNext()) {
		    int i_23_ = ((Integer) iterator.next()).intValue();
		    aClass447Array9135[i++]
			= new Class447(i_23_,
				       anInterface3_1667.method17(i_23_,
								  1502818051));
		}
		anInt9138 = 0;
		aBool9134 = false;
		aSet9136.clear();
	    }
	    if (null != aClass447Array9135
		&& -1147891035 * anInt9138 < aClass447Array9135.length) {
		Class96 class96 = Class111.method1979(-2078500294);
		if (1624093005 * class96.anInt1167 <= 1200) {
		    Class525_Sub15 class525_sub15
			= Class16.method767(Class412.aClass412_4323,
					    class96.aClass6_1169, 1977859884);
		    class525_sub15.aClass525_Sub38_Sub2_10546
			.method16602(0, 734249746);
		    int i = (-1133521593
			     * (class525_sub15.aClass525_Sub38_Sub2_10546
				.pos));
		    class525_sub15.aClass525_Sub38_Sub2_10546.pos
			+= 339428471;
		    for (/**/;
			 anInt9138 * -1147891035 < aClass447Array9135.length;
			 anInt9138 += -1176435411) {
			Class447 class447
			    = aClass447Array9135[anInt9138 * -1147891035];
			if ((class96.anInt1167 * 1624093005
			     + -1133521593 * (class525_sub15
					      .aClass525_Sub38_Sub2_10546
					      .pos)
			     + Class198_Sub4.aClass106_Sub1_Sub2_9917
				   .method14514(class447, (byte) 10))
			    > 1500)
			    break;
			Class198_Sub4.aClass106_Sub1_Sub2_9917.method14517
			    (class525_sub15.aClass525_Sub38_Sub2_10546,
			     class447, (byte) 12);
		    }
		    class525_sub15.aClass525_Sub38_Sub2_10546.method16616
			(-1133521593 * (class525_sub15
					.aClass525_Sub38_Sub2_10546
					.pos) - i,
			 1943024238);
		    if (anInt9138 * -1147891035 >= aClass447Array9135.length)
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .buffer[i]
			    = (byte) 1;
		    else
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .buffer[i]
			    = (byte) 0;
		    class96.method1794(class525_sub15, (short) 31899);
		    aLong9137 = ((Class251.method4508((byte) 8) + 1000L)
				 * 2057664652524391377L);
		}
	    }
	}
    }
    
    public void method14639(Class42 class42) {
	do {
	    try {
		try {
		    byte[] is
			= new byte[(int) class42.method1048(-1962368666)];
		    int i;
		    for (int i_24_ = 0; i_24_ < is.length; i_24_ += i) {
			i = class42.method1049(is, i_24_, is.length - i_24_,
					       (byte) 116);
			if (-1 == i)
			    throw new EOFException();
		    }
		    RSBuffer class525_sub38 = new RSBuffer(is);
		    if ((class525_sub38.buffer.length
			 - -1133521593 * class525_sub38.pos)
			< 1) {
			try {
			    class42.method1047(1810450823);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_25_ = class525_sub38.readUnsignedByte(2037665254);
		    if (i_25_ < 0 || i_25_ > 1) {
			try {
			    class42.method1047(1572034959);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class525_sub38.buffer.length
			 - class525_sub38.pos * -1133521593)
			< 2) {
			try {
			    class42.method1047(-502114210);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_26_ = class525_sub38.readUnsignedShort((byte) 4);
		    if ((class525_sub38.buffer.length
			 - -1133521593 * class525_sub38.pos)
			< 6 * i_26_) {
			try {
			    class42.method1047(-1236423148);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
			Class447 class447
			    = Class198_Sub4.aClass106_Sub1_Sub2_9917
				  .method14515(class525_sub38, (byte) -1);
			if ((Class450.aClass450_4923
			     == (aClass450Array9131
				 [-316828413 * class447.anInt4898]))
			    && (((Class163)
				 (Class198_Sub4.aClass106_Sub1_Sub2_9917
				      .method76
				  (class447.anInt4898 * -316828413,
				   -1209115120)))
				    .aClass495_1765.method8131
				    (-1659745097).aClass5217.isAssignableFrom
				(class447.anObject4899.getClass())))
			    anInterface3_1667.method18((-316828413
							* class447.anInt4898),
						       class447.anObject4899,
						       (byte) -75);
		    }
		} catch (Exception exception) {
		    try {
			class42.method1047(228122121);
		    } catch (Exception exception_28_) {
			exception = exception_28_;
		    }
		    break;
		}
		try {
		    class42.method1047(-2025977914);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Object object) {
		try {
		    class42.method1047(354181140);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method14640(Class42 class42) {
	do {
	    try {
		try {
		    int i = 3;
		    int i_29_ = 0;
		    Iterator iterator = anInterface3_1667.iterator();
		    while (iterator.hasNext()) {
			Class447 class447 = (Class447) iterator.next();
			if (aClass450Array9131[-316828413 * class447.anInt4898]
			    == Class450.aClass450_4923) {
			    i += Class198_Sub4.aClass106_Sub1_Sub2_9917
				     .method14514(class447, (byte) 10);
			    i_29_++;
			}
		    }
		    RSBuffer class525_sub38 = new RSBuffer(i);
		    class525_sub38.method16735(1, -366682014);
		    class525_sub38.method16602(i_29_, 976661330);
		    Iterator iterator_30_ = anInterface3_1667.iterator();
		    while (iterator_30_.hasNext()) {
			Class447 class447 = (Class447) iterator_30_.next();
			if (aClass450Array9131[class447.anInt4898 * -316828413]
			    == Class450.aClass450_4923)
			    Class198_Sub4.aClass106_Sub1_Sub2_9917.method14517
				(class525_sub38, class447, (byte) 24);
		    }
		    class42.method1051(class525_sub38.buffer, 0,
				       -1133521593 * class525_sub38.pos,
				       974520102);
		} catch (Exception exception) {
		    try {
			class42.method1047(-2039272053);
		    } catch (Exception exception_31_) {
			exception = exception_31_;
		    }
		    break;
		}
		try {
		    class42.method1047(523354357);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Object object) {
		try {
		    class42.method1047(2108269299);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong9133 = Class251.method4508((byte) 8) * 8219613812274829465L;
	aBool9132 = false;
    }
    
    public void method14641(Class42 class42) {
	do {
	    try {
		try {
		    int i = 3;
		    int i_32_ = 0;
		    Iterator iterator = anInterface3_1667.iterator();
		    while (iterator.hasNext()) {
			Class447 class447 = (Class447) iterator.next();
			if (aClass450Array9131[-316828413 * class447.anInt4898]
			    == Class450.aClass450_4923) {
			    i += Class198_Sub4.aClass106_Sub1_Sub2_9917
				     .method14514(class447, (byte) 10);
			    i_32_++;
			}
		    }
		    RSBuffer class525_sub38 = new RSBuffer(i);
		    class525_sub38.method16735(1, -1031749250);
		    class525_sub38.method16602(i_32_, 715344559);
		    Iterator iterator_33_ = anInterface3_1667.iterator();
		    while (iterator_33_.hasNext()) {
			Class447 class447 = (Class447) iterator_33_.next();
			if (aClass450Array9131[class447.anInt4898 * -316828413]
			    == Class450.aClass450_4923)
			    Class198_Sub4.aClass106_Sub1_Sub2_9917.method14517
				(class525_sub38, class447, (byte) -3);
		    }
		    class42.method1051(class525_sub38.buffer, 0,
				       -1133521593 * class525_sub38.pos,
				       770583880);
		} catch (Exception exception) {
		    try {
			class42.method1047(687561920);
		    } catch (Exception exception_34_) {
			exception = exception_34_;
		    }
		    break;
		}
		try {
		    class42.method1047(926528996);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Object object) {
		try {
		    class42.method1047(1938831072);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong9133 = Class251.method4508((byte) 8) * 8219613812274829465L;
	aBool9132 = false;
    }
    
    public void method114(Class163 class163, int i) {
	if (Class450.aClass450_4923
	    == aClass450Array9131[class163.anInt1766 * 248546353])
	    aBool9132 = true;
	else if ((Class450.aClass450_4924
		  == aClass450Array9131[class163.anInt1766 * 248546353])
		 && method104(class163, 623775022) != i) {
	    aBool9134 = true;
	    aSet9136.add(Integer.valueOf(248546353 * class163.anInt1766));
	}
	super.method88(class163, i, 943759227);
    }
    
    public void method14642() {
	if (aClass447Array9135 != null
	    && -1147891035 * anInt9138 >= aClass447Array9135.length) {
	    aClass447Array9135 = null;
	    anInt9138 = 0;
	}
    }
    
    public void method14643() {
	if (aClass447Array9135 != null
	    && -1147891035 * anInt9138 >= aClass447Array9135.length) {
	    aClass447Array9135 = null;
	    anInt9138 = 0;
	}
    }
    
    public void method14644() {
	for (int i = 0; i < aClass450Array9131.length; i++) {
	    if (aClass450Array9131[i] == Class450.aClass450_4922
		|| aClass450Array9131[i] == Class450.aClass450_4924)
		anInterface3_1667.method28(i, -1427028605);
	}
	aSet9136.clear();
	aBool9134 = false;
	aClass447Array9135 = null;
	aLong9137 = -2057664652524391377L;
    }
    
    static void method14645(int i, byte i_35_) {
	for (Class525 class525 = client.aClass10_11314.method689(1677932756);
	     class525 != null;
	     class525 = client.aClass10_11314.method690((byte) -4)) {
	    if ((long) i == (class525.aLong7113 * -5126207504388691097L >> 48
			     & 0xffffL))
		class525.method8755(-1933461091);
	}
    }
    
    static final void method14646(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_36_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_37_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	Class65 class65 = (Class65) Class525_Sub22.aClass40_Sub15_10585
					.method76(i_36_, 1746867450);
	if (Class495.aClass495_5387 == class65.aClass495_698) {
	    /* empty */
	}
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = class65.method1410(i_37_, 686484836);
    }
}
