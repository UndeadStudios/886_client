/* Class704_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class704_Sub2_Sub3 extends Class704_Sub2
{
    void method17384() {
	/* empty */
    }
    
    float method17391(float f, float f_0_, float f_1_, int i) {
	float f_2_ = f - aFloat11007;
	if (aClass309_8791.method5494((byte) -49).aFloat4895
	    == Float.POSITIVE_INFINITY)
	    f_0_ = aClass309_8791.method5497((byte) 29).method7230();
	else {
	    float f_3_
		= f_0_ / aClass309_8791.method5494((byte) -18).method7230();
	    float f_4_ = f_0_ / 2.0F * f_3_;
	    if (f_4_ > f_2_) {
		f_0_ -= (aClass309_8791.method5494((byte) -90).method7230()
			 * f_1_);
		if (f_0_ < 0.0F)
		    f_0_ = 0.0F;
	    } else if (f_0_
		       < aClass309_8791.method5497((byte) 52).method7230()) {
		f_0_ += (aClass309_8791.method5494((byte) -64).method7230()
			 * f_1_);
		if (f_0_ > aClass309_8791.method5497((byte) 28).method7230())
		    f_0_ = aClass309_8791.method5497((byte) 101).method7230();
	    }
	}
	return f_0_;
    }
    
    void method17382(byte i) {
	/* empty */
    }
    
    void method17383(RSBuffer class525_sub38, int i, int i_5_) {
	/* empty */
    }
    
    float method17380(float f, float f_6_, float f_7_) {
	float f_8_ = f - aFloat11007;
	if (aClass309_8791.method5494((byte) -68).aFloat4895
	    == Float.POSITIVE_INFINITY)
	    f_6_ = aClass309_8791.method5497((byte) 10).method7230();
	else {
	    float f_9_
		= f_6_ / aClass309_8791.method5494((byte) -47).method7230();
	    float f_10_ = f_6_ / 2.0F * f_9_;
	    if (f_10_ > f_8_) {
		f_6_ -= (aClass309_8791.method5494((byte) -103).method7230()
			 * f_7_);
		if (f_6_ < 0.0F)
		    f_6_ = 0.0F;
	    } else if (f_6_
		       < aClass309_8791.method5497((byte) 28).method7230()) {
		f_6_ += (aClass309_8791.method5494((byte) -22).method7230()
			 * f_7_);
		if (f_6_ > aClass309_8791.method5497((byte) 123).method7230())
		    f_6_ = aClass309_8791.method5497((byte) 40).method7230();
	    }
	}
	return f_6_;
    }
    
    void method17385() {
	/* empty */
    }
    
    void method17386(RSBuffer class525_sub38, int i) {
	/* empty */
    }
    
    public Class704_Sub2_Sub3(Class309 class309) {
	super(class309);
    }
}
