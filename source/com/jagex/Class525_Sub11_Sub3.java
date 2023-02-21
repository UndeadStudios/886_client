/* Class525_Sub11_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class525_Sub11_Sub3 extends Class525_Sub11
{
    static final String aString11700
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float[] aFloatArray11701 = { 0.0F, 0.0F, 0.0F };
    static int anInt11702;
    static Class169_Sub2[] aClass169_Sub2Array11703;
    Class142[] aClass142Array11704 = null;
    static final String aString11705
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11706
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
    static final String aString11707
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float aFloat11708 = 1.0F;
    static final String aString11709
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11710
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11711
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11712
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
    
    void method16214(int i) {
	OpenGL.glUseProgram(0);
	for (int i_0_ = anInt11702; i_0_ >= 0; i_0_--) {
	    aClass182_Sub3_10511.method15394(i_0_);
	    aClass182_Sub3_10511.method15395(null);
	}
    }
    
    void method16197(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_1_, int i_2_, int i_3_) {
	if (anInt11702 >= 1 && anInt11702 <= 3) {
	    int i_4_ = aClass142Array11704[anInt11702 - 1].anInt1662;
	    OpenGL.glUseProgram(i_4_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4_,
							   "paramsWeightings"),
			       aFloat11708, aFloatArray11701[0],
			       aFloatArray11701[1], aFloatArray11701[2]);
	    aClass182_Sub3_10511.method15394(0);
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    for (int i_5_ = anInt11702 - 1; i_5_ >= 0; i_5_--) {
		if (aClass169_Sub2Array11703[i_5_] != null) {
		    if (i_5_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_4_, "remap_1"), 1);
		    if (i_5_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_4_, "remap_2"), 2);
		    if (i_5_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_4_, "remap_3"), 3);
		    aClass182_Sub3_10511.method15394(i_5_ + 1);
		    Class136 class136
			= aClass169_Sub2Array11703[i_5_].method15155();
		    if (class136 != null)
			aClass182_Sub3_10511.method15395(class136);
		}
	    }
	}
    }
    
    Class525_Sub11_Sub3(Class182_Sub3 class182_sub3) {
	super(class182_sub3);
    }
    
    boolean method16219() {
	if (aClass182_Sub3_10511.aBool9780) {
	    aClass142Array11704 = new Class142[3];
	    if (aClass182_Sub3_10511.aBool9805) {
		aClass142Array11704[0]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[1]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[2]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass142Array11704[i] == null)
			return false;
		}
	    } else {
		aClass142Array11704[0]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[1]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[2]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass142Array11704[i] == null)
			return false;
		}
	    }
	    return aClass142Array11704 != null;
	}
	return false;
    }
    
    int method16221() {
	return 2;
    }
    
    void method16203() {
	if (aClass142Array11704 != null) {
	    for (int i = 0; i < aClass142Array11704.length; i++)
		aClass142Array11704[i] = null;
	    aClass142Array11704 = null;
	}
    }
    
    void method16200(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_6_, int i_7_, int i_8_) {
	if (anInt11702 >= 1 && anInt11702 <= 3) {
	    int i_9_ = aClass142Array11704[anInt11702 - 1].anInt1662;
	    OpenGL.glUseProgram(i_9_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_9_,
							   "paramsWeightings"),
			       aFloat11708, aFloatArray11701[0],
			       aFloatArray11701[1], aFloatArray11701[2]);
	    aClass182_Sub3_10511.method15394(0);
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    for (int i_10_ = anInt11702 - 1; i_10_ >= 0; i_10_--) {
		if (aClass169_Sub2Array11703[i_10_] != null) {
		    if (i_10_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_9_, "remap_1"), 1);
		    if (i_10_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_9_, "remap_2"), 2);
		    if (i_10_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_9_, "remap_3"), 3);
		    aClass182_Sub3_10511.method15394(i_10_ + 1);
		    Class136 class136
			= aClass169_Sub2Array11703[i_10_].method15155();
		    if (class136 != null)
			aClass182_Sub3_10511.method15395(class136);
		}
	    }
	}
    }
    
    void method16210(int i) {
	OpenGL.glUseProgram(0);
	for (int i_11_ = anInt11702; i_11_ >= 0; i_11_--) {
	    aClass182_Sub3_10511.method15394(i_11_);
	    aClass182_Sub3_10511.method15395(null);
	}
    }
    
    Class178 method16228() {
	return Class178.aClass178_1905;
    }
    
    boolean method16208() {
	return aClass142Array11704 != null;
    }
    
    boolean method16209() {
	return (aFloat11708 == 1.0F
		|| (aFloatArray11701[0] + aFloatArray11701[1]
		    + aFloatArray11701[2]) == 0.0F
		|| (aClass169_Sub2Array11703[0] == null
		    && aClass169_Sub2Array11703[1] == null
		    && aClass169_Sub2Array11703[2] == null));
    }
    
    static {
	anInt11702 = 1;
	aClass169_Sub2Array11703 = new Class169_Sub2[] { null, null, null };
    }
    
    void method16220(int i) {
	OpenGL.glUseProgram(0);
	for (int i_12_ = anInt11702; i_12_ >= 0; i_12_--) {
	    aClass182_Sub3_10511.method15394(i_12_);
	    aClass182_Sub3_10511.method15395(null);
	}
    }
    
    boolean method16211() {
	return aClass142Array11704 != null;
    }
    
    boolean method16212() {
	if (aClass182_Sub3_10511.aBool9780) {
	    aClass142Array11704 = new Class142[3];
	    if (aClass182_Sub3_10511.aBool9805) {
		aClass142Array11704[0]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[1]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[2]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass142Array11704[i] == null)
			return false;
		}
	    } else {
		aClass142Array11704[0]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[1]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass142Array11704[2]
		    = (Class142.method2341
		       (aClass182_Sub3_10511,
			(new Class119[]
			 { Class119.method2100
			   (aClass182_Sub3_10511, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass142Array11704[i] == null)
			return false;
		}
	    }
	    return aClass142Array11704 != null;
	}
	return false;
    }
    
    void method16213(int i, int i_13_) {
	/* empty */
    }
    
    void method16207(int i, int i_14_) {
	/* empty */
    }
    
    void method16201(int i, int i_15_) {
	/* empty */
    }
    
    void method16218(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_16_, int i_17_, int i_18_) {
	if (anInt11702 >= 1 && anInt11702 <= 3) {
	    int i_19_ = aClass142Array11704[anInt11702 - 1].anInt1662;
	    OpenGL.glUseProgram(i_19_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_19_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_19_,
							   "paramsWeightings"),
			       aFloat11708, aFloatArray11701[0],
			       aFloatArray11701[1], aFloatArray11701[2]);
	    aClass182_Sub3_10511.method15394(0);
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    for (int i_20_ = anInt11702 - 1; i_20_ >= 0; i_20_--) {
		if (aClass169_Sub2Array11703[i_20_] != null) {
		    if (i_20_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_19_, "remap_1"), 1);
		    if (i_20_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_19_, "remap_2"), 2);
		    if (i_20_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_19_, "remap_3"), 3);
		    aClass182_Sub3_10511.method15394(i_20_ + 1);
		    Class136 class136
			= aClass169_Sub2Array11703[i_20_].method15155();
		    if (class136 != null)
			aClass182_Sub3_10511.method15395(class136);
		}
	    }
	}
    }
    
    void method16216(int i, Class136_Sub2 class136_sub2,
		     Class136_Sub2 class136_sub2_21_, int i_22_, int i_23_) {
	if (anInt11702 >= 1 && anInt11702 <= 3) {
	    int i_24_ = aClass142Array11704[anInt11702 - 1].anInt1662;
	    OpenGL.glUseProgram(i_24_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_24_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_24_,
							   "paramsWeightings"),
			       aFloat11708, aFloatArray11701[0],
			       aFloatArray11701[1], aFloatArray11701[2]);
	    aClass182_Sub3_10511.method15394(0);
	    aClass182_Sub3_10511.method15395(class136_sub2);
	    for (int i_25_ = anInt11702 - 1; i_25_ >= 0; i_25_--) {
		if (aClass169_Sub2Array11703[i_25_] != null) {
		    if (i_25_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_24_, "remap_1"), 1);
		    if (i_25_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_24_, "remap_2"), 2);
		    if (i_25_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_24_, "remap_3"), 3);
		    aClass182_Sub3_10511.method15394(i_25_ + 1);
		    Class136 class136
			= aClass169_Sub2Array11703[i_25_].method15155();
		    if (class136 != null)
			aClass182_Sub3_10511.method15395(class136);
		}
	    }
	}
    }
    
    boolean method16198() {
	return aClass142Array11704 != null;
    }
    
    boolean method18246() {
	return aClass182_Sub3_10511.aBool9780;
    }
    
    void method16229() {
	if (aClass142Array11704 != null) {
	    for (int i = 0; i < aClass142Array11704.length; i++)
		aClass142Array11704[i] = null;
	    aClass142Array11704 = null;
	}
    }
    
    Class178 method16224() {
	return Class178.aClass178_1905;
    }
    
    Class178 method16225() {
	return Class178.aClass178_1905;
    }
    
    boolean method16202() {
	return (aFloat11708 == 1.0F
		|| (aFloatArray11701[0] + aFloatArray11701[1]
		    + aFloatArray11701[2]) == 0.0F
		|| (aClass169_Sub2Array11703[0] == null
		    && aClass169_Sub2Array11703[1] == null
		    && aClass169_Sub2Array11703[2] == null));
    }
    
    int method16199() {
	return 2;
    }
    
    void method16230() {
	if (aClass142Array11704 != null) {
	    for (int i = 0; i < aClass142Array11704.length; i++)
		aClass142Array11704[i] = null;
	    aClass142Array11704 = null;
	}
    }
}
