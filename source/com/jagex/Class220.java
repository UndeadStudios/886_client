/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class220 implements Interface43
{
    Class217 this$0;
    public static JS5 aClass458_2330;
    static String aString2331;
    
    Class220(Class217 class217) {
	this$0 = class217;
    }
    
    public float method323(int i) {
	return ((float) Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10727.method17416(1152796818)
		/ 255.0F);
    }
    
    public float method324() {
	return ((float) Class198_Sub13.aClass525_Sub30_9973
			    .aClass696_Sub45_10727.method17416(1059030472)
		/ 255.0F);
    }
    
    public static int method4204(int i, int i_0_, int i_1_, boolean bool,
				 int i_2_) {
	if (0 != i && (i < 50 || i > 100))
	    i = 0;
	if (i_0_ != 0 && (i_0_ < 50 || i_0_ > 100))
	    i_0_ = 0;
	boolean bool_3_ = Class512.aString5685.startsWith("mac");
	int[] is = (Class285.aTwitchTV3143.GetRecommendedSettings
		    (Class434.anInt4827 * -1445589163,
		     -1883654023 * Class696_Sub47.anInt11032, i, 2000, i_1_,
		     Class589.aFloat7785, bool_3_));
	if (0 != is[0])
	    return is[0];
	int i_4_ = is[1];
	int i_5_ = is[2];
	int i_6_ = is[3];
	int i_7_ = i_6_;
	Class589.aLong7795 = 0L;
	Class292.aLong3230
	    = (long) (1000.0F / (float) i_1_) * 4751262509504766917L;
	Class583.anInt7720 = -235706891 * i_4_;
	Class451.anInt4934 = -1446231193 * i_5_;
	if (i_0_ != 0)
	    i_6_ = i_0_ * i_6_ / 100;
	Class268.method4961(new StringBuilder().append("Stream - Input: ")
				.append
				(-1445589163 * Class434.anInt4827).append
				("x").append
				(-1883654023 * Class696_Sub47.anInt11032)
				.append
				(" (").append
				(i_7_).append
				("kbps)").append
				(" => ").append
				("Output: ").append
				(i_4_).append
				("x").append
				(i_5_).append
				(" [").append
				(0 == i ? "auto" : new StringBuilder().append
						       (i).append
						       ("%").toString())
				.append
				("] (").append
				(i_6_).append
				("kbps [").append
				(0 == i_0_ ? "auto"
				 : new StringBuilder().append(i_0_).append
				       ("%").toString())
				.append
				("])").toString(),
			    1522091789);
	return Class285.aTwitchTV3143.StartStreaming(i_4_, i_5_, i_1_, i_6_,
						     0 != i_0_,
						     Class589.aFloat7785,
						     (798874017
						      * Class589.anInt7786),
						     bool);
    }
    
    public static Class597[] method4205(int i) {
	return (new Class597[]
		{ Class597.aClass597_7843, Class597.aClass597_7842,
		  Class597.aClass597_7841 });
    }
    
    static final void method4206(Class683 class683, int i) {
	Class525_Sub37 class525_sub37 = Class62.method1380(1646703469);
	if (class525_sub37 == null) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	} else {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -480723851 * class525_sub37.anInt10825;
	    int i_8_ = (class525_sub37.anInt10823 * 1747910407 << 28
			| (class525_sub37.anInt10826 * 1273194629
			   + Class556.anInt7483) << 14
			| (Class556.anInt7484
			   + class525_sub37.anInt10824 * -1383897689));
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= i_8_;
	}
    }
    
    static int[] method4207(Class525_Sub16_Sub16 class525_sub16_sub16, int i) {
	int[] is = null;
	if (Class264.method4790(class525_sub16_sub16.anInt11861 * 91103913,
				-1677426014))
	    is = ((ItemDefinitions) (Class313_Sub2.aClass40_Sub22_10106.method76
			    ((int) (-6417801577210029731L
				    * class525_sub16_sub16.aLong11860),
			     -1330007204))).anIntArray69;
	else if (class525_sub16_sub16.anInt11857 * 1206307707 != -1)
	    is = ((ItemDefinitions) (Class313_Sub2.aClass40_Sub22_10106.method76
			    (1206307707 * class525_sub16_sub16.anInt11857,
			     -2057450657))).anIntArray69;
	else if (Class468.method7708((91103913
				      * class525_sub16_sub16.anInt11861),
				     (byte) 83)) {
	    Class525_Sub19 class525_sub19
		= ((Class525_Sub19)
		   (client.aClass10_11121.method684
		    ((long) (int) (-6417801577210029731L
				   * class525_sub16_sub16.aLong11860))));
	    if (null != class525_sub19) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       class525_sub19.anObject10571);
		NPCDefinitions class299
		    = class656_sub1_sub3_sub1_sub2.aClass299_12255;
		if (class299.anIntArray3323 != null)
		    class299 = class299.method5386(Class532.aClass111_7170,
						   Class532.aClass111_7170,
						   2117753595);
		if (null != class299)
		    is = class299.anIntArray3344;
	    }
	} else if (Class36.method977((91103913
				      * class525_sub16_sub16.anInt11861),
				     753367649)) {
	    ObjectDefinitions class602
		= ((ObjectDefinitions)
		   (client.aClass507_11137.method8362((byte) -1).method76
		    ((int) ((-6417801577210029731L
			     * class525_sub16_sub16.aLong11860) >>> 32
			    & 0x7fffffffL),
		     1302371984)));
	    if (null != class602.anIntArray7923)
		class602 = class602.method9909(Class532.aClass111_7170,
					       Class532.aClass111_7170,
					       -1856791889);
	    if (class602 != null)
		is = class602.anIntArray7939;
	}
	return is;
    }
    
    static final void method4208(Class259 class259, Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_10_ = ((class683.anIntArray8661
		      [(class683.anInt8662 -= 1552651121) * 501271953])
		     - 1);
	int i_11_ = i_10_;
	if (class259.anInt2630 * 307215955 != 6
	    && 2 != 307215955 * class259.anInt2630)
	    throw new RuntimeException("");
	NPCDefinitions class299
	    = ((NPCDefinitions)
	       Class168_Sub1.aClass40_Sub7_9112
		   .method76(class259.anInt2631 * -961419549, 1297678991));
	if (null == class259.aClass288_2769)
	    class259.aClass288_2769
		= new Class288(class299, 6 == 307215955 * class259.anInt2630);
	class259.aClass288_2769.aLong3195
	    = Class666.method11002((byte) 23) * -6636968143718260973L;
	if (class299.aByteArray3301 != null) {
	    if (i_10_ < 0 || i_10_ >= class299.aByteArray3301.length)
		throw new RuntimeException("");
	    i_11_ = class299.aByteArray3301[i_10_];
	}
	if (null == class299.aShortArray3347 || i_11_ < 0
	    || i_11_ >= class299.aShortArray3347.length)
	    throw new RuntimeException("");
	class259.aClass288_2769.aShortArray3200[i_11_] = (short) i_9_;
	Class649.method10708(class259, (byte) 0);
    }
}
