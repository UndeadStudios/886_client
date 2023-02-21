/* Class198_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198_Sub11 extends Class198
{
    int anInt9965;
    int anInt9966;
    int anInt9967;
    int anInt9968;
    int anInt9969;
    
    public void method3756() {
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = Class201.aClass205Array2202[anInt9968 * 577492941]
		  .method3864(-1043511124);
	class656_sub1_sub3_sub1.method18634(anInt9966 * 1489578327,
					    anInt9967 * -1292222715,
					    anInt9965 * -1989738123,
					    1341108985 * anInt9969,
					    client.anInt11083, 0, 1858839012);
    }
    
    Class198_Sub11(RSBuffer class525_sub38) {
	super(class525_sub38);
	anInt9968 = class525_sub38.readUnsignedShort((byte) 109) * 1569516805;
	int i = class525_sub38.readUnsignedByte(1936397170);
	if ((i & 0x1) != 0) {
	    anInt9966 = class525_sub38.readUnsignedShort((byte) 62) * 45208167;
	    anInt9967 = class525_sub38.readUnsignedShort((byte) 126) * 778679757;
	} else {
	    anInt9966 = -45208167;
	    anInt9967 = -778679757;
	}
	if ((i & 0x2) != 0) {
	    anInt9965 = class525_sub38.readUnsignedShort((byte) 37) * 1669269213;
	    anInt9969 = class525_sub38.readUnsignedShort((byte) 43) * 762081097;
	} else {
	    anInt9965 = -1669269213;
	    anInt9969 = -762081097;
	}
	if ((i & 0x4) != 0) {
	    int i_0_ = class525_sub38.readUnsignedShort((byte) 23);
	    int i_1_ = class525_sub38.readUnsignedShort((byte) 4);
	    int i_2_ = i_0_ * 255 / i_1_;
	    if (i_0_ > 0 && i_2_ < 1) {
		boolean bool = true;
	    }
	}
    }
    
    public void method3754() {
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = Class201.aClass205Array2202[anInt9968 * 577492941]
		  .method3864(-323040378);
	class656_sub1_sub3_sub1.method18634(anInt9966 * 1489578327,
					    anInt9967 * -1292222715,
					    anInt9965 * -1989738123,
					    1341108985 * anInt9969,
					    client.anInt11083, 0, 1024385985);
    }
    
    public void method3757() {
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = Class201.aClass205Array2202[anInt9968 * 577492941]
		  .method3864(-1074797445);
	class656_sub1_sub3_sub1.method18634(anInt9966 * 1489578327,
					    anInt9967 * -1292222715,
					    anInt9965 * -1989738123,
					    1341108985 * anInt9969,
					    client.anInt11083, 0, 2005208855);
    }
    
    public void method3753(int i) {
	Class656_Sub1_Sub3_Sub1 class656_sub1_sub3_sub1
	    = Class201.aClass205Array2202[anInt9968 * 577492941]
		  .method3864(642057426);
	class656_sub1_sub3_sub1.method18634(anInt9966 * 1489578327,
					    anInt9967 * -1292222715,
					    anInt9965 * -1989738123,
					    1341108985 * anInt9969,
					    client.anInt11083, 0, 2027282673);
    }
    
    static void method15647(Class683 class683, int i) {
	class683.anIntArray8661[class683.anInt8662 * 501271953 - 2]
	    = (((Class269)
		Class249.aClass47_Sub1_2445.method76((class683.anIntArray8661
						      [((501271953
							 * class683.anInt8662)
							- 2)]),
						     -1540993150))
		   .method4972
	       (Class532.aClass111_7170,
		class683.anIntArray8661[501271953 * class683.anInt8662 - 1],
		-502417899)) ? 1 : 0;
	class683.anInt8662 -= 1552651121;
    }
    
    static final void method15648(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class53.method1175(class259, class245, class683, -703461896);
    }
    
    static final void method15649(Class683 class683, byte i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_3_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_3_ >> 16];
	Class618.method10160(class259, class245, class683, (byte) 9);
    }
}
