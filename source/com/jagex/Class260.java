/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class260 implements Interface76
{
    static Class260 aClass260_2770;
    static Class260 aClass260_2771;
    static Class260 aClass260_2772;
    static Class260 aClass260_2773;
    static Class260 aClass260_2774;
    static Class260 aClass260_2775;
    static Class260 aClass260_2776;
    static Class260 aClass260_2777;
    static Class260 aClass260_2778;
    static Class260 aClass260_2779;
    static Class260 aClass260_2780;
    static Class260 aClass260_2781;
    static Class260 aClass260_2782;
    static Class260 aClass260_2783 = new Class260(11, 100);
    int anInt2784;
    static Class260 aClass260_2785;
    static Class260 aClass260_2786;
    static Class260 aClass260_2787;
    int anInt2788;
    static Class260 aClass260_2789;
    
    static {
	aClass260_2773 = new Class260(4, 101);
	aClass260_2772 = new Class260(8, 102);
	aClass260_2789 = new Class260(13, 103);
	aClass260_2774 = new Class260(1, 104);
	aClass260_2775 = new Class260(3, 105);
	aClass260_2780 = new Class260(12, 106);
	aClass260_2771 = new Class260(10, 107);
	aClass260_2778 = new Class260(16, 108);
	aClass260_2779 = new Class260(7, 109);
	aClass260_2770 = new Class260(9, 110);
	aClass260_2785 = new Class260(17, 111);
	aClass260_2782 = new Class260(6, 112);
	aClass260_2776 = new Class260(0, 113);
	aClass260_2781 = new Class260(14, 114);
	aClass260_2777 = new Class260(2, 115);
	aClass260_2786 = new Class260(15, 116);
	aClass260_2787 = new Class260(5, 117);
    }
    
    public int method80() {
	return 1644028665 * anInt2784;
    }
    
    Class260(int i, int i_0_) {
	anInt2788 = -1462350109 * i;
	anInt2784 = i_0_ * 578240329;
    }
    
    public int method57() {
	return 1644028665 * anInt2784;
    }
    
    public int method75() {
	return 1644028665 * anInt2784;
    }
    
    static final void method4759(Class683 class683, byte i) {
	Class476.method7781(class683.aClass656_Sub1_Sub3_Sub1_8654, class683,
			    -185941203);
    }
    
    static final void method4760(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub45_10726
		  .method17416(1943911937);
    }
    
    static final void method4761(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_1_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_2_ = class683.anIntArray8661[1 + 501271953 * class683.anInt8662];
	int i_3_ = client.aClass486ArrayArray11128[i_2_][i_1_]
		       .method7845(-684733318);
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 1 == i_3_ ? 1 : 0;
    }
    
    static void method4762(String string, int i) {
	client.aString11055 = string;
	if (Class669.method11036(1414816695) != Class508.aClass508_5657) {
	    try {
		String string_4_
		    = Class281.anApplet3006
			  .getParameter(Class409.aClass409_4219.aString4236);
		String string_5_
		    = Class281.anApplet3006
			  .getParameter(Class409.aClass409_4209.aString4236);
		String string_6_ = new StringBuilder().append(string_4_).append
				       ("settings=").append
				       (string).append
				       ("; version=1; path=/; domain=").append
				       (string_5_).toString();
		if (string.length() == 0)
		    string_6_
			= new StringBuilder().append(string_6_).append
			      ("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0")
			      .toString();
		else
		    string_6_
			= new StringBuilder().append(string_6_).append
			      ("; Expires=").append
			      (Class331.method5808(Class251
						       .method4508((byte) 8)
						   + 94608000000L))
			      .append
			      ("; Max-Age=").append
			      (94608000L).toString();
		Class67.method1441(Class281.anApplet3006,
				   new StringBuilder().append
				       ("document.cookie=\"").append
				       (string_6_).append
				       ("\"").toString(),
				   573747938);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    static final void method4763(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = 0;
    }
    
    static final void method4764(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	if (class683.anIntArray8661[501271953 * class683.anInt8662]
	    > class683.anIntArray8661[1 + 501271953 * class683.anInt8662])
	    class683.anInt8663
		+= -1827402657 * (class683.anIntArray8647
				  [1931825055 * class683.anInt8663]);
    }
}
