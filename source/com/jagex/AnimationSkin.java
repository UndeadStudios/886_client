/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class AnimationSkin implements Interface12, Interface7
{
    public boolean[] flowControl;
    
    public void method70() {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_0_ = class525_sub38.readUnsignedByte(707637945);
	    if (i_0_ == 0)
		break;
	    method3919(class525_sub38, i_0_, -1153846815);
	}
    }
    
    void method3919(RSBuffer class525_sub38, int i, int i_1_) {
	if (i == 2) {
	    flowControl = new boolean[400];
	    int i_2_ = class525_sub38.readUnsignedSmart((byte) -49);
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		flowControl[class525_sub38.readUnsignedSmart((byte) -68)] = true;
	} else if (3 == i) {
	    class525_sub38.readUnsignedByte(1335829500);
	    int i_4_ = class525_sub38.readUnsignedSmart((byte) -73);
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		class525_sub38.readUnsignedSmart((byte) -103);
		class525_sub38.readUnsignedByte(605015990);
	    }
	}
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    void method3920(RSBuffer class525_sub38, int i) {
	if (i == 2) {
	    flowControl = new boolean[400];
	    int i_6_ = class525_sub38.readUnsignedSmart((byte) -89);
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		flowControl[class525_sub38.readUnsignedSmart((byte) -26)] = true;
	} else if (3 == i) {
	    class525_sub38.readUnsignedByte(1054130266);
	    int i_8_ = class525_sub38.readUnsignedSmart((byte) -3);
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		class525_sub38.readUnsignedSmart((byte) -3);
		class525_sub38.readUnsignedByte(1932570616);
	    }
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(205309208);
	    if (i == 0)
		break;
	    method3919(class525_sub38, i, -1153846815);
	}
    }
    
    void method3921(RSBuffer class525_sub38, int i) {
	if (i == 2) {
	    flowControl = new boolean[400];
	    int i_10_ = class525_sub38.readUnsignedSmart((byte) -52);
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		flowControl[class525_sub38.readUnsignedSmart((byte) -115)] = true;
	} else if (3 == i) {
	    class525_sub38.readUnsignedByte(323933984);
	    int i_12_ = class525_sub38.readUnsignedSmart((byte) -126);
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
		class525_sub38.readUnsignedSmart((byte) -34);
		class525_sub38.readUnsignedByte(1942554092);
	    }
	}
    }
    
    AnimationSkin() {
	/* empty */
    }
    
    public void method54(int i, byte i_14_) {
	/* empty */
    }
    
    public static int method3922(int i, int i_15_, boolean bool, int i_16_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (null == class525_sub10)
	    return 0;
	if (i_15_ < 0 || i_15_ >= class525_sub10.anIntArray10506.length)
	    return 0;
	return class525_sub10.anIntArray10506[i_15_];
    }
    
    static final void method3923(Class683 class683, int i) {
	int i_17_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_17_, -695254952);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1943498005 * class259.anInt2638;
    }
    
    static final void method3924(Class683 class683, byte i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	String string_18_
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4315,
				client.aClass96_11361.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16602
	    ((Class161.method2628(string, 304830630)
	      + Class161.method2628(string_18_, 27660651)),
	     1303155622);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      -1492111002);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string_18_,
							      1424839583);
	client.aClass96_11361.method1794(class525_sub15, (short) 32018);
    }
    
    public static final void method3925(int i, boolean bool, byte i_19_) {
	if (Class404.aClass525_Sub25_4148 != null
	    && (i >= 0 && i < (1745938009
			       * Class404.aClass525_Sub25_4148.anInt10600))) {
	    Class341 class341
		= Class404.aClass525_Sub25_4148.aClass341Array10603[i];
	    Class96 class96 = Class111.method1979(-1355674131);
	    Class525_Sub15 class525_sub15
		= Class16.method767(Class412.aClass412_4308,
				    class96.aClass6_1169, 1977859884);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735
		(3 + Class161.method2628(class341.aString3654, -1411880582),
		 -196245971);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16602(i,
								  1734043747);
	    class525_sub15.aClass525_Sub38_Sub2_10546.method16735(bool ? 1 : 0,
								  -1949492778);
	    class525_sub15.aClass525_Sub38_Sub2_10546
		.method16700(class341.aString3654, 167656348);
	    class96.method1794(class525_sub15, (short) 15672);
	}
    }
    
    static final void method3926(Class683 class683, int i) {
	int i_20_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_20_, -695254952);
	Class184.method3609(class259, class683, 2105550179);
    }
}
