/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class469 implements Interface76
{
    static Class469 aClass469_5130;
    static Class469 aClass469_5131 = new Class469(0);
    static Class469 aClass469_5132 = new Class469(1);
    int anInt5133;
    
    Class469(int i) {
	anInt5133 = 110834983 * i;
    }
    
    public int method80() {
	return anInt5133 * 1005775511;
    }
    
    static {
	aClass469_5130 = new Class469(2);
    }
    
    public int method57() {
	return anInt5133 * 1005775511;
    }
    
    public int method75() {
	return anInt5133 * 1005775511;
    }
    
    public static Class469[] method7710() {
	return (new Class469[]
		{ aClass469_5131, aClass469_5130, aClass469_5132 });
    }
    
    static final void method7711(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class259.anInt2630 = -1930949305;
	class259.anInt2631
	    = (class683.anIntArray8661
	       [(class683.anInt8662 -= 1552651121) * 501271953]) * -1938518325;
	if (-1 == class259.anInt2576 * 1534974651 && !class245.aBool2428)
	    Class689.method14096(class259.anInt2588 * 1984678839, -2120587228);
    }
    
    static final int method7712(int i, int i_0_, int i_1_) {
	int i_2_ = (Class399_Sub1.method15873(i - 1, i_0_ - 1, 2079929459)
		    + Class399_Sub1.method15873(i + 1, i_0_ - 1, -1758778001)
		    + Class399_Sub1.method15873(i - 1, 1 + i_0_, 527662581)
		    + Class399_Sub1.method15873(1 + i, i_0_ + 1, -1334545656));
	int i_3_ = (Class399_Sub1.method15873(i - 1, i_0_, -613460154)
		    + Class399_Sub1.method15873(1 + i, i_0_, -1221359243)
		    + Class399_Sub1.method15873(i, i_0_ - 1, 609889326)
		    + Class399_Sub1.method15873(i, 1 + i_0_, 1360268791));
	int i_4_ = Class399_Sub1.method15873(i, i_0_, -2019381837);
	return i_2_ / 16 + i_3_ / 8 + i_4_ / 4;
    }
    
    static final void method7713(Class683 class683, byte i) {
	Class654.method10801(1879363242);
	Class559.method9402(-1374607207);
	client.aClass507_11137.method8375((byte) -20);
	Class650.method10715(-1758466106);
	client.aBool11084 = false;
    }
    
    static final void method7714(Class683 class683, int i) {
	int i_5_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_5_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_5_ >> 16];
	Class706.method14307(class259, class245, class683, 1824763639);
    }
}
