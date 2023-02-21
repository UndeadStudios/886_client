/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class453 implements Interface76
{
    static Class453 aClass453_4938;
    public static Class453 aClass453_4939
	= new Class453_Sub3(Class663.aClass663_8548, 0, true, true);
    public static Class453 aClass453_4940;
    static Class453 aClass453_4941;
    int anInt4942;
    public static Class453 aClass453_4943
	= new Class453_Sub4(Class663.aClass663_8530, 1, false, true);
    public static Class453 aClass453_4944;
    public static Class453 aClass453_4945;
    static Class453 aClass453_4946;
    public static Class453 aClass453_4947;
    public static Class453 aClass453_4948;
    Class663 aClass663_4949;
    static Class453 aClass453_4950;
    
    public int method80() {
	return 368551457 * anInt4942;
    }
    
    Class453(Class663 class663, int i, boolean bool, boolean bool_0_) {
	aClass663_4949 = class663;
	anInt4942 = 1616731617 * i;
    }
    
    public final Class663 method7344(int i) {
	return aClass663_4949;
    }
    
    public int method75() {
	return 368551457 * anInt4942;
    }
    
    public Object method7345(Class163 class163, int i) {
	if (class163.aBool1769)
	    return method7354(class163, (byte) 0);
	return class163.aClass495_1765.method8133((byte) 82);
    }
    
    Object method7346(Class163 class163) {
	return class163.aClass495_1765.method8133((byte) 16);
    }
    
    public Object method7347(Class163 class163) {
	if (class163.aBool1769)
	    return method7354(class163, (byte) 0);
	return class163.aClass495_1765.method8133((byte) 52);
    }
    
    public static Class453[] method7348(int i) {
	return new Class453[] { aClass453_4940, aClass453_4946, aClass453_4941,
				aClass453_4950, aClass453_4948, aClass453_4945,
				aClass453_4947, aClass453_4938, aClass453_4939,
				aClass453_4944, aClass453_4943 };
    }
    
    public int method57() {
	return 368551457 * anInt4942;
    }
    
    public static Class453[] method7349() {
	return new Class453[] { aClass453_4940, aClass453_4946, aClass453_4941,
				aClass453_4950, aClass453_4948, aClass453_4945,
				aClass453_4947, aClass453_4938, aClass453_4939,
				aClass453_4944, aClass453_4943 };
    }
    
    public static Class453[] method7350() {
	return new Class453[] { aClass453_4940, aClass453_4946, aClass453_4941,
				aClass453_4950, aClass453_4948, aClass453_4945,
				aClass453_4947, aClass453_4938, aClass453_4939,
				aClass453_4944, aClass453_4943 };
    }
    
    public final Class663 method7351() {
	return aClass663_4949;
    }
    
    public Object method7352(Class163 class163) {
	if (class163.aBool1769)
	    return method7354(class163, (byte) 0);
	return class163.aClass495_1765.method8133((byte) 29);
    }
    
    static {
	aClass453_4940
	    = new Class453_Sub1(Class663.aClass663_8541, 2, true, true);
	aClass453_4941
	    = new Class453_Sub2(Class663.aClass663_8506, 3, false, false);
	aClass453_4938
	    = new Class453(Class663.aClass663_8533, 4, false, false);
	aClass453_4948 = new Class453(Class663.aClass663_8547, 5, true, true);
	aClass453_4944 = new Class453(Class663.aClass663_8535, 6, true, true);
	aClass453_4945 = new Class453(Class663.aClass663_8536, 7, true, false);
	aClass453_4946
	    = new Class453_Sub5(Class663.aClass663_8537, 8, false, false);
	aClass453_4947 = new Class453(Class663.aClass663_8480, 9, false, true);
	aClass453_4950
	    = new Class453(Class663.aClass663_8543, 10, false, false);
    }
    
    Object method7353(Class163 class163) {
	return class163.aClass495_1765.method8133((byte) 124);
    }
    
    Object method7354(Class163 class163, byte i) {
	return class163.aClass495_1765.method8133((byte) 52);
    }
    
    Object method7355(Class163 class163) {
	return class163.aClass495_1765.method8133((byte) 68);
    }
    
    public Object method7356(Class163 class163) {
	if (class163.aBool1769)
	    return method7354(class163, (byte) 0);
	return class163.aClass495_1765.method8133((byte) 42);
    }
    
    static final void method7357(Class683 class683, short i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class259.anInt2601 * -1028431221;
    }
    
    static final void method7358(byte i, int i_2_) {
	byte[][][] is = client.aClass507_11137.method8417((byte) -12);
	if (is == null) {
	    is = (new byte[4][client.aClass507_11137.method8412(1508896780)]
		  [client.aClass507_11137.method8352((byte) -73)]);
	    client.aClass507_11137.method8443(is, 501271953);
	}
	for (int i_3_ = 0; i_3_ < 4; i_3_++) {
	    for (int i_4_ = 0;
		 i_4_ < client.aClass507_11137.method8412(2125389281);
		 i_4_++) {
		for (int i_5_ = 0;
		     i_5_ < client.aClass507_11137.method8352((byte) -121);
		     i_5_++)
		    is[i_3_][i_4_][i_5_] = i;
	    }
	}
    }
    
    public static final void method7359(byte i) {
	for (int i_6_ = 0; i_6_ < 5; i_6_++)
	    client.aBoolArray11343[i_6_] = false;
	client.anInt11189 = 412741933;
	client.anInt11191 = -912399317;
	Class28.anInt284 = 0;
	Class585.anInt7725 = 0;
	Class700.anInt8779 = 891993676;
	if (Class152_Sub1.method14533(-1843028410) == 5) {
	    Class600 class600 = client.aClass507_11137.method8350(1710184128);
	    int i_7_ = -1227002079 * class600.anInt7858 << 9;
	    int i_8_ = class600.anInt7860 * 1429253007 << 9;
	    int i_9_ = 1000 / Class424.method6768(1684836768);
	    Class453_Sub3.aClass309_Sub1_10316.method5453
		((float) i_9_ / 1000.0F,
		 (client.aClass507_11137.method8359(-2099670124)
		  .anIntArrayArrayArray4966),
		 client.aClass507_11137.method8360(1665497368), i_7_, i_8_,
		 -1940421645);
	}
	Class648.anInt8363 = -1945230309;
	Class198_Sub3.anInt9911 = 56698409;
	client.anInt11340 = 1172496237 * client.anInt11083;
	Class276.anInt2876 = -143820801 * Class477.anInt5200;
	Class218.anInt2328 = 174097511 * Class575.anInt7648;
	Class238.anInt2404 = -1386685897 * Class475.anInt5179;
	Class514.anInt5696 = Class689_Sub1.anInt11019 * -1818791747;
	Class265.anInt2806 = 1161719755 * Class64.anInt695;
	Class329.anInt3590 = client.anInt11360 * 78428177;
    }
}
