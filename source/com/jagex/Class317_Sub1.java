/* Class317_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class317_Sub1 extends Class317
{
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10092;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10093;
    Class435 aClass435_10094 = new Class435();
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10095;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10096;
    Class273 aClass273_10097;
    Class266 aClass266_10098;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10099;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10100;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10101;
    Class273 aClass273_10102;
    Class273 aClass273_10103;
    static Class259[] aClass259Array10104;
    
    boolean method15726() throws Exception_Sub5 {
	aClass266_10098 = aClass182_Sub1_3503.method14660("Particle");
	aClass525_Sub5_Sub1_10092
	    = aClass266_10098.method4837("WVPMatrix", 886883362);
	aClass525_Sub5_Sub1_10093
	    = aClass266_10098.method4837("DiffuseSampler", 886883362);
	aClass525_Sub5_Sub1_10096
	    = aClass266_10098.method4837("TexCoordMatrix", 886883362);
	aClass525_Sub5_Sub1_10100
	    = aClass266_10098.method4837("DistanceFogPlane", 886883362);
	aClass525_Sub5_Sub1_10101
	    = aClass266_10098.method4837("DistanceFogColour", 886883362);
	aClass525_Sub5_Sub1_10099
	    = aClass266_10098.method4837("DistanceFogAmount", 886883362);
	aClass525_Sub5_Sub1_10095
	    = aClass266_10098.method4837("DiffuseColour", 886883362);
	aClass273_10097 = aClass266_10098.method4839("NoFog", -1910491051);
	aClass273_10102
	    = aClass266_10098.method4839("ParticleFog", -1622958651);
	aClass273_10103
	    = aClass266_10098.method4839("BillboardFog", -1041045152);
	if (!aClass273_10097.method5043())
	    return false;
	if (!aClass273_10102.method5043())
	    return false;
	if (!aClass273_10103.method5043())
	    return false;
	return true;
    }
    
    boolean method15727(int i) throws Exception_Sub5 {
	aClass266_10098 = aClass182_Sub1_3503.method14660("Particle");
	aClass525_Sub5_Sub1_10092
	    = aClass266_10098.method4837("WVPMatrix", 886883362);
	aClass525_Sub5_Sub1_10093
	    = aClass266_10098.method4837("DiffuseSampler", 886883362);
	aClass525_Sub5_Sub1_10096
	    = aClass266_10098.method4837("TexCoordMatrix", 886883362);
	aClass525_Sub5_Sub1_10100
	    = aClass266_10098.method4837("DistanceFogPlane", 886883362);
	aClass525_Sub5_Sub1_10101
	    = aClass266_10098.method4837("DistanceFogColour", 886883362);
	aClass525_Sub5_Sub1_10099
	    = aClass266_10098.method4837("DistanceFogAmount", 886883362);
	aClass525_Sub5_Sub1_10095
	    = aClass266_10098.method4837("DiffuseColour", 886883362);
	aClass273_10097 = aClass266_10098.method4839("NoFog", -1901985887);
	aClass273_10102
	    = aClass266_10098.method4839("ParticleFog", -939095099);
	aClass273_10103
	    = aClass266_10098.method4839("BillboardFog", -745109980);
	if (!aClass273_10097.method5043())
	    return false;
	if (!aClass273_10102.method5043())
	    return false;
	if (!aClass273_10103.method5043())
	    return false;
	return true;
    }
    
    public void method5670(boolean bool) {
	aClass266_10098.method4856(bool ? aClass273_10103 : aClass273_10097);
	aClass266_10098.method4804();
	method15728(bool, false, (byte) -101);
	aClass182_Sub1_3503.method14750();
    }
    
    public void method5667(int i, boolean bool) {
	aClass266_10098.method4856(bool ? aClass273_10102 : aClass273_10097);
	aClass266_10098.method4804();
	method15728(bool, true, (byte) -35);
	aClass182_Sub1_3503.method14697(Class373.aClass373_3885, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method5664(boolean bool) {
	aClass266_10098.method4856(bool ? aClass273_10103 : aClass273_10097);
	aClass266_10098.method4804();
	method15728(bool, false, (byte) -12);
	aClass182_Sub1_3503.method14750();
    }
    
    void method15728(boolean bool, boolean bool_0_, byte i) {
	aClass266_10098.method4828(aClass525_Sub5_Sub1_10093, 0,
				   anInterface38_3499, 1447147113);
	aClass266_10098.method4827(aClass525_Sub5_Sub1_10092, aClass435_10094,
				   -2061016497);
	aClass266_10098.method4826(aClass525_Sub5_Sub1_10096, aClass435_3500,
				   (short) 21157);
	aClass266_10098.method4825(aClass525_Sub5_Sub1_10095, anInt3504,
				   (byte) -33);
	if (bool) {
	    if (bool_0_)
		aClass266_10098.method4806(aClass525_Sub5_Sub1_10100,
					   aClass437_3502.aFloat4851,
					   aClass437_3502.aFloat4850,
					   aClass437_3502.aFloat4849,
					   aClass437_3502.aFloat4852,
					   (byte) 6);
	    else
		aClass266_10098.method4818(aClass525_Sub5_Sub1_10099,
					   Math.min(Math.max(aFloat3498, 0.0F),
						    1.0F),
					   -2039195212);
	    aClass266_10098.method4820(aClass525_Sub5_Sub1_10101,
				       aClass446_3501.aFloat4895,
				       aClass446_3501.aFloat4896,
				       aClass446_3501.aFloat4897, -823287123);
	}
    }
    
    public void method5668(int i, boolean bool) {
	aClass266_10098.method4856(bool ? aClass273_10102 : aClass273_10097);
	aClass266_10098.method4804();
	method15728(bool, true, (byte) -21);
	aClass182_Sub1_3503.method14697(Class373.aClass373_3885, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method5669(Class435 class435) {
	aClass435_10094.method6947(class435);
	aClass435_10094.method6950(aClass182_Sub1_3503.aClass435_9195);
    }
    
    public void method5663(Class435 class435) {
	aClass435_10094.method6947(class435);
	aClass435_10094.method6950(aClass182_Sub1_3503.aClass435_9195);
    }
    
    public void method5666(Class435 class435) {
	aClass435_10094.method6947(class435);
	aClass435_10094.method6950(aClass182_Sub1_3503.aClass435_9195);
    }
    
    public void method5665(int i, boolean bool) {
	aClass266_10098.method4856(bool ? aClass273_10102 : aClass273_10097);
	aClass266_10098.method4804();
	method15728(bool, true, (byte) -78);
	aClass182_Sub1_3503.method14697(Class373.aClass373_3885, 0, 4 * i, 0,
					i * 2);
    }
    
    public void method5662(Class435 class435) {
	aClass435_10094.method6947(class435);
	aClass435_10094.method6950(aClass182_Sub1_3503.aClass435_9195);
    }
    
    public Class317_Sub1(Class182_Sub1 class182_sub1) throws Exception_Sub5 {
	super(class182_sub1);
	method15727(-2081845409);
    }
    
    void method15729(boolean bool, boolean bool_1_) {
	aClass266_10098.method4828(aClass525_Sub5_Sub1_10093, 0,
				   anInterface38_3499, -1346373117);
	aClass266_10098.method4827(aClass525_Sub5_Sub1_10092, aClass435_10094,
				   -1838470867);
	aClass266_10098.method4826(aClass525_Sub5_Sub1_10096, aClass435_3500,
				   (short) 19652);
	aClass266_10098.method4825(aClass525_Sub5_Sub1_10095, anInt3504,
				   (byte) -80);
	if (bool) {
	    if (bool_1_)
		aClass266_10098.method4806(aClass525_Sub5_Sub1_10100,
					   aClass437_3502.aFloat4851,
					   aClass437_3502.aFloat4850,
					   aClass437_3502.aFloat4849,
					   aClass437_3502.aFloat4852,
					   (byte) 61);
	    else
		aClass266_10098.method4818(aClass525_Sub5_Sub1_10099,
					   Math.min(Math.max(aFloat3498, 0.0F),
						    1.0F),
					   829691061);
	    aClass266_10098.method4820(aClass525_Sub5_Sub1_10101,
				       aClass446_3501.aFloat4895,
				       aClass446_3501.aFloat4896,
				       aClass446_3501.aFloat4897, -1625902513);
	}
    }
    
    static final void method15730(Class683 class683, int i) {
	if ((client.anInt11075 * 1777895575 != 16
	     && client.anInt11075 * 1777895575 != 7)
	    || Class198_Sub4.method15613(-492271742))
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else if (Class15.aBool176)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else if (Class697.aLong8767 * -6675588598553753887L
		 > Class251.method4508((byte) 8) - 1000L)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else {
	    Class15.aBool176 = true;
	    Class96 class96 = Class111.method1979(-1722573919);
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4292,
				    class96.aClass6_1169, 1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16605(1298550313 * Class617.anInt8060, -965807297);
	    class96.method1794(class525_sub15, (short) 16613);
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	}
    }
    
    static final void method15731(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (string.startsWith(Class501.method8197(0, -265125117))
	    || string.startsWith(Class501.method8197(1, 1137191370)))
	    string = string.substring(7);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class666.method11024(string, 596945279) ? 1 : 0;
    }
}
