/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class110
{
    float aFloat1324;
    float[] aFloatArray1325;
    float[] aFloatArray1326;
    Class182_Sub2 aClass182_Sub2_1327;
    float aFloat1328 = 0.85F;
    float aFloat1329 = 1.0F - aFloat1328;
    int anInt1330 = 0;
    int anInt1331 = 0;
    boolean aBool1332 = false;
    float aFloat1333;
    int[] anIntArray1334;
    boolean aBool1335;
    Class435 aClass435_1336;
    Class444 aClass444_1337;
    Class128 aClass128_1338;
    float[] aFloatArray1339;
    Class435 aClass435_1340;
    Class435 aClass435_1341;
    float aFloat1342;
    float[] aFloatArray1343;
    float[] aFloatArray1344;
    float[] aFloatArray1345;
    float aFloat1346;
    int[] anIntArray1347;
    int[] anIntArray1348;
    int[] anIntArray1349;
    int[] anIntArray1350;
    float[] aFloatArray1351;
    int[] anIntArray1352;
    int[] anIntArray1353;
    Class179_Sub2[] aClass179_Sub2Array1354;
    float aFloat1355;
    float aFloat1356;
    float aFloat1357;
    Class179_Sub2[] aClass179_Sub2Array1358;
    static final float aFloat1359 = 255.0F;
    int anInt1360;
    int anInt1361;
    int anInt1362 = 0;
    Runnable aRunnable1363;
    float[] aFloatArray1364;
    float[] aFloatArray1365;
    float[] aFloatArray1366;
    float[] aFloatArray1367;
    Class444 aClass444_1368;
    boolean aBool1369;
    public static JS5 idx_10;
    public static int anInt1371;
    
    void method1954(byte i) {
	aClass128_1338 = new Class128(aClass182_Sub2_1327, this);
    }
    
    void method1955(Runnable runnable) {
	aRunnable1363 = runnable;
    }
    
    void method1956(Runnable runnable, int i) {
	aRunnable1363 = runnable;
    }
    
    void method1957(Runnable runnable) {
	aRunnable1363 = runnable;
    }
    
    void method1958(Runnable runnable) {
	aRunnable1363 = runnable;
    }
    
    void method1959(Runnable runnable) {
	aRunnable1363 = runnable;
    }
    
    Class110(Class182_Sub2 class182_sub2) {
	anInt1361 = 0;
	aBool1335 = true;
	aClass435_1336 = new Class435();
	aClass444_1368 = new Class444();
	aClass444_1337 = new Class444();
	aClass435_1340 = new Class435();
	aClass435_1341 = new Class435();
	anIntArray1353 = new int[Class179_Sub2.anInt9365];
	aFloatArray1343 = new float[Class179_Sub2.anInt9365];
	aFloatArray1344 = new float[Class179_Sub2.anInt9365];
	aFloatArray1345 = new float[Class179_Sub2.anInt9365];
	aFloatArray1351 = new float[Class179_Sub2.anInt9365];
	anIntArray1347 = new int[8];
	anIntArray1348 = new int[8];
	anIntArray1349 = new int[8];
	anIntArray1350 = new int[10000];
	anIntArray1334 = new int[10000];
	aFloat1357 = 1.0F;
	aFloat1342 = 0.0F;
	aFloat1346 = 1.0F;
	aFloatArray1325 = new float[2];
	aClass179_Sub2Array1358 = new Class179_Sub2[8];
	aClass179_Sub2Array1354 = new Class179_Sub2[8];
	aFloatArray1364 = new float[64];
	aFloatArray1365 = new float[64];
	aFloatArray1366 = new float[64];
	aFloatArray1367 = new float[64];
	aFloatArray1339 = new float[64];
	aFloatArray1326 = new float[3];
	aClass182_Sub2_1327 = class182_sub2;
	aClass128_1338 = new Class128(class182_sub2, this);
	for (int i = 0; i < 8; i++) {
	    aClass179_Sub2Array1358[i]
		= new Class179_Sub2(aClass182_Sub2_1327);
	    aClass179_Sub2Array1354[i]
		= new Class179_Sub2(aClass182_Sub2_1327);
	}
	anIntArray1352 = new int[Class179_Sub2.anInt9366];
	for (int i = 0; i < Class179_Sub2.anInt9366; i++)
	    anIntArray1352[i] = -1;
    }
    
    static final void method1960(Class683 class683, int i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	Class245 class245 = class679.aClass245_8622;
	Class289.method5267(class259, class245, class683, 1274929439);
    }
    
    static final void method1961(Class683 class683, byte i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method1962(Class683 class683, byte i) {
	int i_0_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub24_10687
		  .method14167(i_0_, (byte) -12);
    }
    
    static final void method1963(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	Class239.method4422(class259, class245, class683, (byte) 44);
    }
    
    public static Class525_Sub16_Sub8 method1964(int i, int i_2_) {
	return ((Class525_Sub16_Sub8)
		Class281.aClass10_3003.method684((long) i));
    }
}
