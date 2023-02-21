/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class291
{
    public int anInt3218;
    public int anInt3219;
    public int anInt3220;
    static int anInt3221;
    
    static final void method5278(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class560.method9410((char) i_0_, -1036546992) ? 1 : 0;
    }
    
    static final void method5279(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 5 == Class700.anInt8779 * -174799205 ? 1 : 0;
    }
    
    static final void method5280(byte i) {
	Class600 class600 = client.aClass507_11137.method8350(-1159536485);
	Class446 class446
	    = Class453_Sub3.aClass309_Sub1_10316.method5486(-374337807);
	Class477.anInt5200
	    = ((int) class446.aFloat4895
	       - (class600.anInt7858 * -1227002079 << 9)) * 54795941;
	Class575.anInt7648 = -1332233853 * -(int) class446.aFloat4896;
	Class475.anInt5179
	    = 662343119 * ((int) class446.aFloat4897
			   - (1429253007 * class600.anInt7860 << 9));
	Class689_Sub1.anInt11019
	    = ((int) ((double) Class453_Sub3.aClass309_Sub1_10316
				   .method5490(-161530116)
		      * 2607.5945876176133)
	       & 0x3fff) * 784259773;
	Class64.anInt695 = ((int) ((double) Class453_Sub3
						.aClass309_Sub1_10316
						.method5491((byte) 0)
				   * 2607.5945876176133)
			    & 0x3fff) * -1054956469;
	Class8.anInt137 = 0;
    }
    
    public static Class525_Sub16_Sub8 method5281(int i, int i_1_, byte i_2_) {
	Class270 class270
	    = (Class270) Class281.aMap3005.get(Integer.valueOf(i));
	return class270.method5004(i_1_, 538017645);
    }
    
    static final void method5282
	(Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1, int i) {
	Class689 class689 = class656_sub1_sub3_sub1.aClass689_11987;
	if ((client.anInt11083
	     == class656_sub1_sub3_sub1.anInt11996 * -907110543)
	    || !class689.method14021(-426517502)
	    || class689.method14064(1, (byte) -70)) {
	    int i_3_ = (class656_sub1_sub3_sub1.anInt11996 * -907110543
			- class656_sub1_sub3_sub1.anInt11995 * 1739204983);
	    int i_4_ = (client.anInt11083
			- class656_sub1_sub3_sub1.anInt11995 * 1739204983);
	    int i_5_
		= (class656_sub1_sub3_sub1.anInt11989 * 2003466752
		   + class656_sub1_sub3_sub1.method18608((byte) 19) * 256);
	    int i_6_
		= (-1828101632 * class656_sub1_sub3_sub1.anInt11991
		   + class656_sub1_sub3_sub1.method18608((byte) 26) * 256);
	    int i_7_
		= (585146880 * class656_sub1_sub3_sub1.anInt11990
		   + class656_sub1_sub3_sub1.method18608((byte) 34) * 256);
	    int i_8_
		= (-321291776 * class656_sub1_sub3_sub1.anInt12018
		   + class656_sub1_sub3_sub1.method18608((byte) 114) * 256);
	    int i_9_ = (i_4_ * i_7_ + i_5_ * (i_3_ - i_4_)) / i_3_;
	    int i_10_ = ((i_3_ - i_4_) * i_6_ + i_4_ * i_8_) / i_3_;
	    int i_11_
		= Class335.method5855(i_9_, i_10_,
				      (1369914933
				       * class656_sub1_sub3_sub1.anInt11993),
				      2020563229);
	    int i_12_
		= Class335.method5855(i_7_, i_8_,
				      (1634449747
				       * class656_sub1_sub3_sub1.anInt11968),
				      2020563229);
	    int i_13_ = (i_11_ * (i_3_ - i_4_) + i_4_ * i_12_) / i_3_;
	    class656_sub1_sub3_sub1.method10824((float) i_9_, (float) i_13_,
						(float) i_10_);
	}
	class656_sub1_sub3_sub1.anInt12019 = 0;
	class656_sub1_sub3_sub1.method18597((class656_sub1_sub3_sub1.anInt11997
					     * 1491619207),
					    false, (byte) 1);
    }
}
