/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class386 implements Interface72
{
    public String method493(Class650 class650, int[] is, long l) {
	if (class650 == Class650.aClass650_8371) {
	    WorldTile class65 = (WorldTile) Class525_Sub22.aClass40_Sub15_10585
					    .method76(is[0], -621245148);
	    return class65.method1410((int) l, 668701373);
	}
	if (class650 == Class650.aClass650_8385
	    || class650 == Class650.aClass650_8377) {
	    ItemDefinitions class8 = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					 .method76((int) l, 225778031);
	    return class8.aString66;
	}
	if (class650 == Class650.aClass650_8376
	    || class650 == Class650.aClass650_8383
	    || Class650.aClass650_8374 == class650
	    || class650 == Class650.aClass650_8378)
	    return ((WorldTile)
		    Class525_Sub22.aClass40_Sub15_10585.method76(is[0],
								 -1584485518))
		       .method1410((int) l, -1812214628);
	return null;
    }
    
    public String method494(Class650 class650, int[] is, long l) {
	if (class650 == Class650.aClass650_8371) {
	    WorldTile class65 = (WorldTile) Class525_Sub22.aClass40_Sub15_10585
					    .method76(is[0], -63739440);
	    return class65.method1410((int) l, -620260054);
	}
	if (class650 == Class650.aClass650_8385
	    || class650 == Class650.aClass650_8377) {
	    ItemDefinitions class8 = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					 .method76((int) l, -372164370);
	    return class8.aString66;
	}
	if (class650 == Class650.aClass650_8376
	    || class650 == Class650.aClass650_8383
	    || Class650.aClass650_8374 == class650
	    || class650 == Class650.aClass650_8378)
	    return ((WorldTile)
		    Class525_Sub22.aClass40_Sub15_10585.method76(is[0],
								 1379563012))
		       .method1410((int) l, -1596016251);
	return null;
    }
    
    public String method495(Class650 class650, int[] is, long l) {
	if (class650 == Class650.aClass650_8371) {
	    WorldTile class65 = (WorldTile) Class525_Sub22.aClass40_Sub15_10585
					    .method76(is[0], 431319741);
	    return class65.method1410((int) l, 653539519);
	}
	if (class650 == Class650.aClass650_8385
	    || class650 == Class650.aClass650_8377) {
	    ItemDefinitions class8 = (ItemDefinitions) Class313_Sub2.aClass40_Sub22_10106
					 .method76((int) l, 893818598);
	    return class8.aString66;
	}
	if (class650 == Class650.aClass650_8376
	    || class650 == Class650.aClass650_8383
	    || Class650.aClass650_8374 == class650
	    || class650 == Class650.aClass650_8378)
	    return ((WorldTile)
		    Class525_Sub22.aClass40_Sub15_10585.method76(is[0],
								 -1409665294))
		       .method1410((int) l, -1568921124);
	return null;
    }
    
    static final void method6444(Class683 class683, short i) {
	Class476.method7781(class683.aClass656_Sub1_Sub2_Sub1_8646, class683,
			    -185941203);
    }
    
    public static float method6445(float f, float f_0_, byte i) {
	double d = Math.atan2((double) f, (double) f_0_);
	if (d < 0.0)
	    d = 3.141592653589793 + (3.141592653589793 + d);
	return (float) d;
    }
    
    static void method6446(boolean bool, int i) {
	if (bool) {
	    if (-1 != -750203937 * client.anInt11260)
		Class39.method1015(client.anInt11260 * -750203937, -767767940);
	    for (Class525_Sub33 class525_sub33
		     = ((Class525_Sub33)
			client.aClass10_11261.method689(2093493776));
		 class525_sub33 != null;
		 class525_sub33
		     = ((Class525_Sub33)
			client.aClass10_11261.method690((byte) -62))) {
		if (!class525_sub33.method8756(-1407402499)) {
		    class525_sub33
			= ((Class525_Sub33)
			   client.aClass10_11261.method689(481684564));
		    if (null == class525_sub33)
			break;
		}
		Class708.method14341(class525_sub33, true, false, -101023890);
	    }
	    client.anInt11260 = 2101694433;
	    client.aClass10_11261 = new Class10(8);
	    Class188.method3687(-2133777716);
	    client.anInt11260 = 1931260315 * Class138.aClass631_1641.anInt8177;
	    if (client.anInt11260 * -750203937 != -1) {
		Class198_Sub14.method15652(false, -836912409);
		Class83.method1604(-1910485673);
		Class455_Sub1.method15987(client.anInt11260 * -750203937, null,
					  670355642);
	    }
	}
	Class70.aBool787 = true;
    }
    
    static final void method6447(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_2_ = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class394.method6516(i_1_, i_2_, (byte) 2) ? 1 : 0;
    }
}
