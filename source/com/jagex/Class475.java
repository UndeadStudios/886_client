/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class475
{
    static final int anInt5172 = 16;
    static final int anInt5173 = 2;
    static final int anInt5174 = 2;
    public static final int anInt5175 = 2;
    public static final int anInt5176 = 8;
    public static final int anInt5177 = 4;
    public byte[][][] aByteArrayArrayArray5178;
    public static int anInt5179;
    
    public boolean method7761(int i, int i_0_) {
	if (i < 0 || i_0_ < 0 || i >= aByteArrayArrayArray5178[1].length
	    || i_0_ >= aByteArrayArrayArray5178[1][i].length)
	    return false;
	if (0 != (aByteArrayArrayArray5178[1][i][i_0_] & 0x2))
	    return true;
	return false;
    }
    
    public boolean method7762(int i, int i_1_) {
	if (i < 0 || i_1_ < 0 || i >= aByteArrayArrayArray5178[3].length
	    || i_1_ >= aByteArrayArrayArray5178[3][i].length)
	    return false;
	return (aByteArrayArrayArray5178[3][i][i_1_] & 0x2) != 0;
    }
    
    public boolean method7763(int i, int i_2_, int i_3_) {
	if (i < 0 || i_2_ < 0 || i >= aByteArrayArrayArray5178[3].length
	    || i_2_ >= aByteArrayArrayArray5178[3][i].length)
	    return false;
	return (aByteArrayArrayArray5178[3][i][i_2_] & 0x2) != 0;
    }
    
    public void method7764(int i) {
	for (int i_4_ = 0; i_4_ < aByteArrayArrayArray5178.length; i_4_++) {
	    for (int i_5_ = 0; i_5_ < aByteArrayArrayArray5178[0].length;
		 i_5_++) {
		for (int i_6_ = 0;
		     i_6_ < aByteArrayArrayArray5178[0][0].length; i_6_++)
		    aByteArrayArrayArray5178[i_4_][i_5_][i_6_] = (byte) 0;
	    }
	}
    }
    
    public boolean method7765(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
	if (0 != (aByteArrayArrayArray5178[0][i_8_][i_9_] & 0x2))
	    return true;
	if ((aByteArrayArrayArray5178[i_7_][i_8_][i_9_] & 0x10) != 0)
	    return false;
	if (method7766(i_7_, i_8_, i_9_, 1128332826) == i)
	    return true;
	return false;
    }
    
    int method7766(int i, int i_11_, int i_12_, int i_13_) {
	if ((aByteArrayArrayArray5178[i][i_11_][i_12_] & 0x8) != 0)
	    return 0;
	if (i > 0 && 0 != (aByteArrayArrayArray5178[1][i_11_][i_12_] & 0x2))
	    return i - 1;
	return i;
    }
    
    public void method7767() {
	for (int i = 0; i < aByteArrayArrayArray5178.length; i++) {
	    for (int i_14_ = 0; i_14_ < aByteArrayArrayArray5178[0].length;
		 i_14_++) {
		for (int i_15_ = 0;
		     i_15_ < aByteArrayArrayArray5178[0][0].length; i_15_++)
		    aByteArrayArrayArray5178[i][i_14_][i_15_] = (byte) 0;
	    }
	}
    }
    
    public Class475(int i, int i_16_, int i_17_) {
	aByteArrayArrayArray5178 = new byte[i][i_16_][i_17_];
    }
    
    public boolean method7768(int i, int i_18_) {
	if (i < 0 || i_18_ < 0 || i >= aByteArrayArrayArray5178[3].length
	    || i_18_ >= aByteArrayArrayArray5178[3][i].length)
	    return false;
	return (aByteArrayArrayArray5178[3][i][i_18_] & 0x2) != 0;
    }
    
    public void method7769() {
	for (int i = 0; i < aByteArrayArrayArray5178.length; i++) {
	    for (int i_19_ = 0; i_19_ < aByteArrayArrayArray5178[0].length;
		 i_19_++) {
		for (int i_20_ = 0;
		     i_20_ < aByteArrayArrayArray5178[0][0].length; i_20_++)
		    aByteArrayArrayArray5178[i][i_19_][i_20_] = (byte) 0;
	    }
	}
    }
    
    public boolean method7770(int i, int i_21_) {
	if (i < 0 || i_21_ < 0 || i >= aByteArrayArrayArray5178[3].length
	    || i_21_ >= aByteArrayArrayArray5178[3][i].length)
	    return false;
	return (aByteArrayArrayArray5178[3][i][i_21_] & 0x2) != 0;
    }
    
    public boolean method7771(int i, int i_22_) {
	if (i < 0 || i_22_ < 0 || i >= aByteArrayArrayArray5178[1].length
	    || i_22_ >= aByteArrayArrayArray5178[1][i].length)
	    return false;
	if (0 != (aByteArrayArrayArray5178[1][i][i_22_] & 0x2))
	    return true;
	return false;
    }
    
    public boolean method7772(int i, int i_23_) {
	if (i < 0 || i_23_ < 0 || i >= aByteArrayArrayArray5178[1].length
	    || i_23_ >= aByteArrayArrayArray5178[1][i].length)
	    return false;
	if (0 != (aByteArrayArrayArray5178[1][i][i_23_] & 0x2))
	    return true;
	return false;
    }
    
    public boolean method7773(int i, int i_24_, int i_25_, int i_26_) {
	if (0 != (aByteArrayArrayArray5178[0][i_25_][i_26_] & 0x2))
	    return true;
	if ((aByteArrayArrayArray5178[i_24_][i_25_][i_26_] & 0x10) != 0)
	    return false;
	if (method7766(i_24_, i_25_, i_26_, 1128332826) == i)
	    return true;
	return false;
    }
    
    public boolean method7774(int i, int i_27_, int i_28_) {
	if (i < 0 || i_27_ < 0 || i >= aByteArrayArrayArray5178[1].length
	    || i_27_ >= aByteArrayArrayArray5178[1][i].length)
	    return false;
	if (0 != (aByteArrayArrayArray5178[1][i][i_27_] & 0x2))
	    return true;
	return false;
    }
    
    static final void method7775(Class683 class683, short i) {
	class683.anObjectArray8636
	    [(class683.anInt8644 += 1285561025) * 1373599041 - 1]
	    = new StringBuilder().append
		  (Class602.method9962(((long) (class683.anIntArray8661
						[(class683.anInt8662
						  -= 1552651121) * 501271953])
					* 60000L),
				       Class21.aClass666_213.method80(), true,
				       385681574))
		  .append
		  (" UTC").toString();
    }
    
    static final void method7776(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class96 class96 = Class111.method1979(963549474);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4258, class96.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16735(0, -1227371222);
	int i_29_ = (class525_sub15.aClass525_Sub38_Sub2_10546.pos
		     * -1133521593);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      1507079600);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16602
	    (class683.aClass401_8651.anInt4134 * -1275733157, 1154524325);
	class683.aClass401_8651.aClass525_Sub16_Sub11_4133.method18422
	    (class525_sub15.aClass525_Sub38_Sub2_10546,
	     class683.aClass401_8651.anIntArray4132, (byte) 110);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16617
	    ((class525_sub15.aClass525_Sub38_Sub2_10546.pos
	      * -1133521593) - i_29_,
	     (byte) 7);
	class96.method1794(class525_sub15, (short) 19155);
    }
    
    public static Class389 method7777(RSBuffer class525_sub38, byte i) {
	int i_30_ = class525_sub38.readInt(1171053238);
	return new Class389(i_30_);
    }
    
    static final void method7778(Class683 class683, int i) {
	class683.anInt8644 -= -438284221;
	class683.anInt8662 -= -1189665054;
	Class453_Sub1.method15915
	    (((String)
	      class683.anObjectArray8636[class683.anInt8644 * 1373599041]),
	     ((String)
	      class683.anObjectArray8636[1 + class683.anInt8644 * 1373599041]),
	     class683.anIntArray8661[501271953 * class683.anInt8662],
	     1 == class683.anIntArray8661[501271953 * class683.anInt8662 + 1],
	     ((String)
	      class683.anObjectArray8636[1373599041 * class683.anInt8644 + 2]),
	     -2109570614);
    }
}
