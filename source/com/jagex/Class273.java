/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.event.ActionEvent;

public abstract class Class273 implements Interface36
{
    protected String aString2851;
    protected String aString2852;
    protected String aString2853 = null;
    
    abstract void method5028(int i, float f, float f_0_, float f_1_);
    
    abstract void method5029(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
			     Interface39 interface39);
    
    String method5030(int i) {
	return aString2853;
    }
    
    abstract void method5031(Class525_Sub5_Sub1 class525_sub5_sub1, float f);
    
    abstract void method5032(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_2_);
    
    abstract void method5033(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_3_, float f_4_);
    
    abstract void method5034(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_5_, float f_6_, float f_7_);
    
    abstract void method5035(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    abstract void method5036(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    abstract void method5037(int i, float f, float f_8_, float f_9_);
    
    abstract void method5038(int i, Class435 class435);
    
    abstract void method5039(int i, Class435 class435);
    
    abstract void method5040(int i, float f, float f_10_, float f_11_,
			     float f_12_);
    
    abstract void method5041(int i, float[] fs, int i_13_);
    
    abstract void method5042(int i, float f, float f_14_, float f_15_,
			     float f_16_);
    
    public abstract boolean method5043();
    
    abstract void method5044(int i, Class435 class435);
    
    abstract void method5045(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_17_, float f_18_, float f_19_);
    
    Class273() {
	/* empty */
    }
    
    public abstract boolean method5046();
    
    public abstract boolean method5047();
    
    abstract void method5048(Class525_Sub5_Sub1 class525_sub5_sub1, float f);
    
    abstract void method5049(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    abstract void method5050(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_20_, float f_21_);
    
    abstract void method5051(Class525_Sub5_Sub1 class525_sub5_sub1, float f);
    
    abstract void method5052(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs,
			     int i);
    
    abstract void method5053(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs,
			     int i);
    
    abstract void method5054(int i, Class435 class435);
    
    abstract void method5055(int i, Class435 class435);
    
    abstract void method5056(Class525_Sub5_Sub1 class525_sub5_sub1, int i,
			     Interface39 interface39);
    
    abstract void method5057(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_22_, float f_23_, float f_24_);
    
    abstract void method5058(Class525_Sub5_Sub1 class525_sub5_sub1, float[] fs,
			     int i);
    
    abstract void method5059(int i, float f, float f_25_, float f_26_,
			     float f_27_);
    
    abstract void method5060(int i, float f, float f_28_, float f_29_,
			     float f_30_);
    
    abstract void method5061(int i, float f, float f_31_, float f_32_,
			     float f_33_);
    
    abstract void method5062(int i, float[] fs, int i_34_);
    
    abstract void method5063(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    abstract void method5064(int i, Class435 class435);
    
    abstract void method5065(int i, Class435 class435);
    
    abstract void method5066(int i, Class435 class435);
    
    abstract void method5067(int i, Class435 class435);
    
    abstract void method5068(int i, Class435 class435);
    
    abstract void method5069(int i, Class435 class435);
    
    abstract void method5070(int i, Class435 class435);
    
    abstract void method5071(int i, Class435 class435);
    
    abstract void method5072(int i, int i_35_, Interface39 interface39);
    
    abstract void method5073(int i, int i_36_, Interface39 interface39);
    
    abstract void method5074(int i, int i_37_, Interface39 interface39);
    
    abstract void method5075(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_38_, float f_39_);
    
    abstract void method5076(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    abstract void method5077(Class525_Sub5_Sub1 class525_sub5_sub1, float f);
    
    abstract void method5078(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_40_);
    
    abstract void method5079(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_41_);
    
    abstract void method5080(Class525_Sub5_Sub1 class525_sub5_sub1, float f,
			     float f_42_);
    
    String method5081() {
	return aString2853;
    }
    
    abstract void method5082(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    abstract void method5083(Class525_Sub5_Sub1 class525_sub5_sub1,
			     Class435 class435);
    
    static void method5084(Object object, int i) {
	if (null != Class521.anEventQueue7094) {
	    for (int i_43_ = 0;
		 i_43_ < 50 && Class521.anEventQueue7094.peekEvent() != null;
		 i_43_++)
		Class229.method4381(1L);
	    try {
		if (null != object)
		    Class521.anEventQueue7094
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static final void method5085(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class70.anInt761 * 1534765603;
    }
    
    static void method5086(Class525_Sub16_Sub7 class525_sub16_sub7, int i,
			   int i_44_) {
	if (Class61.aBool670) {
	    Class7 class7 = Class328.method5797((byte) -60);
	    int i_45_ = 0;
	    for (Class525_Sub16_Sub16 class525_sub16_sub16
		     = (Class525_Sub16_Sub16) class525_sub16_sub7
						  .aClass697_11778
						  .method14186((byte) -59);
		 null != class525_sub16_sub16;
		 class525_sub16_sub16
		     = (Class525_Sub16_Sub16) class525_sub16_sub7
						  .aClass697_11778
						  .method14201((byte) -1)) {
		int i_46_ = Class305.method5426(class525_sub16_sub16, class7,
						-1433611372);
		if (i_46_ > i_45_)
		    i_45_ = i_46_;
	    }
	    i_45_ += 8;
	    int i_47_ = 21 + (Class61.anInt648 * -632680525
			      * (class525_sub16_sub7.anInt11780 * 1624285615));
	    Class541.anInt7192 = ((class525_sub16_sub7.anInt11780 * 1624285615
				   * (-632680525 * Class61.anInt648))
				  + (Class61.aBool645 ? 26 : 22)) * -707072255;
	    int i_48_
		= 994365359 * Class49.anInt373 + -305591171 * Class50.anInt374;
	    if (i_45_ + i_48_ > Class434.anInt4827 * -1445589163)
		i_48_ = -305591171 * Class50.anInt374 - i_45_;
	    if (i_48_ < 0)
		i_48_ = 0;
	    int i_49_
		= Class61.aBool645 ? 20 + class7.anInt49 * 385749773 + 1 : 31;
	    int i_50_ = 1 + (class7.anInt49 * 385749773 + (i - i_49_));
	    if (i_47_ + i_50_ > -1883654023 * Class696_Sub47.anInt11032)
		i_50_ = -1883654023 * Class696_Sub47.anInt11032 - i_47_;
	    if (i_50_ < 0)
		i_50_ = 0;
	    Class561.anInt7550 = 555394897 * i_48_;
	    Class212.anInt2272 = 1987736631 * i_50_;
	    Class263.anInt2798 = -1051307487 * i_45_;
	    Class61.aClass525_Sub16_Sub7_668 = class525_sub16_sub7;
	}
    }
}
