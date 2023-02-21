/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class232 implements Interface26
{
    Class230 aClass230_2367;
    Class221 this$0;
    public static Class40_Sub18 aClass40_Sub18_2368;
    
    public void method163(Class228 class228, int i) {
	class228.method4280(aClass230_2367, -1349820924);
    }
    
    public void method160(Class228 class228) {
	class228.method4280(aClass230_2367, -1866095632);
    }
    
    public void method161(Class228 class228) {
	class228.method4280(aClass230_2367, -1828004793);
    }
    
    public void method162(Class228 class228) {
	class228.method4280(aClass230_2367, -1840852518);
    }
    
    Class232(Class221 class221, RSBuffer class525_sub38) {
	this$0 = class221;
	boolean bool = class525_sub38.readUnsignedByte(841437970) != 255;
	if (bool)
	    class525_sub38.pos -= 339428471;
	aClass230_2367 = new Class230(class525_sub38, bool, true);
    }
    
    public void method165(Class228 class228) {
	class228.method4280(aClass230_2367, 272805427);
    }
    
    public void method164(Class228 class228) {
	class228.method4280(aClass230_2367, 1903741767);
    }
    
    static final void method4393(Class683 class683, int i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_0_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_0_ >> 16];
	Class609.method10012(class259, class245, class683, 1962778336);
    }
    
    public static Class182 method4394
	(int i, Canvas canvas, Class180 class180, Interface24 interface24,
	 Interface47 interface47, Interface48 interface48,
	 Interface49 interface49, Class458 class458, int i_1_, int i_2_) {
	int i_3_ = 0;
	int i_4_ = 0;
	if (null != canvas) {
	    Dimension dimension = canvas.getSize();
	    i_3_ = dimension.width;
	    i_4_ = dimension.height;
	}
	return Class182.method3228(i, canvas, class180, interface24,
				   interface47, interface48, interface49,
				   class458, i_1_, i_3_, i_4_, 458150106);
    }
    
    public static int method4395(int i) {
	if ((double) Class556_Sub1.aFloat7526 == 2.0)
	    return 25;
	if ((double) Class556_Sub1.aFloat7526 == 3.0)
	    return 37;
	if ((double) Class556_Sub1.aFloat7526 == 4.0)
	    return 50;
	if ((double) Class556_Sub1.aFloat7526 == 6.0)
	    return 75;
	if (8.0 == (double) Class556_Sub1.aFloat7526)
	    return 100;
	return 200;
    }
}
