/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;

public class Class459
{
    Class463 aClass463_5058;
    Class470 aClass470_5059;
    Class467 aClass467_5060;
    boolean aBool5061 = false;
    BigInteger aBigInteger5062;
    Class525_Sub16_Sub12_Sub1 aClass525_Sub16_Sub12_Sub1_5063;
    Class525_Sub16_Sub12_Sub3 aClass525_Sub16_Sub12_Sub3_5064;
    Class466 aClass466_5065;
    Class467 aClass467_5066;
    BigInteger aBigInteger5067;
    Class454_Sub1[] aClass454_Sub1Array5068;
    
    public void method7571(int i) {
	if (aClass454_Sub1Array5068 != null) {
	    for (int i_0_ = 0; i_0_ < aClass454_Sub1Array5068.length; i_0_++) {
		if (null != aClass454_Sub1Array5068[i_0_])
		    aClass454_Sub1Array5068[i_0_].method16002(1434963910);
	    }
	    for (int i_1_ = 0; i_1_ < aClass454_Sub1Array5068.length; i_1_++) {
		if (null != aClass454_Sub1Array5068[i_1_])
		    aClass454_Sub1Array5068[i_1_].method16003(-1812621964);
	    }
	    if (null == aClass467_5060)
		method7572((byte) 84);
	    else if (null != aClass470_5059 && !aBool5061) {
		if (aClass525_Sub16_Sub12_Sub3_5064 == null)
		    aClass525_Sub16_Sub12_Sub3_5064
			= aClass470_5059.method7717((byte) -80);
		else if (!aClass525_Sub16_Sub12_Sub3_5064.aBool11832) {
		    byte[] is = aClass525_Sub16_Sub12_Sub3_5064
				    .method18447(-1837172565);
		    try {
			aClass467_5066
			    = new Class467(new RSBuffer(is),
					   aBigInteger5067, aBigInteger5062);
			for (int i_2_ = 0;
			     i_2_ < aClass454_Sub1Array5068.length; i_2_++) {
			    if (aClass454_Sub1Array5068[i_2_] != null
				&& aClass454_Sub1Array5068[i_2_]
				       .method16011((byte) 0)) {
				Class473 class473
				    = aClass467_5066.aClass473Array5125[i_2_];
				aClass454_Sub1Array5068[i_2_].method16010
				    ((aClass454_Sub1Array5068[i_2_].method15999
				      (class473.anInt5157 * 1266691715,
				       class473.aByteArray5159,
				       101633277 * class473.anInt5160,
				       -1194065127 * class473.anInt5158,
				       18382869)),
				     1411535730);
			    }
			}
		    } catch (Exception exception) {
			for (int i_3_ = 0;
			     i_3_ < aClass454_Sub1Array5068.length; i_3_++) {
			    if (aClass454_Sub1Array5068[i_3_] != null
				&& aClass454_Sub1Array5068[i_3_]
				       .method16011((byte) 0))
				aClass454_Sub1Array5068[i_3_]
				    .method16010(false, 969688029);
			}
		    }
		    aClass525_Sub16_Sub12_Sub3_5064 = null;
		    aBool5061 = true;
		}
	    }
	}
    }
    
