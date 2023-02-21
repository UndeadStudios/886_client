/* Class122_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub1 extends Class122
{
    Class126 aClass126_8912;
    static final char aChar8913 = '\0';
    static final String aString8914
	= "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
    float[] aFloatArray8915;
    int anInt8916;
    Class140 aClass140_8917;
    float aFloat8918;
    Class143 aClass143_8919;
    static final char aChar8920 = '\001';
    static float[] aFloatArray8921 = new float[4];
    
    void method2110(Class136 class136, int i) {
	aClass182_Sub3_1445.method15395(class136);
	aClass182_Sub3_1445.method15396(i);
    }
    
    boolean method2117() {
	return true;
    }
    
    void method14470() {
	aClass126_8912 = new Class126(aClass182_Sub3_1445, 2);
	aClass126_8912.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15400(-16777216);
	aClass182_Sub3_1445.method15398(260, 7681);
	aClass182_Sub3_1445.method15399(0, 34166, 770);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glBindProgramARB(34336, aClass143_8919.anInt1665);
	OpenGL.glEnable(34336);
	aClass126_8912.method2238();
	aClass126_8912.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass182_Sub3_1445.method15396(0);
	aClass182_Sub3_1445.method15399(0, 5890, 770);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass126_8912.method2238();
    }
    
    Class122_Sub1(Class182_Sub3 class182_sub3, Class140 class140) {
	super(class182_sub3);
	aClass140_8917 = class140;
	if (aClass182_Sub3_1445.aBool9811
	    && aClass182_Sub3_1445.anInt9794 >= 2) {
	    aClass143_8919
		= (Class143.method2353
		   (aClass182_Sub3_1445, 34336,
		    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
	    if (aClass143_8919 != null) {
		int[][] is = Class518.method8641(64, 256, 0, 4, 4, 3, 0.4F,
						 false, -395343630);
		int[][] is_0_ = Class518.method8641(64, 256, 8, 4, 4, 3, 0.4F,
						    false, -1310261548);
		int i = 0;
		aFloatArray8915 = new float[32768];
		for (int i_1_ = 0; i_1_ < 256; i_1_++) {
		    int[] is_2_ = is[i_1_];
		    int[] is_3_ = is_0_[i_1_];
		    for (int i_4_ = 0; i_4_ < 64; i_4_++) {
			aFloatArray8915[i++] = (float) is_2_[i_4_] / 4096.0F;
			aFloatArray8915[i++] = (float) is_3_[i_4_] / 4096.0F;
		    }
		}
		method14470();
	    }
	}
    }
    
    void method2116(boolean bool) {
	/* empty */
    }
    
    void method2107(int i, int i_5_) {
	if (aClass126_8912 != null) {
	    aClass182_Sub3_1445.method15394(1);
	    if ((i & 0x80) == 0) {
		if ((i_5_ & 0x1) == 1) {
		    if (!aClass140_8917.aBool1647) {
			int i_6_
			    = aClass182_Sub3_1445.anInt9721 % 4000 * 16 / 4000;
			aClass182_Sub3_1445.method15395
			    (aClass140_8917.aClass136_Sub2Array1646[i_6_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			aClass182_Sub3_1445
			    .method15395(aClass140_8917.aClass136_Sub1_1649);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    aFloat8918, 0.0F,
							    0.0F, 1.0F);
		    }
		} else {
		    if (aClass140_8917.aBool1647)
			aClass182_Sub3_1445
			    .method15395(aClass140_8917.aClass136_Sub1_1649);
		    else
			aClass182_Sub3_1445.method15395
			    (aClass140_8917.aClass136_Sub2Array1646[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8921[0] = (aClass182_Sub3_1445.aFloat9834
				      * aClass182_Sub3_1445.aFloat9755);
		aFloatArray8921[1] = (aClass182_Sub3_1445.aFloat9834
				      * aClass182_Sub3_1445.aFloat9756);
		aFloatArray8921[2] = (aClass182_Sub3_1445.aFloat9834
				      * aClass182_Sub3_1445.aFloat9708);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8921, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_7_ = i & 0x3;
	    if (i_7_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_7_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method2108() {
	if (aClass126_8912 != null) {
	    aClass126_8912.method2234('\001');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	}
    }
    
    void method2112(boolean bool) {
	if (aClass126_8912 != null) {
	    aClass126_8912.method2234('\0');
	    aClass182_Sub3_1445.method15394(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass182_Sub3_1445.aClass435_9716
				  .aFloatArray4830),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    if (anInt8916 != aClass182_Sub3_1445.anInt9721) {
		int i = aClass182_Sub3_1445.anInt9721 % 5000 * 128 / 5000;
		for (int i_8_ = 0; i_8_ < 64; i_8_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_8_,
							 aFloatArray8915, i);
		    i += 2;
		}
		if (aClass140_8917.aBool1647)
		    aFloat8918 = (float) (aClass182_Sub3_1445.anInt9721
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8916 = aClass182_Sub3_1445.anInt9721;
	    }
	}
    }
    
    void method2113(boolean bool) {
	if (aClass126_8912 != null) {
	    aClass126_8912.method2234('\0');
	    aClass182_Sub3_1445.method15394(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass182_Sub3_1445.aClass435_9716
				  .aFloatArray4830),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    if (anInt8916 != aClass182_Sub3_1445.anInt9721) {
		int i = aClass182_Sub3_1445.anInt9721 % 5000 * 128 / 5000;
		for (int i_9_ = 0; i_9_ < 64; i_9_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_9_,
							 aFloatArray8915, i);
		    i += 2;
		}
		if (aClass140_8917.aBool1647)
		    aFloat8918 = (float) (aClass182_Sub3_1445.anInt9721
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8916 = aClass182_Sub3_1445.anInt9721;
	    }
	}
    }
    
    boolean method2118() {
	return true;
    }
    
    void method2106(boolean bool) {
	if (aClass126_8912 != null) {
	    aClass126_8912.method2234('\0');
	    aClass182_Sub3_1445.method15394(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass182_Sub3_1445.aClass435_9716
				  .aFloatArray4830),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass182_Sub3_1445.method15394(0);
	    if (anInt8916 != aClass182_Sub3_1445.anInt9721) {
		int i = aClass182_Sub3_1445.anInt9721 % 5000 * 128 / 5000;
		for (int i_10_ = 0; i_10_ < 64; i_10_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_10_,
							 aFloatArray8915, i);
		    i += 2;
		}
		if (aClass140_8917.aBool1647)
		    aFloat8918 = (float) (aClass182_Sub3_1445.anInt9721
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8916 = aClass182_Sub3_1445.anInt9721;
	    }
	}
    }
    
    void method14471() {
	aClass126_8912 = new Class126(aClass182_Sub3_1445, 2);
	aClass126_8912.method2233(0);
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15400(-16777216);
	aClass182_Sub3_1445.method15398(260, 7681);
	aClass182_Sub3_1445.method15399(0, 34166, 770);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glBindProgramARB(34336, aClass143_8919.anInt1665);
	OpenGL.glEnable(34336);
	aClass126_8912.method2238();
	aClass126_8912.method2233(1);
	aClass182_Sub3_1445.method15394(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass182_Sub3_1445.method15396(0);
	aClass182_Sub3_1445.method15399(0, 5890, 770);
	aClass182_Sub3_1445.method15394(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass126_8912.method2238();
    }
    
    void method2114(boolean bool) {
	/* empty */
    }
    
    void method2115(boolean bool) {
	/* empty */
    }
    
    void method2111() {
	if (aClass126_8912 != null) {
	    aClass126_8912.method2234('\001');
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	}
    }
    
    void method2105(int i, int i_11_) {
	if (aClass126_8912 != null) {
	    aClass182_Sub3_1445.method15394(1);
	    if ((i & 0x80) == 0) {
		if ((i_11_ & 0x1) == 1) {
		    if (!aClass140_8917.aBool1647) {
			int i_12_
			    = aClass182_Sub3_1445.anInt9721 % 4000 * 16 / 4000;
			aClass182_Sub3_1445.method15395
			    (aClass140_8917.aClass136_Sub2Array1646[i_12_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			aClass182_Sub3_1445
			    .method15395(aClass140_8917.aClass136_Sub1_1649);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    aFloat8918, 0.0F,
							    0.0F, 1.0F);
		    }
		} else {
		    if (aClass140_8917.aBool1647)
			aClass182_Sub3_1445
			    .method15395(aClass140_8917.aClass136_Sub1_1649);
		    else
			aClass182_Sub3_1445.method15395
			    (aClass140_8917.aClass136_Sub2Array1646[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8921[0] = (aClass182_Sub3_1445.aFloat9834
				      * aClass182_Sub3_1445.aFloat9755);
		aFloatArray8921[1] = (aClass182_Sub3_1445.aFloat9834
				      * aClass182_Sub3_1445.aFloat9756);
		aFloatArray8921[2] = (aClass182_Sub3_1445.aFloat9834
				      * aClass182_Sub3_1445.aFloat9708);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8921, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_13_ = i & 0x3;
	    if (i_13_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_13_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method2109(Class136 class136, int i) {
	aClass182_Sub3_1445.method15395(class136);
	aClass182_Sub3_1445.method15396(i);
    }
}
