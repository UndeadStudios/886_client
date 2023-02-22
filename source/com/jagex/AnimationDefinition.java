/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class AnimationDefinition implements Interface12
{
    public int[] anIntArray2151;
    int anInt2152;
    public int anInt2153;
    public int replayMode;
    Class10 aClass10_2155;
    public int[] frameDurations;
    public int anInt2157 = 0;
    public AnimationSkin aClass210_2158;
    public int[] frames;
    public int[][] anIntArrayArray2160;
    public int offhand;
    public int priority;
    public boolean tweened;
    public int mainhand;
    public int maxLoops;
    public int animatingPrecedence;
    public int walkingPrecedence;
    public int loopOffset;
    public boolean aBool2169;
    Class206 aClass206_2170;
    public int[] anIntArray2171;
    public int[] anIntArray2172;
    public int[] anIntArray2173;
    public static boolean aBool2174 = false;
    public int anInt2175;
    
    void method3718(RSBuffer class525_sub38, int i, int i_0_) {
	if (1 == i) {
	    int i_1_ = class525_sub38.readUnsignedShort((byte) 92);
		frameDurations = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		frameDurations[i_2_] = class525_sub38.readUnsignedShort((byte) 30);
		frames = new int[i_1_];
	    for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
		frames[i_3_] = class525_sub38.readUnsignedShort((byte) 55);
	    for (int i_4_ = 0; i_4_ < i_1_; i_4_++)
		frames[i_4_] = (class525_sub38.readUnsignedShort((byte) 126)
					<< 16) + frames[i_4_];
	} else if (i == 2)
		loopOffset = class525_sub38.readUnsignedShort((byte) 17) * 1471889067;
	else if (i == 5)
		priority = class525_sub38.readUnsignedByte(1731271389) * 275412631;
	else if (6 == i)
		offhand = class525_sub38.readUnsignedShort((byte) 44) * 219955247;
	else if (i == 7)
		mainhand = class525_sub38.readUnsignedShort((byte) 47) * 1107178429;
	else if (8 == i)
		maxLoops = class525_sub38.readUnsignedByte(2105332226) * -1537345603;
	else if (9 == i)
		animatingPrecedence = class525_sub38.readUnsignedByte(1808736380) * 513988037;
	else if (i == 10)
		walkingPrecedence = class525_sub38.readUnsignedByte(2107183457) * -1313336343;
	else if (i == 11)
		replayMode = class525_sub38.readUnsignedByte(37813992) * -1849278909;
	else if (i == 12 || i == 112) {
	    int i_5_;
	    if (12 == i)
		i_5_ = class525_sub38.readUnsignedByte(1490578772);
	    else
		i_5_ = class525_sub38.readUnsignedShort((byte) 4);
	    anIntArray2171 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		anIntArray2171[i_6_] = class525_sub38.readUnsignedShort((byte) 14);
	    for (int i_7_ = 0; i_7_ < i_5_; i_7_++)
		anIntArray2171[i_7_] = (class525_sub38.readUnsignedShort((byte) 109)
					<< 16) + anIntArray2171[i_7_];
	} else if (13 == i) {
	    int i_8_ = class525_sub38.readUnsignedShort((byte) 93);
	    anIntArrayArray2160 = new int[i_8_][];
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		int i_10_ = class525_sub38.readUnsignedByte(352099844);
		if (i_10_ > 0) {
		    anIntArrayArray2160[i_9_] = new int[i_10_];
		    anIntArrayArray2160[i_9_][0]
			= class525_sub38.method16834(-1994884458);
		    for (int i_11_ = 1; i_11_ < i_10_; i_11_++)
			anIntArrayArray2160[i_9_][i_11_]
			    = class525_sub38.readUnsignedShort((byte) 109);
		}
	    }
	} else if (14 == i)
	    aBool2169 = true;
	else if (15 == i)
		tweened = true;
	else if (i != 16 && i != 18) {
	    if (i == 19 || 119 == i) {
		if (anIntArray2151 == null) {
		    anIntArray2151 = new int[anIntArrayArray2160.length];
		    for (int i_12_ = 0; i_12_ < anIntArrayArray2160.length;
			 i_12_++)
			anIntArray2151[i_12_] = 255;
		}
		int i_13_;
		if (i == 19)
		    i_13_ = class525_sub38.readUnsignedByte(684576145);
		else
		    i_13_ = class525_sub38.readUnsignedShort((byte) 65);
		anIntArray2151[i_13_] = class525_sub38.readUnsignedByte(1734745657);
	    } else if (i == 20 || 120 == i) {
		if (null == anIntArray2172 || null == anIntArray2173) {
		    anIntArray2172 = new int[anIntArrayArray2160.length];
		    anIntArray2173 = new int[anIntArrayArray2160.length];
		    for (int i_14_ = 0; i_14_ < anIntArrayArray2160.length;
			 i_14_++) {
			anIntArray2172[i_14_] = 256;
			anIntArray2173[i_14_] = 256;
		    }
		}
		int i_15_;
		if (i == 20)
		    i_15_ = class525_sub38.readUnsignedByte(711903727);
		else
		    i_15_ = class525_sub38.readUnsignedShort((byte) 16);
		anIntArray2172[i_15_] = class525_sub38.readUnsignedShort((byte) 5);
		anIntArray2173[i_15_] = class525_sub38.readUnsignedShort((byte) 37);
	    } else if (22 == i)
		anInt2175
		    = class525_sub38.readUnsignedByte(1248602322) * -1022542303;
	    else if (i == 23)
		class525_sub38.readUnsignedShort((byte) 20);
	    else if (i == 24) {
		anInt2152 = class525_sub38.readUnsignedShort((byte) 70) * 2121231111;
		if (null != aClass206_2170)
		    aClass210_2158
			= ((AnimationSkin)
			   aClass206_2170.anInterface13_2245
			       .method76(anInt2152 * 2005668535, -1911836536));
	    } else if (249 == i) {
		int i_16_ = class525_sub38.readUnsignedByte(1490667704);
		if (null == aClass10_2155) {
		    int i_17_ = Class212.method3935(i_16_, -2056250364);
		    aClass10_2155 = new Class10(i_17_);
		}
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
		    boolean bool = class525_sub38.readUnsignedByte(580807210) == 1;
		    int i_19_ = class525_sub38.method16834(-1994884458);
		    Class525 class525;
		    if (bool)
			class525
			    = new Class525_Sub19(class525_sub38
						     .readString((byte) -27));
		    else
			class525
			    = new Class525_Sub42(class525_sub38
						     .readInt(2096809219));
		    aClass10_2155.method695(class525, (long) i_19_);
		}
	    }
	}
    }
    
    public boolean method3719() {
	if (null == frames)
	    return true;
	boolean bool = true;
	int[] is = frames;
	for (int i = 0; i < is.length; i++) {
	    int i_20_ = is[i];
	    if (aClass206_2170.getCollection(i_20_ >>> 16, 512751906) == null)
		bool = false;
	}
	return bool;
    }

	AnimationDefinition(int i, Class206 class206) {
	anInt2152 = -2121231111;
	loopOffset = -1471889067;
	priority = 1377063155;
	offhand = -219955247;
	mainhand = -1107178429;
	maxLoops = -1873359337;
	animatingPrecedence = -513988037;
	walkingPrecedence = 1313336343;
	replayMode = 596409478;
	aBool2169 = false;
	tweened = false;
	anInt2175 = 1022542303;
	anInt2153 = i * 2097759349;
	aClass206_2170 = class206;
    }
    
    public int method3721(int i, int i_40_) {
	if (aClass10_2155 == null)
	    return i_40_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_40_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public int method3722(int i, int i_41_, byte i_42_) {
	if (aClass10_2155 == null)
	    return i_41_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_41_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public void method68(RSBuffer class525_sub38) {
	for (;;) {
	    int i = class525_sub38.readUnsignedByte(1438967659);
	    if (i == 0)
		break;
	    method3718(class525_sub38, i, -1201417620);
	}
    }
    
    public void method66(RSBuffer class525_sub38, int i) {
	for (;;) {
	    int i_43_ = class525_sub38.readUnsignedByte(980663559);
	    if (i_43_ == 0)
		break;
	    method3718(class525_sub38, i_43_, -1319607841);
	}
    }
    
    public void method69() {
	if (-1 == animatingPrecedence * -83500787) {
	    if (null != aClass210_2158
		&& null != aClass210_2158.flowControl)
		animatingPrecedence = 1027976074;
	    else
		animatingPrecedence = 0;
	}
	if (-764414887 * walkingPrecedence == -1) {
	    if (null != aClass210_2158
		&& aClass210_2158.flowControl != null)
		walkingPrecedence = 1668294610;
	    else
		walkingPrecedence = 0;
	}
	if (null != frameDurations) {
	    anInt2157 = 0;
	    for (int i = 0; i < frameDurations.length; i++)
		anInt2157 += frameDurations[i] * -346242477;
	}
    }
    
    public void method70() {
	if (-1 == animatingPrecedence * -83500787) {
	    if (null != aClass210_2158
		&& null != aClass210_2158.flowControl)
		animatingPrecedence = 1027976074;
	    else
		animatingPrecedence = 0;
	}
	if (-764414887 * walkingPrecedence == -1) {
	    if (null != aClass210_2158
		&& aClass210_2158.flowControl != null)
		walkingPrecedence = 1668294610;
	    else
		walkingPrecedence = 0;
	}
	if (null != frameDurations) {
	    anInt2157 = 0;
	    for (int i = 0; i < frameDurations.length; i++)
		anInt2157 += frameDurations[i] * -346242477;
	}
    }
    
    public void method67(int i) {
	if (-1 == animatingPrecedence * -83500787) {
	    if (null != aClass210_2158
		&& null != aClass210_2158.flowControl)
		animatingPrecedence = 1027976074;
	    else
		animatingPrecedence = 0;
	}
	if (-764414887 * walkingPrecedence == -1) {
	    if (null != aClass210_2158
		&& aClass210_2158.flowControl != null)
		walkingPrecedence = 1668294610;
	    else
		walkingPrecedence = 0;
	}
	if (null != frameDurations) {
	    anInt2157 = 0;
	    for (int i_44_ = 0; i_44_ < frameDurations.length; i_44_++)
		anInt2157 += frameDurations[i_44_] * -346242477;
	}
    }

	public boolean method3724() {
	if (null == frames)
	    return true;
	boolean bool = true;
	int[] is = frames;
	for (int i = 0; i < is.length; i++) {
	    int i_64_ = is[i];
	    if (aClass206_2170.getCollection(i_64_ >>> 16, 1887745401) == null)
		bool = false;
	}
	return bool;
    }
    
    public boolean method3725(int i) {
	if (null == frames)
	    return true;
	boolean bool = true;
	int[] is = frames;
	for (int i_65_ = 0; i_65_ < is.length; i_65_++) {
	    int i_66_ = is[i_65_];
	    if (aClass206_2170.getCollection(i_66_ >>> 16, 372856903) == null)
		bool = false;
	}
	return bool;
    }
    
    public int method3726(int i, int i_67_) {
	if (aClass10_2155 == null)
	    return i_67_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_67_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public int method3727(int i, int i_68_) {
	if (aClass10_2155 == null)
	    return i_68_;
	Class525_Sub42 class525_sub42
	    = (Class525_Sub42) aClass10_2155.method684((long) i);
	if (class525_sub42 == null)
	    return i_68_;
	return -1344652871 * class525_sub42.anInt10858;
    }
    
    public String method3728(int i, String string, byte i_69_) {
	if (null == aClass10_2155)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2155.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method3729(int i, String string) {
	if (null == aClass10_2155)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2155.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    public String method3730(int i, String string) {
	if (null == aClass10_2155)
	    return string;
	Class525_Sub19 class525_sub19
	    = (Class525_Sub19) aClass10_2155.method684((long) i);
	if (null == class525_sub19)
	    return string;
	return (String) class525_sub19.anObject10571;
    }
    
    static final void method3731(Class683 class683, int i) {
	throw new RuntimeException("");
    }
    
    static final void method3732(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt782 * 473728883;
    }
}
