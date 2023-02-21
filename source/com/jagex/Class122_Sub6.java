/* Class122_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub6 extends Class122
{
    Class140 aClass140_8956;
    static final String aString8957
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    Class142 aClass142_8958;
    boolean aBool8959 = false;
    boolean aBool8960 = false;
    static final String aString8961
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    
    void method2105(int i, int i_0_) {
	if (aBool8959) {
	    int i_1_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_2_ = i_0_ & 0xffff;
	    float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
	    int i_4_ = aClass142_8958.anInt1662;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"),
			       (float) (i_1_ * aClass182_Sub3_1445.anInt9721
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterDepth"),
			       (float) i_2_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterOffset"),
			       f_3_);
	}
    }
    
    void method2114(boolean bool) {
	/* empty */
    }
    
    void method2111() {
	if (aBool8959) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445.method15395(null);
	    OpenGL.glUseProgram(0);
	    aBool8959 = false;
	}
    }
    
    void method2116(boolean bool) {
	/* empty */
    }
    
    void method2108() {
	if (aBool8959) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445.method15395(null);
	    OpenGL.glUseProgram(0);
	    aBool8959 = false;
	}
    }
    
    boolean method2117() {
	return aBool8960;
    }
    
    void method2110(Class136 class136, int i) {
	if (!aBool8959) {
	    aClass182_Sub3_1445.method15395(class136);
	    aClass182_Sub3_1445.method15396(i);
	}
    }
    
    boolean method2118() {
	return aBool8960;
    }
    
    void method2112(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aBool8960 && class136_sub3 != null) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445
		.method15395(aClass140_8956.aClass136_Sub1_1652);
	    int i = aClass142_8958.anInt1662;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass182_Sub3_1445.aFloatArray9660[0],
			       -aClass182_Sub3_1445.aFloatArray9660[1],
			       -aClass182_Sub3_1445.aFloatArray9660[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass182_Sub3_1445.aFloat9755,
			       aClass182_Sub3_1445.aFloat9756,
			       aClass182_Sub3_1445.aFloat9708, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass182_Sub3_1445
						.aFloatArray9660[1]) * 928.0F);
	    aBool8959 = true;
	}
    }
    
    void method2113(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aBool8960 && class136_sub3 != null) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445
		.method15395(aClass140_8956.aClass136_Sub1_1652);
	    int i = aClass142_8958.anInt1662;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass182_Sub3_1445.aFloatArray9660[0],
			       -aClass182_Sub3_1445.aFloatArray9660[1],
			       -aClass182_Sub3_1445.aFloatArray9660[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass182_Sub3_1445.aFloat9755,
			       aClass182_Sub3_1445.aFloat9756,
			       aClass182_Sub3_1445.aFloat9708, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass182_Sub3_1445
						.aFloatArray9660[1]) * 928.0F);
	    aBool8959 = true;
	}
    }
    
    void method2115(boolean bool) {
	/* empty */
    }
    
    void method2107(int i, int i_5_) {
	if (aBool8959) {
	    int i_6_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_7_ = i_5_ & 0xffff;
	    float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
	    int i_9_ = aClass142_8958.anInt1662;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"),
			       (float) (i_6_ * aClass182_Sub3_1445.anInt9721
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterDepth"),
			       (float) i_7_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterOffset"),
			       f_8_);
	}
    }
    
    Class122_Sub6(Class182_Sub3 class182_sub3, Class140 class140) {
	super(class182_sub3);
	aClass140_8956 = class140;
	if (aClass140_8956.aClass136_Sub1_1652 != null
	    && aClass182_Sub3_1445.aBool9812
	    && aClass182_Sub3_1445.aBool9780) {
	    Class119 class119
		= (Class119.method2100
		   (aClass182_Sub3_1445, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class119 class119_10_
		= (Class119.method2100
		   (aClass182_Sub3_1445, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    aClass142_8958
		= Class142.method2341(aClass182_Sub3_1445,
				      new Class119[] { class119,
						       class119_10_ });
	    aBool8960 = aClass142_8958 != null;
	}
    }
    
    void method2106(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aBool8960 && class136_sub3 != null) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445
		.method15395(aClass140_8956.aClass136_Sub1_1652);
	    int i = aClass142_8958.anInt1662;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass182_Sub3_1445.aFloatArray9660[0],
			       -aClass182_Sub3_1445.aFloatArray9660[1],
			       -aClass182_Sub3_1445.aFloatArray9660[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass182_Sub3_1445.aFloat9755,
			       aClass182_Sub3_1445.aFloat9756,
			       aClass182_Sub3_1445.aFloat9708, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass182_Sub3_1445
						.aFloatArray9660[1]) * 928.0F);
	    aBool8959 = true;
	}
    }
    
    void method2109(Class136 class136, int i) {
	if (!aBool8959) {
	    aClass182_Sub3_1445.method15395(class136);
	    aClass182_Sub3_1445.method15396(i);
	}
    }
}