    public boolean method7572(byte i) {
	if (null != aClass467_5060)
	    return true;
	if (null == aClass525_Sub16_Sub12_Sub1_5063) {
	    if (aClass463_5058.method7613(-1370300329))
		return false;
	    aClass525_Sub16_Sub12_Sub1_5063
		= aClass463_5058.method7611(255, 255, (byte) 0, true,
					    1860673198);
	}
	if (aClass525_Sub16_Sub12_Sub1_5063.aBool11832)
	    return false;
	RSBuffer class525_sub38
	    = new RSBuffer(aClass525_Sub16_Sub12_Sub1_5063
				     .method18447(-2087898967));
	aClass467_5060
	    = new Class467(class525_sub38, aBigInteger5067, aBigInteger5062);
	if (aClass454_Sub1Array5068 == null)
	    aClass454_Sub1Array5068
		= new Class454_Sub1[aClass467_5060.aClass473Array5125.length];
	else {
	    for (int i_4_ = 0; i_4_ < aClass454_Sub1Array5068.length; i_4_++) {
		if (null != aClass454_Sub1Array5068[i_4_]) {
		    Class473 class473
			= aClass467_5060.aClass473Array5125[i_4_];
		    aClass454_Sub1Array5068[i_4_].method15998
			(1266691715 * class473.anInt5157,
			 class473.aByteArray5159,
			 101633277 * class473.anInt5160,
			 class473.anInt5158 * -1194065127, (short) 255);
		    if (aClass454_Sub1Array5068[i_4_].method16011((byte) 0))
			aClass454_Sub1Array5068[i_4_].method16010(false,
								  1955595153);
		}
	    }
	}
	aBool5061 = false;
	return true;
    }
    
    public Class454_Sub1 method7573(int i, Class552 class552,
				    Class552 class552_5_, boolean bool) {
	return method7574(i, class552, class552_5_, true, bool, -100620967);
    }
    
    Class454_Sub1 method7574(int i, Class552 class552, Class552 class552_6_,
			     boolean bool, boolean bool_7_, int i_8_) {
	if (aClass467_5060 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass454_Sub1Array5068.length)
	    throw new RuntimeException();
	if (aClass454_Sub1Array5068[i] != null)
	    return aClass454_Sub1Array5068[i];
	Class473 class473 = aClass467_5060.aClass473Array5125[i];
	Class454_Sub1 class454_sub1
	    = new Class454_Sub1(i, class552, class552_6_, aClass463_5058,
				bool_7_ ? aClass470_5059 : null,
				aClass466_5065,
				1266691715 * class473.anInt5157,
				class473.aByteArray5159,
				class473.anInt5160 * 101633277, bool,
				class473.anInt5158 * -1194065127);
	aClass454_Sub1Array5068[i] = class454_sub1;
	if (aClass467_5066 != null && bool_7_) {
	    Class473 class473_9_ = aClass467_5066.aClass473Array5125[i];
	    aClass454_Sub1Array5068[i].method16010
		((aClass454_Sub1Array5068[i].method15999
		  (class473_9_.anInt5157 * 1266691715,
		   class473_9_.aByteArray5159,
		   class473_9_.anInt5160 * 101633277,
		   -1194065127 * class473_9_.anInt5158, 18382869)),
		 1630324329);
	}
	return class454_sub1;
    }
    
    public Class454_Sub1 method7575(int i, Class552 class552,
				    Class552 class552_10_, boolean bool) {
	return method7574(i, class552, class552_10_, true, bool, -990096108);
    }
    
    public boolean method7576() {
	if (null != aClass467_5060)
	    return true;
	if (null == aClass525_Sub16_Sub12_Sub1_5063) {
	    if (aClass463_5058.method7613(-1370300329))
		return false;
	    aClass525_Sub16_Sub12_Sub1_5063
		= aClass463_5058.method7611(255, 255, (byte) 0, true,
					    1929174766);
	}
	if (aClass525_Sub16_Sub12_Sub1_5063.aBool11832)
	    return false;
	RSBuffer class525_sub38
	    = new RSBuffer(aClass525_Sub16_Sub12_Sub1_5063
				     .method18447(-1430799068));
	aClass467_5060
	    = new Class467(class525_sub38, aBigInteger5067, aBigInteger5062);
	if (aClass454_Sub1Array5068 == null)
	    aClass454_Sub1Array5068
		= new Class454_Sub1[aClass467_5060.aClass473Array5125.length];
	else {
	    for (int i = 0; i < aClass454_Sub1Array5068.length; i++) {
		if (null != aClass454_Sub1Array5068[i]) {
		    Class473 class473 = aClass467_5060.aClass473Array5125[i];
		    aClass454_Sub1Array5068[i].method15998
			(1266691715 * class473.anInt5157,
			 class473.aByteArray5159,
			 101633277 * class473.anInt5160,
			 class473.anInt5158 * -1194065127, (short) 255);
		    if (aClass454_Sub1Array5068[i].method16011((byte) 0))
			aClass454_Sub1Array5068[i].method16010(false,
							       1146836888);
		}
	    }
	}
	aBool5061 = false;
	return true;
    }
    
