/* Class584 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class584
{
    Class458 aClass458_7721;
    Class200 aClass200_7722 = new Class200(20);
    
    void method9636(int i) {
	synchronized (aClass200_7722) {
	    aClass200_7722.method3791((byte) 37);
	}
    }
    
    Class584(Class458 class458) {
	aClass458_7721 = class458;
    }
    
    void method9637(int i, int i_0_) {
	synchronized (aClass200_7722) {
	    aClass200_7722.method3805(i, 1838519808);
	}
    }
    
    void method9638(byte i) {
	synchronized (aClass200_7722) {
	    aClass200_7722.method3809((byte) 122);
	}
    }
    
    void method9639() {
	synchronized (aClass200_7722) {
	    aClass200_7722.method3791((byte) 29);
	}
    }
    
    void method9640() {
	synchronized (aClass200_7722) {
	    aClass200_7722.method3809((byte) 98);
	}
    }
    
    static final void method9641(boolean bool, Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_1_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_1_ >> 16];
	if (bool)
	    Class555.method9242(class245, class259, 108507919);
	else
	    Class458.method7569(class245, class259, (byte) 0);
    }
    
    static final void method9642(Class683 class683, int i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = (class683.aClass525_Sub25_8653.aClass341Array10603[i_2_]
	       .aByte3652);
    }
    
    public static Class603_Sub1 method9643(int i) {
	if (733621821 * Class15.anInt178
	    < Class15.aClass603_Sub1Array175.length)
	    return (Class15.aClass603_Sub1Array175
		    [(Class15.anInt178 += 2008242453) * 733621821 - 1]);
	return null;
    }
    
    public static void method9644(int i, int i_3_, int i_4_, String string,
				  int i_5_) {
	Class259 class259 = Class147.method2388(i_3_, i_4_, -591235649);
	if (class259 != null) {
	    if (class259.anObjectArray2721 != null) {
		Class525_Sub32 class525_sub32 = new Class525_Sub32();
		class525_sub32.aClass259_10736 = class259;
		class525_sub32.anInt10739 = i * -589399091;
		class525_sub32.aString10743 = string;
		class525_sub32.anObjectArray10740 = class259.anObjectArray2721;
		Class241.method4435(class525_sub32, 1542487398);
	    }
	    if (client.method17531(class259).method16133(i - 1, (short) 197)) {
		Class96 class96 = Class111.method1979(-743078548);
		if (16 == 1777895575 * client.anInt11075
		    || client.anInt11075 * 1777895575 == 7
		    || 9 == 1777895575 * client.anInt11075) {
		    if (null != class259.aString2742
			&& null != class259.aClass238_2743) {
			Class525_Sub15 class525_sub15
			    = Class16.method767(Class412.aClass412_4299,
						class96.aClass6_1169,
						1977859884);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16735
			    (7 + Class161.method2628(class259.aString2742,
						     101549901) + 1,
			     -2012792549);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16700(class259.aString2742, 527262173);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16664(i_4_, -1694464992);
			class525_sub15.aClass525_Sub38_Sub2_10546.method16656
			    (class259.aClass238_2743.method80(), -1833375229);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16605(i_3_, -703690923);
			class525_sub15.aClass525_Sub38_Sub2_10546
			    .method16696(i, (short) 732);
			class96.method1794(class525_sub15, (short) 8434);
		    } else
			Class235.method4402(class96, class259, i, i_3_, i_4_,
					    1899282045);
		}
	    }
	}
    }
    
    static final void method9645(Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	Class525_Sub15 class525_sub15
	    = Class16.method767(Class412.aClass412_4363,
				client.aClass96_11085.aClass6_1169,
				1977859884);
	class525_sub15.aClass525_Sub38_Sub2_10546
	    .method16735(string.length() + 1, -475376138);
	class525_sub15.aClass525_Sub38_Sub2_10546.method16700(string,
							      -536853368);
	client.aClass96_11085.method1794(class525_sub15, (short) 28879);
    }
    
    static final void method9646(Class683 class683, int i) {
	int i_6_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_6_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_6_ >> 16];
	Class533.method8849(class259, class245, class683, 1540325886);
    }
}
