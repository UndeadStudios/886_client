/* Class600 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;

public class Class600
{
    public int anInt7858;
    public int anInt7859;
    public int anInt7860;
    
    public String method9870() {
	return new StringBuilder().append(1801040619 * anInt7859).append
		   (",").append
		   (anInt7858 * -1227002079 >> 6).append
		   (",").append
		   (1429253007 * anInt7860 >> 6).append
		   (",").append
		   (anInt7858 * -1227002079 & 0x3f).append
		   (",").append
		   (anInt7860 * 1429253007 & 0x3f).toString();
    }
    
    public Class600() {
	anInt7859 = 2084411965;
    }
    
    public String toString() {
	return new StringBuilder().append(1801040619 * anInt7859).append
		   (",").append
		   (anInt7858 * -1227002079 >> 6).append
		   (",").append
		   (1429253007 * anInt7860 >> 6).append
		   (",").append
		   (anInt7858 * -1227002079 & 0x3f).append
		   (",").append
		   (anInt7860 * 1429253007 & 0x3f).toString();
    }
    
    public void method9871(Class525_Sub28 class525_sub28, int i) {
	anInt7859 = -381826957 * class525_sub28.anInt10615;
	anInt7858 = (-794397083 * class525_sub28.anInt10614 >> 9) * -568666911;
	anInt7860 = 221647727 * (class525_sub28.anInt10618 * 602488327 >> 9);
    }
    
    public int method9872(byte i) {
	return (1801040619 * anInt7859 << 28 | anInt7858 * -1227002079 << 14
		| 1429253007 * anInt7860);
    }
    
    public boolean method9873(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class600))
	    return false;
	return method9876((Class600) object, -1132390238);
    }
    
    public String method9874() {
	return new StringBuilder().append(1801040619 * anInt7859).append
		   (",").append
		   (anInt7858 * -1227002079 >> 6).append
		   (",").append
		   (1429253007 * anInt7860 >> 6).append
		   (",").append
		   (anInt7858 * -1227002079 & 0x3f).append
		   (",").append
		   (anInt7860 * 1429253007 & 0x3f).toString();
    }
    
    public Class600(int i) {
	if (i == -1)
	    anInt7859 = 2084411965;
	else {
	    anInt7859 = (i >> 28 & 0x3) * -2084411965;
	    anInt7858 = (i >> 14 & 0x3fff) * -568666911;
	    anInt7860 = (i & 0x3fff) * 221647727;
	}
    }
    
    public boolean method9875(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class600))
	    return false;
	return method9876((Class600) object, -1485148997);
    }
    
    boolean method9876(Class600 class600_0_, int i) {
	if (1801040619 * anInt7859 != 1801040619 * class600_0_.anInt7859)
	    return false;
	if (anInt7858 * -1227002079 != -1227002079 * class600_0_.anInt7858)
	    return false;
	if (1429253007 * class600_0_.anInt7860 != anInt7860 * 1429253007)
	    return false;
	return true;
    }
    
    public boolean method9877(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class600))
	    return false;
	return method9876((Class600) object, -1281485684);
    }
    
    public boolean method9878(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class600))
	    return false;
	return method9876((Class600) object, -1504457864);
    }
    
    public boolean method9879(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class600))
	    return false;
	return method9876((Class600) object, -1214936721);
    }
    
    public int method9880() {
	return method9872((byte) 1);
    }
    
    public boolean equals(Object object) {
	if (this == object)
	    return true;
	if (!(object instanceof Class600))
	    return false;
	return method9876((Class600) object, -2051667336);
    }
    
    public int method9881() {
	return method9872((byte) 1);
    }
    
    public int method9882() {
	return method9872((byte) 1);
    }
    
    public Class600(int i, int i_1_, int i_2_) {
	anInt7859 = i * -2084411965;
	anInt7858 = i_1_ * -568666911;
	anInt7860 = i_2_ * 221647727;
    }
    
    public void method9883(Class525_Sub28 class525_sub28) {
	anInt7859 = -381826957 * class525_sub28.anInt10615;
	anInt7858 = (-794397083 * class525_sub28.anInt10614 >> 9) * -568666911;
	anInt7860 = 221647727 * (class525_sub28.anInt10618 * 602488327 >> 9);
    }
    
    public String method9884() {
	return new StringBuilder().append(1801040619 * anInt7859).append
		   (",").append
		   (anInt7858 * -1227002079 >> 6).append
		   (",").append
		   (1429253007 * anInt7860 >> 6).append
		   (",").append
		   (anInt7858 * -1227002079 & 0x3f).append
		   (",").append
		   (anInt7860 * 1429253007 & 0x3f).toString();
    }
    
    public int hashCode() {
	return method9872((byte) 1);
    }
    
    public void method9885(Class525_Sub28 class525_sub28) {
	anInt7859 = -381826957 * class525_sub28.anInt10615;
	anInt7858 = (-794397083 * class525_sub28.anInt10614 >> 9) * -568666911;
	anInt7860 = 221647727 * (class525_sub28.anInt10618 * 602488327 >> 9);
    }
    
    public void method9886(Class525_Sub28 class525_sub28) {
	anInt7859 = -381826957 * class525_sub28.anInt10615;
	anInt7858 = (-794397083 * class525_sub28.anInt10614 >> 9) * -568666911;
	anInt7860 = 221647727 * (class525_sub28.anInt10618 * 602488327 >> 9);
    }
    
    public int method9887() {
	return (1801040619 * anInt7859 << 28 | anInt7858 * -1227002079 << 14
		| 1429253007 * anInt7860);
    }
    
    boolean method9888(Class600 class600_3_) {
	if (1801040619 * anInt7859 != 1801040619 * class600_3_.anInt7859)
	    return false;
	if (anInt7858 * -1227002079 != -1227002079 * class600_3_.anInt7858)
	    return false;
	if (1429253007 * class600_3_.anInt7860 != anInt7860 * 1429253007)
	    return false;
	return true;
    }
    
    static final void method9889(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2634 * 1248120695;
    }
    
    public static JS5 method9890(Class56 class56, boolean bool, int i,
                                 boolean bool_5_, boolean bool_6_,
                                 byte i_7_) {
	if (Class652_Sub2.aClass454_Sub1Array10916 == null) {
	    Class652_Sub2.aClass454_Sub1Array10916
		= new Class454_Sub1[Class281.method5197(599760346)];
	    EmitterConfig.aMap11727 = new HashMap();
	}
	Class552 class552 = null;
	int i_8_ = class56.method1202(1538102183);
	if (client.aClass37_5589 != null && !Class175_Sub2.aBool9893)
	    class552 = new Class552(i_8_, client.aClass37_5589,
				    Class468.aClass37Array5129[i_8_],
				    (i_8_ == Class56.aClass56_576
						 .method1202(1557437531)
				     ? 8000000 : 2500000));
	Class652_Sub2.aClass454_Sub1Array10916[i_8_]
	    = Class442.aClass459_4866.method7577(i_8_, class552,
						 Class312_Sub1.aClass552_10065,
						 class56
						     .method1194(1352145043),
						 85161710);
	if (bool_6_)
	    Class652_Sub2.aClass454_Sub1Array10916[i_8_]
		.method16045((byte) 52);
	JS5 class458
	    = new JS5(Class652_Sub2.aClass454_Sub1Array10916[i_8_], bool,
			   i);
	EmitterConfig.aMap11727.put(class56, class458);
	return class458;
    }
    
    static void method9891(Class96 class96, int i) {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4284, class96.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(Class441.method7120((byte) -53), -1978580135);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(-1445589163 * Class434.anInt4827, 645655519);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(Class696_Sub47.anInt11032 * -1883654023, 1771507379);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10678
		 .method17324(-16711936),
	     -134797595);
	class96.method1794(class525_sub15, (short) 32647);
    }
    
    static final void method9892(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class309.anInt3464 * -628474859;
    }
}
