/* Class122_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class122_Sub9 extends Class122
{
    Class142 aClass142_8980;
    static final String aString8981
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    boolean aBool8982;
    boolean aBool8983 = false;
    static final String aString8984
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    Class140 aClass140_8985;
    
    void method2105(int i, int i_0_) {
	if (aBool8983) {
	    int i_1_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_2_ = i_0_ & 0xffff;
	    float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
	    float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
	    float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
	    int i_6_ = i_0_ >> 27 & 0xf;
	    int i_7_ = aClass142_8980.anInt1662;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"),
			       (float) (i_1_ * aClass182_Sub3_1445.anInt9721
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_,
							   "breakWaterDepth"),
			       (float) i_2_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_,
							   "breakWaterOffset"),
			       f_3_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_,
							   "waveIntensity"),
			       f_5_, f_4_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_,
							   "waveExponent"),
			       (float) i_6_);
	}
    }
    
    boolean method2117() {
	return aBool8982;
    }
    
    void method2106(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aBool8982 && class136_sub3 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass182_Sub3_1445
					      .aFloatArray9660[1])) * 2.0F;
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445
		.method15395(aClass140_8985.aClass136_Sub1_1652);
	    int i = aClass142_8980.anInt1662;
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
			       aClass182_Sub3_1445.aFloat9755 * f,
			       aClass182_Sub3_1445.aFloat9756 * f,
			       aClass182_Sub3_1445.aFloat9708 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass182_Sub3_1445
						.aFloatArray9660[1]) * 928.0F);
	    aBool8983 = true;
	}
    }
    
    void method2112(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aBool8982 && class136_sub3 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass182_Sub3_1445
					      .aFloatArray9660[1])) * 2.0F;
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445
		.method15395(aClass140_8985.aClass136_Sub1_1652);
	    int i = aClass142_8980.anInt1662;
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
			       aClass182_Sub3_1445.aFloat9755 * f,
			       aClass182_Sub3_1445.aFloat9756 * f,
			       aClass182_Sub3_1445.aFloat9708 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass182_Sub3_1445
						.aFloatArray9660[1]) * 928.0F);
	    aBool8983 = true;
	}
    }
    
    void method2108() {
	if (aBool8983) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445.method15395(null);
	    OpenGL.glUseProgram(0);
	    aBool8983 = false;
	}
    }
    
    void method2109(Class136 class136, int i) {
	if (!aBool8983) {
	    aClass182_Sub3_1445.method15395(class136);
	    aClass182_Sub3_1445.method15396(i);
	}
    }
    
    void method2110(Class136 class136, int i) {
	if (!aBool8983) {
	    aClass182_Sub3_1445.method15395(class136);
	    aClass182_Sub3_1445.method15396(i);
	}
    }
    
    boolean method2118() {
	return aBool8982;
    }
    
    void method2111() {
	if (aBool8983) {
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(null);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445.method15395(null);
	    OpenGL.glUseProgram(0);
	    aBool8983 = false;
	}
    }
    
    void method2113(boolean bool) {
	Class136_Sub3 class136_sub3 = aClass182_Sub3_1445.method15374();
	if (aBool8982 && class136_sub3 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass182_Sub3_1445
					      .aFloatArray9660[1])) * 2.0F;
	    aClass182_Sub3_1445.method15394(1);
	    aClass182_Sub3_1445.method15395(class136_sub3);
	    aClass182_Sub3_1445.method15394(0);
	    aClass182_Sub3_1445
		.method15395(aClass140_8985.aClass136_Sub1_1652);
	    int i = aClass142_8980.anInt1662;
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
			       aClass182_Sub3_1445.aFloat9755 * f,
			       aClass182_Sub3_1445.aFloat9756 * f,
			       aClass182_Sub3_1445.aFloat9708 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass182_Sub3_1445
						.aFloatArray9660[1]) * 928.0F);
	    aBool8983 = true;
	}
    }
    
    void method2114(boolean bool) {
	/* empty */
    }
    
    void method2115(boolean bool) {
	/* empty */
    }
    
    void method2116(boolean bool) {
	/* empty */
    }
    
    Class122_Sub9(Class182_Sub3 class182_sub3, Class140 class140) {
	super(class182_sub3);
	aBool8982 = false;
	aClass140_8985 = class140;
	if (aClass140_8985.aClass136_Sub1_1652 != null
	    && aClass182_Sub3_1445.aBool9812
	    && aClass182_Sub3_1445.aBool9780) {
	    Class119 class119
		= (Class119.method2100
		   (aClass182_Sub3_1445, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class119 class119_8_
		= (Class119.method2100
		   (aClass182_Sub3_1445, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    aClass142_8980
		= Class142.method2341(aClass182_Sub3_1445,
				      new Class119[] { class119,
						       class119_8_ });
	    aBool8982 = aClass142_8980 != null;
	}
    }
    
    void method2107(int i, int i_9_) {
	if (aBool8983) {
	    int i_10_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_11_ = i_9_ & 0xffff;
	    float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
	    float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
	    float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
	    int i_15_ = i_9_ >> 27 & 0xf;
	    int i_16_ = aClass142_8980.anInt1662;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"),
			       (float) (i_10_ * aClass182_Sub3_1445.anInt9721
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_,
							   "breakWaterDepth"),
			       (float) i_11_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_,
							   "breakWaterOffset"),
			       f_12_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_,
							   "waveIntensity"),
			       f_14_, f_13_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_,
							   "waveExponent"),
			       (float) i_15_);
	}
    }
}
