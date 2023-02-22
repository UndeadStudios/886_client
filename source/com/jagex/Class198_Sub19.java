/* Class198_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class198_Sub19 extends Class198
{
    int anInt9989;
    int anInt9990;
    int anInt9991;
    static String aString9992;
    static Class525_Sub16_Sub16 aClass525_Sub16_Sub16_9993;
    public static JS5 aClass458_9994;
    
    boolean method3760() {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(anInt9991 * -1035952981,
						     -1515271924));
	boolean bool = class674.method11108(150309893);
	AnimationDefinition class194
	    = ((AnimationDefinition)
	       Class685.aClass40_Sub8_8691
		   .method76(1700860103 * class674.anInt8596, -495197919));
	bool &= class194.method3725(1946154623);
	return bool;
    }
    
    boolean method3752(int i) {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(anInt9991 * -1035952981,
						     647970067));
	boolean bool = class674.method11108(-1352941534);
	AnimationDefinition class194
	    = ((AnimationDefinition)
	       Class685.aClass40_Sub8_8691
		   .method76(1700860103 * class674.anInt8596, 235732927));
	bool &= class194.method3725(1626356326);
	return bool;
    }
    
    boolean method3758() {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(anInt9991 * -1035952981,
						     35599314));
	boolean bool = class674.method11108(-1736341681);
	AnimationDefinition class194
	    = ((AnimationDefinition)
	       Class685.aClass40_Sub8_8691
		   .method76(1700860103 * class674.anInt8596, 176499573));
	bool &= class194.method3725(-2109339863);
	return bool;
    }
    
    boolean method3759() {
	Class674 class674
	    = ((Class674)
	       Class574.aClass40_Sub20_7645.method76(anInt9991 * -1035952981,
						     -1750521871));
	boolean bool = class674.method11108(374690811);
	AnimationDefinition class194
	    = ((AnimationDefinition)
	       Class685.aClass40_Sub8_8691
		   .method76(1700860103 * class674.anInt8596, -264344567));
	bool &= class194.method3725(-522388746);
	return bool;
    }
    
    Class198_Sub19(RSBuffer class525_sub38) {
	super(class525_sub38);
	anInt9991 = class525_sub38.readUnsignedShort((byte) 41) * -2140766717;
	anInt9990 = class525_sub38.readUnsignedShort((byte) 53) * -221241177;
	anInt9989 = class525_sub38.readUnsignedByte(178061339) * -990807535;
    }
}
