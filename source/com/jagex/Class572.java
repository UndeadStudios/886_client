/* Class572 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.LinkedList;

public class Class572
{
    int anInt7638;
    int anInt7639;
    LinkedList aLinkedList7640;
    float aFloat7641;
    int anInt7642;
    
    Class572(int i, LinkedList linkedlist, int i_0_, int i_1_, float f) {
	anInt7642 = 1717988237 * i;
	aLinkedList7640 = linkedlist;
	anInt7638 = -1218318371 * i_0_;
	anInt7639 = i_1_ * -607501093;
	aFloat7641 = f;
    }
    
    static final void method9534(Class683 class683, byte i) {
	int i_2_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (!Class501.aClass182_5564.method3142())
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 3;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub37_10680
		      .method14167(i_2_, (byte) -13);
    }
    
    public static boolean method9535(int i) {
	if (Class512.aString5685.startsWith("win"))
	    return true;
	return false;
    }
    
    static final void method9536(Class683 class683, int i) {
	int i_3_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_3_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_3_ >> 16];
	Class76.method1561(class259, class245, class683, -215321864);
    }
    
    static final void method9537(Class683 class683, int i) {
	class683.anInt8662 -= 1552651121;
    }
}