    public Class454_Sub1 method7577(int i, Class552 class552,
				    Class552 class552_11_, boolean bool,
				    int i_12_) {
	return method7574(i, class552, class552_11_, true, bool, 1084220688);
    }
    
    public Class459(Class463 class463, Class470 class470, Class466 class466,
		    BigInteger biginteger, BigInteger biginteger_13_) {
	aClass463_5058 = class463;
	aClass470_5059 = class470;
	aClass466_5065 = class466;
	aBigInteger5067 = biginteger;
	aBigInteger5062 = biginteger_13_;
	if (!aClass463_5058.method7613(-1370300329))
	    aClass525_Sub16_Sub12_Sub1_5063
		= aClass463_5058.method7611(255, 255, (byte) 0, true,
					    1738765916);
	if (aClass470_5059 != null)
	    aClass525_Sub16_Sub12_Sub3_5064
		= aClass470_5059.method7717((byte) -35);
    }
    
    public Class454_Sub1 method7578(int i, Class552 class552,
				    Class552 class552_14_, boolean bool) {
	return method7574(i, class552, class552_14_, true, bool, 1515093562);
    }
    
    public Class454_Sub1 method7579(int i, Class552 class552,
				    Class552 class552_15_, boolean bool) {
	return method7574(i, class552, class552_15_, true, bool, 588659925);
    }
    
    Class454_Sub1 method7580(int i, Class552 class552, Class552 class552_16_,
			     boolean bool, boolean bool_17_) {
	if (aClass467_5060 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass454_Sub1Array5068.length)
	    throw new RuntimeException();
	if (aClass454_Sub1Array5068[i] != null)
	    return aClass454_Sub1Array5068[i];
	Class473 class473 = aClass467_5060.aClass473Array5125[i];
	Class454_Sub1 class454_sub1
	    = new Class454_Sub1(i, class552, class552_16_, aClass463_5058,
				bool_17_ ? aClass470_5059 : null,
				aClass466_5065,
				1266691715 * class473.anInt5157,
				class473.aByteArray5159,
				class473.anInt5160 * 101633277, bool,
				class473.anInt5158 * -1194065127);
	aClass454_Sub1Array5068[i] = class454_sub1;
	if (aClass467_5066 != null && bool_17_) {
	    Class473 class473_18_ = aClass467_5066.aClass473Array5125[i];
	    aClass454_Sub1Array5068[i].method16010
		((aClass454_Sub1Array5068[i].method15999
		  (class473_18_.anInt5157 * 1266691715,
		   class473_18_.aByteArray5159,
		   class473_18_.anInt5160 * 101633277,
		   -1194065127 * class473_18_.anInt5158, 18382869)),
		 900148815);
	}
	return class454_sub1;
    }
    
    static void method7581(Class683 class683, int i) {
	boolean bool = ((class683.anIntArray8661
			 [(class683.anInt8662 -= 1552651121) * 501271953])
			!= 0);
	Class243.method4455(bool, (byte) -53);
    }
    
    static final void method7582(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class175_Sub4.anInt9941 * 414562409;
    }
    
    static String method7583(int i, byte i_19_) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static final void method7584(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int[] is = Class558.method9375(string, class683, (byte) 3);
	if (null != is)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2712
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1974953247);
	class259.anIntArray2653 = is;
	class259.aBool2695 = true;
    }
}
