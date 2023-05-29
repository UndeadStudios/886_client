/* Class525_Sub16_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class525_Sub16_Sub18 extends Class525_Sub16
{
    static JS5 aClass458_11870;
    static JS5 aClass458_11871;
    int anInt11872;
    byte[][] aByteArrayArray11873;
    AnimationFrame[] aClass177Array11874;
    
    public boolean method18479(int i) {
	return aClass177Array11874[i].modifiesAlpha;
    }
    
    public boolean method18480(int i) {
	return aClass177Array11874[i].aBool1902;
    }
    
    public Class525_Sub16_Sub18(int i) {
	anInt11872 = i * 405031133;
    }
    
    public boolean method18481(int i, int i_0_) {
	return aClass177Array11874[i].modifiesColour;
    }
    
    public boolean method18482(int i, byte i_1_) {
	return aClass177Array11874[i].aBool1902;
    }
    
    public static void method18483(JS5 class458, JS5 class458_2_,
                                   int i) {
	aClass458_11871 = class458;
	aClass458_11870 = class458_2_;
    }
    
    public boolean method18484() {
	if (aClass177Array11874 != null)
	    return true;
	if (aByteArrayArray11873 == null) {
	    synchronized (aClass458_11871) {
		if (!aClass458_11871.method7558(anInt11872 * -629092491,
						(byte) 57)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is = aClass458_11871.method7540(-629092491 * anInt11872,
						      1180054175);
		aByteArrayArray11873 = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    aByteArrayArray11873[i]
			= aClass458_11871.getFile(anInt11872 * -629092491,
						     is[i], 1695036699);
	    }
	}
	boolean bool = true;
	for (int i = 0; i < aByteArrayArray11873.length; i++) {
	    byte[] is = aByteArrayArray11873[i];
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    class525_sub38.index = 339428471;
	    int i_3_ = class525_sub38.readUnsignedShort((byte) 59);
	    synchronized (aClass458_11870) {
		bool &= aClass458_11870.method7506(i_3_, 622973909);
	    }
	}
	if (!bool)
	    return false;
	Class709 class709 = new Class709();
	int[] is;
	synchronized (aClass458_11871) {
	    int i = aClass458_11871.getFileCountForArchive(anInt11872 * -629092491,
					       2136505378);
	    aClass177Array11874 = new AnimationFrame[i];
	    is = aClass458_11871.method7540(anInt11872 * -629092491,
					    2047147001);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_4_ = aByteArrayArray11873[i];
	    RSBuffer class525_sub38 = new RSBuffer(is_4_);
	    class525_sub38.index = 339428471;
	    int i_5_ = class525_sub38.readUnsignedShort((byte) 52);
	    AnimationFrameBase class525_sub14 = null;
	    for (AnimationFrameBase class525_sub14_6_
			 = (AnimationFrameBase) class709.method14372((short) -13177);
			 null != class525_sub14_6_;
			 class525_sub14_6_
		     = (AnimationFrameBase) class709.method14353(-1119070312)) {
		if (-2087764181 * class525_sub14_6_.id == i_5_) {
		    class525_sub14 = class525_sub14_6_;
		    break;
		}
	    }
	    if (null == class525_sub14) {
		synchronized (aClass458_11870) {
		    class525_sub14
			= new AnimationFrameBase(i_5_, (aClass458_11870.getTextureData
						    (i_5_, 1384840409)));
		}
		class709.method14345(class525_sub14, (byte) 0);
	    }
	    aClass177Array11874[is[i]] = new AnimationFrame(is_4_, class525_sub14);
	}
	aByteArrayArray11873 = null;
	return true;
    }
    
    public boolean method18485(int i) {
	if (aClass177Array11874 != null)
	    return true;
	if (aByteArrayArray11873 == null) {
	    synchronized (aClass458_11871) {
		if (!aClass458_11871.method7558(anInt11872 * -629092491,
						(byte) 114)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is = aClass458_11871.method7540(-629092491 * anInt11872,
						      -1051651364);
		aByteArrayArray11873 = new byte[is.length][];
		for (int i_7_ = 0; i_7_ < is.length; i_7_++)
		    aByteArrayArray11873[i_7_]
			= aClass458_11871.getFile(anInt11872 * -629092491,
						     is[i_7_], 1960986328);
	    }
	}
	boolean bool = true;
	for (int i_8_ = 0; i_8_ < aByteArrayArray11873.length; i_8_++) {
	    byte[] is = aByteArrayArray11873[i_8_];
	    RSBuffer class525_sub38 = new RSBuffer(is);
	    class525_sub38.index = 339428471;
	    int i_9_ = class525_sub38.readUnsignedShort((byte) 102);
	    synchronized (aClass458_11870) {
		bool &= aClass458_11870.method7506(i_9_, 1356951955);
	    }
	}
	if (!bool)
	    return false;
	Class709 class709 = new Class709();
	int[] is;
	synchronized (aClass458_11871) {
	    int i_10_ = aClass458_11871.getFileCountForArchive(anInt11872 * -629092491,
						   2137322192);
	    aClass177Array11874 = new AnimationFrame[i_10_];
	    is = aClass458_11871.method7540(anInt11872 * -629092491,
					    -1429695635);
	}
	for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
	    byte[] is_12_ = aByteArrayArray11873[i_11_];
	    RSBuffer class525_sub38 = new RSBuffer(is_12_);
	    class525_sub38.index = 339428471;
	    int i_13_ = class525_sub38.readUnsignedShort((byte) 86);
	    AnimationFrameBase class525_sub14 = null;
	    for (AnimationFrameBase class525_sub14_14_
			 = (AnimationFrameBase) class709.method14372((short) -31499);
			 null != class525_sub14_14_;
			 class525_sub14_14_
		     = (AnimationFrameBase) class709.method14353(-1982855882)) {
		if (-2087764181 * class525_sub14_14_.id == i_13_) {
		    class525_sub14 = class525_sub14_14_;
		    break;
		}
	    }
	    if (null == class525_sub14) {
		synchronized (aClass458_11870) {
		    class525_sub14
			= new AnimationFrameBase(i_13_, (aClass458_11870.getTextureData
						     (i_13_, 2138118013)));
		}
		class709.method14345(class525_sub14, (byte) 0);
	    }
	    aClass177Array11874[is[i_11_]]
		= new AnimationFrame(is_12_, class525_sub14);
	}
	aByteArrayArray11873 = null;
	return true;
    }
    
    public boolean method18486(int i) {
	return aClass177Array11874[i].modifiesAlpha;
    }
    
    public boolean method18487(int i) {
	return aClass177Array11874[i].modifiesColour;
    }
    
    public boolean method18488(int i, int i_15_) {
	return aClass177Array11874[i].modifiesAlpha;
    }
}
