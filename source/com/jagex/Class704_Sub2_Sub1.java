/* Class704_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class704_Sub2_Sub1 extends Class704_Sub2
{
    float[] aFloatArray11919;
    float[] aFloatArray11920;
    float[] aFloatArray11921;
    int anInt11922 = 0;
    
    float method17380(float f, float f_0_, float f_1_) {
	float f_2_ = aFloat11007 / f;
	if (f_2_ < 0.0F)
	    f_2_ = 0.0F;
	if (f_2_ > 1.0F)
	    f_2_ = 1.0F;
	return (f / aFloatArray11921[anInt11922 * 946214927]
		* (f_2_ * (aFloatArray11919[946214927 * anInt11922]
			   - aFloatArray11920[946214927 * anInt11922])
		   + aFloatArray11920[anInt11922 * 946214927]));
    }
    
    void method17382(byte i) {
	anInt11922 += 1799214831;
    }
    
    float method17391(float f, float f_3_, float f_4_, int i) {
	float f_5_ = aFloat11007 / f;
	if (f_5_ < 0.0F)
	    f_5_ = 0.0F;
	if (f_5_ > 1.0F)
	    f_5_ = 1.0F;
	return (f / aFloatArray11921[anInt11922 * 946214927]
		* (f_5_ * (aFloatArray11919[946214927 * anInt11922]
			   - aFloatArray11920[946214927 * anInt11922])
		   + aFloatArray11920[anInt11922 * 946214927]));
    }
    
    void method17386(RSBuffer class525_sub38, int i) {
	aFloatArray11920 = new float[i];
	aFloatArray11919 = new float[i];
	aFloatArray11921 = new float[i];
	anInt11922 = 0;
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    aFloatArray11920[i_6_] = class525_sub38.method16634(-1326112410);
	    aFloatArray11919[i_6_] = class525_sub38.method16634(-804254791);
	    aFloatArray11921[i_6_] = class525_sub38.method16634(-734592078);
	}
    }
    
    void method17383(RSBuffer class525_sub38, int i, int i_7_) {
	aFloatArray11920 = new float[i];
	aFloatArray11919 = new float[i];
	aFloatArray11921 = new float[i];
	anInt11922 = 0;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    aFloatArray11920[i_8_] = class525_sub38.method16634(-1093416745);
	    aFloatArray11919[i_8_] = class525_sub38.method16634(-866517630);
	    aFloatArray11921[i_8_] = class525_sub38.method16634(-540137984);
	}
    }
    
    void method17385() {
	anInt11922 += 1799214831;
    }
    
    void method17384() {
	anInt11922 += 1799214831;
    }
    
    public Class704_Sub2_Sub1(Class309 class309) {
	super(class309);
    }
    
    static final void method18556(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_9_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_9_ >> 16];
	Class486.method7851(class259, class245, class683, -326351648);
    }
}
