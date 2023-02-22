/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class AnimationFrame
{
    short[] skippedRefrences;
    static short[] bufferX;
    static short[] bufferY;
    static short[] bufferZ;
    static short[] indicesBuffer = new short[500];
    static byte[] flagsBuffer;
    AnimationFrameBase base = null;
    int transformationCount = 0;
    short[] transformationIndices;
    short[] transformationZ;
    short[] transformationY;
    static final int anInt1896 = 2;
    short[] transformationX;
    byte[] transformationFlags;
    boolean modifiesAlpha = false;
    static short[] skipped;
    boolean modifiesColour = false;
    boolean aBool1902 = false;
    static final int anInt1903 = 1;
    static final int anInt1904 = 2;
    
    AnimationFrame(byte[] is, AnimationFrameBase class525_sub14) {
	base = class525_sub14;
	try {
	    RSBuffer attributes = new RSBuffer(is);
	    RSBuffer transformations = new RSBuffer(is);
	    int version = attributes.readUnsignedByte(1005005350);
	    attributes.index += 678856942;
	    int count = attributes.readUnsignedShort((byte) 80);
	    int used = 0;
	    int last = -1;
	    int lastUsed = -1;
	    transformations.index = (attributes.index * -1133521593 + count) * 339428471;
	    for (int index_ = 0; index_ < count; index_++) {
		int type = base.transformationTypes[index_];
		if (type == 0)
		    last = index_;
		int attribute = attributes.readUnsignedByte(1502456173);
		if (attribute > 0) {
		    if (type == 0)
				lastUsed = index_;
			indicesBuffer[used] = (short) index_;
		    short value = 0;
		    if (type == 3 || type == 10)
			value = (short) 128;
		    if (version >= 2 && type == 7) {
			if ((attribute & 0x1) != 0) {
				bufferX[used]
				= (short) transformations
					      .readSmart3(993241788);
			    transformations.readSmart3(993241788);
			} else
			    bufferX[used] = value;
			if ((attribute & 0x2) != 0) {
				bufferY[used]
				= (short) transformations
					      .readSmart3(993241788);
			    transformations.readSmart3(993241788);
			} else
			    bufferY[used] = value;
			if ((attribute & 0x4) != 0) {
				bufferZ[used]
				= (short) transformations
					      .readSmart3(993241788);
			    transformations.readSmart3(993241788);
			} else
			    bufferZ[used] = value;
		    } else {
			if ((attribute & 0x1) != 0)
			    bufferX[used]
				= (short) transformations
					      .readSmart3(993241788);
			else
			    bufferX[used] = value;
			if ((attribute & 0x2) != 0)
			    bufferY[used]
				= (short) transformations
					      .readSmart3(993241788);
			else
			    bufferY[used] = value;
			if ((attribute & 0x4) != 0)
			    bufferZ[used]
				= (short) transformations
					      .readSmart3(993241788);
			else
			    bufferZ[used] = value;
		    }
			flagsBuffer[used] = (byte) (attribute >>> 3 & 0x3);
		    if (type == 2 || type == 9) {
			bufferX[used]
			    = (short) (bufferX[used] << 2 & 0x3fff);
			bufferY[used]
			    = (short) (bufferY[used] << 2 & 0x3fff);
			bufferZ[used]
			    = (short) (bufferZ[used] << 2 & 0x3fff);
		    }
			skipped[used] = (short) -1;
		    if (type == 1 || type == 2 || type == 3) {
			if (last > 	lastUsed) {
			    skipped[used] = (short) last;
			    	lastUsed = last;
			}
		    } else if (type == 5)
			modifiesAlpha = true;
		    else if (type == 7)
			modifiesColour = true;
		    else if (type == 9 || type == 10 || type == 8)
			aBool1902 = true;
		    used++;
		}
	    }
	    if (transformations.index * -1133521593 != is.length)
		throw new RuntimeException();
		transformationCount = used;
		transformationIndices = new short[used];
		transformationX = new short[used];
		transformationY = new short[used];
		transformationZ = new short[used];
		skippedRefrences = new short[used];
		transformationFlags = new byte[used];
	    for (int i_9_ = 0; i_9_ < used; i_9_++) {
		transformationIndices[i_9_] = indicesBuffer[i_9_];
		transformationX[i_9_] = bufferX[i_9_];
		transformationY[i_9_] = bufferY[i_9_];
		transformationZ[i_9_] = bufferZ[i_9_];
		skippedRefrences[i_9_] = skipped[i_9_];
		transformationFlags[i_9_] = flagsBuffer[i_9_];
	    }
	} catch (Exception exception) {
	    transformationCount = 0;
	    modifiesAlpha = false;
	    modifiesColour = false;
	}
    }
    
    static {
	bufferX = new short[500];
	bufferY = new short[500];
	bufferZ = new short[500];
	skipped = new short[500];
	flagsBuffer = new byte[500];
    }
}
