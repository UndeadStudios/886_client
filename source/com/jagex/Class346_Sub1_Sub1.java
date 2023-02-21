/* Class346_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class346_Sub1_Sub1 extends Class346_Sub1
{
    public int anInt11526;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_11527;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_11528;
    Class273 aClass273_11529;
    Class273 aClass273_11530;
    public int anInt11531;
    public Class435 aClass435_11532 = new Class435();
    float[] aFloatArray11533;
    public Class435 aClass435_11534 = new Class435();
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_11535;
    float aFloat11536;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_11537;
    float[] aFloatArray11538;
    Class339 aClass339_11539;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_11540;
    public int anInt11541;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_11542;
    public int anInt11543;
    
    public void method18144(int i, int i_0_, int i_1_) {
	float f = (float) ((i & 0x3) + 1) * -5.0E-4F;
	float f_2_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
	float f_3_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
	boolean bool = 0 != (i & 0x80);
	if (bool) {
	    aFloatArray11533[0] = f_3_;
	    aFloatArray11533[1] = 0.0F;
	    aFloatArray11533[2] = 0.0F;
	    aFloatArray11533[3] = 0.0F;
	} else {
	    aFloatArray11533[0] = 0.0F;
	    aFloatArray11533[1] = 0.0F;
	    aFloatArray11533[2] = f_3_;
	    aFloatArray11533[3] = 0.0F;
	}
	aFloatArray11538[0] = 0.0F;
	aFloatArray11538[1] = f_3_;
	aFloatArray11538[2] = 0.0F;
	aFloatArray11538[3] = (float) aClass182_Sub1_3729.anInt9295 * f % 1.0F;
	if (!aClass339_11539.aBool3635) {
	    int i_4_
		= (int) (f_2_ * (float) aClass182_Sub1_3729.anInt9295 * 16.0F);
	    aClass182_Sub1_3729.method14731(aClass339_11539
					    .anInterface38Array3638
					    [i_4_ % 16]);
	} else
	    aFloat11536 = (float) ((double) aClass182_Sub1_3729.anInt9295
				   * (double) f_2_ % 1.0);
    }
    
    public Class346_Sub1_Sub1
	(Class182_Sub1 class182_sub1, Class339 class339)
	throws Exception_Sub5 {
	super(class182_sub1);
	aFloatArray11533 = new float[4];
	aFloatArray11538 = new float[4];
	aClass339_11539 = class339;
	if (aClass339_11539.method5977() && class182_sub1.method14657())
	    method15766("Waterfall");
    }
    
    boolean method15767() throws Exception_Sub5 {
	aClass525_Sub5_Sub1_11540
	    = aClass266_10169.method4837("WorldMatrix", 886883362);
	aClass525_Sub5_Sub1_11537
	    = aClass266_10169.method4837("WVPMatrix", 886883362);
	aClass525_Sub5_Sub1_11535
	    = aClass266_10169.method4837("UGenerationPlane", 886883362);
	aClass525_Sub5_Sub1_11542
	    = aClass266_10169.method4837("VGenerationPlane", 886883362);
	aClass525_Sub5_Sub1_11527
	    = aClass266_10169.method4837("Time", 886883362);
	aClass525_Sub5_Sub1_11528
	    = aClass266_10169.method4837("billowSampler3D", 886883362);
	if (aClass339_11539.aBool3635) {
	    aClass273_11529
		= aClass266_10169.method4839("Waterfall3D", -2070238630);
	    aClass266_10169.method4856(aClass273_11529);
	} else {
	    aClass273_11530
		= aClass266_10169.method4839("Waterfall2D", -1958677824);
	    aClass266_10169.method4856(aClass273_11530);
	}
	return true;
    }
    
    public void method18145(int i) {
	if (aClass339_11539.aBool3635)
	    aClass266_10169.method4856(aClass273_11529);
	else
	    aClass266_10169.method4856(aClass273_11530);
	aClass266_10169.method4804();
	if (aClass339_11539.aBool3635)
	    aClass266_10169.method4828(aClass525_Sub5_Sub1_11528, 0,
				       aClass339_11539.anInterface37_3642,
				       -1946058103);
	aClass266_10169.method4827(aClass525_Sub5_Sub1_11540, aClass435_11534,
				   -1589912155);
	aClass266_10169.method4827(aClass525_Sub5_Sub1_11537, aClass435_11532,
				   -2005579814);
	aClass266_10169.method4823(aClass525_Sub5_Sub1_11535,
				   new Class437(aFloatArray11533[0],
						aFloatArray11533[1],
						aFloatArray11533[2],
						aFloatArray11533[3]),
				   1881944288);
	aClass266_10169.method4823(aClass525_Sub5_Sub1_11542,
				   new Class437(aFloatArray11538[0],
						aFloatArray11538[1],
						aFloatArray11538[2],
						aFloatArray11538[3]),
				   1397386225);
	aClass266_10169.method4823(aClass525_Sub5_Sub1_11527,
				   new Class437(aFloat11536, 0.0F, 0.0F, 0.0F),
				   1063237595);
	aClass182_Sub1_3729.method14697(Class373.aClass373_3885,
					-978469479 * anInt11531,
					465393435 * anInt11541,
					-2091148579 * anInt11526,
					anInt11543 * -1461544021);
    }
    
    boolean method15790() throws Exception_Sub5 {
	aClass525_Sub5_Sub1_11540
	    = aClass266_10169.method4837("WorldMatrix", 886883362);
	aClass525_Sub5_Sub1_11537
	    = aClass266_10169.method4837("WVPMatrix", 886883362);
	aClass525_Sub5_Sub1_11535
	    = aClass266_10169.method4837("UGenerationPlane", 886883362);
	aClass525_Sub5_Sub1_11542
	    = aClass266_10169.method4837("VGenerationPlane", 886883362);
	aClass525_Sub5_Sub1_11527
	    = aClass266_10169.method4837("Time", 886883362);
	aClass525_Sub5_Sub1_11528
	    = aClass266_10169.method4837("billowSampler3D", 886883362);
	if (aClass339_11539.aBool3635) {
	    aClass273_11529
		= aClass266_10169.method4839("Waterfall3D", -1560154898);
	    aClass266_10169.method4856(aClass273_11529);
	} else {
	    aClass273_11530
		= aClass266_10169.method4839("Waterfall2D", -1510395825);
	    aClass266_10169.method4856(aClass273_11530);
	}
	return true;
    }
    
    boolean method15778() throws Exception_Sub5 {
	aClass525_Sub5_Sub1_11540
	    = aClass266_10169.method4837("WorldMatrix", 886883362);
	aClass525_Sub5_Sub1_11537
	    = aClass266_10169.method4837("WVPMatrix", 886883362);
	aClass525_Sub5_Sub1_11535
	    = aClass266_10169.method4837("UGenerationPlane", 886883362);
	aClass525_Sub5_Sub1_11542
	    = aClass266_10169.method4837("VGenerationPlane", 886883362);
	aClass525_Sub5_Sub1_11527
	    = aClass266_10169.method4837("Time", 886883362);
	aClass525_Sub5_Sub1_11528
	    = aClass266_10169.method4837("billowSampler3D", 886883362);
	if (aClass339_11539.aBool3635) {
	    aClass273_11529
		= aClass266_10169.method4839("Waterfall3D", -530556275);
	    aClass266_10169.method4856(aClass273_11529);
	} else {
	    aClass273_11530
		= aClass266_10169.method4839("Waterfall2D", -1646666600);
	    aClass266_10169.method4856(aClass273_11530);
	}
	return true;
    }
    
    public void method18146() {
	if (aClass339_11539.aBool3635)
	    aClass266_10169.method4856(aClass273_11529);
	else
	    aClass266_10169.method4856(aClass273_11530);
	aClass266_10169.method4804();
	if (aClass339_11539.aBool3635)
	    aClass266_10169.method4828(aClass525_Sub5_Sub1_11528, 0,
				       aClass339_11539.anInterface37_3642,
				       -2001401312);
	aClass266_10169.method4827(aClass525_Sub5_Sub1_11540, aClass435_11534,
				   -1887733347);
	aClass266_10169.method4827(aClass525_Sub5_Sub1_11537, aClass435_11532,
				   -1900851059);
	aClass266_10169.method4823(aClass525_Sub5_Sub1_11535,
				   new Class437(aFloatArray11533[0],
						aFloatArray11533[1],
						aFloatArray11533[2],
						aFloatArray11533[3]),
				   2060247406);
	aClass266_10169.method4823(aClass525_Sub5_Sub1_11542,
				   new Class437(aFloatArray11538[0],
						aFloatArray11538[1],
						aFloatArray11538[2],
						aFloatArray11538[3]),
				   1179565987);
	aClass266_10169.method4823(aClass525_Sub5_Sub1_11527,
				   new Class437(aFloat11536, 0.0F, 0.0F, 0.0F),
				   2111182331);
	aClass182_Sub1_3729.method14697(Class373.aClass373_3885,
					-978469479 * anInt11531,
					465393435 * anInt11541,
					-2091148579 * anInt11526,
					anInt11543 * -1461544021);
    }
    
    static final void method18147(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_5_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_6_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	int i_7_ = (Class215.aClass58_2283.method1220(i_5_, 797864)
			.method18426(i_6_, -1913925699).anInt8384
		    * -490904493);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_7_;
    }
}
