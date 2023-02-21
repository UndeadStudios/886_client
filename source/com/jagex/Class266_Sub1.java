/* Class266_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class266_Sub1 extends Class266
{
    Class182_Sub1_Sub2 aClass182_Sub1_Sub2_10089;
    Class273_Sub2 aClass273_Sub2_10090;
    int anInt10091;
    
    Class273 method4808(Class182_Sub1 class182_sub1, Class280 class280) {
	return new Class273_Sub2((Class182_Sub1_Sub2) class182_sub1, this,
				 class280);
    }
    
    public boolean method4873(Class273 class273) {
	if (aClass273_Sub2_10090 == class273)
	    return true;
	if (!class273.method5043())
	    return false;
	boolean bool = method4830();
	aClass273_Sub2_10090 = (Class273_Sub2) class273;
	anInt2813 = method4812(class273, -1374728895) * -1852759053;
	if (anInt2813 * -1130812101 == -1)
	    throw new IllegalArgumentException();
	anInt10091 = aClass273_Sub2_10090.anInt10070;
	if (bool) {
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
	return true;
    }
    
    public boolean method4830() {
	return (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		== aClass273_Sub2_10090);
    }
    
    Class525_Sub5_Sub1 method4817(Class274 class274) {
	return new Class525_Sub5_Sub1_Sub2(this, class274);
    }
    
    Class525_Sub5_Sub1 method4876(Class274 class274) {
	return new Class525_Sub5_Sub1_Sub2(this, class274);
    }
    
    public boolean method4869(Class273 class273) {
	if (aClass273_Sub2_10090 == class273)
	    return true;
	if (!class273.method5043())
	    return false;
	boolean bool = method4830();
	aClass273_Sub2_10090 = (Class273_Sub2) class273;
	anInt2813 = method4812(class273, 645274050) * -1852759053;
	if (anInt2813 * -1130812101 == -1)
	    throw new IllegalArgumentException();
	anInt10091 = aClass273_Sub2_10090.anInt10070;
	if (bool) {
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
	return true;
    }
    
    public void method4942() {
	if (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
	    != aClass273_Sub2_10090) {
	    if (aClass273_Sub2_10090 == null)
		throw new RuntimeException_Sub2();
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
    }
    
    void method4843() {
	for (int i = 0; i < method4810(65280); i++)
	    ((Class273_Sub2) method4811(i, 475641842)).method127();
	super.method4843();
    }
    
    public void finalize() throws Throwable {
	method4843();
	super.finalize();
    }
    
    void method15722() throws Throwable {
	method4843();
	super.finalize();
    }
    
    void method15723() throws Throwable {
	method4843();
	super.finalize();
    }
    
    void method15724() throws Throwable {
	method4843();
	super.finalize();
    }
    
    void method15725() throws Throwable {
	method4843();
	super.finalize();
    }
    
    public void method4844() {
	/* empty */
    }
    
    public void method4845() {
	/* empty */
    }
    
    public boolean method4936() {
	return (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		== aClass273_Sub2_10090);
    }
    
    public boolean method4847() {
	return (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		== aClass273_Sub2_10090);
    }
    
    Class273 method4894(Class182_Sub1 class182_sub1, Class280 class280) {
	return new Class273_Sub2((Class182_Sub1_Sub2) class182_sub1, this,
				 class280);
    }
    
    public void method4805() {
	/* empty */
    }
    
    Class273 method4855(Class182_Sub1 class182_sub1, Class280 class280) {
	return new Class273_Sub2((Class182_Sub1_Sub2) class182_sub1, this,
				 class280);
    }
    
    public boolean method4866(Class273 class273) {
	if (aClass273_Sub2_10090 == class273)
	    return true;
	if (!class273.method5043())
	    return false;
	boolean bool = method4830();
	aClass273_Sub2_10090 = (Class273_Sub2) class273;
	anInt2813 = method4812(class273, -1025794) * -1852759053;
	if (anInt2813 * -1130812101 == -1)
	    throw new IllegalArgumentException();
	anInt10091 = aClass273_Sub2_10090.anInt10070;
	if (bool) {
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
	return true;
    }
    
    Class266_Sub1(Class182_Sub1_Sub2 class182_sub1_sub2, Class262 class262) {
	super((Class182_Sub1) class182_sub1_sub2, class262);
	aClass182_Sub1_Sub2_10089 = class182_sub1_sub2;
    }
    
    Class273 method4846(Class182_Sub1 class182_sub1, Class280 class280) {
	return new Class273_Sub2((Class182_Sub1_Sub2) class182_sub1, this,
				 class280);
    }
    
    public boolean method4856(Class273 class273) {
	if (aClass273_Sub2_10090 == class273)
	    return true;
	if (!class273.method5043())
	    return false;
	boolean bool = method4830();
	aClass273_Sub2_10090 = (Class273_Sub2) class273;
	anInt2813 = method4812(class273, 682773319) * -1852759053;
	if (anInt2813 * -1130812101 == -1)
	    throw new IllegalArgumentException();
	anInt10091 = aClass273_Sub2_10090.anInt10070;
	if (bool) {
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
	return true;
    }
    
    Class525_Sub5_Sub1 method4875(Class274 class274) {
	return new Class525_Sub5_Sub1_Sub2(this, class274);
    }
    
    public boolean method4904(Class273 class273) {
	if (aClass273_Sub2_10090 == class273)
	    return true;
	if (!class273.method5043())
	    return false;
	boolean bool = method4830();
	aClass273_Sub2_10090 = (Class273_Sub2) class273;
	anInt2813 = method4812(class273, -218251511) * -1852759053;
	if (anInt2813 * -1130812101 == -1)
	    throw new IllegalArgumentException();
	anInt10091 = aClass273_Sub2_10090.anInt10070;
	if (bool) {
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
	return true;
    }
    
    void method4939() {
	for (int i = 0; i < method4810(65280); i++)
	    ((Class273_Sub2) method4811(i, 1602701518)).method127();
	super.method4843();
    }
    
    void method4940() {
	for (int i = 0; i < method4810(65280); i++)
	    ((Class273_Sub2) method4811(i, -1962621528)).method127();
	super.method4843();
    }
    
    public void method4863() {
	if (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
	    != aClass273_Sub2_10090) {
	    if (aClass273_Sub2_10090 == null)
		throw new RuntimeException_Sub2();
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
    }
    
    public void method4804() {
	if (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
	    != aClass273_Sub2_10090) {
	    if (aClass273_Sub2_10090 == null)
		throw new RuntimeException_Sub2();
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
    }
    
    public void method4909() {
	if (aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
	    != aClass273_Sub2_10090) {
	    if (aClass273_Sub2_10090 == null)
		throw new RuntimeException_Sub2();
	    OpenGL.glUseProgram(anInt10091);
	    aClass182_Sub1_Sub2_10089.aClass273_Sub2_11495
		= aClass273_Sub2_10090;
	}
    }
}
