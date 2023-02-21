/* Class704_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class704_Sub1 extends Class704
{
    Class446 aClass446_11000 = new Class446(Float.NaN, Float.NaN, Float.NaN);
    Class446 aClass446_11001 = new Class446(Float.NaN, Float.NaN, Float.NaN);
    Class446 aClass446_11002 = new Class446();
    
    public void method14279(Class291 class291, Class444 class444, int i,
			    int i_0_, float f, int i_1_) {
	Class446 class446
	    = Class446.method7209(aClass309_8791.method5486(-1039819247));
	class446.aFloat4895 -= (float) i;
	class446.aFloat4897 -= (float) i_0_;
	class446.aFloat4896 *= -1.0F;
	Class446 class446_2_ = Class446.method7209(aClass446_11000);
	class446_2_.aFloat4895 -= (float) i;
	class446_2_.aFloat4897 -= (float) i_0_;
	class446_2_.aFloat4896 *= -1.0F;
	class444.method7187((double) class446.aFloat4895,
			    (double) class446.aFloat4896,
			    (double) class446.aFloat4897,
			    (double) class446_2_.aFloat4895,
			    (double) class446_2_.aFloat4896,
			    (double) class446_2_.aFloat4897, 0.0F, 1.0F, 0.0F);
	class446.method7260();
	class446_2_.method7260();
    }
    
    public void method14298(float f) {
	aClass309_8791.method5454(false, f, aClass446_11000,
				  aClass309_8791.method5493(-292218890),
				  aClass446_11001, aClass446_11002,
				  (byte) -46);
    }
    
    public boolean method14284() {
	return !Float.isNaN(aClass446_11000.aFloat4895);
    }
    
    public boolean method14286(int i) {
	return !Float.isNaN(aClass446_11000.aFloat4895);
    }
    
    public Class446 method14295() {
	return Class446.method7209(aClass446_11001);
    }
    
    public Class446 method14281(byte i) {
	return Class446.method7209(aClass446_11000);
    }
    
    public Class446 method14299(int i) {
	return Class446.method7209(aClass446_11001);
    }
    
    public void method14285(RSBuffer class525_sub38, int i) {
	aClass446_11001.method7215(class525_sub38);
    }
    
    public Class446 method14294() {
	return Class446.method7209(aClass446_11001);
    }
    
    public boolean method14282() {
	return !Float.isNaN(aClass446_11000.aFloat4895);
    }
    
    public Class704_Sub1(Class309 class309) {
	super(class309);
    }
    
    public Class446 method14289() {
	return Class446.method7209(aClass446_11000);
    }
    
    public Class446 method14290() {
	return Class446.method7209(aClass446_11000);
    }
    
    public Class446 method14291() {
	return Class446.method7209(aClass446_11000);
    }
    
    public Class446 method14292() {
	return Class446.method7209(aClass446_11000);
    }
    
    public Class446 method14293() {
	return Class446.method7209(aClass446_11001);
    }
    
    public void method14288(float f) {
	aClass309_8791.method5454(false, f, aClass446_11000,
				  aClass309_8791.method5493(-1678726166),
				  aClass446_11001, aClass446_11002, (byte) -3);
    }
    
    public void method17377(Class525_Sub28 class525_sub28, int i) {
	aClass446_11001.aFloat4895
	    = (float) (-794397083 * class525_sub28.anInt10614);
	aClass446_11001.aFloat4896
	    = (float) (-1069747287 * class525_sub28.anInt10617);
	aClass446_11001.aFloat4897
	    = (float) (class525_sub28.anInt10618 * 602488327);
	if (Float.isNaN(aClass446_11000.aFloat4895)) {
	    aClass446_11000.method7216(aClass446_11001);
	    aClass446_11002.method7217();
	}
    }
    
    public void method14283(RSBuffer class525_sub38) {
	aClass446_11001.method7215(class525_sub38);
    }
    
    public void method14296(RSBuffer class525_sub38) {
	aClass446_11001.method7215(class525_sub38);
    }
    
    public void method14297(float f) {
	aClass309_8791.method5454(false, f, aClass446_11000,
				  aClass309_8791.method5493(724957314),
				  aClass446_11001, aClass446_11002,
				  (byte) -42);
    }
    
    public void method14280(float f, int i) {
	aClass309_8791.method5454(false, f, aClass446_11000,
				  aClass309_8791.method5493(360908389),
				  aClass446_11001, aClass446_11002,
				  (byte) -100);
    }
    
    public boolean method14287() {
	return !Float.isNaN(aClass446_11000.aFloat4895);
    }
    
    public void method14300(Class291 class291, Class444 class444, int i,
			    int i_3_, float f) {
	Class446 class446
	    = Class446.method7209(aClass309_8791.method5486(-1020025740));
	class446.aFloat4895 -= (float) i;
	class446.aFloat4897 -= (float) i_3_;
	class446.aFloat4896 *= -1.0F;
	Class446 class446_4_ = Class446.method7209(aClass446_11000);
	class446_4_.aFloat4895 -= (float) i;
	class446_4_.aFloat4897 -= (float) i_3_;
	class446_4_.aFloat4896 *= -1.0F;
	class444.method7187((double) class446.aFloat4895,
			    (double) class446.aFloat4896,
			    (double) class446.aFloat4897,
			    (double) class446_4_.aFloat4895,
			    (double) class446_4_.aFloat4896,
			    (double) class446_4_.aFloat4897, 0.0F, 1.0F, 0.0F);
	class446.method7260();
	class446_4_.method7260();
    }
}
