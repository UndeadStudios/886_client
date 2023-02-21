/* Class627 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class627 implements Interface76
{
    static Class627 aClass627_8150;
    int anInt8151;
    static Class627 aClass627_8152;
    public static Class627 aClass627_8153 = new Class627(0);
    
    public static Class627[] method10264() {
	return (new Class627[]
		{ aClass627_8153, aClass627_8152, aClass627_8150 });
    }
    
    Class627(int i) {
	anInt8151 = i * 164491083;
    }
    
    public boolean method10265() {
	return this != aClass627_8153;
    }
    
    public boolean method10266(int i) {
	return this == aClass627_8152;
    }
    
    public boolean method10267(byte i) {
	return this != aClass627_8153;
    }
    
    static {
	aClass627_8152 = new Class627(1);
	aClass627_8150 = new Class627(2);
    }
    
    public int method57() {
	return anInt8151 * 1668129379;
    }
    
    public int method75() {
	return anInt8151 * 1668129379;
    }
    
    public boolean method10268() {
	return this == aClass627_8152;
    }
    
    public static Class627[] method10269(int i) {
	return (new Class627[]
		{ aClass627_8153, aClass627_8152, aClass627_8150 });
    }
    
    public boolean method10270() {
	return this == aClass627_8152;
    }
    
    public boolean method10271() {
	return this == aClass627_8152;
    }
    
    public boolean method10272() {
	return this == aClass627_8152;
    }
    
    static void method10273(int i) {
	if (null != Class61.aClass525_Sub16_Sub7_668) {
	    Class61.aClass525_Sub16_Sub7_668 = null;
	    Class198_Sub19_Sub1.method18196(Class561.anInt7550 * 1048248753,
					    Class212.anInt2272 * -2121563769,
					    Class263.anInt2798 * -1153846815,
					    Class541.anInt7192 * 1178996993,
					    870295436);
	}
    }
    
    public int method80() {
	return anInt8151 * 1668129379;
    }
    
    static final void method10274(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_0_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	boolean bool
	    = class683.anIntArray8661[1 + class683.anInt8662 * 501271953] == 1;
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub20_10701, i_0_,
	     (byte) -30);
	if (!bool)
	    Class198_Sub13.aClass525_Sub30_9973.method16502
		(Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub23_10719, 0,
		 (byte) -112);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    public static void method10275(int i, int i_1_, String string,
				   String string_2_, String string_3_,
				   String string_4_, String string_5_,
				   int i_6_, Class411 class411, byte i_7_) {
	Class270 class270
	    = (Class270) Class281.aMap3005.get(Integer.valueOf(i));
	if (null == class270) {
	    class270 = new Class270();
	    Class281.aMap3005.put(Integer.valueOf(i), class270);
	}
	Class525_Sub16_Sub8 class525_sub16_sub8
	    = class270.method5006(i, i_1_, string, string_2_, string_3_,
				  string_4_, string_5_, i_6_, class411,
				  -1047459614);
	Class281.aClass10_3003.method695(class525_sub16_sub8,
					 (long) (class525_sub16_sub8.anInt11782
						 * -1767900299));
	Class281.aClass697_3002.method14184(class525_sub16_sub8, 728171782);
	client.anInt11153 = 774207951 * client.anInt11162;
    }
}
