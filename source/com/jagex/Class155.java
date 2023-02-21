/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class155
{
    Class182_Sub3 aClass182_Sub3_1734;
    static final String aString1735
	= "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
    Class142 aClass142_1736;
    
    boolean method2455(Class136_Sub1 class136_sub1,
		       Class136_Sub1 class136_sub1_0_, float f) {
	if (!method2456())
	    return false;
	Class168_Sub2_Sub2 class168_sub2_sub2
	    = aClass182_Sub3_1734.aClass168_Sub2_Sub2_9822;
	Class525_Sub16_Sub2 class525_sub16_sub2
	    = new Class525_Sub16_Sub2(aClass182_Sub3_1734,
				      Class165.aClass165_1771,
				      Class178.aClass178_1905,
				      class136_sub1.anInt8907,
				      class136_sub1.anInt8908);
	boolean bool = false;
	aClass182_Sub3_1734.method3158(class168_sub2_sub2, -1166817212);
	class168_sub2_sub2.method15585(0, class525_sub16_sub2);
	if (class168_sub2_sub2.method15588()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, class136_sub1.anInt8907,
			      class136_sub1.anInt8908);
	    OpenGL.glUseProgram(aClass142_1736.anInt1662);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass142_1736
							    .anInt1662),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass142_1736
							    .anInt1662),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass142_1736
							    .anInt1662),
							   "sampleSize"),
			       1.0F / (float) class136_sub1_0_.anInt8907,
			       1.0F / (float) class136_sub1_0_.anInt8908);
	    for (int i = 0; i < class136_sub1.anInt8909; i++) {
		float f_1_ = (float) i / (float) class136_sub1.anInt8909;
		aClass182_Sub3_1734.method15395(class136_sub1_0_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class136_sub1.method14466(0, 0, i, class136_sub1.anInt8907,
					  class136_sub1.anInt8908, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class168_sub2_sub2.method15585(0, null);
	aClass182_Sub3_1734.method3159(class168_sub2_sub2, -1876999470);
	return bool;
    }
    
    Class155(Class182_Sub3 class182_sub3) {
	aClass182_Sub3_1734 = class182_sub3;
    }
    
    boolean method2456() {
	if (aClass182_Sub3_1734.aBool9797 && aClass182_Sub3_1734.aBool9780
	    && aClass142_1736 == null) {
	    Class119 class119
		= (Class119.method2100
		   (aClass182_Sub3_1734, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class119 != null)
		aClass142_1736
		    = Class142.method2341(aClass182_Sub3_1734,
					  new Class119[] { class119 });
	}
	return aClass142_1736 != null;
    }
    
    boolean method2457() {
	if (aClass182_Sub3_1734.aBool9797 && aClass182_Sub3_1734.aBool9780
	    && aClass142_1736 == null) {
	    Class119 class119
		= (Class119.method2100
		   (aClass182_Sub3_1734, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class119 != null)
		aClass142_1736
		    = Class142.method2341(aClass182_Sub3_1734,
					  new Class119[] { class119 });
	}
	return aClass142_1736 != null;
    }
    
    boolean method2458(Class136_Sub1 class136_sub1,
		       Class136_Sub1 class136_sub1_2_, float f) {
	if (!method2456())
	    return false;
	Class168_Sub2_Sub2 class168_sub2_sub2
	    = aClass182_Sub3_1734.aClass168_Sub2_Sub2_9822;
	Class525_Sub16_Sub2 class525_sub16_sub2
	    = new Class525_Sub16_Sub2(aClass182_Sub3_1734,
				      Class165.aClass165_1771,
				      Class178.aClass178_1905,
				      class136_sub1.anInt8907,
				      class136_sub1.anInt8908);
	boolean bool = false;
	aClass182_Sub3_1734.method3158(class168_sub2_sub2, -1166817212);
	class168_sub2_sub2.method15585(0, class525_sub16_sub2);
	if (class168_sub2_sub2.method15588()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, class136_sub1.anInt8907,
			      class136_sub1.anInt8908);
	    OpenGL.glUseProgram(aClass142_1736.anInt1662);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass142_1736
							    .anInt1662),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass142_1736
							    .anInt1662),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass142_1736
							    .anInt1662),
							   "sampleSize"),
			       1.0F / (float) class136_sub1_2_.anInt8907,
			       1.0F / (float) class136_sub1_2_.anInt8908);
	    for (int i = 0; i < class136_sub1.anInt8909; i++) {
		float f_3_ = (float) i / (float) class136_sub1.anInt8909;
		aClass182_Sub3_1734.method15395(class136_sub1_2_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_3_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_3_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_3_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_3_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class136_sub1.method14466(0, 0, i, class136_sub1.anInt8907,
					  class136_sub1.anInt8908, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class168_sub2_sub2.method15585(0, null);
	aClass182_Sub3_1734.method3159(class168_sub2_sub2, -1876999470);
	return bool;
    }
}
