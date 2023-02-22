/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class198
{
    public int anInt2188;
    
    boolean method3752(int i) {
	return true;
    }
    
    public abstract void method3753(int i);
    
    public abstract void method3754();
    
    void method3755(short i) {
	/* empty */
    }
    
    public abstract void method3756();
    
    Class198(RSBuffer class525_sub38) {
	anInt2188 = class525_sub38.readUnsignedShort((byte) 2) * -606105165;
    }
    
    public abstract void method3757();
    
    boolean method3758() {
	return true;
    }
    
    boolean method3759() {
	return true;
    }
    
    boolean method3760() {
	return true;
    }
    
    void method3761() {
	/* empty */
    }
    
    void method3762() {
	/* empty */
    }
    
    static Class198 method3763(RSBuffer class525_sub38) {
	int i = class525_sub38.readUnsignedByte(710859424);
	Class84 class84 = Class477.method7787(i, 1384765611);
	Class198 class198 = null;
	switch (1405603987 * class84.anInt884) {
	case 30:
	    class198 = new Class198_Sub5(class525_sub38);
	    break;
	case 0:
	    class198 = new Class198_Sub14(class525_sub38, false);
	    break;
	case 10:
	    class198 = new Class198_Sub23(class525_sub38, 1, 0);
	    break;
	case 17:
	    class198 = new Class198_Sub2(class525_sub38);
	    break;
	case 26:
	    class198 = new Class198_Sub6(class525_sub38);
	    break;
	case 29:
	    class198 = new Class198_Sub16(class525_sub38);
	    break;
	case 12:
	    class198 = new Class198_Sub20(class525_sub38);
	    break;
	case 1:
	    class198 = new Class198_Sub19_Sub2(class525_sub38);
	    break;
	case 7:
	    class198 = new Class198_Sub1(class525_sub38);
	    break;
	case 28:
	    class198 = new Class198_Sub4(class525_sub38);
	    break;
	case 27:
	    class198 = new Class198_Sub9(class525_sub38);
	    break;
	case 14:
	    class198 = new Class198_Sub7(class525_sub38);
	    break;
	case 13:
	    class198 = new Class198_Sub10(class525_sub38);
	    break;
	case 16:
	    class198 = new Class198_Sub12(class525_sub38);
	    break;
	case 4:
	    class198 = new Class198_Sub19_Sub1(class525_sub38);
	    break;
	case 5:
	    class198 = new Class198_Sub13(class525_sub38);
	    break;
	case 2:
	    class198 = new Class198_Sub15(class525_sub38);
	    break;
	case 9:
	    class198 = new Class198_Sub21(class525_sub38);
	    break;
	default:
	    break;
	case 22:
	    class198 = new Class198_Sub11(class525_sub38);
	    break;
	case 25:
	    class198 = new Class198_Sub23(class525_sub38, 0, 0);
	    break;
	case 21:
	    class198 = new Class198_Sub14(class525_sub38, true);
	    break;
	case 8:
	    class198 = new Class198_Sub22(class525_sub38);
	    break;
	case 6:
	    class198 = new Class198_Sub23(class525_sub38, 0, 1);
	    break;
	case 11:
	    class198 = new Class198_Sub3(class525_sub38);
	    break;
	case 15:
	    class198 = new Class198_Sub17(class525_sub38);
	    break;
	case 18:
	    class198 = new Class198_Sub18(class525_sub38);
	    break;
	case 3:
	    class198 = new Class198_Sub8(class525_sub38);
	    break;
	case 19:
	    class198 = new Class198_Sub23(class525_sub38, 1, 1);
	}
	return class198;
    }
    
    static void method3764(int i) {
	Class43.method1068(1887743832);
    }
    
    static int method3765(CharSequence charsequence, int i, boolean bool,
			  int i_0_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_1_ = false;
	boolean bool_2_ = false;
	int i_3_ = 0;
	int i_4_ = charsequence.length();
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
	    int i_6_ = charsequence.charAt(i_5_);
	    if (i_5_ == 0) {
		if (45 == i_6_) {
		    bool_1_ = true;
		    continue;
		}
		if (i_6_ == 43 && bool)
		    continue;
	    }
	    if (i_6_ >= 48 && i_6_ <= 57)
		i_6_ -= 48;
	    else if (i_6_ >= 65 && i_6_ <= 90)
		i_6_ -= 55;
	    else if (i_6_ >= 97 && i_6_ <= 122)
		i_6_ -= 87;
	    else
		throw new NumberFormatException();
	    if (i_6_ >= i)
		throw new NumberFormatException();
	    if (bool_1_)
		i_6_ = -i_6_;
	    int i_7_ = i_6_ + i * i_3_;
	    if (i_7_ / i != i_3_)
		throw new NumberFormatException();
	    i_3_ = i_7_;
	    bool_2_ = true;
	}
	if (!bool_2_)
	    throw new NumberFormatException();
	return i_3_;
    }
    
    static Class390 method3766(RSBuffer class525_sub38, int i) {
	Class395 class395 = (Class96.method1813(-1141226536)
			     [class525_sub38.readUnsignedByte(692307999)]);
	Class396 class396 = (Class643.method10595((byte) 71)
			     [class525_sub38.readUnsignedByte(1461027772)]);
	int i_8_ = class525_sub38.readSmart((byte) -51);
	int i_9_ = class525_sub38.readSmart((byte) 9);
	int i_10_ = class525_sub38.readUnsignedShort((byte) 24);
	int i_11_ = class525_sub38.readUnsignedShort((byte) 82);
	int i_12_ = class525_sub38.readSmart((byte) 56);
	int i_13_ = class525_sub38.readBigSmart(-2043778683);
	int i_14_ = class525_sub38.readInt(1299960307);
	return new Class390(class395, class396, i_8_, i_9_, i_10_, i_11_,
			    i_12_, i_13_, i_14_);
    }
    
    static final boolean method3767(Class40_Sub11 class40_sub11, int i,
				    int i_15_, byte i_16_) {
	ObjectDefinitions class602 = (ObjectDefinitions) class40_sub11.method76(i, -1960245481);
	if (i_15_ == 11)
	    i_15_ = 10;
	if (i_15_ >= 5 && i_15_ <= 8)
	    i_15_ = 4;
	return class602.method9905(i_15_, -208849855);
    }
    
    static final void method3768(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
}
