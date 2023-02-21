/* Class163_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class163_Sub2 extends Class163
{
    public int anInt8987;
    public static Class458 aClass458_8988;
    public static Class40_Sub13 aClass40_Sub13_8989;
    
    void method2650(RSBuffer class525_sub38, int i) {
	Class260 class260
	    = ((Class260)
	       Class539.method8888(Class522_Sub1.method16053(1003491053), i,
				   189371369));
	if (Class260.aClass260_2770 == class260)
	    anInt8987 = class525_sub38.readUnsignedShort((byte) 118) * -1247392763;
    }
    
    void method2644(RSBuffer class525_sub38, int i, byte i_0_) {
	Class260 class260
	    = ((Class260)
	       Class539.method8888(Class522_Sub1.method16053(1003491053), i,
				   -752350404));
	if (Class260.aClass260_2770 == class260)
	    anInt8987 = class525_sub38.readUnsignedShort((byte) 1) * -1247392763;
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    Class163_Sub2(Class453 class453, int i) {
	super(class453, i);
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    static void method14529(byte i) {
	if (Class501.aClass182_5564 != null) {
	    client.aClass507_11137.method8369(-1391827569);
	    Class587.method9690(-1161837775);
	    Class591.method9795(-1387958166);
	    Class476.method7779((byte) -1);
	    Class163.method2653(199188127);
	    client.aClass507_11137.method8371(true, (byte) 15);
	    Class522_Sub1.method16055(-464753972);
	    Class643.method10600((byte) 56);
	    Class514.method8552(false, 642796926);
	    Class669_Sub1.method17110((byte) 2);
	    Class172_Sub1.method15239((byte) -7);
	    Class5.method541(-2066424135);
	    for (int i_1_ = 0; i_1_ < client.aClass523Array11183.length;
		 i_1_++) {
		if (null != client.aClass523Array11183[i_1_])
		    client.aClass523Array11183[i_1_].aClass179_7098 = null;
	    }
	    for (int i_2_ = 0; i_2_ < 2048; i_2_++) {
		Class656_Sub1_Sub3_Sub1_Sub1 class656_sub1_sub3_sub1_sub1
		    = client.aClass656_Sub1_Sub3_Sub1_Sub1Array11384[i_2_];
		if (null != class656_sub1_sub3_sub1_sub1) {
		    for (int i_3_ = 0;
			 i_3_ < (class656_sub1_sub3_sub1_sub1
				 .aClass179Array12010).length;
			 i_3_++)
			class656_sub1_sub3_sub1_sub1.aClass179Array12010[i_3_]
			    = null;
		}
	    }
	    for (int i_4_ = 0; i_4_ < 1530572215 * client.anInt11276; i_4_++) {
		Class656_Sub1_Sub3_Sub1_Sub2 class656_sub1_sub3_sub1_sub2
		    = ((Class656_Sub1_Sub3_Sub1_Sub2)
		       client.aClass525_Sub19Array11122[i_4_].anObject10571);
		if (class656_sub1_sub3_sub1_sub2 != null) {
		    for (int i_5_ = 0;
			 i_5_ < (class656_sub1_sub3_sub1_sub2
				 .aClass179Array12010).length;
			 i_5_++)
			class656_sub1_sub3_sub1_sub2.aClass179Array12010[i_5_]
			    = null;
		}
	    }
	    client.aClass10_11248.method688((short) 4163);
	    Class501.aClass182_5564.method3134(-1701341179);
	    Class501.aClass182_5564 = null;
	}
    }
}
