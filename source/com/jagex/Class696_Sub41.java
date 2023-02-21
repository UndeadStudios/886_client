/* Class696_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub41 extends Class696
{
    public static final int anInt10987 = 1;
    public static final int anInt10988 = 2;
    public static final int anInt10989 = 3;
    
    public int method17336() {
	return -1757849351 * anInt8760;
    }
    
    public int method17337(int i) {
	return -1757849351 * anInt8760;
    }
    
    public void method17338(int i) {
	if (-1757849351 * anInt8760 < 1 || -1757849351 * anInt8760 > 3)
	    anInt8760 = method14168(-350307926) * 1908664649;
    }
    
    int method14168(int i) {
	return (aClass525_Sub30_8759.method16506(1537835262)
		    .method14257(893163959)
		? 3 : 2);
    }
    
    public Class696_Sub41(Class525_Sub30 class525_sub30) {
	super(class525_sub30);
    }
    
    void method14169(int i, int i_0_) {
	anInt8760 = 1908664649 * i;
    }
    
    int method14167(int i, byte i_1_) {
	return 1;
    }
    
    int method14175() {
	return (aClass525_Sub30_8759.method16506(1537835262)
		    .method14257(1307512173)
		? 3 : 2);
    }
    
    void method14173(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    int method14172(int i) {
	return 1;
    }
    
    void method14174(int i) {
	anInt8760 = 1908664649 * i;
    }
    
    public void method17339() {
	if (-1757849351 * anInt8760 < 1 || -1757849351 * anInt8760 > 3)
	    anInt8760 = method14168(-119552815) * 1908664649;
    }
    
    public void method17340() {
	if (-1757849351 * anInt8760 < 1 || -1757849351 * anInt8760 > 3)
	    anInt8760 = method14168(-576448911) * 1908664649;
    }
    
    public Class696_Sub41(int i, Class525_Sub30 class525_sub30) {
	super(i, class525_sub30);
    }
    
    public int method17341() {
	return -1757849351 * anInt8760;
    }
    
    public int method17342() {
	return -1757849351 * anInt8760;
    }
    
    static void method17343(Class683 class683, Class517 class517,
			    Exception exception, String string, int i) {
	StringBuilder stringbuilder = new StringBuilder(30);
	stringbuilder.append
	    (new StringBuilder().append(string).append(" ").toString()).append
	    (-5126207504388691097L
	     * class683.aClass525_Sub16_Sub4_8664.aLong7113)
	    .append(" ");
	for (int i_2_ = -965162233 * class683.anInt8650 - 1; i_2_ >= 0; i_2_--)
	    stringbuilder.append("").append
		(-5126207504388691097L * (class683.aClass649Array8640[i_2_]
					  .aClass525_Sub16_Sub4_8367
					  .aLong7113))
		.append(" ");
	stringbuilder.append("")
	    .append(Integer.valueOf(1888322459 * class517.anInt7057));
	Class525_Sub16_Sub13.method18448(stringbuilder.toString(), exception,
					 (byte) 72);
    }
    
    static final void method17344(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_3_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_4_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_5_ = 0;
	int i_6_ = i_4_ >>> 8;
	int i_7_ = i_4_ & 0xff;
	Class14 class14
	    = (Class14) Class486.aClass40_5240.method76(i_3_, -1459352238);
	Class82 class82
	    = (Class82) Class685.aClass40_8690.method76(i_6_, -1362921386);
	Class495[] class495s = class82.aClass495ArrayArray849[i_7_];
	Object[] objects = class14.method739(i_7_, -1804634100);
	if (objects == null && class82.anObjectArrayArray850 != null)
	    objects = class82.anObjectArrayArray850[i_7_];
	if (null != objects)
	    i_5_ = objects.length / class495s.length;
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_5_;
    }
    
    static final void method17345(Class683 class683, int i) {
	int i_8_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_8_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_8_ >> 16];
	Class15.method766(class259, class245, class683, -829796695);
    }
}
