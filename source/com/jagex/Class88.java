/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class88 implements Interface12, Interface7
{
    public String aString892;
    public int anInt893;
    Class495 aClass495_894;
    public boolean aBool895 = true;
    
    public void method54(int i, byte i_0_) {
	/* empty */
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_1_ = class525_sub38.readUnsignedByte(463293224);
	    if (i_1_ == 0)
		break;
	    method1660(class525_sub38, i_1_, (byte) -121);
	}
    }
    
    void method1660(RSBuffer class525_sub38, int i, byte i_2_) {
	if (1 == i) {
	    char c = (Class656_Sub1_Sub1_Sub1.method18717
		      (class525_sub38.readByte(-1150098071), 1856227166));
	    aClass495_894 = Class495.method8132(c, -1102287297);
	} else if (2 == i)
	    anInt893 = class525_sub38.readInt(1725964181) * 525909807;
	else if (4 == i)
	    aBool895 = false;
	else if (i == 5)
	    aString892 = class525_sub38.readString((byte) -28);
	else if (101 == i)
	    aClass495_894
		= ((Class495)
		   Class539.method8888(Class495.method8143((byte) 1),
				       class525_sub38.readUnsignedSmart((byte) -11),
				       -94956704));
    }
    
    public boolean method1661(int i) {
	return Class495.aClass495_5387 == aClass495_894;
    }
    
    public void method67(int i) {
	/* empty */
    }
    
    void method1662(RSBuffer class525_sub38, int i) {
	if (1 == i) {
	    char c = (Class656_Sub1_Sub1_Sub1.method18717
		      (class525_sub38.readByte(-1150098071), -1775932733));
	    aClass495_894 = Class495.method8132(c, 1926678381);
	} else if (2 == i)
	    anInt893 = class525_sub38.readInt(1282694894) * 525909807;
	else if (4 == i)
	    aBool895 = false;
	else if (i == 5)
	    aString892 = class525_sub38.readString((byte) -95);
	else if (101 == i)
	    aClass495_894
		= ((Class495)
		   Class539.method8888(Class495.method8143((byte) 1),
				       class525_sub38.readUnsignedSmart((byte) -32),
				       1242307650));
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(756850994);
	    if (i == 0)
		break;
	    method1660(class525_sub38, i, (byte) -94);
	}
    }
    
    public void method69() {
	/* empty */
    }
    
    public void method70() {
	/* empty */
    }
    
    public void method53(int i) {
	/* empty */
    }
    
    void method1663(RSBuffer class525_sub38, int i) {
	if (1 == i) {
	    char c = (Class656_Sub1_Sub1_Sub1.method18717
		      (class525_sub38.readByte(-1150098071), 517810038));
	    aClass495_894 = Class495.method8132(c, 1997558578);
	} else if (2 == i)
	    anInt893 = class525_sub38.readInt(1469353405) * 525909807;
	else if (4 == i)
	    aBool895 = false;
	else if (i == 5)
	    aString892 = class525_sub38.readString((byte) -71);
	else if (101 == i)
	    aClass495_894
		= ((Class495)
		   Class539.method8888(Class495.method8143((byte) 1),
				       class525_sub38.readUnsignedSmart((byte) -57),
				       -626710745));
    }
    
    Class88() {
	/* empty */
    }
    
    static void method1664(Class259 class259, Class259 class259_3_, int i) {
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4269,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(class259_3_.anInt2576 * 1534974651, 1873498937);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(class259_3_.anInt2740 * 372293357, 1463988495);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16666(1534974651 * class259.anInt2576, 1442598224);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16602(372293357 * class259.anInt2740, 2093318691);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16674(1984678839 * class259_3_.anInt2588, (byte) 0);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16605(class259.anInt2588 * 1984678839, -1993675505);
	client.aClass96_11085.method1794(class525_sub15, (short) 3764);
    }
    
    public static int method1665(int i, int i_4_, boolean bool, byte i_5_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return 0;
	if (i_4_ == -1)
	    return 0;
	int i_6_ = 0;
	for (int i_7_ = 0; i_7_ < class525_sub10.anIntArray10506.length;
	     i_7_++) {
	    if (class525_sub10.anIntArray10507[i_7_] == i_4_)
		i_6_ += class525_sub10.anIntArray10506[i_7_];
	}
	return i_6_;
    }
    
    static final void method1666(Class683 class683, int i)
	throws Exception_Sub7 {
	class683.anInt8662 -= -1189665054;
	int i_8_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_9_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	Class446 class446
	    = Class446.method7208((float) i_8_, (float) i_8_, (float) i_8_);
	if (class446.aFloat4895 == -1.0F)
	    class446.aFloat4895 = Float.POSITIVE_INFINITY;
	if (-1.0F == class446.aFloat4896)
	    class446.aFloat4896 = Float.POSITIVE_INFINITY;
	if (-1.0F == class446.aFloat4897)
	    class446.aFloat4897 = Float.POSITIVE_INFINITY;
	Class453_Sub3.aClass309_Sub1_10316.method5495(class446, 1629339268);
	Class453_Sub3.aClass309_Sub1_10316.method5553((float) i_9_ / 1000.0F,
						      2146364216);
	class446.method7260();
    }
    
    public static void method1667(int i, int i_10_, byte i_11_) {
	Class525_Sub16_Sub10 class525_sub16_sub10
	    = Class465.method7671(20, (long) i_10_ << 32 | (long) i);
	class525_sub16_sub10.method18350((byte) 2);
    }
}
