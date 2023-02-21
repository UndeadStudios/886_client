/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class212 implements Interface28
{
    Class221 this$0;
    int anInt2269;
    int anInt2270;
    public static Class144 aClass144_2271;
    static int anInt2272;
    
    public void method163(Class228 class228, int i) {
	class228.method4282(anInt2270 * -1920221867, -1295429283 * anInt2269,
			    -375085165);
	class228.method4275(anInt2270 * -1920221867, 1752361214)
	    .method4163(-1278955858);
    }
    
    public void method164(Class228 class228) {
	class228.method4282(anInt2270 * -1920221867, -1295429283 * anInt2269,
			    -1970527381);
	class228.method4275(anInt2270 * -1920221867, 582186183)
	    .method4163(-864800355);
    }
    
    public void method161(Class228 class228) {
	class228.method4282(anInt2270 * -1920221867, -1295429283 * anInt2269,
			    -257503516);
	class228.method4275(anInt2270 * -1920221867, -1433056602)
	    .method4163(49115121);
    }
    
    public void method165(Class228 class228) {
	class228.method4282(anInt2270 * -1920221867, -1295429283 * anInt2269,
			    -379816501);
	class228.method4275(anInt2270 * -1920221867, 1682212872)
	    .method4163(-1299181776);
    }
    
    public void method160(Class228 class228) {
	class228.method4282(anInt2270 * -1920221867, -1295429283 * anInt2269,
			    -766094723);
	class228.method4275(anInt2270 * -1920221867, 938538915)
	    .method4163(-552511110);
    }
    
    Class212(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	anInt2270 = class525_sub38.readUnsignedShort((byte) 58) * -245999619;
	anInt2269 = class525_sub38.readUnsignedByte(828468611) * -1731360011;
    }
    
    public void method162(Class228 class228) {
	class228.method4282(anInt2270 * -1920221867, -1295429283 * anInt2269,
			    -1267396204);
	class228.method4275(anInt2270 * -1920221867, -54351302)
	    .method4163(133279741);
    }
    
    static final void method3933(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	int i_0_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	if (!Class188.method3683(string.charAt(0), 2056761100))
	    throw new RuntimeException();
	if (string.isEmpty() || string.length() > 10)
	    throw new RuntimeException();
	if (!Class7.aClass278_54.method5139(string, i_0_, i_1_, 1735237619))
	    throw new RuntimeException();
    }
    
    static final void method3934(Class683 class683, byte i) {
	Class525_Sub16_Sub16 class525_sub16_sub16
	    = Class47.method1101((byte) -118);
	if (Class213.method3942(class525_sub16_sub16, (byte) 17) == 7) {
	    int i_2_ = (int) class525_sub16_sub16.method18474((byte) 6);
	    if (i_2_ >= 0 && i_2_ <= 692634081 * Class104.anInt1284) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_2_];
		if (null != class656_sub1_sub3_sub1_sub1) {
		    class683.aClass656_Sub1_Sub3_Sub1_8654
			= class656_sub1_sub3_sub1_sub1;
		    class683.anIntArray8661
			[(class683.anInt8662 += 1552651121) * 501271953 - 1]
			= 1;
		    return;
		}
	    }
	}
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    public static int method3935(int i, int i_3_) {
	i = --i | i >>> 1;
	i |= i >>> 2;
	i |= i >>> 4;
	i |= i >>> 8;
	i |= i >>> 16;
	return 1 + i;
    }
    
    static final void method3936(Class683 class683, byte i) {
	Class193.method3717((byte) 3);
    }
}
