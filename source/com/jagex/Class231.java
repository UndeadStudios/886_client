/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class231 implements Interface28
{
    Class447 aClass447_2366;
    Class221 this$0;
    
    public void method160(Class228 class228) {
	if (null != aClass447_2366)
	    class228.method4347(908093913).method92
		(((Class163)
		  (this$0.anInterface27_2333.method145(-666265992).method76
		   (aClass447_2366.anInt4898 * -316828413, -204601387))),
		 aClass447_2366.anObject4899, (byte) -14);
    }
    
    Class231(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	if (class525_sub38.readUnsignedShort((byte) 74) != 65535) {
	    class525_sub38.pos -= 678856942;
	    aClass447_2366 = class221.anInterface27_2333.method145
				 (-1215621292)
				 .method14515(class525_sub38, (byte) -1);
	} else
	    aClass447_2366 = null;
    }
    
    public void method161(Class228 class228) {
	if (null != aClass447_2366)
	    class228.method4347(908093913).method92
		(((Class163)
		  (this$0.anInterface27_2333.method145(-1257675428).method76
		   (aClass447_2366.anInt4898 * -316828413, 1891531001))),
		 aClass447_2366.anObject4899, (byte) -79);
    }
    
    public void method162(Class228 class228) {
	if (null != aClass447_2366)
	    class228.method4347(908093913).method92
		(((Class163)
		  (this$0.anInterface27_2333.method145(1755589223).method76
		   (aClass447_2366.anInt4898 * -316828413, 1609419372))),
		 aClass447_2366.anObject4899, (byte) -117);
    }
    
    public void method163(Class228 class228, int i) {
	if (null != aClass447_2366)
	    class228.method4347(908093913).method92
		(((Class163)
		  (this$0.anInterface27_2333.method145(1675401543).method76
		   (aClass447_2366.anInt4898 * -316828413, -720989649))),
		 aClass447_2366.anObject4899, (byte) -61);
    }
    
    public void method165(Class228 class228) {
	if (null != aClass447_2366)
	    class228.method4347(908093913).method92
		(((Class163)
		  (this$0.anInterface27_2333.method145(-39419461).method76
		   (aClass447_2366.anInt4898 * -316828413, -1733821559))),
		 aClass447_2366.anObject4899, (byte) -42);
    }
    
    public void method164(Class228 class228) {
	if (null != aClass447_2366)
	    class228.method4347(908093913).method92
		(((Class163)
		  (this$0.anInterface27_2333.method145(-1579420101).method76
		   (aClass447_2366.anInt4898 * -316828413, -1984314259))),
		 aClass447_2366.anObject4899, (byte) -124);
    }
    
    static final void method4388(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2660
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -758891962);
	class259.aBool2695 = true;
    }
    
    static final void method4389(Class683 class683, int i) {
	if (null == Class699.anIntArray8775
	    || (-1461411415 * Class390_Sub3.anInt10233
		>= Class699.anIntArray8775.length))
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= (Class699.anIntArray8775[(Class390_Sub3.anInt10233
					    += -1384017255) * -1461411415 - 1]
		   & 0xffff);
    }
    
    static final void method4390(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.aClass229_11119.method4356(i_0_, 2132558747)
		  .method3948(i_1_, (byte) 28);
    }
    
    static void method4391(boolean bool, int i) {
	Class600 class600 = Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705
				.method18623((byte) -91);
	Class525_Sub16_Sub6 class525_sub16_sub6
	    = Class556_Sub1.method9249(class600.anInt7858 * -1227002079,
				       1429253007 * class600.anInt7860);
	if (null == class525_sub16_sub6)
	    class525_sub16_sub6
		= Class556_Sub1.method9289((Class556_Sub1.aClass623_7468
					    .anInt8120) * 1938296189);
	if (Class182_Sub2.aClass525_Sub16_Sub6_9504 != class525_sub16_sub6
	    || bool) {
	    Class182_Sub2.aClass525_Sub16_Sub6_9504 = class525_sub16_sub6;
	    boolean bool_2_ = Class556_Sub1.method9248(class525_sub16_sub6);
	    if (bool_2_) {
		Class556_Sub1.aBool7475 = true;
		Class2.method528(1255547148);
	    }
	}
    }
    
    public static void method4392(boolean bool, short i) {
	if (1874190559 * client.anInt11145 != 3
	    && 1 != 1874190559 * client.anInt11145) {
	    if (!bool) {
		if (null != Class201.aClass198Array2205) {
		    Class198[] class198s = Class201.aClass198Array2205;
		    for (int i_3_ = 0; i_3_ < class198s.length; i_3_++) {
			Class198 class198 = class198s[i_3_];
			class198.method3755((short) 4287);
		    }
		}
		if (-1 != -360662919 * Class201.anInt2212)
		    Class40_Sub20.aClass217_11050.method4054(((Class201
							       .anInt2212)
							      * -360662919),
							     255, 564519426);
	    }
	    client.anInt11145 = -1068396195;
	    Class569.aClass525_Sub38_7628 = null;
	    client.aBool11146 = false;
	    if (-1755834573 * Class201.anInt2209 > 0)
		Class396.method6536(Class578.aClass578_7668,
				    -1755834573 * Class201.anInt2209, -1,
				    2122697055);
	    Class555.method9241(-2007319410);
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4317,
				    client.aClass96_11085.aClass6_1169,
				    1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(bool ? 1 : 0,
								  -636226952);
	    client.aClass96_11085.method1794(class525_sub15, (short) 6152);
	}
    }
}
