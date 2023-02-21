/* Class422 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class422
{
    static final int anInt4697 = 2;
    static final int anInt4698 = 3;
    static final int anInt4699 = 6;
    static final int anInt4700 = 11;
    static final int anInt4701 = 7;
    static final int anInt4702 = 5;
    static final int anInt4703 = 1;
    static final int anInt4704 = 10;
    static final int anInt4705 = 9;
    static final int anInt4706 = 12;
    static final int anInt4707 = 4;
    static final int anInt4708 = 13;
    static final int anInt4709 = 8;
    
    Class422() throws Throwable {
	throw new Error();
    }
    
    static final void method6755(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class636.method10471(class259, class245, class683, 758575255);
    }
    
    static final void method6756(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	float f = ((float) (class683.anIntArray8661
			    [class683.anInt8662 * 501271953 + 1])
		   / 1000.0F);
	Class453_Sub3.aClass309_Sub1_10316.method5461(i_1_, f, 737728455);
    }
    
    static final void method6757(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = client.anInt11062 * -898082599;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 681650215 * client.anInt11061;
    }
    
    public static int method6758(int i) {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class182 class182
	    = Class232.method4394(0, canvas, null, null, null, null, null,
				  null, 0, -2123528941);
	long l = Class251.method4508((byte) 8);
	for (int i_2_ = 0; i_2_ < 10000; i_2_++)
	    class182.method3197(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i_3_ = (int) (Class251.method4508((byte) 8) - l);
	class182.method3190(0, 0, 100, 100, -16777216, (byte) -1);
	class182.method3134(-1583037741);
	return i_3_;
    }
}
