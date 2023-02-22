/* Class643 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class643 implements Interface76
{
    public static Class643 aClass643_8330 = new Class643(0);
    static Class643 aClass643_8331 = new Class643(1);
    static Class643 aClass643_8332 = new Class643(2);
    static Class643 aClass643_8333 = new Class643(3);
    static Class643 aClass643_8334 = new Class643(4);
    int anInt8335;
    
    Class643(int i) {
	anInt8335 = -24894377 * i;
    }
    
    public int method80() {
	return anInt8335 * 880871271;
    }
    
    public int method75() {
	return anInt8335 * 880871271;
    }
    
    public int method57() {
	return anInt8335 * 880871271;
    }
    
    public static Class396[] method10595(byte i) {
	return (new Class396[]
		{ Class396.aClass396_4105, Class396.aClass396_4104,
		  Class396.aClass396_4103 });
    }
    
    static void method10596(long[] ls, int[] is, int i, int i_0_, byte i_1_) {
	if (i < i_0_) {
	    int i_2_ = (i + i_0_) / 2;
	    int i_3_ = i;
	    long l = ls[i_2_];
	    ls[i_2_] = ls[i_0_];
	    ls[i_0_] = l;
	    int i_4_ = is[i_2_];
	    is[i_2_] = is[i_0_];
	    is[i_0_] = i_4_;
	    int i_5_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
		if (ls[i_6_] < l + (long) (i_6_ & i_5_)) {
		    long l_7_ = ls[i_6_];
		    ls[i_6_] = ls[i_3_];
		    ls[i_3_] = l_7_;
		    int i_8_ = is[i_6_];
		    is[i_6_] = is[i_3_];
		    is[i_3_++] = i_8_;
		}
	    }
	    ls[i_0_] = ls[i_3_];
	    ls[i_3_] = l;
	    is[i_0_] = is[i_3_];
	    is[i_3_] = i_4_;
	    method10596(ls, is, i, i_3_ - 1, (byte) 63);
	    method10596(ls, is, i_3_ + 1, i_0_, (byte) 16);
	}
    }
    
    static final void method10597(Class683 class683, short i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_9_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_9_ >> 16];
	Class176.method2905(class259, class245, class683, -944411008);
    }
    
    static final void method10598(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_10_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_11_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	Class88 class88
	    = ((Class88)
	       client.aClass40_Sub16_11201.method76(i_11_, -600537934));
	if (class88.method1661(129120776))
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= ((ObjectDefinitions) client.aClass507_11137.method8362((byte) -1)
				  .method76(i_10_, -146025964))
		      .method9911(i_11_, class88.aString892, -518858954);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (((ObjectDefinitions) client.aClass507_11137.method8362((byte) -1)
				   .method76(i_10_, 1416529642))
		       .method9910
		   (i_11_, 2053564367 * class88.anInt893, (byte) 50));
    }
    
    public static final void method10599(Class179 class179, Class689 class689,
					 Class689 class689_12_, int i) {
	if (class689.method14044(-501522938)
	    && class689_12_.method14044(916479761)) {
	    AnimationDefinition class194 = class689.aClass194_8723;
	    AnimationDefinition class194_13_ = class689_12_.aClass194_8723;
	    class179.method2951
		(class689.aClass691_8734.aClass525_Sub16_Sub18_8748,
		 class689.aClass691_8734.anInt8744 * 1740761095,
		 class689.aClass691_8734.aClass525_Sub16_Sub18_8747,
		 class689.aClass691_8734.anInt8745 * -1589968357,
		 1733587607 * class689.anInt8724,
		 class194.frameDurations[class689.anInt8733 * -685079725],
		 class689_12_.aClass691_8734.aClass525_Sub16_Sub18_8748,
		 1740761095 * class689_12_.aClass691_8734.anInt8744,
		 class689_12_.aClass691_8734.aClass525_Sub16_Sub18_8747,
		 -1589968357 * class689_12_.aClass691_8734.anInt8745,
		 class689_12_.anInt8724 * 1733587607,
		 (class194_13_.frameDurations
		  [class689_12_.anInt8733 * -685079725]),
		 (class194.aClass210_2158 != null
		  ? class194.aClass210_2158.flowControl : null),
		 class194.aBool2169 | class194_13_.aBool2169);
	}
    }
    
    public static void method10600(byte i) {
	int i_14_ = client.aClass507_11137.method8412(288552835);
	int i_15_ = client.aClass507_11137.method8352((byte) -106);
	Class617.aBoolArrayArray8064 = new boolean[i_14_ >> 3][i_15_ >> 3];
    }
    
    static final void method10601(Class683 class683, byte i) {
	Class678.method11187(class683, 584674185);
    }
}
