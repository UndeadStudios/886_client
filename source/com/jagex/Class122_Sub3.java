/* Class122_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub3 extends Class122
{
    Class143 aClass143_8924;
    static final String aString8925
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    static final String aString8926
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    boolean aBool8927;
    boolean aBool8928;
    boolean aBool8929;
    boolean aBool8930 = false;
    Class143 aClass143_8931;
    Class136_Sub2 aClass136_Sub2_8932;
    Class143 aClass143_8933;
    static final String aString8934
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    Class143 aClass143_8935;
    static final String aString8936
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    static float[] aFloatArray8937 = { 0.0F, -1.0F, 0.0F, 0.0F };
    
    boolean method2118() {
	return aBool8927;
    }
    
    boolean method2117() {
	return aBool8927;
    }
    
    void method2106(boolean bool) {
	aBool8928 = bool;
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(aClass136_Sub2_8932);
	aClass182_Sub3_1445.method15398(34165, 7681);
	aClass182_Sub3_1445.method15431(0, 34166, 768);
	aClass182_Sub3_1445.method15431(2, 5890, 770);
	aClass182_Sub3_1445.method15399(0, 34168, 770);
	aClass182_Sub3_1445.method15394(0);
	method14493();
    }
    
    void method2105(int i, int i_0_) {
	/* empty */
    }
    
    void method2110(Class136 class136, int i) {
	if (class136 == null) {
	    if (!aBool8930) {
		aClass182_Sub3_1445
		    .method15395(aClass182_Sub3_1445.aClass136_Sub2_9786);
		aClass182_Sub3_1445.method15396(1);
		aClass182_Sub3_1445.method15431(0, 34168, 768);
		aClass182_Sub3_1445.method15399(0, 34168, 770);
		aBool8930 = true;
	    }
	} else {
	    if (aBool8930) {
		aClass182_Sub3_1445.method15431(0, 5890, 768);
		aClass182_Sub3_1445.method15399(0, 5890, 770);
		aBool8930 = false;
	    }
	    aClass182_Sub3_1445.method15395(class136);
	    aClass182_Sub3_1445.method15396(i);
	}
    }
    
    void method14493() {
	Class435 class435 = aClass182_Sub3_1445.aClass435_9715;
	if (aBool8928)
	    OpenGL.glBindProgramARB(34336, ((aClass182_Sub3_1445.anInt9833
					     == 2147483647)
					    ? aClass143_8935.anInt1665
					    : aClass143_8933.anInt1665));
	else
	    OpenGL.glBindProgramARB(34336, ((aClass182_Sub3_1445.anInt9833
					     == 2147483647)
					    ? aClass143_8931.anInt1665
					    : aClass143_8924.anInt1665));
	float f = (float) aClass182_Sub3_1445.anInt9833;
	float f_1_
	    = class435.aFloatArray4830[4] * f + class435.aFloatArray4830[12];
	float f_2_
	    = class435.aFloatArray4830[5] * f + class435.aFloatArray4830[13];
	float f_3_
	    = class435.aFloatArray4830[6] * f + class435.aFloatArray4830[14];
	aFloatArray8937[0] = -class435.aFloatArray4830[4];
	aFloatArray8937[1] = -class435.aFloatArray4830[5];
	aFloatArray8937[2] = -class435.aFloatArray4830[6];
	aFloatArray8937[3]
	    = -(aFloatArray8937[0] * f_1_ + aFloatArray8937[1] * f_2_
		+ aFloatArray8937[2] * f_3_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8937[0],
					    aFloatArray8937[1],
					    aFloatArray8937[2],
					    aFloatArray8937[3]);
	OpenGL.glEnable(34336);
	aBool8929 = true;
	method14494();
    }
    
    void method2115(boolean bool) {
	/* empty */
    }
    
    void method2116(boolean bool) {
	/* empty */
    }
    
    void method2108() {
	if (aBool8929) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBool8929 = false;
	}
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(null);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aClass182_Sub3_1445.method15431(0, 5890, 768);
	aClass182_Sub3_1445.method15431(2, 34166, 770);
	aClass182_Sub3_1445.method15399(0, 5890, 770);
	aClass182_Sub3_1445.method15394(0);
	if (aBool8930) {
	    aClass182_Sub3_1445.method15431(0, 5890, 768);
	    aClass182_Sub3_1445.method15399(0, 5890, 770);
	    aBool8930 = false;
	}
    }
    
    void method14494() {
	if (aBool8929) {
	    float f = aClass182_Sub3_1445.aFloat9729;
	    float f_4_ = aClass182_Sub3_1445.aFloat9728;
	    float f_5_ = f - (f - f_4_) * 0.125F;
	    float f_6_ = f - (f - f_4_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_6_, f_5_,
		 256.0F / (float) (aClass182_Sub3_1445.aClass176_9757.anInt1879
				   * -734182087),
		 (float) (aClass182_Sub3_1445.aClass176_9757.anInt1883
			  * -2134548585) / 255.0F);
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15400((aClass182_Sub3_1445.aClass176_9757
					     .anInt1877) * 2141545647);
	    aClass182_Sub3_1445.method15394(0);
	}
    }
    
    void method2112(boolean bool) {
	aBool8928 = bool;
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(aClass136_Sub2_8932);
	aClass182_Sub3_1445.method15398(34165, 7681);
	aClass182_Sub3_1445.method15431(0, 34166, 768);
	aClass182_Sub3_1445.method15431(2, 5890, 770);
	aClass182_Sub3_1445.method15399(0, 34168, 770);
	aClass182_Sub3_1445.method15394(0);
	method14493();
    }
    
    void method2113(boolean bool) {
	aBool8928 = bool;
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(aClass136_Sub2_8932);
	aClass182_Sub3_1445.method15398(34165, 7681);
	aClass182_Sub3_1445.method15431(0, 34166, 768);
	aClass182_Sub3_1445.method15431(2, 5890, 770);
	aClass182_Sub3_1445.method15399(0, 34168, 770);
	aClass182_Sub3_1445.method15394(0);
	method14493();
    }
    
    void method2114(boolean bool) {
	/* empty */
    }
    
    void method2107(int i, int i_7_) {
	/* empty */
    }
    
    void method2111() {
	if (aBool8929) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBool8929 = false;
	}
	aClass182_Sub3_1445.method15394(1);
	aClass182_Sub3_1445.method15395(null);
	aClass182_Sub3_1445.method15398(8448, 8448);
	aClass182_Sub3_1445.method15431(0, 5890, 768);
	aClass182_Sub3_1445.method15431(2, 34166, 770);
	aClass182_Sub3_1445.method15399(0, 5890, 770);
	aClass182_Sub3_1445.method15394(0);
	if (aBool8930) {
	    aClass182_Sub3_1445.method15431(0, 5890, 768);
	    aClass182_Sub3_1445.method15399(0, 5890, 770);
	    aBool8930 = false;
	}
    }
    
    Class122_Sub3(Class182_Sub3 class182_sub3) {
	super(class182_sub3);
	if (aClass182_Sub3_1445.aBool9811) {
	    aClass143_8931
		= (Class143.method2353
		   (aClass182_Sub3_1445, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    aClass143_8935
		= (Class143.method2353
		   (aClass182_Sub3_1445, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    aClass143_8924
		= (Class143.method2353
		   (aClass182_Sub3_1445, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    aClass143_8933
		= (Class143.method2353
		   (aClass182_Sub3_1445, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    if (aClass143_8931 != null & aClass143_8935 != null
		& aClass143_8924 != null & aClass143_8933 != null) {
		aClass136_Sub2_8932
		    = new Class136_Sub2(class182_sub3, 3553,
					Class165.aClass165_1772,
					Class178.aClass178_1905, 2, 1, false,
					new byte[] { 0, -1 },
					Class165.aClass165_1772, false);
		aClass136_Sub2_8932.method14474(false, false);
		aBool8927 = true;
	    } else
		aBool8927 = false;
	} else
	    aBool8927 = false;
    }
    
    void method2109(Class136 class136, int i) {
	if (class136 == null) {
	    if (!aBool8930) {
		aClass182_Sub3_1445
		    .method15395(aClass182_Sub3_1445.aClass136_Sub2_9786);
		aClass182_Sub3_1445.method15396(1);
		aClass182_Sub3_1445.method15431(0, 34168, 768);
		aClass182_Sub3_1445.method15399(0, 34168, 770);
		aBool8930 = true;
	    }
	} else {
	    if (aBool8930) {
		aClass182_Sub3_1445.method15431(0, 5890, 768);
		aClass182_Sub3_1445.method15399(0, 5890, 770);
		aBool8930 = false;
	    }
	    aClass182_Sub3_1445.method15395(class136);
	    aClass182_Sub3_1445.method15396(i);
	}
    }
    
    void method14495() {
	Class435 class435 = aClass182_Sub3_1445.aClass435_9715;
	if (aBool8928)
	    OpenGL.glBindProgramARB(34336, ((aClass182_Sub3_1445.anInt9833
					     == 2147483647)
					    ? aClass143_8935.anInt1665
					    : aClass143_8933.anInt1665));
	else
	    OpenGL.glBindProgramARB(34336, ((aClass182_Sub3_1445.anInt9833
					     == 2147483647)
					    ? aClass143_8931.anInt1665
					    : aClass143_8924.anInt1665));
	float f = (float) aClass182_Sub3_1445.anInt9833;
	float f_8_
	    = class435.aFloatArray4830[4] * f + class435.aFloatArray4830[12];
	float f_9_
	    = class435.aFloatArray4830[5] * f + class435.aFloatArray4830[13];
	float f_10_
	    = class435.aFloatArray4830[6] * f + class435.aFloatArray4830[14];
	aFloatArray8937[0] = -class435.aFloatArray4830[4];
	aFloatArray8937[1] = -class435.aFloatArray4830[5];
	aFloatArray8937[2] = -class435.aFloatArray4830[6];
	aFloatArray8937[3]
	    = -(aFloatArray8937[0] * f_8_ + aFloatArray8937[1] * f_9_
		+ aFloatArray8937[2] * f_10_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8937[0],
					    aFloatArray8937[1],
					    aFloatArray8937[2],
					    aFloatArray8937[3]);
	OpenGL.glEnable(34336);
	aBool8929 = true;
	method14494();
    }
}
