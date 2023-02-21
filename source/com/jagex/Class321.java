/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class321 implements Interface33
{
    Class387 aClass387_3535;
    Class458 aClass458_3536;
    Class458 aClass458_3537;
    Class175 aClass175_3538;
    static Class157 aClass157_3539;
    
    public void method70() {
	Class7 class7
	    = Class293.method5306(aClass458_3537,
				  -1856873875 * aClass387_3535.anInt4033,
				  Class7.aClass404_53, -1832309734);
	aClass175_3538
	    = (Class501.aClass182_5564.method3223
	       (class7,
		Class187.method3671(aClass458_3536,
				    aClass387_3535.anInt4033 * -1856873875),
		true));
    }
    
    public void method211(int i) {
	Class7 class7
	    = Class293.method5306(aClass458_3537,
				  -1856873875 * aClass387_3535.anInt4033,
				  Class7.aClass404_53, -24067955);
	aClass175_3538
	    = (Class501.aClass182_5564.method3223
	       (class7,
		Class187.method3671(aClass458_3536,
				    aClass387_3535.anInt4033 * -1856873875),
		true));
    }
    
    public void method212(boolean bool, byte i) {
	if (bool) {
	    int i_0_ = ((aClass387_3535.aClass395_4024.method6521
			 (aClass387_3535.anInt4031 * -1561611451,
			  client.anInt11223 * -1202561691, (byte) -82))
			+ -834908743 * aClass387_3535.anInt4026);
	    int i_1_ = ((aClass387_3535.aClass396_4027.method6529
			 (aClass387_3535.anInt4029 * -1862118985,
			  client.anInt11224 * -1167554197, (byte) 100))
			+ aClass387_3535.anInt4023 * -821877617);
	    aClass175_3538.method2839(aClass387_3535.aString4032, i_0_, i_1_,
				      -1561611451 * aClass387_3535.anInt4031,
				      aClass387_3535.anInt4029 * -1862118985,
				      aClass387_3535.anInt4034 * -286588277,
				      -1826801195 * aClass387_3535.anInt4035,
				      aClass387_3535.anInt4025 * -1662642339,
				      aClass387_3535.anInt4028 * 1438382511,
				      1182416297 * aClass387_3535.anInt4030,
				      null, null, null, 0, 0, -387508267);
	}
    }
    
    public boolean method213(int i) {
	boolean bool = true;
	if (!aClass458_3536.method7506(-1856873875 * aClass387_3535.anInt4033,
				       1952064949))
	    bool = false;
	if (!aClass458_3537.method7506(aClass387_3535.anInt4033 * -1856873875,
				       -1299652708))
	    bool = false;
	return bool;
    }
    
    Class321(Class458 class458, Class458 class458_2_, Class387 class387) {
	aClass387_3535 = class387;
	aClass458_3536 = class458;
	aClass458_3537 = class458_2_;
    }
    
    public void method209(boolean bool) {
	if (bool) {
	    int i = ((aClass387_3535.aClass395_4024.method6521
		      (aClass387_3535.anInt4031 * -1561611451,
		       client.anInt11223 * -1202561691, (byte) -60))
		     + -834908743 * aClass387_3535.anInt4026);
	    int i_3_ = ((aClass387_3535.aClass396_4027.method6529
			 (aClass387_3535.anInt4029 * -1862118985,
			  client.anInt11224 * -1167554197, (byte) 100))
			+ aClass387_3535.anInt4023 * -821877617);
	    aClass175_3538.method2839(aClass387_3535.aString4032, i, i_3_,
				      -1561611451 * aClass387_3535.anInt4031,
				      aClass387_3535.anInt4029 * -1862118985,
				      aClass387_3535.anInt4034 * -286588277,
				      -1826801195 * aClass387_3535.anInt4035,
				      aClass387_3535.anInt4025 * -1662642339,
				      aClass387_3535.anInt4028 * 1438382511,
				      1182416297 * aClass387_3535.anInt4030,
				      null, null, null, 0, 0, -1935026018);
	}
    }
    
    public boolean method210() {
	boolean bool = true;
	if (!aClass458_3536.method7506(-1856873875 * aClass387_3535.anInt4033,
				       1122428551))
	    bool = false;
	if (!aClass458_3537.method7506(aClass387_3535.anInt4033 * -1856873875,
				       1125835915))
	    bool = false;
	return bool;
    }
    
    static final void method5716(Class683 class683, int i) {
	int i_4_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_4_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_4_ >> 16];
	Class256.method4649(class259, class245, class683, (byte) -4);
    }
    
    public static void method5717(int i, int i_5_) {
	Class259.aClass200_2581.method3805(i, 1877901650);
	Class259.aClass200_2584.method3805(i, 1850601505);
	Class259.aClass200_2605.method3805(i, 2080809794);
	Class259.aClass200_2583.method3805(i, 2059777989);
    }
}
