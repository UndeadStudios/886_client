/* Class525_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class525_Sub11_Sub2 extends Class525_Sub11
{
    Class142 aClass142_11674;
    static float aFloat11675 = 0.25F;
    Class142 aClass142_11676;
    static float aFloat11677;
    static final String aString11678
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    int anInt11679;
    static final String aString11680
	= "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
    int anInt11681;
    Class168_Sub2_Sub2 aClass168_Sub2_Sub2_11682;
    static final String aString11683
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
    Class136_Sub2 aClass136_Sub2_11684;
    static final int anInt11685 = 256;
    Class136_Sub2 aClass136_Sub2_11686;
    Class136_Sub2[] aClass136_Sub2Array11687;
    static float aFloat11688 = 1.0F;
    int anInt11689;
    int anInt11690;
    Class142 aClass142_11691;
    Class142 aClass142_11692;
    static final String aString11693
	= "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    Class168_Sub2_Sub2 aClass168_Sub2_Sub2_11694;
    
    static {
	aFloat11677 = 1.0F;
    }
    
    boolean method18221() {
	return (aClass182_Sub3_10511.aBool9797
		&& aClass182_Sub3_10511.aBool9780
		&& aClass182_Sub3_10511.aBool9726);
    }
    
    boolean method16198() {
	return aClass168_Sub2_Sub2_11682 != null;
    }
    
    boolean method16219() {
	if (aClass182_Sub3_10511.aBool9797 && aClass182_Sub3_10511.aBool9780
	    && aClass182_Sub3_10511.aBool9726) {
	    aClass168_Sub2_Sub2_11682
		= new Class168_Sub2_Sub2(aClass182_Sub3_10511);
	    aClass136_Sub2_11684
		= new Class136_Sub2(aClass182_Sub3_10511, 3553,
				    Class165.aClass165_1771, method16228(),
				    256, 256);
	    aClass136_Sub2_11684.method14474(false, false);
	    aClass136_Sub2_11686
		= new Class136_Sub2(aClass182_Sub3_10511, 3553,
				    Class165.aClass165_1771, method16228(),
				    256, 256);
	    aClass136_Sub2_11686.method14474(false, false);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682
		.method15585(0, aClass136_Sub2_11684.method14472(0));
	    aClass168_Sub2_Sub2_11682
		.method15585(1, aClass136_Sub2_11686.method14472(0));
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    if (!aClass168_Sub2_Sub2_11682.method15588()) {
		aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
						-1876999470);
		return false;
	    }
	    aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
					    -1876999470);
	    aClass142_11674
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass142_11676
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass142_11692
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    aClass142_11691
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass142_11676 != null && aClass142_11674 != null
		    && aClass142_11692 != null && aClass142_11691 != null);
	}
	return false;
    }
    
    void method16201(int i, int i_0_) {
	anInt11681 = i;
	anInt11679 = i_0_;
	int i_1_ = Class696_Sub18.method17142(anInt11681, (byte) 127);
	int i_2_ = Class696_Sub18.method17142(anInt11679, (byte) 14);
	if (anInt11689 != i_1_ || anInt11690 != i_2_) {
	    if (aClass136_Sub2Array11687 != null) {
		for (int i_3_ = 0; i_3_ < aClass136_Sub2Array11687.length;
		     i_3_++)
		    aClass136_Sub2Array11687[i_3_].method2310();
		aClass136_Sub2Array11687 = null;
	    }
	    if (i_1_ > 256 || i_2_ > 256) {
		int i_4_ = i_1_;
		int i_5_ = i_2_;
		int i_6_ = 0;
		while (i_4_ > 256 || i_5_ > 256) {
		    if (i_4_ > 256)
			i_4_ >>= 1;
		    if (i_5_ > 256)
			i_5_ >>= 1;
		    i_6_++;
		}
		if (aClass168_Sub2_Sub2_11694 == null)
		    aClass168_Sub2_Sub2_11694
			= new Class168_Sub2_Sub2(aClass182_Sub3_10511);
		aClass136_Sub2Array11687 = new Class136_Sub2[i_6_];
		i_4_ = i_1_;
		i_5_ = i_2_;
		i_6_ = 0;
		while (i_4_ > 256 || i_5_ > 256) {
		    aClass136_Sub2Array11687[i_6_++]
			= new Class136_Sub2(aClass182_Sub3_10511, 3553,
					    Class165.aClass165_1771,
					    method16228(), i_4_, i_5_);
		    if (i_4_ > 256)
			i_4_ >>= 1;
		    if (i_5_ > 256)
			i_5_ >>= 1;
		}
	    } else
		aClass168_Sub2_Sub2_11694 = null;
	    anInt11689 = i_1_;
	    anInt11690 = i_2_;
	}
    }
    
    void method16203() {
	anInt11690 = -1;
	anInt11689 = -1;
	aClass168_Sub2_Sub2_11694 = null;
	aClass136_Sub2Array11687 = null;
	aClass168_Sub2_Sub2_11682 = null;
	aClass136_Sub2_11684 = null;
	aClass136_Sub2_11686 = null;
	aClass142_11674 = null;
	aClass142_11676 = null;
	aClass142_11692 = null;
	aClass142_11691 = null;
    }
    
    void method16200(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_7_, int i_8_, int i_9_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass136_Sub2Array11687 != null) {
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11694,
					    -1166817212);
	    int i_10_ = Class696_Sub18.method17142(anInt11681, (byte) 7);
	    int i_11_ = Class696_Sub18.method17142(anInt11679, (byte) 116);
	    int i_12_ = 0;
	    while (i_10_ > 256 || i_11_ > 256) {
		OpenGL.glViewport(0, 0, i_10_, i_11_);
		aClass168_Sub2_Sub2_11694.method15585(0,
						      aClass136_Sub2Array11687
							  [i_12_]
							  .method14472(0));
		if (i_12_ == 0) {
		    aClass182_Sub3_10511.method15395(class136_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11679 - i_8_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_9_),
					(float) (anInt11679 - i_8_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_9_),
					(float) anInt11679);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass182_Sub3_10511
			.method15395(aClass136_Sub2Array11687[i_12_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_10_ > 256)
		    i_10_ >>= 1;
		if (i_11_ > 256)
		    i_11_ >>= 1;
		i_12_++;
	    }
	    aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11694,
					    -1876999470);
	    aClass182_Sub3_10511
		.method15395(aClass136_Sub2Array11687[i_12_ - 1]);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_13_ = aClass142_11676.anInt1662;
	    OpenGL.glUseProgram(i_13_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_13_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_13_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_14_ = aClass142_11674.anInt1662;
	    OpenGL.glUseProgram(i_14_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_14_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_14_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, (float) anInt11679);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass168_Sub2_Sub2_11682.method18155(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	int i_15_ = aClass142_11691.anInt1662;
	OpenGL.glUseProgram(i_15_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_15_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_15_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass168_Sub2_Sub2_11682.method18155(0);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11686);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_15_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
					-1876999470);
	int i_16_ = aClass142_11692.anInt1662;
	OpenGL.glUseProgram(i_16_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_16_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_16_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_16_, "params"),
			   aFloat11675, aFloat11688, 0.0F);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16210(int i) {
	OpenGL.glUseProgram(0);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(null);
	aClass182_Sub3_10511.method15394(0);
    }
    
    Class178 method16228() {
	return Class178.aClass178_1912;
    }
    
    int method16199() {
	return 0;
    }
    
    boolean method16209() {
	return false;
    }
    
    void method16207(int i, int i_17_) {
	anInt11681 = i;
	anInt11679 = i_17_;
	int i_18_ = Class696_Sub18.method17142(anInt11681, (byte) 120);
	int i_19_ = Class696_Sub18.method17142(anInt11679, (byte) 10);
	if (anInt11689 != i_18_ || anInt11690 != i_19_) {
	    if (aClass136_Sub2Array11687 != null) {
		for (int i_20_ = 0; i_20_ < aClass136_Sub2Array11687.length;
		     i_20_++)
		    aClass136_Sub2Array11687[i_20_].method2310();
		aClass136_Sub2Array11687 = null;
	    }
	    if (i_18_ > 256 || i_19_ > 256) {
		int i_21_ = i_18_;
		int i_22_ = i_19_;
		int i_23_ = 0;
		while (i_21_ > 256 || i_22_ > 256) {
		    if (i_21_ > 256)
			i_21_ >>= 1;
		    if (i_22_ > 256)
			i_22_ >>= 1;
		    i_23_++;
		}
		if (aClass168_Sub2_Sub2_11694 == null)
		    aClass168_Sub2_Sub2_11694
			= new Class168_Sub2_Sub2(aClass182_Sub3_10511);
		aClass136_Sub2Array11687 = new Class136_Sub2[i_23_];
		i_21_ = i_18_;
		i_22_ = i_19_;
		i_23_ = 0;
		while (i_21_ > 256 || i_22_ > 256) {
		    aClass136_Sub2Array11687[i_23_++]
			= new Class136_Sub2(aClass182_Sub3_10511, 3553,
					    Class165.aClass165_1771,
					    method16228(), i_21_, i_22_);
		    if (i_21_ > 256)
			i_21_ >>= 1;
		    if (i_22_ > 256)
			i_22_ >>= 1;
		}
	    } else
		aClass168_Sub2_Sub2_11694 = null;
	    anInt11689 = i_18_;
	    anInt11690 = i_19_;
	}
    }
    
    boolean method16208() {
	return aClass168_Sub2_Sub2_11682 != null;
    }
    
    boolean method16211() {
	return aClass168_Sub2_Sub2_11682 != null;
    }
    
    boolean method16212() {
	if (aClass182_Sub3_10511.aBool9797 && aClass182_Sub3_10511.aBool9780
	    && aClass182_Sub3_10511.aBool9726) {
	    aClass168_Sub2_Sub2_11682
		= new Class168_Sub2_Sub2(aClass182_Sub3_10511);
	    aClass136_Sub2_11684
		= new Class136_Sub2(aClass182_Sub3_10511, 3553,
				    Class165.aClass165_1771, method16228(),
				    256, 256);
	    aClass136_Sub2_11684.method14474(false, false);
	    aClass136_Sub2_11686
		= new Class136_Sub2(aClass182_Sub3_10511, 3553,
				    Class165.aClass165_1771, method16228(),
				    256, 256);
	    aClass136_Sub2_11686.method14474(false, false);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682
		.method15585(0, aClass136_Sub2_11684.method14472(0));
	    aClass168_Sub2_Sub2_11682
		.method15585(1, aClass136_Sub2_11686.method14472(0));
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    if (!aClass168_Sub2_Sub2_11682.method15588()) {
		aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
						-1876999470);
		return false;
	    }
	    aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
					    -1876999470);
	    aClass142_11674
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass142_11676
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass142_11692
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    aClass142_11691
		= (Class142.method2341
		   (aClass182_Sub3_10511,
		    (new Class119[]
		     { Class119.method2100
		       (aClass182_Sub3_10511, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass142_11676 != null && aClass142_11674 != null
		    && aClass142_11692 != null && aClass142_11691 != null);
	}
	return false;
    }
    
    Class178 method16225() {
	return Class178.aClass178_1912;
    }
    
    boolean method16202() {
	return false;
    }
    
    void method16197(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_24_, int i_25_, int i_26_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass136_Sub2Array11687 != null) {
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11694,
					    -1166817212);
	    int i_27_ = Class696_Sub18.method17142(anInt11681, (byte) 103);
	    int i_28_ = Class696_Sub18.method17142(anInt11679, (byte) 10);
	    int i_29_ = 0;
	    while (i_27_ > 256 || i_28_ > 256) {
		OpenGL.glViewport(0, 0, i_27_, i_28_);
		aClass168_Sub2_Sub2_11694.method15585(0,
						      aClass136_Sub2Array11687
							  [i_29_]
							  .method14472(0));
		if (i_29_ == 0) {
		    aClass182_Sub3_10511.method15395(class136_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11679 - i_25_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_26_),
					(float) (anInt11679 - i_25_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_26_),
					(float) anInt11679);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass182_Sub3_10511
			.method15395(aClass136_Sub2Array11687[i_29_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_27_ > 256)
		    i_27_ >>= 1;
		if (i_28_ > 256)
		    i_28_ >>= 1;
		i_29_++;
	    }
	    aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11694,
					    -1876999470);
	    aClass182_Sub3_10511
		.method15395(aClass136_Sub2Array11687[i_29_ - 1]);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_30_ = aClass142_11676.anInt1662;
	    OpenGL.glUseProgram(i_30_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_30_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_30_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_31_ = aClass142_11674.anInt1662;
	    OpenGL.glUseProgram(i_31_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_31_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_31_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, (float) anInt11679);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass168_Sub2_Sub2_11682.method18155(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	int i_32_ = aClass142_11691.anInt1662;
	OpenGL.glUseProgram(i_32_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_32_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_32_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass168_Sub2_Sub2_11682.method18155(0);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11686);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_32_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
					-1876999470);
	int i_33_ = aClass142_11692.anInt1662;
	OpenGL.glUseProgram(i_33_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_33_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_33_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_33_, "params"),
			   aFloat11675, aFloat11688, 0.0F);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16218(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_34_, int i_35_, int i_36_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass136_Sub2Array11687 != null) {
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11694,
					    -1166817212);
	    int i_37_ = Class696_Sub18.method17142(anInt11681, (byte) 53);
	    int i_38_ = Class696_Sub18.method17142(anInt11679, (byte) 64);
	    int i_39_ = 0;
	    while (i_37_ > 256 || i_38_ > 256) {
		OpenGL.glViewport(0, 0, i_37_, i_38_);
		aClass168_Sub2_Sub2_11694.method15585(0,
						      aClass136_Sub2Array11687
							  [i_39_]
							  .method14472(0));
		if (i_39_ == 0) {
		    aClass182_Sub3_10511.method15395(class136_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11679 - i_35_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_36_),
					(float) (anInt11679 - i_35_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_36_),
					(float) anInt11679);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass182_Sub3_10511
			.method15395(aClass136_Sub2Array11687[i_39_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_37_ > 256)
		    i_37_ >>= 1;
		if (i_38_ > 256)
		    i_38_ >>= 1;
		i_39_++;
	    }
	    aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11694,
					    -1876999470);
	    aClass182_Sub3_10511
		.method15395(aClass136_Sub2Array11687[i_39_ - 1]);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_40_ = aClass142_11676.anInt1662;
	    OpenGL.glUseProgram(i_40_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_40_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_40_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_41_ = aClass142_11674.anInt1662;
	    OpenGL.glUseProgram(i_41_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_41_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_41_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, (float) anInt11679);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass168_Sub2_Sub2_11682.method18155(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	int i_42_ = aClass142_11691.anInt1662;
	OpenGL.glUseProgram(i_42_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_42_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_42_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass168_Sub2_Sub2_11682.method18155(0);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11686);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_42_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
					-1876999470);
	int i_43_ = aClass142_11692.anInt1662;
	OpenGL.glUseProgram(i_43_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_43_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_43_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_43_, "params"),
			   aFloat11675, aFloat11688, 0.0F);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16216(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_44_, int i_45_, int i_46_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass136_Sub2Array11687 != null) {
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11694,
					    -1166817212);
	    int i_47_ = Class696_Sub18.method17142(anInt11681, (byte) 89);
	    int i_48_ = Class696_Sub18.method17142(anInt11679, (byte) 122);
	    int i_49_ = 0;
	    while (i_47_ > 256 || i_48_ > 256) {
		OpenGL.glViewport(0, 0, i_47_, i_48_);
		aClass168_Sub2_Sub2_11694.method15585(0,
						      aClass136_Sub2Array11687
							  [i_49_]
							  .method14472(0));
		if (i_49_ == 0) {
		    aClass182_Sub3_10511.method15395(class136_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11679 - i_45_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_46_),
					(float) (anInt11679 - i_45_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_46_),
					(float) anInt11679);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass182_Sub3_10511
			.method15395(aClass136_Sub2Array11687[i_49_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_47_ > 256)
		    i_47_ >>= 1;
		if (i_48_ > 256)
		    i_48_ >>= 1;
		i_49_++;
	    }
	    aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11694,
					    -1876999470);
	    aClass182_Sub3_10511
		.method15395(aClass136_Sub2Array11687[i_49_ - 1]);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_50_ = aClass142_11676.anInt1662;
	    OpenGL.glUseProgram(i_50_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_50_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_50_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    aClass182_Sub3_10511.method3158(aClass168_Sub2_Sub2_11682,
					    -1166817212);
	    aClass168_Sub2_Sub2_11682.method18155(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_51_ = aClass142_11674.anInt1662;
	    OpenGL.glUseProgram(i_51_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_51_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_51_, "params"),
			       aFloat11677, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11681, (float) anInt11679);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11679);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass168_Sub2_Sub2_11682.method18155(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	int i_52_ = aClass142_11691.anInt1662;
	OpenGL.glUseProgram(i_52_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_52_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_52_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass168_Sub2_Sub2_11682.method18155(0);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11686);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_52_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass182_Sub3_10511.method3159(aClass168_Sub2_Sub2_11682,
					-1876999470);
	int i_53_ = aClass142_11692.anInt1662;
	OpenGL.glUseProgram(i_53_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_53_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_53_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_53_, "params"),
			   aFloat11675, aFloat11688, 0.0F);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(aClass136_Sub2_11684);
	aClass182_Sub3_10511.method15394(0);
	aClass182_Sub3_10511.method15395(class136_sub2);
    }
    
    void method16214(int i) {
	OpenGL.glUseProgram(0);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(null);
	aClass182_Sub3_10511.method15394(0);
    }
    
    void method16220(int i) {
	OpenGL.glUseProgram(0);
	aClass182_Sub3_10511.method15394(1);
	aClass182_Sub3_10511.method15395(null);
	aClass182_Sub3_10511.method15394(0);
    }
    
    int method16221() {
	return 0;
    }
    
    Class178 method16224() {
	return Class178.aClass178_1912;
    }
    
    void method16229() {
	anInt11690 = -1;
	anInt11689 = -1;
	aClass168_Sub2_Sub2_11694 = null;
	aClass136_Sub2Array11687 = null;
	aClass168_Sub2_Sub2_11682 = null;
	aClass136_Sub2_11684 = null;
	aClass136_Sub2_11686 = null;
	aClass142_11674 = null;
	aClass142_11676 = null;
	aClass142_11692 = null;
	aClass142_11691 = null;
    }
    
    Class525_Sub11_Sub2(Class182_Sub3 class182_sub3) {
	super(class182_sub3);
    }
    
    void method16213(int i, int i_54_) {
	anInt11681 = i;
	anInt11679 = i_54_;
	int i_55_ = Class696_Sub18.method17142(anInt11681, (byte) 13);
	int i_56_ = Class696_Sub18.method17142(anInt11679, (byte) 6);
	if (anInt11689 != i_55_ || anInt11690 != i_56_) {
	    if (aClass136_Sub2Array11687 != null) {
		for (int i_57_ = 0; i_57_ < aClass136_Sub2Array11687.length;
		     i_57_++)
		    aClass136_Sub2Array11687[i_57_].method2310();
		aClass136_Sub2Array11687 = null;
	    }
	    if (i_55_ > 256 || i_56_ > 256) {
		int i_58_ = i_55_;
		int i_59_ = i_56_;
		int i_60_ = 0;
		while (i_58_ > 256 || i_59_ > 256) {
		    if (i_58_ > 256)
			i_58_ >>= 1;
		    if (i_59_ > 256)
			i_59_ >>= 1;
		    i_60_++;
		}
		if (aClass168_Sub2_Sub2_11694 == null)
		    aClass168_Sub2_Sub2_11694
			= new Class168_Sub2_Sub2(aClass182_Sub3_10511);
		aClass136_Sub2Array11687 = new Class136_Sub2[i_60_];
		i_58_ = i_55_;
		i_59_ = i_56_;
		i_60_ = 0;
		while (i_58_ > 256 || i_59_ > 256) {
		    aClass136_Sub2Array11687[i_60_++]
			= new Class136_Sub2(aClass182_Sub3_10511, 3553,
					    Class165.aClass165_1771,
					    method16228(), i_58_, i_59_);
		    if (i_58_ > 256)
			i_58_ >>= 1;
		    if (i_59_ > 256)
			i_59_ >>= 1;
		}
	    } else
		aClass168_Sub2_Sub2_11694 = null;
	    anInt11689 = i_55_;
	    anInt11690 = i_56_;
	}
    }
    
    void method16230() {
	anInt11690 = -1;
	anInt11689 = -1;
	aClass168_Sub2_Sub2_11694 = null;
	aClass136_Sub2Array11687 = null;
	aClass168_Sub2_Sub2_11682 = null;
	aClass136_Sub2_11684 = null;
	aClass136_Sub2_11686 = null;
	aClass142_11674 = null;
	aClass142_11676 = null;
	aClass142_11692 = null;
	aClass142_11691 = null;
    }
    
    boolean method18222() {
	return (aClass182_Sub3_10511.aBool9797
		&& aClass182_Sub3_10511.aBool9780
		&& aClass182_Sub3_10511.aBool9726);
    }
}
