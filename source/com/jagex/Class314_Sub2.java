/* Class314_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class314_Sub2 extends Class314
{
    Class273 aClass273_10139;
    Class525_Sub5_Sub1 aClass525_Sub5_Sub1_10140;
    Class266 aClass266_10141;
    
    boolean method15756() throws Exception_Sub5 {
	aClass266_10141 = aClass182_Sub1_3485.method14660("BatchedSprite");
	aClass525_Sub5_Sub1_10140
	    = aClass266_10141.method4837("SpriteSampler", 886883362);
	aClass273_10139 = aClass266_10141.method4839("Normal", -1004541017);
	aClass266_10141.method4856(aClass273_10139);
	return true;
    }
    
    boolean method15757(int i) throws Exception_Sub5 {
	aClass266_10141 = aClass182_Sub1_3485.method14660("BatchedSprite");
	aClass525_Sub5_Sub1_10140
	    = aClass266_10141.method4837("SpriteSampler", 886883362);
	aClass273_10139 = aClass266_10141.method4839("Normal", -1357280956);
	aClass266_10141.method4856(aClass273_10139);
	return true;
    }
    
    public Class314_Sub2(Class182_Sub1 class182_sub1) throws Exception_Sub5 {
	super(class182_sub1);
	method15757(-413296225);
    }
    
    public void method5648() {
	aClass266_10141.method4804();
	aClass266_10141.method4828(aClass525_Sub5_Sub1_10140, 0,
				   anInterface38_3484, 541731817);
    }
    
    boolean method15758() throws Exception_Sub5 {
	aClass266_10141 = aClass182_Sub1_3485.method14660("BatchedSprite");
	aClass525_Sub5_Sub1_10140
	    = aClass266_10141.method4837("SpriteSampler", 886883362);
	aClass273_10139 = aClass266_10141.method4839("Normal", -627780401);
	aClass266_10141.method4856(aClass273_10139);
	return true;
    }
    
    public void method5647() {
	aClass266_10141.method4804();
	aClass266_10141.method4828(aClass525_Sub5_Sub1_10140, 0,
				   anInterface38_3484, -1106663611);
    }
    
    boolean method15759() throws Exception_Sub5 {
	aClass266_10141 = aClass182_Sub1_3485.method14660("BatchedSprite");
	aClass525_Sub5_Sub1_10140
	    = aClass266_10141.method4837("SpriteSampler", 886883362);
	aClass273_10139 = aClass266_10141.method4839("Normal", -445026993);
	aClass266_10141.method4856(aClass273_10139);
	return true;
    }
    
    public static final void method15760(String string, byte i) {
	if (null != string) {
	    String string_0_
		= Class48.method1111(string, Class454.aClass76_4951,
				     1818523412);
	    if (null != string_0_) {
		for (int i_1_ = 0; i_1_ < client.anInt11366 * -651611127;
		     i_1_++) {
		    Class31 class31 = client.aClass31Array11368[i_1_];
		    String string_2_ = class31.aString300;
		    String string_3_
			= Class48.method1111(string_2_, Class454.aClass76_4951,
					     1769167114);
		    if (Class569.method9523(string, string_0_, string_2_,
					    string_3_, 1903463988)) {
			client.anInt11366 -= -1244227015;
			for (int i_4_ = i_1_;
			     i_4_ < client.anInt11366 * -651611127; i_4_++)
			    client.aClass31Array11368[i_4_]
				= client.aClass31Array11368[i_4_ + 1];
			client.anInt11304 = 1928320841 * client.anInt11162;
			Class96 class96 = Class111.method1979(359061587);
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4334,
						class96.aClass6_1169,
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (Class161.method2628(string, 1388884022),
			     -478205891);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16700(string, 60884149);
			class96.method1794(class525_sub15, (short) 27244);
			break;
		    }
		}
	    }
	}
    }
    
    static void method15761(int i, int i_5_, int i_6_, int i_7_, int i_8_,
			    int i_9_, int i_10_, int i_11_, int i_12_,
			    int i_13_, int i_14_, int i_15_, int i_16_,
			    int i_17_, boolean bool, int i_18_, byte i_19_) {
	if (0 != i_5_ && -1 != i_7_) {
	    Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1 = null;
	    if (i_5_ < 0) {
		int i_20_ = -i_5_ - 1;
		if (i_20_ == client.anInt11053 * 615376671)
		    class656_sub1_sub3_sub1
			= Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705;
		else
		    class656_sub1_sub3_sub1
			= (client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384
			   [i_20_]);
	    } else {
		int i_21_ = i_5_ - 1;
		Class525_Sub19 class525_sub19
		    = ((Class525_Sub19)
		       client.aClass10_11121.method684((long) i_21_));
		if (class525_sub19 != null)
		    class656_sub1_sub3_sub1 = ((Class656_Sub1_Sub3_Sub1)
					       class525_sub19.anObject10571);
	    }
	    if (class656_sub1_sub3_sub1 != null) {
		Class586 class586
		    = class656_sub1_sub3_sub1.method18633((byte) -102);
		if (class586.anIntArrayArray7755 != null
		    && null != class586.anIntArrayArray7755[i_7_])
		    i_8_ -= class586.anIntArrayArray7755[i_7_][1];
		if (class586.anIntArrayArray7728 != null
		    && class586.anIntArrayArray7728[i_7_] != null)
		    i_8_ -= class586.anIntArrayArray7728[i_7_][1];
	    }
	}
	Class656_Sub1_Sub3_Sub5 class656_sub1_sub3_sub5
	    = new Class656_Sub1_Sub3_Sub5(client.aClass507_11137
					      .method8358((byte) 67),
					  i, -799406751 * TextureMetrics.anInt1836,
					  -799406751 * TextureMetrics.anInt1836,
					  i_10_, i_11_, i_8_,
					  client.anInt11083 + i_14_,
					  client.anInt11083 + i_15_, i_16_,
					  i_17_, i_5_, i_6_, i_9_, bool, i_7_,
					  i_18_);
	class656_sub1_sub3_sub5.method18857
	    (i_12_, i_13_,
	     Class335.method5855(i_12_, i_13_, TextureMetrics.anInt1836 * -799406751,
				 2020563229) - i_9_,
	     i_14_ + client.anInt11083, (short) 14155);
	client.aClass709_11247.method14345
	    (new Class525_Sub16_Sub13(class656_sub1_sub3_sub5), (byte) 0);
    }
}
