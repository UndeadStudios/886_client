/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ModelDecoder
{
    public int[] vertexBones;
    public int vertexCount;
    static final int anInt2085 = 1;
    public int version = 12;
    public int maxVertexUsed;
    public Class171[] aClass171Array2088;
    public int[] vertexX;
    public int[] vertexY;
    public byte[] aByteArray2091;
    public byte[] aByteArray2092;
    public MagnetConfig[] aClass154Array2093;
    public short[] aShortArray2094;
    int textureUVCoordCount;
    public float[] aFloatArray2096;
    public float[] aFloatArray2097;
    public int faceCount;
    public byte[] faceAlpha;
    public short[] faceB;
    public short[] faceC;
    public byte[] aByteArray2102;
    public int[] anIntArray2103;
    public byte[] aByteArray2104;
    static final int anInt2105 = 26;
    public byte[] facePriorities;
    public byte[] faceRenderTypes;
    public int[] vertexZ;
    public short[] aShortArray2109;
    public short[] aShortArray2110;
    public short[] faceA;
    byte priority;
    public short[] aShortArray2113;
    public int[] anIntArray2114;
    public static final short aShort2115 = 32766;
    int texturedFaceCount;
    public byte[] textureRenderTypes;
    public short[] aShortArray2118;
    public short[] aShortArray2119;
    public short[] aShortArray2120;
    public int[] anIntArray2121;
    public short[] aShortArray2122;
    public int[] anIntArray2123;
    public int[] anIntArray2124;
    public int[] anIntArray2125;
    public int[] faceBones;
    byte[] aByteArray2127;
    public static final short aShort2128 = -1;
    public Class184[] aClass184Array2129;
    public int[] anIntArray2130;
    static final int anInt2131 = 3;
    
    public int method3619(int i, int i_0_, int i_1_, byte i_2_, byte i_3_,
			  short i_4_, byte i_5_, short i_6_) {
	faceA[faceCount] = (short) i;
	faceB[faceCount] = (short) i_0_;
	faceC[faceCount] = (short) i_1_;
	faceRenderTypes[faceCount] = i_2_;
	aShortArray2122[faceCount] = (short) i_3_;
	aShortArray2109[faceCount] = i_4_;
	faceAlpha[faceCount] = i_5_;
	aShortArray2110[faceCount] = i_6_;
	return faceCount++;
    }
    
    void method3620(RSBuffer class525_sub38,
					RSBuffer class525_sub38_7_,
					RSBuffer class525_sub38_8_) {
	short i = 0;
	short i_9_ = 0;
	short i_10_ = 0;
	int i_11_ = 0;
	for (int i_12_ = 0; i_12_ < faceCount; i_12_++) {
	    int i_13_ = class525_sub38_7_.readUnsignedByte(1428735722);
	    int i_14_ = i_13_ & 0x7;
	    if (i_14_ == 1) {
		faceA[i_12_] = i
		    = (short) (class525_sub38.readSmart3(993241788) + i_11_);
		i_11_ = i;
		faceB[i_12_] = i_9_
		    = (short) (class525_sub38.readSmart3(993241788) + i_11_);
		i_11_ = i_9_;
		faceC[i_12_] = i_10_
		    = (short) (class525_sub38.readSmart3(993241788) + i_11_);
		i_11_ = i_10_;
		if (i > maxVertexUsed)
		    maxVertexUsed = i;
		if (i_9_ > maxVertexUsed)
		    maxVertexUsed = i_9_;
		if (i_10_ > maxVertexUsed)
		    maxVertexUsed = i_10_;
	    }
	    if (i_14_ == 2) {
		i_9_ = i_10_;
		i_10_
		    = (short) (class525_sub38.readSmart3(993241788) + i_11_);
		i_11_ = i_10_;
		faceA[i_12_] = i;
		faceB[i_12_] = i_9_;
		faceC[i_12_] = i_10_;
		if (i_10_ > maxVertexUsed)
		    maxVertexUsed = i_10_;
	    }
	    if (i_14_ == 3) {
		i = i_10_;
		i_10_
		    = (short) (class525_sub38.readSmart3(993241788) + i_11_);
		i_11_ = i_10_;
		faceA[i_12_] = i;
		faceB[i_12_] = i_9_;
		faceC[i_12_] = i_10_;
		if (i_10_ > maxVertexUsed)
		    maxVertexUsed = i_10_;
	    }
	    if (i_14_ == 4) {
		short i_15_ = i;
		i = i_9_;
		i_9_ = i_15_;
		i_10_
		    = (short) (class525_sub38.readSmart3(993241788) + i_11_);
		i_11_ = i_10_;
		faceA[i_12_] = i;
		faceB[i_12_] = i_9_;
		faceC[i_12_] = i_10_;
		if (i_10_ > maxVertexUsed)
		    maxVertexUsed = i_10_;
	    }
	    if (textureUVCoordCount > 0 && (i_13_ & 0x8) != 0) {
		aByteArray2102[i_12_]
		    = (byte) class525_sub38_8_.readUnsignedByte(666199228);
		aByteArray2092[i_12_]
		    = (byte) class525_sub38_8_.readUnsignedByte(290029715);
		aByteArray2104[i_12_]
		    = (byte) class525_sub38_8_.readUnsignedByte(1540023704);
	    }
	}
	maxVertexUsed++;
    }
    
    public ModelDecoder(int i, int i_16_, int i_17_) {
	vertexCount = 0;
	maxVertexUsed = 0;
	faceCount = 0;
	priority = (byte) 0;
	texturedFaceCount = 0;
	vertexX = new int[i];
	vertexY = new int[i];
	vertexZ = new int[i];
	vertexBones = new int[i];
	faceA = new short[i_16_];
	faceB = new short[i_16_];
	faceC = new short[i_16_];
	faceRenderTypes = new byte[i_16_];
	facePriorities = new byte[i_16_];
	faceAlpha = new byte[i_16_];
	aShortArray2122 = new short[i_16_];
	aShortArray2109 = new short[i_16_];
	aShortArray2110 = new short[i_16_];
	faceBones = new int[i_16_];
	if (i_17_ > 0) {
	    textureRenderTypes = new byte[i_17_];
	    aShortArray2118 = new short[i_17_];
	    aShortArray2119 = new short[i_17_];
	    aShortArray2120 = new short[i_17_];
	    anIntArray2121 = new int[i_17_];
	    anIntArray2114 = new int[i_17_];
	    anIntArray2123 = new int[i_17_];
	    aByteArray2127 = new byte[i_17_];
	    aByteArray2091 = new byte[i_17_];
	    anIntArray2124 = new int[i_17_];
	    anIntArray2125 = new int[i_17_];
	    anIntArray2130 = new int[i_17_];
	}
    }
    
    public int method3621(int i, int i_18_, int i_19_, byte i_20_, byte i_21_,
			  short i_22_, byte i_23_, short i_24_) {
	faceA[faceCount] = (short) i;
	faceB[faceCount] = (short) i_18_;
	faceC[faceCount] = (short) i_19_;
	faceRenderTypes[faceCount] = i_20_;
	aShortArray2122[faceCount] = (short) i_21_;
	aShortArray2109[faceCount] = i_22_;
	faceAlpha[faceCount] = i_23_;
	aShortArray2110[faceCount] = i_24_;
	return faceCount++;
    }
    
    final int method3622(ModelDecoder class186_25_, int i, short i_26_) {
	int i_27_ = class186_25_.vertexX[i];
	int i_28_ = class186_25_.vertexY[i];
	int i_29_ = class186_25_.vertexZ[i];
	for (int i_30_ = 0; i_30_ < vertexCount; i_30_++) {
	    if (i_27_ == vertexX[i_30_]
		&& i_28_ == vertexY[i_30_]
		&& i_29_ == vertexZ[i_30_]) {
		aShortArray2094[i_30_] |= i_26_;
		return i_30_;
	    }
	}
	vertexX[vertexCount] = i_27_;
	vertexY[vertexCount] = i_28_;
	vertexZ[vertexCount] = i_29_;
	aShortArray2094[vertexCount] = i_26_;
	vertexBones[vertexCount] = (class186_25_.vertexBones != null
				     ? class186_25_.vertexBones[i] : -1);
	return vertexCount++;
    }
    
    public void method3623(short i, short i_31_) {
	if (aShortArray2110 != null) {
	    for (int i_32_ = 0; i_32_ < faceCount; i_32_++) {
		if (aShortArray2110[i_32_] == i)
		    aShortArray2110[i_32_] = i_31_;
	    }
	}
    }
    
    void method3624
	(RSBuffer class525_sub38, RSBuffer class525_sub38_33_,
	 RSBuffer class525_sub38_34_, RSBuffer class525_sub38_35_,
	 RSBuffer class525_sub38_36_,
	 RSBuffer class525_sub38_37_) {
	for (int i = 0; i < texturedFaceCount; i++) {
	    int i_38_ = textureRenderTypes[i] & 0xff;
	    if (i_38_ == 0) {
		aShortArray2118[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 73);
		aShortArray2119[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 15);
		aShortArray2120[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 24);
	    }
	    if (i_38_ == 1) {
		aShortArray2118[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 79);
		aShortArray2119[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 23);
		aShortArray2120[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 100);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_34_.readUnsignedShort((byte) 61);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_34_.readUnsignedShort((byte) 5);
		    else
			anIntArray2114[i]
			    = class525_sub38_34_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_34_.readUnsignedShort((byte) 37);
		} else {
		    anIntArray2121[i]
			= class525_sub38_34_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_34_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_34_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_35_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_36_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_37_.readByte(-1150098071);
	    }
	    if (i_38_ == 2) {
		aShortArray2118[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 74);
		aShortArray2119[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 66);
		aShortArray2120[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 89);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_34_.readUnsignedShort((byte) 95);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_34_.readUnsignedShort((byte) 102);
		    else
			anIntArray2114[i]
			    = class525_sub38_34_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_34_.readUnsignedShort((byte) 49);
		} else {
		    anIntArray2121[i]
			= class525_sub38_34_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_34_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_34_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_35_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_36_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_37_.readByte(-1150098071);
		anIntArray2125[i]
		    = class525_sub38_37_.readByte(-1150098071);
		anIntArray2130[i]
		    = class525_sub38_37_.readByte(-1150098071);
	    }
	    if (i_38_ == 3) {
		aShortArray2118[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 34);
		aShortArray2119[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 127);
		aShortArray2120[i]
		    = (short) class525_sub38_33_.readUnsignedShort((byte) 122);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_34_.readUnsignedShort((byte) 118);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_34_.readUnsignedShort((byte) 70);
		    else
			anIntArray2114[i]
			    = class525_sub38_34_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_34_.readUnsignedShort((byte) 113);
		} else {
		    anIntArray2121[i]
			= class525_sub38_34_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_34_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_34_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_35_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_36_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_37_.readByte(-1150098071);
	    }
	}
    }
    
    public int method3625(int i, int i_39_, int i_40_) {
	for (int i_41_ = 0; i_41_ < vertexCount; i_41_++) {
	    if (vertexX[i_41_] == i && vertexY[i_41_] == i_39_
		&& vertexZ[i_41_] == i_40_)
		return i_41_;
	}
	vertexX[vertexCount] = i;
	vertexY[vertexCount] = i_39_;
	vertexZ[vertexCount] = i_40_;
	maxVertexUsed = vertexCount + 1;
	return vertexCount++;
    }
    
    public int method3626(int i, int i_42_, int i_43_, byte i_44_, byte i_45_,
			  short i_46_, byte i_47_, short i_48_) {
	faceA[faceCount] = (short) i;
	faceB[faceCount] = (short) i_42_;
	faceC[faceCount] = (short) i_43_;
	faceRenderTypes[faceCount] = i_44_;
	aShortArray2122[faceCount] = (short) i_45_;
	aShortArray2109[faceCount] = i_46_;
	faceAlpha[faceCount] = i_47_;
	aShortArray2110[faceCount] = i_48_;
	return faceCount++;
    }
    
    public byte method3627(short i, short i_49_, short i_50_) {
	if (texturedFaceCount >= 255)
	    throw new IllegalStateException();
	textureRenderTypes[texturedFaceCount] = (byte) 0;
	aShortArray2118[texturedFaceCount] = i;
	aShortArray2119[texturedFaceCount] = i_49_;
	aShortArray2120[texturedFaceCount] = i_50_;
	return (byte) texturedFaceCount++;
    }
    
    public byte method3628(short i, short i_51_, short i_52_, short i_53_,
			   short i_54_, short i_55_, byte i_56_, byte i_57_,
			   byte i_58_) {
	if (texturedFaceCount >= 255)
	    throw new IllegalStateException();
	textureRenderTypes[texturedFaceCount] = (byte) 3;
	aShortArray2118[texturedFaceCount] = i;
	aShortArray2119[texturedFaceCount] = i_51_;
	aShortArray2120[texturedFaceCount] = i_52_;
	anIntArray2121[texturedFaceCount] = i_53_;
	anIntArray2114[texturedFaceCount] = i_54_;
	anIntArray2123[texturedFaceCount] = i_55_;
	aByteArray2127[texturedFaceCount] = i_56_;
	aByteArray2091[texturedFaceCount] = i_57_;
	anIntArray2124[texturedFaceCount] = i_58_;
	return (byte) texturedFaceCount++;
    }
    
    public ModelDecoder(byte[] is) {
    	vertexCount = 0;
	maxVertexUsed = 0;
	faceCount = 0;
	priority = (byte) 0;
	texturedFaceCount = 0;
	RSBuffer class525_sub38 = new RSBuffer(is);
	RSBuffer class525_sub38_59_ = new RSBuffer(is);
	RSBuffer class525_sub38_60_ = new RSBuffer(is);
	RSBuffer class525_sub38_61_ = new RSBuffer(is);
	RSBuffer class525_sub38_62_ = new RSBuffer(is);
	RSBuffer class525_sub38_63_ = new RSBuffer(is);
	RSBuffer class525_sub38_64_ = new RSBuffer(is);
	int i = class525_sub38.readUnsignedByte(1088145695);
	if (i != 1)
	    System.out
		.println(new StringBuilder().append("").append(i).toString());
	else {
	    class525_sub38.readUnsignedByte(106166660);
	    version = class525_sub38.readUnsignedByte(1992046182);
	    class525_sub38.index = (is.length - 26) * 339428471;
	    vertexCount = class525_sub38.readUnsignedShort((byte) 7);
	    faceCount = class525_sub38.readUnsignedShort((byte) 97);
	    texturedFaceCount = class525_sub38.readUnsignedShort((byte) 21);
	    int i_65_ = class525_sub38.readUnsignedByte(61497356);
	    boolean hasFaceRenderTypes = (i_65_ & 0x1) == 1;
	    boolean bool_66_ = (i_65_ & 0x2) == 2;
	    boolean bool_67_ = (i_65_ & 0x4) == 4;
	    boolean bool_68_ = (i_65_ & 0x10) == 16;
	    boolean bool_69_ = (i_65_ & 0x20) == 32;
	    boolean bool_70_ = (i_65_ & 0x40) == 64;
	    boolean bool_71_ = (i_65_ & 0x80) == 128;
	    int modelPriority = class525_sub38.readUnsignedByte(474896755);
	    int hasFaceAlpha = class525_sub38.readUnsignedByte(318561625);
	    int hasFaceBones = class525_sub38.readUnsignedByte(870224844);
	    int i_75_ = class525_sub38.readUnsignedByte(1067041912);
	    int hasVertexBones = class525_sub38.readUnsignedByte(724462811);
	    int i_77_ = class525_sub38.readUnsignedShort((byte) 2);
	    int i_78_ = class525_sub38.readUnsignedShort((byte) 127);
	    int i_79_ = class525_sub38.readUnsignedShort((byte) 7);
	    int i_80_ = class525_sub38.readUnsignedShort((byte) 57);
	    int i_81_ = class525_sub38.readUnsignedShort((byte) 49);
	    int i_82_ = class525_sub38.readUnsignedShort((byte) 81);
	    int i_83_ = class525_sub38.readUnsignedShort((byte) 63);
	    if (!bool_68_) {
		if (hasVertexBones == 1)
		    i_82_ = vertexCount;
		else
		    i_82_ = 0;
	    }
	    if (!bool_69_) {
		if (hasFaceBones == 1)
		    i_83_ = faceCount;
		else
		    i_83_ = 0;
	    }
	    int i_84_ = 0;
	    int i_85_ = 0;
	    int i_86_ = 0;
	    if (texturedFaceCount > 0) {
		textureRenderTypes = new byte[texturedFaceCount];
		class525_sub38.index = 1018285413;
		for (int i_87_ = 0; i_87_ < texturedFaceCount; i_87_++) {
		    byte i_88_ = (textureRenderTypes[i_87_]
				  = class525_sub38.readByte(-1150098071));
		    if (i_88_ == 0)
			i_84_++;
		    if (i_88_ >= 1 && i_88_ <= 3)
			i_85_++;
		    if (i_88_ == 2)
			i_86_++;
		}
	    }
	    int i_89_ = 3 + texturedFaceCount;
	    int i_90_ = i_89_;
	    i_89_ += vertexCount;
	    int i_91_ = i_89_;
	    if (hasFaceRenderTypes)
		i_89_ += faceCount;
	    int i_92_ = i_89_;
	    i_89_ += faceCount;
	    int i_93_ = i_89_;
	    if (modelPriority == 255)
		i_89_ += faceCount;
	    int i_94_ = i_89_;
	    i_89_ += i_83_;
	    int i_95_ = i_89_;
	    i_89_ += i_82_;
	    int i_96_ = i_89_;
	    if (hasFaceAlpha == 1)
		i_89_ += faceCount;
	    int i_97_ = i_89_;
	    i_89_ += i_80_;
	    int i_98_ = i_89_;
	    if (i_75_ == 1)
		i_89_ += faceCount * 2;
	    int i_99_ = i_89_;
	    i_89_ += i_81_;
	    int i_100_ = i_89_;
	    i_89_ += faceCount * 2;
	    int i_101_ = i_89_;
	    i_89_ += i_77_;
	    int i_102_ = i_89_;
	    i_89_ += i_78_;
	    int i_103_ = i_89_;
	    i_89_ += i_79_;
	    int i_104_ = i_89_;
	    i_89_ += i_84_ * 6;
	    int i_105_ = i_89_;
	    i_89_ += i_85_ * 6;
	    int i_106_ = 6;
	    if (version == 14)
		i_106_ = 7;
	    else if (version >= 15)
		i_106_ = 9;
	    int i_107_ = i_89_;
	    i_89_ += i_85_ * i_106_;
	    int i_108_ = i_89_;
	    i_89_ += i_85_;
	    int i_109_ = i_89_;
	    i_89_ += i_85_;
	    int i_110_ = i_89_;
	    i_89_ += i_85_ + i_86_ * 2;
	    int i_111_ = i_89_;
	    int i_112_ = is.length;
	    int i_113_ = is.length;
	    int i_114_ = is.length;
	    int i_115_ = is.length;
	    if (bool_71_) {
		RSBuffer class525_sub38_116_ = new RSBuffer(is);
		class525_sub38_116_.index = (is.length - 26) * 339428471;
		class525_sub38_116_.index
		    -= (is[class525_sub38_116_.index * -1133521593 - 1]
			* 339428471);
		textureUVCoordCount = class525_sub38_116_.readUnsignedShort((byte) 61);
		int i_117_ = class525_sub38_116_.readUnsignedShort((byte) 59);
		int i_118_ = class525_sub38_116_.readUnsignedShort((byte) 81);
		i_112_ = i_111_ + i_117_;
		i_113_ = i_112_ + i_118_;
		i_114_ = i_113_ + vertexCount;
		i_115_ = i_114_ + textureUVCoordCount * 2;
	    }
		vertexX = new int[vertexCount];
		vertexY = new int[vertexCount];
		vertexZ = new int[vertexCount];
		faceA = new short[faceCount];
		faceB = new short[faceCount];
		faceC = new short[faceCount];
	    if (hasVertexBones == 1)
		vertexBones = new int[vertexCount];
	    if (hasFaceRenderTypes)
		faceRenderTypes = new byte[faceCount];
	    if (modelPriority == 255)
		facePriorities = new byte[faceCount];
	    else
		priority = (byte) modelPriority;
	    if (hasFaceAlpha == 1)
		faceAlpha = new byte[faceCount];
	    if (hasFaceBones == 1)
		faceBones = new int[faceCount];
	    if (i_75_ == 1)
		aShortArray2110 = new short[faceCount];
	    if (i_75_ == 1 && (texturedFaceCount > 0 || textureUVCoordCount > 0))
		aShortArray2122 = new short[faceCount];
	    aShortArray2109 = new short[faceCount];
	    if (texturedFaceCount > 0) {
		aShortArray2118 = new short[texturedFaceCount];
		aShortArray2119 = new short[texturedFaceCount];
		aShortArray2120 = new short[texturedFaceCount];
		if (i_85_ > 0) {
		    anIntArray2121 = new int[i_85_];
		    anIntArray2114 = new int[i_85_];
		    anIntArray2123 = new int[i_85_];
		    aByteArray2127 = new byte[i_85_];
		    aByteArray2091 = new byte[i_85_];
		    anIntArray2124 = new int[i_85_];
		}
		if (i_86_ > 0) {
		    anIntArray2125 = new int[i_86_];
		    anIntArray2130 = new int[i_86_];
		}
	    }
	    class525_sub38.index = i_90_ * 339428471;
	    class525_sub38_59_.index = i_101_ * 339428471;
	    class525_sub38_60_.index = i_102_ * 339428471;
	    class525_sub38_61_.index = i_103_ * 339428471;
	    class525_sub38_62_.index = i_95_ * 339428471;
	    int i_119_ = 0;
	    int i_120_ = 0;
	    int i_121_ = 0;
	    for (int i_122_ = 0; i_122_ < vertexCount; i_122_++) {
		int i_123_ = class525_sub38.readUnsignedByte(1146027134);
		int i_124_ = 0;
		if ((i_123_ & 0x1) != 0)
		    i_124_ = class525_sub38_59_.readSmart3(993241788);
		int i_125_ = 0;
		if ((i_123_ & 0x2) != 0)
		    i_125_ = class525_sub38_60_.readSmart3(993241788);
		int i_126_ = 0;
		if ((i_123_ & 0x4) != 0)
		    i_126_ = class525_sub38_61_.readSmart3(993241788);
		vertexX[i_122_] = i_119_ + i_124_;
		vertexY[i_122_] = i_120_ + i_125_;
		vertexZ[i_122_] = i_121_ + i_126_;
		i_119_ = vertexX[i_122_];
		i_120_ = vertexY[i_122_];
		i_121_ = vertexZ[i_122_];
		if (hasVertexBones == 1) {
		    if (bool_68_)
			vertexBones[i_122_]
			    = class525_sub38_62_.readSmart2(894165069);
		    else {
			vertexBones[i_122_]
			    = class525_sub38_62_.readUnsignedByte(1021087686);
			if (vertexBones[i_122_] == 255)
			    vertexBones[i_122_] = -1;
		    }
		}
	    }
	    if (textureUVCoordCount > 0) {
		class525_sub38.index = i_113_ * 339428471;
		class525_sub38_59_.index = i_114_ * 339428471;
		class525_sub38_60_.index = i_115_ * 339428471;
		anIntArray2103 = new int[vertexCount];
		int i_127_ = 0;
		int i_128_ = 0;
		for (/**/; i_127_ < vertexCount; i_127_++) {
		    anIntArray2103[i_127_] = i_128_;
		    i_128_ += class525_sub38.readUnsignedByte(758720023);
		}
		aByteArray2102 = new byte[faceCount];
		aByteArray2092 = new byte[faceCount];
		aByteArray2104 = new byte[faceCount];
		aFloatArray2096 = new float[textureUVCoordCount];
		aFloatArray2097 = new float[textureUVCoordCount];
		for (i_127_ = 0; i_127_ < textureUVCoordCount; i_127_++) {
		    aFloatArray2096[i_127_]
			= ((float) class525_sub38_59_.readSmart((byte) 33)
			   / 4096.0F);
		    aFloatArray2097[i_127_]
			= ((float) class525_sub38_60_.readSmart((byte) -30)
			   / 4096.0F);
		}
	    }
	    class525_sub38.index = i_100_ * 339428471;
	    class525_sub38_59_.index = i_91_ * 339428471;
	    class525_sub38_60_.index = i_93_ * 339428471;
	    class525_sub38_61_.index = i_96_ * 339428471;
	    class525_sub38_62_.index = i_94_ * 339428471;
	    class525_sub38_63_.index = i_98_ * 339428471;
	    class525_sub38_64_.index = i_99_ * 339428471;
	    for (int i_129_ = 0; i_129_ < faceCount; i_129_++) {
		aShortArray2109[i_129_]
		    = (short) class525_sub38.readUnsignedShort((byte) 80);
		if (hasFaceRenderTypes)
		    faceRenderTypes[i_129_]
			= class525_sub38_59_.readByte(-1150098071);
		if (modelPriority == 255)
		    facePriorities[i_129_]
			= class525_sub38_60_.readByte(-1150098071);
		if (hasFaceAlpha == 1)
		    faceAlpha[i_129_]
			= class525_sub38_61_.readByte(-1150098071);
		if (hasFaceBones == 1) {
		    if (bool_69_)
			faceBones[i_129_]
			    = class525_sub38_62_.readSmart2(-1621259551);
		    else {
			faceBones[i_129_]
			    = class525_sub38_62_.readUnsignedByte(309982520);
			if (faceBones[i_129_] == 255)
			    faceBones[i_129_] = -1;
		    }
		}
		if (i_75_ == 1)
		    aShortArray2110[i_129_]
			= (short) (class525_sub38_63_.readUnsignedShort((byte) 29)
				   - 1);
		if (aShortArray2122 != null) {
		    if (aShortArray2110[i_129_] != -1) {
			if (version >= 16)
			    aShortArray2122[i_129_]
				= (short) (class525_sub38_64_
					       .readUnsignedSmart((byte) -97)
					   - 1);
			else
			    aShortArray2122[i_129_]
				= (short) (class525_sub38_64_
					       .readUnsignedByte(2022369849)
					   - 1);
		    } else
			aShortArray2122[i_129_] = (short) -1;
		}
	    }
	    maxVertexUsed = -1;
	    class525_sub38.index = i_97_ * 339428471;
	    class525_sub38_59_.index = i_92_ * 339428471;
	    class525_sub38_60_.index = i_112_ * 339428471;
	    method3620(class525_sub38, class525_sub38_59_, class525_sub38_60_);
	    class525_sub38.index = i_104_ * 339428471;
	    class525_sub38_59_.index = i_105_ * 339428471;
	    class525_sub38_60_.index = i_107_ * 339428471;
	    class525_sub38_61_.index = i_108_ * 339428471;
	    class525_sub38_62_.index = i_109_ * 339428471;
	    class525_sub38_63_.index = i_110_ * 339428471;
	    method3624(class525_sub38, class525_sub38_59_, class525_sub38_60_,
		       class525_sub38_61_, class525_sub38_62_,
		       class525_sub38_63_);
	    class525_sub38.index = i_111_ * 339428471;
	    if (bool_66_) {
		int i_130_ = class525_sub38.readUnsignedByte(217891652);
		if (i_130_ > 0) {
		    aClass184Array2129 = new Class184[i_130_];
		    for (int i_131_ = 0; i_131_ < i_130_; i_131_++) {
			int i_132_ = class525_sub38.readUnsignedShort((byte) 60);
			int i_133_ = class525_sub38.readUnsignedShort((byte) 74);
			byte i_134_;
			if (modelPriority == 255)
			    i_134_ = facePriorities[i_133_];
			else
			    i_134_ = (byte) modelPriority;
			aClass184Array2129[i_131_]
			    = new Class184(i_132_, i_133_,
					   faceA[i_133_],
					   faceB[i_133_],
					   faceC[i_133_], i_134_);
		    }
		}
		int i_135_ = class525_sub38.readUnsignedByte(770170466);
		if (i_135_ > 0) {
		    aClass154Array2093 = new MagnetConfig[i_135_];
		    for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
			int i_137_ = class525_sub38.readUnsignedShort((byte) 69);
			int i_138_ = class525_sub38.readUnsignedShort((byte) 93);
			aClass154Array2093[i_136_]
			    = new MagnetConfig(i_137_, i_138_);
		    }
		}
	    }
	    if (bool_67_) {
		int i_139_ = class525_sub38.readUnsignedByte(1524698822);
		if (i_139_ > 0) {
		    aClass171Array2088 = new Class171[i_139_];
		    for (int i_140_ = 0; i_140_ < i_139_; i_140_++) {
			int i_141_ = class525_sub38.readUnsignedShort((byte) 120);
			int i_142_ = class525_sub38.readUnsignedShort((byte) 48);
			int i_143_;
			if (bool_70_)
			    i_143_ = class525_sub38.readSmart2(-1942832527);
			else {
			    i_143_ = class525_sub38.readUnsignedByte(1003603903);
			    if (i_143_ == 255)
				i_143_ = -1;
			}
			byte i_144_ = class525_sub38.readByte(-1150098071);
			aClass171Array2088[i_140_]
			    = new Class171(i_141_, i_142_, i_143_, i_144_);
		    }
		}
	    }
	}
    }
    
    public int[][] method3629() {
	int[] is = new int[256];
	int i = 0;
	for (int i_145_ = 0; i_145_ < faceCount; i_145_++) {
	    int i_146_ = faceBones[i_145_];
	    if (i_146_ >= 0) {
		is[i_146_]++;
		if (i_146_ > i)
		    i = i_146_;
	    }
	}
	int[][] is_147_ = new int[i + 1][];
	for (int i_148_ = 0; i_148_ <= i; i_148_++) {
	    is_147_[i_148_] = new int[is[i_148_]];
	    is[i_148_] = 0;
	}
	for (int i_149_ = 0; i_149_ < faceCount; i_149_++) {
	    int i_150_ = faceBones[i_149_];
	    if (i_150_ >= 0)
		is_147_[i_150_][is[i_150_]++] = i_149_;
	}
	return is_147_;
    }
    
    public int[][] method3630() {
	int[] is = new int[256];
	int i = 0;
	for (int i_151_ = 0; i_151_ < aClass171Array2088.length; i_151_++) {
	    int i_152_ = aClass171Array2088[i_151_].anInt1857 * -821245807;
	    if (i_152_ >= 0) {
		is[i_152_]++;
		if (i_152_ > i)
		    i = i_152_;
	    }
	}
	int[][] is_153_ = new int[i + 1][];
	for (int i_154_ = 0; i_154_ <= i; i_154_++) {
	    is_153_[i_154_] = new int[is[i_154_]];
	    is[i_154_] = 0;
	}
	for (int i_155_ = 0; i_155_ < aClass171Array2088.length; i_155_++) {
	    int i_156_ = aClass171Array2088[i_155_].anInt1857 * -821245807;
	    if (i_156_ >= 0)
		is_153_[i_156_][is[i_156_]++] = i_155_;
	}
	return is_153_;
    }
    
    public void method3631(short i, short i_157_) {
	for (int i_158_ = 0; i_158_ < faceCount; i_158_++) {
	    if (aShortArray2109[i_158_] == i)
		aShortArray2109[i_158_] = i_157_;
	}
    }
    
    public void method3632(short i, short i_159_) {
	if (aShortArray2110 != null) {
	    for (int i_160_ = 0; i_160_ < faceCount; i_160_++) {
		if (aShortArray2110[i_160_] == i)
		    aShortArray2110[i_160_] = i_159_;
	    }
	}
    }
    
    public void method3633(int i, int i_161_, int i_162_) {
	for (int i_163_ = 0; i_163_ < vertexCount; i_163_++) {
	    vertexX[i_163_] += i;
	    vertexY[i_163_] += i_161_;
	    vertexZ[i_163_] += i_162_;
	}
    }
    
    void method3634(RSBuffer class525_sub38,
					RSBuffer class525_sub38_164_,
					RSBuffer class525_sub38_165_,
					RSBuffer class525_sub38_166_,
					RSBuffer class525_sub38_167_,
					RSBuffer class525_sub38_168_) {
	for (int i = 0; i < texturedFaceCount; i++) {
	    int i_169_ = textureRenderTypes[i] & 0xff;
	    if (i_169_ == 0) {
		aShortArray2118[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 13);
		aShortArray2119[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 123);
		aShortArray2120[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 111);
	    }
	    if (i_169_ == 1) {
		aShortArray2118[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 119);
		aShortArray2119[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 117);
		aShortArray2120[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 84);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_165_.readUnsignedShort((byte) 86);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_165_.readUnsignedShort((byte) 62);
		    else
			anIntArray2114[i]
			    = class525_sub38_165_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_165_.readUnsignedShort((byte) 36);
		} else {
		    anIntArray2121[i]
			= class525_sub38_165_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_165_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_165_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_166_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_167_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_168_.readByte(-1150098071);
	    }
	    if (i_169_ == 2) {
		aShortArray2118[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 82);
		aShortArray2119[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 54);
		aShortArray2120[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 116);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_165_.readUnsignedShort((byte) 114);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_165_.readUnsignedShort((byte) 23);
		    else
			anIntArray2114[i]
			    = class525_sub38_165_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_165_.readUnsignedShort((byte) 34);
		} else {
		    anIntArray2121[i]
			= class525_sub38_165_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_165_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_165_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_166_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_167_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_168_.readByte(-1150098071);
		anIntArray2125[i]
		    = class525_sub38_168_.readByte(-1150098071);
		anIntArray2130[i]
		    = class525_sub38_168_.readByte(-1150098071);
	    }
	    if (i_169_ == 3) {
		aShortArray2118[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 85);
		aShortArray2119[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 1);
		aShortArray2120[i]
		    = (short) class525_sub38_164_.readUnsignedShort((byte) 5);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_165_.readUnsignedShort((byte) 6);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_165_.readUnsignedShort((byte) 18);
		    else
			anIntArray2114[i]
			    = class525_sub38_165_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_165_.readUnsignedShort((byte) 127);
		} else {
		    anIntArray2121[i]
			= class525_sub38_165_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_165_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_165_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_166_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_167_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_168_.readByte(-1150098071);
	    }
	}
    }
    
    public void method3635(float f) {
	for (int i = 0; i < vertexCount; i++) {
	    vertexX[i] *= f;
	    vertexY[i] *= f;
	    vertexZ[i] *= f;
	}
	if (texturedFaceCount > 0 && anIntArray2121 != null) {
	    for (int i = 0; i < anIntArray2121.length; i++) {
		anIntArray2121[i] *= f;
		anIntArray2114[i] *= f;
		if (textureRenderTypes[i] != 1)
		    anIntArray2123[i] *= f;
	    }
	}
    }
    
    public int[][] method3636(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_170_ = bool ? vertexCount : maxVertexUsed;
	for (int i_171_ = 0; i_171_ < i_170_; i_171_++) {
	    int i_172_ = vertexBones[i_171_];
	    if (i_172_ >= 0) {
		is[i_172_]++;
		if (i_172_ > i)
		    i = i_172_;
	    }
	}
	int[][] is_173_ = new int[i + 1][];
	for (int i_174_ = 0; i_174_ <= i; i_174_++) {
	    is_173_[i_174_] = new int[is[i_174_]];
	    is[i_174_] = 0;
	}
	for (int i_175_ = 0; i_175_ < i_170_; i_175_++) {
	    int i_176_ = vertexBones[i_175_];
	    if (i_176_ >= 0)
		is_173_[i_176_][is[i_176_]++] = i_175_;
	}
	return is_173_;
    }
    
    public int method3637(int i, int i_177_, int i_178_, byte i_179_,
			  byte i_180_, short i_181_, byte i_182_,
			  short i_183_) {
	faceA[faceCount] = (short) i;
	faceB[faceCount] = (short) i_177_;
	faceC[faceCount] = (short) i_178_;
	faceRenderTypes[faceCount] = i_179_;
	aShortArray2122[faceCount] = (short) i_180_;
	aShortArray2109[faceCount] = i_181_;
	faceAlpha[faceCount] = i_182_;
	aShortArray2110[faceCount] = i_183_;
	return faceCount++;
    }
    
    public static ModelDecoder method3638(JS5 class458, int i, int i_184_) {
	byte[] is = class458.getFile(i, i_184_, 1869421269);
	if (is == null)
	    return null;
	return new ModelDecoder(is);
    }
    
    public static ModelDecoder method3639(JS5 class458, int i, int i_185_) {
	byte[] is = class458.getFile(i, i_185_, 392709580);
	if (is == null)
	    return null;
	return new ModelDecoder(is);
    }
    
    final int method3640(ModelDecoder class186_186_, int i, short i_187_) {
	int i_188_ = class186_186_.vertexX[i];
	int i_189_ = class186_186_.vertexY[i];
	int i_190_ = class186_186_.vertexZ[i];
	for (int i_191_ = 0; i_191_ < vertexCount; i_191_++) {
	    if (i_188_ == vertexX[i_191_]
		&& i_189_ == vertexY[i_191_]
		&& i_190_ == vertexZ[i_191_]) {
		aShortArray2094[i_191_] |= i_187_;
		return i_191_;
	    }
	}
	vertexX[vertexCount] = i_188_;
	vertexY[vertexCount] = i_189_;
	vertexZ[vertexCount] = i_190_;
	aShortArray2094[vertexCount] = i_187_;
	vertexBones[vertexCount] = (class186_186_.vertexBones != null
				     ? class186_186_.vertexBones[i] : -1);
	return vertexCount++;
    }
    
    final int method3641(ModelDecoder class186_192_, int i, short i_193_) {
	int i_194_ = class186_192_.vertexX[i];
	int i_195_ = class186_192_.vertexY[i];
	int i_196_ = class186_192_.vertexZ[i];
	for (int i_197_ = 0; i_197_ < vertexCount; i_197_++) {
	    if (i_194_ == vertexX[i_197_]
		&& i_195_ == vertexY[i_197_]
		&& i_196_ == vertexZ[i_197_]) {
		aShortArray2094[i_197_] |= i_193_;
		return i_197_;
	    }
	}
	vertexX[vertexCount] = i_194_;
	vertexY[vertexCount] = i_195_;
	vertexZ[vertexCount] = i_196_;
	aShortArray2094[vertexCount] = i_193_;
	vertexBones[vertexCount] = (class186_192_.vertexBones != null
				     ? class186_192_.vertexBones[i] : -1);
	return vertexCount++;
    }
    
    void method3642(RSBuffer class525_sub38,
					RSBuffer class525_sub38_198_,
					RSBuffer class525_sub38_199_) {
	short i = 0;
	short i_200_ = 0;
	short i_201_ = 0;
	int i_202_ = 0;
	for (int i_203_ = 0; i_203_ < faceCount; i_203_++) {
	    int i_204_ = class525_sub38_198_.readUnsignedByte(1130865760);
	    int i_205_ = i_204_ & 0x7;
	    if (i_205_ == 1) {
		faceA[i_203_] = i
		    = (short) (class525_sub38.readSmart3(993241788) + i_202_);
		i_202_ = i;
		faceB[i_203_] = i_200_
		    = (short) (class525_sub38.readSmart3(993241788) + i_202_);
		i_202_ = i_200_;
		faceC[i_203_] = i_201_
		    = (short) (class525_sub38.readSmart3(993241788) + i_202_);
		i_202_ = i_201_;
		if (i > maxVertexUsed)
		    maxVertexUsed = i;
		if (i_200_ > maxVertexUsed)
		    maxVertexUsed = i_200_;
		if (i_201_ > maxVertexUsed)
		    maxVertexUsed = i_201_;
	    }
	    if (i_205_ == 2) {
		i_200_ = i_201_;
		i_201_
		    = (short) (class525_sub38.readSmart3(993241788) + i_202_);
		i_202_ = i_201_;
		faceA[i_203_] = i;
		faceB[i_203_] = i_200_;
		faceC[i_203_] = i_201_;
		if (i_201_ > maxVertexUsed)
		    maxVertexUsed = i_201_;
	    }
	    if (i_205_ == 3) {
		i = i_201_;
		i_201_
		    = (short) (class525_sub38.readSmart3(993241788) + i_202_);
		i_202_ = i_201_;
		faceA[i_203_] = i;
		faceB[i_203_] = i_200_;
		faceC[i_203_] = i_201_;
		if (i_201_ > maxVertexUsed)
		    maxVertexUsed = i_201_;
	    }
	    if (i_205_ == 4) {
		short i_206_ = i;
		i = i_200_;
		i_200_ = i_206_;
		i_201_
		    = (short) (class525_sub38.readSmart3(993241788) + i_202_);
		i_202_ = i_201_;
		faceA[i_203_] = i;
		faceB[i_203_] = i_200_;
		faceC[i_203_] = i_201_;
		if (i_201_ > maxVertexUsed)
		    maxVertexUsed = i_201_;
	    }
	    if (textureUVCoordCount > 0 && (i_204_ & 0x8) != 0) {
		aByteArray2102[i_203_]
		    = (byte) class525_sub38_199_.readUnsignedByte(1299915195);
		aByteArray2092[i_203_]
		    = (byte) class525_sub38_199_.readUnsignedByte(229462825);
		aByteArray2104[i_203_]
		    = (byte) class525_sub38_199_.readUnsignedByte(1880149751);
	    }
	}
	maxVertexUsed++;
    }
    
    void method3643(RSBuffer class525_sub38,
					RSBuffer class525_sub38_207_,
					RSBuffer class525_sub38_208_,
					RSBuffer class525_sub38_209_,
					RSBuffer class525_sub38_210_,
					RSBuffer class525_sub38_211_) {
	for (int i = 0; i < texturedFaceCount; i++) {
	    int i_212_ = textureRenderTypes[i] & 0xff;
	    if (i_212_ == 0) {
		aShortArray2118[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 125);
		aShortArray2119[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 37);
		aShortArray2120[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 121);
	    }
	    if (i_212_ == 1) {
		aShortArray2118[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 111);
		aShortArray2119[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 106);
		aShortArray2120[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 96);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_208_.readUnsignedShort((byte) 99);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_208_.readUnsignedShort((byte) 81);
		    else
			anIntArray2114[i]
			    = class525_sub38_208_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_208_.readUnsignedShort((byte) 15);
		} else {
		    anIntArray2121[i]
			= class525_sub38_208_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_208_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_208_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_209_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_210_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_211_.readByte(-1150098071);
	    }
	    if (i_212_ == 2) {
		aShortArray2118[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 45);
		aShortArray2119[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 43);
		aShortArray2120[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 120);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_208_.readUnsignedShort((byte) 10);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_208_.readUnsignedShort((byte) 105);
		    else
			anIntArray2114[i]
			    = class525_sub38_208_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_208_.readUnsignedShort((byte) 103);
		} else {
		    anIntArray2121[i]
			= class525_sub38_208_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_208_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_208_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_209_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_210_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_211_.readByte(-1150098071);
		anIntArray2125[i]
		    = class525_sub38_211_.readByte(-1150098071);
		anIntArray2130[i]
		    = class525_sub38_211_.readByte(-1150098071);
	    }
	    if (i_212_ == 3) {
		aShortArray2118[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 107);
		aShortArray2119[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 69);
		aShortArray2120[i]
		    = (short) class525_sub38_207_.readUnsignedShort((byte) 18);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_208_.readUnsignedShort((byte) 23);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_208_.readUnsignedShort((byte) 71);
		    else
			anIntArray2114[i]
			    = class525_sub38_208_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_208_.readUnsignedShort((byte) 62);
		} else {
		    anIntArray2121[i]
			= class525_sub38_208_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_208_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_208_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_209_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_210_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_211_.readByte(-1150098071);
	    }
	}
    }
    
    public static ModelDecoder method3644(JS5 class458, int i, int i_213_) {
	byte[] is = class458.getFile(i, i_213_, 90150170);
	if (is == null)
	    return null;
	return new ModelDecoder(is);
    }
    
    public int[][] method3645() {
	int[] is = new int[256];
	int i = 0;
	for (int i_214_ = 0; i_214_ < aClass171Array2088.length; i_214_++) {
	    int i_215_ = aClass171Array2088[i_214_].anInt1857 * -821245807;
	    if (i_215_ >= 0) {
		is[i_215_]++;
		if (i_215_ > i)
		    i = i_215_;
	    }
	}
	int[][] is_216_ = new int[i + 1][];
	for (int i_217_ = 0; i_217_ <= i; i_217_++) {
	    is_216_[i_217_] = new int[is[i_217_]];
	    is[i_217_] = 0;
	}
	for (int i_218_ = 0; i_218_ < aClass171Array2088.length; i_218_++) {
	    int i_219_ = aClass171Array2088[i_218_].anInt1857 * -821245807;
	    if (i_219_ >= 0)
		is_216_[i_219_][is[i_219_]++] = i_218_;
	}
	return is_216_;
    }
    
    public void method3646(int i) {
	for (int i_220_ = 0; i_220_ < vertexCount; i_220_++) {
	    vertexX[i_220_] <<= i;
	    vertexY[i_220_] <<= i;
	    vertexZ[i_220_] <<= i;
	}
	if (texturedFaceCount > 0 && anIntArray2121 != null) {
	    for (int i_221_ = 0; i_221_ < anIntArray2121.length; i_221_++) {
		anIntArray2121[i_221_] <<= i;
		anIntArray2114[i_221_] <<= i;
		if (textureRenderTypes[i_221_] != 1)
		    anIntArray2123[i_221_] <<= i;
	    }
	}
    }
    
    public void method3647(int i, int i_222_, int i_223_) {
	if (i_223_ != 0) {
	    int i_224_ = Class436.anIntArray4831[i_223_];
	    int i_225_ = Class436.anIntArray4838[i_223_];
	    for (int i_226_ = 0; i_226_ < vertexCount; i_226_++) {
		int i_227_ = ((vertexY[i_226_] * i_224_
			       + vertexX[i_226_] * i_225_)
			      >> 14);
		vertexY[i_226_]
		    = (vertexY[i_226_] * i_225_
		       - vertexX[i_226_] * i_224_) >> 14;
		vertexX[i_226_] = i_227_;
	    }
	}
	if (i != 0) {
	    int i_228_ = Class436.anIntArray4831[i];
	    int i_229_ = Class436.anIntArray4838[i];
	    for (int i_230_ = 0; i_230_ < vertexCount; i_230_++) {
		int i_231_ = ((vertexY[i_230_] * i_229_
			       - vertexZ[i_230_] * i_228_)
			      >> 14);
		vertexZ[i_230_]
		    = (vertexY[i_230_] * i_228_
		       + vertexZ[i_230_] * i_229_) >> 14;
		vertexY[i_230_] = i_231_;
	    }
	}
	if (i_222_ != 0) {
	    int i_232_ = Class436.anIntArray4831[i_222_];
	    int i_233_ = Class436.anIntArray4838[i_222_];
	    for (int i_234_ = 0; i_234_ < vertexCount; i_234_++) {
		int i_235_ = ((vertexZ[i_234_] * i_232_
			       + vertexX[i_234_] * i_233_)
			      >> 14);
		vertexZ[i_234_]
		    = (vertexZ[i_234_] * i_233_
		       - vertexX[i_234_] * i_232_) >> 14;
		vertexX[i_234_] = i_235_;
	    }
	}
    }
    
    public int method3648(int i, int i_236_, int i_237_, byte i_238_,
			  byte i_239_, short i_240_, byte i_241_,
			  short i_242_) {
	faceA[faceCount] = (short) i;
	faceB[faceCount] = (short) i_236_;
	faceC[faceCount] = (short) i_237_;
	faceRenderTypes[faceCount] = i_238_;
	aShortArray2122[faceCount] = (short) i_239_;
	aShortArray2109[faceCount] = i_240_;
	faceAlpha[faceCount] = i_241_;
	aShortArray2110[faceCount] = i_242_;
	return faceCount++;
    }
    
    public void method3649(short i, short i_243_) {
	if (aShortArray2110 != null) {
	    for (int i_244_ = 0; i_244_ < faceCount; i_244_++) {
		if (aShortArray2110[i_244_] == i)
		    aShortArray2110[i_244_] = i_243_;
	    }
	}
    }
    
    public byte method3650(short i, short i_245_, short i_246_) {
	if (texturedFaceCount >= 255)
	    throw new IllegalStateException();
	textureRenderTypes[texturedFaceCount] = (byte) 0;
	aShortArray2118[texturedFaceCount] = i;
	aShortArray2119[texturedFaceCount] = i_245_;
	aShortArray2120[texturedFaceCount] = i_246_;
	return (byte) texturedFaceCount++;
    }
    
    public void method3651(int i) {
	for (int i_247_ = 0; i_247_ < vertexCount; i_247_++) {
	    vertexX[i_247_] <<= i;
	    vertexY[i_247_] <<= i;
	    vertexZ[i_247_] <<= i;
	}
	if (texturedFaceCount > 0 && anIntArray2121 != null) {
	    for (int i_248_ = 0; i_248_ < anIntArray2121.length; i_248_++) {
		anIntArray2121[i_248_] <<= i;
		anIntArray2114[i_248_] <<= i;
		if (textureRenderTypes[i_248_] != 1)
		    anIntArray2123[i_248_] <<= i;
	    }
	}
    }
    
    public int[][] method3652(boolean bool) {
	int[] is = new int[400];
	int i = 0;
	int i_249_ = bool ? vertexCount : maxVertexUsed;
	for (int i_250_ = 0; i_250_ < i_249_; i_250_++) {
	    int i_251_ = vertexBones[i_250_];
	    if (i_251_ >= 0) {
		is[i_251_]++;
		if (i_251_ > i)
		    i = i_251_;
	    }
	}
	int[][] is_252_ = new int[i + 1][];
	for (int i_253_ = 0; i_253_ <= i; i_253_++) {
	    is_252_[i_253_] = new int[is[i_253_]];
	    is[i_253_] = 0;
	}
	for (int i_254_ = 0; i_254_ < i_249_; i_254_++) {
	    int i_255_ = vertexBones[i_254_];
	    if (i_255_ >= 0)
		is_252_[i_255_][is[i_255_]++] = i_254_;
	}
	return is_252_;
    }
    
    public int[][] method3653() {
	int[] is = new int[256];
	int i = 0;
	for (int i_256_ = 0; i_256_ < aClass171Array2088.length; i_256_++) {
	    int i_257_ = aClass171Array2088[i_256_].anInt1857 * -821245807;
	    if (i_257_ >= 0) {
		is[i_257_]++;
		if (i_257_ > i)
		    i = i_257_;
	    }
	}
	int[][] is_258_ = new int[i + 1][];
	for (int i_259_ = 0; i_259_ <= i; i_259_++) {
	    is_258_[i_259_] = new int[is[i_259_]];
	    is[i_259_] = 0;
	}
	for (int i_260_ = 0; i_260_ < aClass171Array2088.length; i_260_++) {
	    int i_261_ = aClass171Array2088[i_260_].anInt1857 * -821245807;
	    if (i_261_ >= 0)
		is_258_[i_261_][is[i_261_]++] = i_260_;
	}
	return is_258_;
    }
    
    public int[][] method3654() {
	int[] is = new int[256];
	int i = 0;
	for (int i_262_ = 0; i_262_ < aClass171Array2088.length; i_262_++) {
	    int i_263_ = aClass171Array2088[i_262_].anInt1857 * -821245807;
	    if (i_263_ >= 0) {
		is[i_263_]++;
		if (i_263_ > i)
		    i = i_263_;
	    }
	}
	int[][] is_264_ = new int[i + 1][];
	for (int i_265_ = 0; i_265_ <= i; i_265_++) {
	    is_264_[i_265_] = new int[is[i_265_]];
	    is[i_265_] = 0;
	}
	for (int i_266_ = 0; i_266_ < aClass171Array2088.length; i_266_++) {
	    int i_267_ = aClass171Array2088[i_266_].anInt1857 * -821245807;
	    if (i_267_ >= 0)
		is_264_[i_267_][is[i_267_]++] = i_266_;
	}
	return is_264_;
    }
    
    public int[][] method3655() {
	int[] is = new int[256];
	int i = 0;
	for (int i_268_ = 0; i_268_ < aClass171Array2088.length; i_268_++) {
	    int i_269_ = aClass171Array2088[i_268_].anInt1857 * -821245807;
	    if (i_269_ >= 0) {
		is[i_269_]++;
		if (i_269_ > i)
		    i = i_269_;
	    }
	}
	int[][] is_270_ = new int[i + 1][];
	for (int i_271_ = 0; i_271_ <= i; i_271_++) {
	    is_270_[i_271_] = new int[is[i_271_]];
	    is[i_271_] = 0;
	}
	for (int i_272_ = 0; i_272_ < aClass171Array2088.length; i_272_++) {
	    int i_273_ = aClass171Array2088[i_272_].anInt1857 * -821245807;
	    if (i_273_ >= 0)
		is_270_[i_273_][is[i_273_]++] = i_272_;
	}
	return is_270_;
    }
    
    public void method3656(int i) {
	for (int i_274_ = 0; i_274_ < vertexCount; i_274_++) {
	    vertexX[i_274_] <<= i;
	    vertexY[i_274_] <<= i;
	    vertexZ[i_274_] <<= i;
	}
	if (texturedFaceCount > 0 && anIntArray2121 != null) {
	    for (int i_275_ = 0; i_275_ < anIntArray2121.length; i_275_++) {
		anIntArray2121[i_275_] <<= i;
		anIntArray2114[i_275_] <<= i;
		if (textureRenderTypes[i_275_] != 1)
		    anIntArray2123[i_275_] <<= i;
	    }
	}
    }
    
    public void method3657(short i, short i_276_) {
	for (int i_277_ = 0; i_277_ < faceCount; i_277_++) {
	    if (aShortArray2109[i_277_] == i)
		aShortArray2109[i_277_] = i_276_;
	}
    }
    
    public void method3658(short i, short i_278_) {
	for (int i_279_ = 0; i_279_ < faceCount; i_279_++) {
	    if (aShortArray2109[i_279_] == i)
		aShortArray2109[i_279_] = i_278_;
	}
    }
    
    public static ModelDecoder method3659(JS5 class458, int i, int i_280_) {
	byte[] is = class458.getFile(i, i_280_, 574765077);
	if (is == null)
	    return null;
	return new ModelDecoder(is);
    }
    
    void method3660(RSBuffer class525_sub38,
					RSBuffer class525_sub38_281_,
					RSBuffer class525_sub38_282_,
					RSBuffer class525_sub38_283_,
					RSBuffer class525_sub38_284_,
					RSBuffer class525_sub38_285_) {
	for (int i = 0; i < texturedFaceCount; i++) {
	    int i_286_ = textureRenderTypes[i] & 0xff;
	    if (i_286_ == 0) {
		aShortArray2118[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 108);
		aShortArray2119[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 32);
		aShortArray2120[i]
		    = (short) class525_sub38.readUnsignedShort((byte) 98);
	    }
	    if (i_286_ == 1) {
		aShortArray2118[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 7);
		aShortArray2119[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 12);
		aShortArray2120[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 97);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_282_.readUnsignedShort((byte) 6);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_282_.readUnsignedShort((byte) 46);
		    else
			anIntArray2114[i]
			    = class525_sub38_282_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_282_.readUnsignedShort((byte) 84);
		} else {
		    anIntArray2121[i]
			= class525_sub38_282_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_282_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_282_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_283_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_284_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_285_.readByte(-1150098071);
	    }
	    if (i_286_ == 2) {
		aShortArray2118[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 72);
		aShortArray2119[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 94);
		aShortArray2120[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 108);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_282_.readUnsignedShort((byte) 66);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_282_.readUnsignedShort((byte) 98);
		    else
			anIntArray2114[i]
			    = class525_sub38_282_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_282_.readUnsignedShort((byte) 118);
		} else {
		    anIntArray2121[i]
			= class525_sub38_282_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_282_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_282_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_283_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_284_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_285_.readByte(-1150098071);
		anIntArray2125[i]
		    = class525_sub38_285_.readByte(-1150098071);
		anIntArray2130[i]
		    = class525_sub38_285_.readByte(-1150098071);
	    }
	    if (i_286_ == 3) {
		aShortArray2118[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 73);
		aShortArray2119[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 46);
		aShortArray2120[i]
		    = (short) class525_sub38_281_.readUnsignedShort((byte) 13);
		if (version < 15) {
		    anIntArray2121[i]
			= class525_sub38_282_.readUnsignedShort((byte) 27);
		    if (version < 14)
			anIntArray2114[i]
			    = class525_sub38_282_.readUnsignedShort((byte) 42);
		    else
			anIntArray2114[i]
			    = class525_sub38_282_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_282_.readUnsignedShort((byte) 68);
		} else {
		    anIntArray2121[i]
			= class525_sub38_282_.method16834(-1994884458);
		    anIntArray2114[i]
			= class525_sub38_282_.method16834(-1994884458);
		    anIntArray2123[i]
			= class525_sub38_282_.method16834(-1994884458);
		}
		aByteArray2127[i]
		    = class525_sub38_283_.readByte(-1150098071);
		aByteArray2091[i]
		    = class525_sub38_284_.readByte(-1150098071);
		anIntArray2124[i]
		    = class525_sub38_285_.readByte(-1150098071);
	    }
	}
    }
    
    public void method3661(int i, int i_287_, int i_288_) {
	for (int i_289_ = 0; i_289_ < vertexCount; i_289_++) {
	    vertexX[i_289_] += i;
	    vertexY[i_289_] += i_287_;
	    vertexZ[i_289_] += i_288_;
	}
    }
    
    public void method3662(int i, int i_290_, int i_291_) {
	if (i_291_ != 0) {
	    int i_292_ = Class436.anIntArray4831[i_291_];
	    int i_293_ = Class436.anIntArray4838[i_291_];
	    for (int i_294_ = 0; i_294_ < vertexCount; i_294_++) {
		int i_295_ = ((vertexY[i_294_] * i_292_
			       + vertexX[i_294_] * i_293_)
			      >> 14);
		vertexY[i_294_]
		    = (vertexY[i_294_] * i_293_
		       - vertexX[i_294_] * i_292_) >> 14;
		vertexX[i_294_] = i_295_;
	    }
	}
	if (i != 0) {
	    int i_296_ = Class436.anIntArray4831[i];
	    int i_297_ = Class436.anIntArray4838[i];
	    for (int i_298_ = 0; i_298_ < vertexCount; i_298_++) {
		int i_299_ = ((vertexY[i_298_] * i_297_
			       - vertexZ[i_298_] * i_296_)
			      >> 14);
		vertexZ[i_298_]
		    = (vertexY[i_298_] * i_296_
		       + vertexZ[i_298_] * i_297_) >> 14;
		vertexY[i_298_] = i_299_;
	    }
	}
	if (i_290_ != 0) {
	    int i_300_ = Class436.anIntArray4831[i_290_];
	    int i_301_ = Class436.anIntArray4838[i_290_];
	    for (int i_302_ = 0; i_302_ < vertexCount; i_302_++) {
		int i_303_ = ((vertexZ[i_302_] * i_300_
			       + vertexX[i_302_] * i_301_)
			      >> 14);
		vertexZ[i_302_]
		    = (vertexZ[i_302_] * i_301_
		       - vertexX[i_302_] * i_300_) >> 14;
		vertexX[i_302_] = i_303_;
	    }
	}
    }
    
    public void method3663(int i, int i_304_, int i_305_) {
	if (i_305_ != 0) {
	    int i_306_ = Class436.anIntArray4831[i_305_];
	    int i_307_ = Class436.anIntArray4838[i_305_];
	    for (int i_308_ = 0; i_308_ < vertexCount; i_308_++) {
		int i_309_ = ((vertexY[i_308_] * i_306_
			       + vertexX[i_308_] * i_307_)
			      >> 14);
		vertexY[i_308_]
		    = (vertexY[i_308_] * i_307_
		       - vertexX[i_308_] * i_306_) >> 14;
		vertexX[i_308_] = i_309_;
	    }
	}
	if (i != 0) {
	    int i_310_ = Class436.anIntArray4831[i];
	    int i_311_ = Class436.anIntArray4838[i];
	    for (int i_312_ = 0; i_312_ < vertexCount; i_312_++) {
		int i_313_ = ((vertexY[i_312_] * i_311_
			       - vertexZ[i_312_] * i_310_)
			      >> 14);
		vertexZ[i_312_]
		    = (vertexY[i_312_] * i_310_
		       + vertexZ[i_312_] * i_311_) >> 14;
		vertexY[i_312_] = i_313_;
	    }
	}
	if (i_304_ != 0) {
	    int i_314_ = Class436.anIntArray4831[i_304_];
	    int i_315_ = Class436.anIntArray4838[i_304_];
	    for (int i_316_ = 0; i_316_ < vertexCount; i_316_++) {
		int i_317_ = ((vertexZ[i_316_] * i_314_
			       + vertexX[i_316_] * i_315_)
			      >> 14);
		vertexZ[i_316_]
		    = (vertexZ[i_316_] * i_315_
		       - vertexX[i_316_] * i_314_) >> 14;
		vertexX[i_316_] = i_317_;
	    }
	}
    }
    
    public void method3664(int i, int i_318_, int i_319_) {
	if (i_319_ != 0) {
	    int i_320_ = Class436.anIntArray4831[i_319_];
	    int i_321_ = Class436.anIntArray4838[i_319_];
	    for (int i_322_ = 0; i_322_ < vertexCount; i_322_++) {
		int i_323_ = ((vertexY[i_322_] * i_320_
			       + vertexX[i_322_] * i_321_)
			      >> 14);
		vertexY[i_322_]
		    = (vertexY[i_322_] * i_321_
		       - vertexX[i_322_] * i_320_) >> 14;
		vertexX[i_322_] = i_323_;
	    }
	}
	if (i != 0) {
	    int i_324_ = Class436.anIntArray4831[i];
	    int i_325_ = Class436.anIntArray4838[i];
	    for (int i_326_ = 0; i_326_ < vertexCount; i_326_++) {
		int i_327_ = ((vertexY[i_326_] * i_325_
			       - vertexZ[i_326_] * i_324_)
			      >> 14);
		vertexZ[i_326_]
		    = (vertexY[i_326_] * i_324_
		       + vertexZ[i_326_] * i_325_) >> 14;
		vertexY[i_326_] = i_327_;
	    }
	}
	if (i_318_ != 0) {
	    int i_328_ = Class436.anIntArray4831[i_318_];
	    int i_329_ = Class436.anIntArray4838[i_318_];
	    for (int i_330_ = 0; i_330_ < vertexCount; i_330_++) {
		int i_331_ = ((vertexZ[i_330_] * i_328_
			       + vertexX[i_330_] * i_329_)
			      >> 14);
		vertexZ[i_330_]
		    = (vertexZ[i_330_] * i_329_
		       - vertexX[i_330_] * i_328_) >> 14;
		vertexX[i_330_] = i_331_;
	    }
	}
    }
    
    public ModelDecoder(ModelDecoder[] class186s, int i) {
	vertexCount = 0;
	maxVertexUsed = 0;
	faceCount = 0;
	priority = (byte) 0;
	texturedFaceCount = 0;
	vertexCount = 0;
	faceCount = 0;
	texturedFaceCount = 0;
	textureUVCoordCount = 0;
	int i_332_ = 0;
	int i_333_ = 0;
	int i_334_ = 0;
	boolean bool = false;
	boolean bool_335_ = false;
	boolean bool_336_ = false;
	boolean bool_337_ = false;
	boolean bool_338_ = false;
	boolean bool_339_ = false;
	priority = (byte) -1;
	for (int i_340_ = 0; i_340_ < i; i_340_++) {
	    ModelDecoder class186_341_ = class186s[i_340_];
	    if (class186_341_ != null) {
		vertexCount += class186_341_.vertexCount;
		faceCount += class186_341_.faceCount;
		texturedFaceCount += class186_341_.texturedFaceCount;
		textureUVCoordCount += class186_341_.textureUVCoordCount;
		if (class186_341_.aClass184Array2129 != null)
		    i_332_ += class186_341_.aClass184Array2129.length;
		if (class186_341_.aClass154Array2093 != null)
		    i_333_ += class186_341_.aClass154Array2093.length;
		if (class186_341_.aClass171Array2088 != null)
		    i_334_ += class186_341_.aClass171Array2088.length;
		bool = bool | class186_341_.faceRenderTypes != null;
		if (class186_341_.facePriorities != null)
		    bool_335_ = true;
		else {
		    if (priority == -1)
			priority = class186_341_.priority;
		    if (priority != class186_341_.priority)
			bool_335_ = true;
		}
		bool_336_ = bool_336_ | class186_341_.faceAlpha != null;
		bool_337_ = bool_337_ | class186_341_.aShortArray2122 != null;
		bool_338_ = bool_338_ | class186_341_.aShortArray2110 != null;
		bool_339_ = bool_339_ | class186_341_.faceBones != null;
	    }
	}
	vertexX = new int[vertexCount];
	vertexY = new int[vertexCount];
	vertexZ = new int[vertexCount];
	vertexBones = new int[vertexCount];
	aShortArray2094 = new short[vertexCount];
	faceA = new short[faceCount];
	faceB = new short[faceCount];
	faceC = new short[faceCount];
	if (bool)
	    faceRenderTypes = new byte[faceCount];
	if (bool_335_)
	    facePriorities = new byte[faceCount];
	if (bool_336_)
	    faceAlpha = new byte[faceCount];
	if (bool_337_)
	    aShortArray2122 = new short[faceCount];
	aShortArray2109 = new short[faceCount];
	if (bool_338_)
	    aShortArray2110 = new short[faceCount];
	if (bool_339_)
	    faceBones = new int[faceCount];
	aShortArray2113 = new short[faceCount];
	if (texturedFaceCount > 0) {
	    textureRenderTypes = new byte[texturedFaceCount];
	    aShortArray2118 = new short[texturedFaceCount];
	    aShortArray2119 = new short[texturedFaceCount];
	    aShortArray2120 = new short[texturedFaceCount];
	    anIntArray2121 = new int[texturedFaceCount];
	    anIntArray2114 = new int[texturedFaceCount];
	    anIntArray2123 = new int[texturedFaceCount];
	    aByteArray2127 = new byte[texturedFaceCount];
	    aByteArray2091 = new byte[texturedFaceCount];
	    anIntArray2124 = new int[texturedFaceCount];
	    anIntArray2125 = new int[texturedFaceCount];
	    anIntArray2130 = new int[texturedFaceCount];
	}
	if (i_334_ > 0)
	    aClass171Array2088 = new Class171[i_334_];
	if (i_332_ > 0)
	    aClass184Array2129 = new Class184[i_332_];
	if (i_333_ > 0)
	    aClass154Array2093 = new MagnetConfig[i_333_];
	if (textureUVCoordCount > 0) {
	    aFloatArray2096 = new float[textureUVCoordCount];
	    aFloatArray2097 = new float[textureUVCoordCount];
	    anIntArray2103 = new int[vertexCount];
	    aByteArray2102 = new byte[faceCount];
	    aByteArray2092 = new byte[faceCount];
	    aByteArray2104 = new byte[faceCount];
	}
	int[] is = new int[vertexCount];
	int[] is_342_ = new int[textureUVCoordCount];
	int[] is_343_ = new int[vertexCount];
	int[] is_344_ = new int[vertexCount];
	int[] is_345_ = new int[3];
	vertexCount = 0;
	faceCount = 0;
	texturedFaceCount = 0;
	textureUVCoordCount = 0;
	i_332_ = 0;
	i_333_ = 0;
	i_334_ = 0;
	for (int i_346_ = 0; i_346_ < i; i_346_++) {
	    short i_347_ = (short) (1 << i_346_);
	    ModelDecoder class186_348_ = class186s[i_346_];
	    int i_349_ = faceCount;
	    if (class186_348_ != null) {
		boolean[] bools = new boolean[class186_348_.vertexCount];
		if (class186_348_.aClass171Array2088 != null) {
		    for (int i_350_ = 0;
			 i_350_ < class186_348_.aClass171Array2088.length;
			 i_350_++) {
			Class171 class171
			    = class186_348_.aClass171Array2088[i_350_];
			aClass171Array2088[i_334_++]
			    = class171.method2732((class171.anInt1856
						   * 553052305) + faceCount,
						  495056557);
		    }
		}
		for (int i_351_ = 0; i_351_ < class186_348_.faceCount;
		     i_351_++) {
		    is_345_[0] = class186_348_.faceA[i_351_];
		    is_345_[1] = class186_348_.faceB[i_351_];
		    is_345_[2] = class186_348_.faceC[i_351_];
		    for (int i_352_ = 0; i_352_ < 3; i_352_++) {
			int i_353_ = is_345_[i_352_];
			int i_354_ = class186_348_.vertexX[i_353_];
			int i_355_ = class186_348_.vertexY[i_353_];
			int i_356_ = class186_348_.vertexZ[i_353_];
			int i_357_;
			for (i_357_ = 0; i_357_ < vertexCount; i_357_++) {
			    if (i_354_ == vertexX[i_357_]
				&& i_355_ == vertexY[i_357_]
				&& i_356_ == vertexZ[i_357_]) {
				aShortArray2094[i_357_] |= i_347_;
				is_343_[i_353_] = i_357_;
				break;
			    }
			}
			if (class186_348_.textureUVCoordCount > 0 && !bools[i_353_]) {
			    int i_358_
				= ((i_353_ < class186_348_.vertexCount - 1
				    ? class186_348_.anIntArray2103[i_353_ + 1]
				    : class186_348_.textureUVCoordCount)
				   - class186_348_.anIntArray2103[i_353_]);
			    for (int i_359_ = 0; i_359_ < i_358_; i_359_++) {
				aFloatArray2096[textureUVCoordCount]
				    = (class186_348_.aFloatArray2096
				       [(class186_348_.anIntArray2103[i_353_]
					 + i_359_)]);
				aFloatArray2097[textureUVCoordCount]
				    = (class186_348_.aFloatArray2097
				       [(class186_348_.anIntArray2103[i_353_]
					 + i_359_)]);
				is_342_[textureUVCoordCount]
				    = i_357_ << 16 | is[i_357_] + i_359_;
				textureUVCoordCount++;
			    }
			    is_344_[i_353_] = is[i_357_];
			    is[i_357_] += i_358_;
			    bools[i_353_] = true;
			}
			if (i_357_ >= vertexCount) {
			    vertexX[vertexCount] = i_354_;
			    vertexY[vertexCount] = i_355_;
			    vertexZ[vertexCount] = i_356_;
			    aShortArray2094[vertexCount] = i_347_;
			    vertexBones[vertexCount]
				= (class186_348_.vertexBones != null
				   ? class186_348_.vertexBones[i_353_]
				   : -1);
			    is_343_[i_353_] = vertexCount;
			    vertexCount++;
			}
		    }
		}
		for (int i_360_ = 0; i_360_ < class186_348_.faceCount;
		     i_360_++) {
		    if (bool && class186_348_.faceRenderTypes != null)
			faceRenderTypes[faceCount]
			    = class186_348_.faceRenderTypes[i_360_];
		    if (bool_335_) {
			if (class186_348_.facePriorities != null)
			    facePriorities[faceCount]
				= class186_348_.facePriorities[i_360_];
			else
			    facePriorities[faceCount]
				= class186_348_.priority;
		    }
		    if (bool_336_ && class186_348_.faceAlpha != null)
			faceAlpha[faceCount]
			    = class186_348_.faceAlpha[i_360_];
		    if (bool_338_) {
			if (class186_348_.aShortArray2110 != null)
			    aShortArray2110[faceCount]
				= class186_348_.aShortArray2110[i_360_];
			else
			    aShortArray2110[faceCount] = (short) -1;
		    }
		    if (bool_339_) {
			if (class186_348_.faceBones != null)
			    faceBones[faceCount]
				= class186_348_.faceBones[i_360_];
			else
			    faceBones[faceCount] = -1;
		    }
		    if (class186_348_.textureUVCoordCount > 0) {
			aByteArray2102[faceCount]
			    = (byte) (class186_348_.aByteArray2102[i_360_]
				      + is_344_[(class186_348_.faceA
						 [i_360_])]);
			aByteArray2092[faceCount]
			    = (byte) (class186_348_.aByteArray2092[i_360_]
				      + is_344_[(class186_348_.faceB
						 [i_360_])]);
			aByteArray2104[faceCount]
			    = (byte) (class186_348_.aByteArray2104[i_360_]
				      + is_344_[(class186_348_.faceC
						 [i_360_])]);
		    }
		    faceA[faceCount]
			= (short) (is_343_
				   [class186_348_.faceA[i_360_]]);
		    faceB[faceCount]
			= (short) (is_343_
				   [class186_348_.faceB[i_360_]]);
		    faceC[faceCount]
			= (short) (is_343_
				   [class186_348_.faceC[i_360_]]);
		    aShortArray2113[faceCount] = i_347_;
		    aShortArray2109[faceCount]
			= class186_348_.aShortArray2109[i_360_];
		    faceCount++;
		}
		if (class186_348_.aClass184Array2129 != null) {
		    for (int i_361_ = 0;
			 i_361_ < class186_348_.aClass184Array2129.length;
			 i_361_++) {
			int i_362_
			    = is_343_[(class186_348_.aClass184Array2129[i_361_]
				       .anInt2066) * -1882366163];
			int i_363_
			    = is_343_[(class186_348_.aClass184Array2129[i_361_]
				       .anInt2076) * -1545046327];
			int i_364_
			    = is_343_[(class186_348_.aClass184Array2129[i_361_]
				       .anInt2068) * -1411214779];
			aClass184Array2129[i_332_]
			    = (class186_348_.aClass184Array2129[i_361_]
				   .method3604
			       ((class186_348_.aClass184Array2129[i_361_]
				 .anInt2065) * -1426233023 + i_349_,
				i_362_, i_363_, i_364_, 788167278));
			i_332_++;
		    }
		}
		if (class186_348_.aClass154Array2093 != null) {
		    for (int i_365_ = 0;
			 i_365_ < class186_348_.aClass154Array2093.length;
			 i_365_++) {
			int i_366_
			    = is_343_[(class186_348_.aClass154Array2093[i_365_]
				       .anInt1729) * 1174339389];
			aClass154Array2093[i_333_]
			    = class186_348_.aClass154Array2093[i_365_]
				  .method2445(i_366_, -1846136768);
			i_333_++;
		    }
		}
	    }
	}
	maxVertexUsed = vertexCount;
	if (textureUVCoordCount > 0) {
	    Class66.method1439(is_342_, aFloatArray2096, aFloatArray2097,
			       (byte) 114);
	    int i_367_ = 0;
	    int i_368_ = 0;
	    for (/**/; i_367_ < vertexCount; i_367_++) {
		anIntArray2103[i_367_] = i_368_;
		i_368_ += is[i_367_];
	    }
	}
	int i_369_ = 0;
	int i_370_ = 0;
	for (/**/; i_369_ < i; i_369_++) {
	    short i_371_ = (short) (1 << i_369_);
	    ModelDecoder class186_372_ = class186s[i_369_];
	    if (class186_372_ != null) {
		if (bool_337_) {
		    int i_373_ = 0;
		    while (i_373_ < class186_372_.faceCount) {
			aShortArray2122[i_370_]
			    = (class186_372_.aShortArray2122 != null
			       ? class186_372_.aShortArray2122[i_373_]
			       : (short) -1);
			if (aShortArray2122[i_370_] > -1
			    && aShortArray2122[i_370_] < 32766)
			    aShortArray2122[i_370_]
				= (short) (aShortArray2122[i_370_]
					   + texturedFaceCount);
			i_373_++;
			i_370_++;
		    }
		}
		for (int i_374_ = 0; i_374_ < class186_372_.texturedFaceCount;
		     i_374_++) {
		    byte i_375_ = (textureRenderTypes[texturedFaceCount]
				   = class186_372_.textureRenderTypes[i_374_]);
		    if (i_375_ == 0) {
			aShortArray2118[texturedFaceCount]
			    = (short) method3622(class186_372_,
						 (class186_372_.aShortArray2118
						  [i_374_]),
						 i_371_);
			aShortArray2119[texturedFaceCount]
			    = (short) method3622(class186_372_,
						 (class186_372_.aShortArray2119
						  [i_374_]),
						 i_371_);
			aShortArray2120[texturedFaceCount]
			    = (short) method3622(class186_372_,
						 (class186_372_.aShortArray2120
						  [i_374_]),
						 i_371_);
		    } else if (i_375_ >= 1 && i_375_ <= 3) {
			aShortArray2118[texturedFaceCount]
			    = class186_372_.aShortArray2118[i_374_];
			aShortArray2119[texturedFaceCount]
			    = class186_372_.aShortArray2119[i_374_];
			aShortArray2120[texturedFaceCount]
			    = class186_372_.aShortArray2120[i_374_];
			anIntArray2121[texturedFaceCount]
			    = class186_372_.anIntArray2121[i_374_];
			anIntArray2114[texturedFaceCount]
			    = class186_372_.anIntArray2114[i_374_];
			anIntArray2123[texturedFaceCount]
			    = class186_372_.anIntArray2123[i_374_];
			aByteArray2127[texturedFaceCount]
			    = class186_372_.aByteArray2127[i_374_];
			aByteArray2091[texturedFaceCount]
			    = class186_372_.aByteArray2091[i_374_];
			anIntArray2124[texturedFaceCount]
			    = class186_372_.anIntArray2124[i_374_];
		    } else if (i_375_ == 2) {
			anIntArray2125[texturedFaceCount]
			    = class186_372_.anIntArray2125[i_374_];
			anIntArray2130[texturedFaceCount]
			    = class186_372_.anIntArray2130[i_374_];
		    }
		    texturedFaceCount++;
		}
	    }
	}
    }
    
    public byte method3665(short i, short i_376_, short i_377_, short i_378_,
			   short i_379_, short i_380_, byte i_381_,
			   byte i_382_, byte i_383_) {
	if (texturedFaceCount >= 255)
	    throw new IllegalStateException();
	textureRenderTypes[texturedFaceCount] = (byte) 3;
	aShortArray2118[texturedFaceCount] = i;
	aShortArray2119[texturedFaceCount] = i_376_;
	aShortArray2120[texturedFaceCount] = i_377_;
	anIntArray2121[texturedFaceCount] = i_378_;
	anIntArray2114[texturedFaceCount] = i_379_;
	anIntArray2123[texturedFaceCount] = i_380_;
	aByteArray2127[texturedFaceCount] = i_381_;
	aByteArray2091[texturedFaceCount] = i_382_;
	anIntArray2124[texturedFaceCount] = i_383_;
	return (byte) texturedFaceCount++;
    }
}
