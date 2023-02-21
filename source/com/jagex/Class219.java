/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;
import java.awt.Insets;

public class Class219 implements Interface28
{
    Class221 this$0;
    int anInt2329;
    
    Class219(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	anInt2329 = class525_sub38.readUnsignedShort((byte) 80) * -1804612369;
    }
    
    public void method161(Class228 class228) {
	class228.method4284(anInt2329 * 502850063, -1902104782);
	class228.method4275(anInt2329 * 502850063, -215601198);
    }
    
    public void method160(Class228 class228) {
	class228.method4284(anInt2329 * 502850063, -1902104782);
	class228.method4275(anInt2329 * 502850063, -900302729);
    }
    
    public void method162(Class228 class228) {
	class228.method4284(anInt2329 * 502850063, -1902104782);
	class228.method4275(anInt2329 * 502850063, 413899803);
    }
    
    public void method163(Class228 class228, int i) {
	class228.method4284(anInt2329 * 502850063, -1902104782);
	class228.method4275(anInt2329 * 502850063, -978473850);
    }
    
    public void method165(Class228 class228) {
	class228.method4284(anInt2329 * 502850063, -1902104782);
	class228.method4275(anInt2329 * 502850063, -763956986);
    }
    
    public void method164(Class228 class228) {
	class228.method4284(anInt2329 * 502850063, -1902104782);
	class228.method4275(anInt2329 * 502850063, 2073562724);
    }
    
    static String method4199(RSBuffer class525_sub38, int i, int i_0_) {
	String string;
	try {
	    int i_1_ = class525_sub38.method16740((byte) -6);
	    if (i_1_ > i)
		i_1_ = i;
	    byte[] is = new byte[i_1_];
	    class525_sub38.pos
		+= (Class268.aClass279_2817.method5149
		    (class525_sub38.buffer,
		     class525_sub38.pos * -1133521593, is, 0, i_1_,
		     -1175768126)) * 339428471;
	    String string_2_ = Class392.method6482(is, 0, i_1_, 868488117);
	    string = string_2_;
	} catch (Exception exception) {
	    return "Cabbage";
	}
	return string;
    }
    
    public static void method4200(byte i) {
	Class627.method10273(1166488217);
	Class61.aBool670 = false;
	Class198_Sub19_Sub1.method18196(-305591171 * Class50.anInt374,
					Exception_Sub2.anInt11420 * 359058039,
					Class49.anInt373 * 994365359,
					-1601665585 * Class515.anInt5722,
					870295436);
	Class307.aClass525_Sub16_Sub16_3418 = null;
	Class198_Sub19.aClass525_Sub16_Sub16_9993 = null;
    }
    
    static final void method4201(Class683 class683, int i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (Class699.aClass99Array8774 != null
	    && i_3_ < Class110.anInt1371 * -218000115
	    && (Class699.aClass99Array8774[i_3_].aString1208.equalsIgnoreCase
		(Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aString12231)))
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    public static void method4202(int i) {
	Container container = Class203.method3854(1955349051);
	int i_4_ = container.getSize().width;
	int i_5_ = container.getSize().height;
	if (container == Class198_Sub7.aFrame9932) {
	    Insets insets = Class198_Sub7.aFrame9932.getInsets();
	    i_4_ -= insets.left + insets.right;
	    i_5_ -= insets.bottom + insets.top;
	}
	if (i_4_ != -349587129 * OutputStream_Sub1.anInt11049
	    || Class696_Sub9.anInt10903 * 1666450389 != i_5_
	    || client.aBool11095) {
	    if (Class501.aClass182_5564 == null
		|| Class501.aClass182_5564.method3258())
		Class97.method1820(-1153408233);
	    else {
		OutputStream_Sub1.anInt11049 = 1023287415 * i_4_;
		Class696_Sub9.anInt10903 = -1847648899 * i_5_;
	    }
	    client.aLong11219 = ((Class251.method4508((byte) 8) + 500L)
				 * -732908131660104225L);
	    client.aBool11095 = false;
	}
    }
    
    static boolean method4203(String string, String string_6_, int i) {
	Class70.anInt765 = -1076319984;
	Class70.aClass96_741 = client.aClass96_11361;
	return Class108.method1934(false, false, string, string_6_, -1L);
    }
}
