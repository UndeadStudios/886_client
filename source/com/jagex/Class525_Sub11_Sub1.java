/* Class525_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class525_Sub11_Sub1 extends Class525_Sub11
{
    static float aFloat11635 = 1.0F;
    static float aFloat11636 = 0.0F;
    static float aFloat11637;
    static float aFloat11638;
    static final String aString11639
	= "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
    static float aFloat11640 = 1.0F;
    Class142 aClass142_11641;
    
    boolean method16212() {
	if (aClass182_Sub3_10511.aBool9780) {
	    aClass142_11641
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return aClass142_11641 != null;
	}
	return false;
    }
    
    void method16218(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_0_, int i_1_, int i_2_) {
	int i_3_ = aClass142_11641.anInt1662;
	OpenGL.glUseProgram(i_3_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3_, "paramsGamma"),
			   aFloat11635);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_, "paramsRanges"),
			   aFloat11636, aFloat11640, aFloat11638, aFloat11637);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16220(int i) {
	OpenGL.glUseProgram(0);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(null);
    }
    
    boolean method16219() {
	if (aClass182_Sub3_10511.aBool9780) {
	    aClass142_11641
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return aClass142_11641 != null;
	}
	return false;
    }
    
    void method16201(int i, int i_4_) {
	/* empty */
    }
    
    boolean method16198() {
	return aClass142_11641 != null;
    }
    
    boolean method18211() {
	return aClass182_Sub3_10511.aBool9780;
    }
    
    boolean method16211() {
	return aClass142_11641 != null;
    }
    
    Class178 method16228() {
	return Class178.aClass178_1905;
    }
    
    int method16199() {
	return 1;
    }
    
    boolean method16209() {
	return (aFloat11635 == 1.0F && aFloat11636 == 0.0F
		&& aFloat11640 == 1.0F && aFloat11638 == 0.0F
		&& aFloat11637 == 1.0F);
    }
    
    static {
	aFloat11638 = 0.0F;
	aFloat11637 = 1.0F;
    }
    
    boolean method16208() {
	return aClass142_11641 != null;
    }
    
    void method16203() {
	aClass142_11641 = null;
    }
    
    Class525_Sub11_Sub1(Class182_Sub3 class182_sub3) {
	super(class182_sub3);
    }
    
    void method16213(int i, int i_5_) {
	/* empty */
    }
    
    void method16207(int i, int i_6_) {
	/* empty */
    }
    
    Class178 method16224() {
	return Class178.aClass178_1905;
    }
    
    void method16197(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_7_, int i_8_, int i_9_) {
	int i_10_ = aClass142_11641.anInt1662;
	OpenGL.glUseProgram(i_10_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "paramsGamma"),
			   aFloat11635);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_10_, "paramsRanges"),
			   aFloat11636, aFloat11640, aFloat11638, aFloat11637);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16216(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_11_, int i_12_, int i_13_) {
	int i_14_ = aClass142_11641.anInt1662;
	OpenGL.glUseProgram(i_14_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "paramsGamma"),
			   aFloat11635);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_14_, "paramsRanges"),
			   aFloat11636, aFloat11640, aFloat11638, aFloat11637);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16214(int i) {
	OpenGL.glUseProgram(0);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(null);
    }
    
    void method16210(int i) {
	OpenGL.glUseProgram(0);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(null);
    }
    
    int method16221() {
	return 1;
    }
    
    void method16200(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_15_, int i_16_, int i_17_) {
	int i_18_ = aClass142_11641.anInt1662;
	OpenGL.glUseProgram(i_18_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_18_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_18_, "paramsGamma"),
			   aFloat11635);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_18_, "paramsRanges"),
			   aFloat11636, aFloat11640, aFloat11638, aFloat11637);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    Class178 method16225() {
	return Class178.aClass178_1905;
    }
    
    boolean method16202() {
	return (aFloat11635 == 1.0F && aFloat11636 == 0.0F
		&& aFloat11640 == 1.0F && aFloat11638 == 0.0F
		&& aFloat11637 == 1.0F);
    }
    
    boolean method18212() {
	return aClass182_Sub3_10511.aBool9780;
    }
    
    void method16229() {
	aClass142_11641 = null;
    }
    
    void method16230() {
	aClass142_11641 = null;
    }
}
