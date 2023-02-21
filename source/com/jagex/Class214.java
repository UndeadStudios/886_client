/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class214
{
    static final int anInt2275 = 40;
    List aList2276;
    List aList2277;
    public int anInt2278;
    static Integer anInteger2279 = Integer.valueOf(-1);
    List aList2280;
    static final int anInt2281 = 8;
    List aList2282;
    
    public boolean method3943(int i, int i_0_) {
	return !((Integer) aList2277.get(i)).equals(anInteger2279);
    }
    
    public Class214(int i) {
	anInt2278 = i * 1017878881;
	aList2276 = new ArrayList();
	aList2280 = new ArrayList();
	aList2277 = new ArrayList();
	aList2282 = new ArrayList();
    }
    
    void method3944(int i, int i_1_) {
	aList2280.add(i_1_, Integer.valueOf(i));
	aList2277.add(i_1_, anInteger2279);
	ArrayList arraylist = new ArrayList();
	for (int i_2_ = 0; i_2_ < aList2276.size(); i_2_++)
	    arraylist.add(null);
	aList2282.add(i_1_, arraylist);
    }
    
    public int method3945(int i, int i_3_) {
	return aList2280.indexOf(Integer.valueOf(i));
    }
    
    public int method3946(int i, int i_4_) {
	return ((Integer) aList2280.get(i)).intValue();
    }
    
    public int method3947(int i, int i_5_) {
	return aList2276.indexOf(Integer.valueOf(i));
    }
    
    public int method3948(int i, byte i_6_) {
	return ((Integer) aList2276.get(i)).intValue();
    }
    
    public void method3949(int i, int i_7_) {
	aList2276.add(i_7_, aList2276.remove(i));
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_7_, list.remove(i));
	}
    }
    
    public void method3950(int i, boolean bool, int i_8_) {
	aList2277.set(i, bool ? Integer.valueOf(i) : anInteger2279);
    }
    
    public void method3951(int i, int i_9_, int i_10_) {
	aList2277.set(i, Integer.valueOf(i_9_));
    }
    
    public int method3952() {
	return aList2280.size();
    }
    
    public int method3953(int i, int i_11_, int i_12_) {
	if (aList2276.size() == 8)
	    throw new RuntimeException("");
	if (method3947(i, 1244778733) != -1)
	    throw new RuntimeException("");
	if (i_11_ == -1)
	    i_11_ = aList2276.size();
	aList2276.add(i_11_, Integer.valueOf(i));
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_11_, null);
	}
	return i_11_;
    }
    
    public void method3954(int i, int i_13_) {
	aList2277.set(i, Integer.valueOf(i_13_));
    }
    
    public int method3955(int i, int i_14_) {
	return method3958(i, -1, 846812120);
    }
    
    void method3956(int i, int i_15_) {
	aList2280.add(i_15_, aList2280.remove(i));
	aList2277.add(i_15_, aList2277.remove(i));
	aList2282.add(i_15_, aList2282.remove(i));
    }
    
    void method3957(int i, int i_16_, int i_17_) {
	aList2280.add(i_16_, aList2280.remove(i));
	aList2277.add(i_16_, aList2277.remove(i));
	aList2282.add(i_16_, aList2282.remove(i));
    }
    
    public int method3958(int i, int i_18_, int i_19_) {
	if (aList2280.size() == 40)
	    throw new RuntimeException("");
	if (method3945(i, -1868554707) != -1)
	    throw new RuntimeException("");
	if (i_18_ == -1)
	    i_18_ = aList2280.size();
	method3959(i, i_18_, 1569909867);
	for (int i_20_ = i_18_ + 1; i_20_ < aList2280.size(); i_20_++) {
	    Integer integer = (Integer) aList2277.get(i_20_);
	    if (!integer.equals(anInteger2279) && integer.intValue() < i_20_)
		method3957(i_20_, i_20_ - 1, 710178847);
	}
	return method3945(i, -2125311942);
    }
    
    void method3959(int i, int i_21_, int i_22_) {
	aList2280.add(i_21_, Integer.valueOf(i));
	aList2277.add(i_21_, anInteger2279);
	ArrayList arraylist = new ArrayList();
	for (int i_23_ = 0; i_23_ < aList2276.size(); i_23_++)
	    arraylist.add(null);
	aList2282.add(i_21_, arraylist);
    }
    
    public void method3960(int i, int i_24_) {
	method4003(i, 1021106019);
	int i_25_ = i;
	for (int i_26_ = i; i_26_ < aList2280.size(); i_26_++) {
	    if (!method3943(i_26_, 1341366289)) {
		if (i_25_ != i_26_)
		    method3957(i_26_, i_25_, -1850112618);
		i_25_ = i_26_ + 1;
	    }
	}
    }
    
    public int method3961(int i) {
	return method3958(i, -1, 1581779983);
    }
    
    public void method3962(int i, int i_27_, int i_28_) {
	aList2276.add(i_27_, aList2276.remove(i));
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_27_, list.remove(i));
	}
    }
    
    public void method3963(int i, int i_29_) {
	aList2276.remove(i);
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public void method3964(int i, int i_30_, Object object, int i_31_) {
	((List) aList2282.get(i)).set(i_30_, object);
    }
    
    public int method3965(int i) {
	return aList2276.size();
    }
    
    public int method3966() {
	return aList2276.size();
    }
    
    public int method3967(int i) {
	return aList2280.size();
    }
    
    public int method3968() {
	return aList2280.size();
    }
    
    public void method3969(int i, int i_32_) {
	method3957(i, i_32_, 224643431);
	for (int i_33_ = 0; i_33_ < aList2277.size(); i_33_++) {
	    Integer integer = (Integer) aList2277.get(i_33_);
	    if (!integer.equals(anInteger2279)) {
		Integer integer_34_ = Integer.valueOf(i_33_);
		if (!integer.equals(integer_34_))
		    aList2277.set(i_33_, integer_34_);
	    }
	}
    }
    
    public int method3970() {
	return aList2280.size();
    }
    
    public int method3971() {
	return aList2280.size();
    }
    
    public int method3972(int i) {
	return aList2280.indexOf(Integer.valueOf(i));
    }
    
    public int method3973(int i, int i_35_) {
	if (aList2280.size() == 40)
	    throw new RuntimeException("");
	if (method3945(i, -1967041775) != -1)
	    throw new RuntimeException("");
	if (i_35_ == -1)
	    i_35_ = aList2280.size();
	method3959(i, i_35_, -1128684361);
	for (int i_36_ = i_35_ + 1; i_36_ < aList2280.size(); i_36_++) {
	    Integer integer = (Integer) aList2277.get(i_36_);
	    if (!integer.equals(anInteger2279) && integer.intValue() < i_36_)
		method3957(i_36_, i_36_ - 1, 736757431);
	}
	return method3945(i, -1739918261);
    }
    
    public int method3974(int i, int i_37_) {
	return method3953(i, -1, 634819539);
    }
    
    public int method3975(int i) {
	return ((Integer) aList2276.get(i)).intValue();
    }
    
    public int method3976(int i) {
	return method3953(i, -1, 688671111);
    }
    
    public int method3977(int i) {
	return method3953(i, -1, 466267611);
    }
    
    public int method3978(int i) {
	return method3953(i, -1, 961432830);
    }
    
    public int method3979(int i) {
	return method3953(i, -1, 2142591278);
    }
    
    public void method3980(int i, boolean bool) {
	aList2277.set(i, bool ? Integer.valueOf(i) : anInteger2279);
    }
    
    void method3981(int i, int i_38_) {
	aList2280.add(i_38_, Integer.valueOf(i));
	aList2277.add(i_38_, anInteger2279);
	ArrayList arraylist = new ArrayList();
	for (int i_39_ = 0; i_39_ < aList2276.size(); i_39_++)
	    arraylist.add(null);
	aList2282.add(i_38_, arraylist);
    }
    
    void method3982(int i) {
	aList2280.remove(i);
	aList2277.remove(i);
	aList2282.remove(i);
    }
    
    public void method3983(int i, int i_40_) {
	aList2277.set(i, Integer.valueOf(i_40_));
    }
    
    public boolean method3984(int i) {
	return !((Integer) aList2277.get(i)).equals(anInteger2279);
    }
    
    public int method3985(int i, int i_41_) {
	if (aList2276.size() == 8)
	    throw new RuntimeException("");
	if (method3947(i, 1235777844) != -1)
	    throw new RuntimeException("");
	if (i_41_ == -1)
	    i_41_ = aList2276.size();
	aList2276.add(i_41_, Integer.valueOf(i));
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_41_, null);
	}
	return i_41_;
    }
    
    public void method3986(int i) {
	aList2276.remove(i);
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public int method3987(int i, int i_42_) {
	if (aList2280.size() == 40)
	    throw new RuntimeException("");
	if (method3945(i, -1975781799) != -1)
	    throw new RuntimeException("");
	if (i_42_ == -1)
	    i_42_ = aList2280.size();
	method3959(i, i_42_, 4429262);
	for (int i_43_ = i_42_ + 1; i_43_ < aList2280.size(); i_43_++) {
	    Integer integer = (Integer) aList2277.get(i_43_);
	    if (!integer.equals(anInteger2279) && integer.intValue() < i_43_)
		method3957(i_43_, i_43_ - 1, -767947358);
	}
	return method3945(i, -1868454552);
    }
    
    public void method3988(int i) {
	aList2276.remove(i);
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public int method3989() {
	return aList2276.size();
    }
    
    public int method3990(int i) {
	return method3958(i, -1, 208692466);
    }
    
    public int method3991(int i) {
	return method3958(i, -1, -640729315);
    }
    
    public void method3992(int i) {
	aList2276.remove(i);
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public void method3993(int i, int i_44_) {
	aList2277.set(i, Integer.valueOf(i_44_));
    }
    
    public void method3994(int i, int i_45_) {
	method3957(i, i_45_, -16914048);
	for (int i_46_ = 0; i_46_ < aList2277.size(); i_46_++) {
	    Integer integer = (Integer) aList2277.get(i_46_);
	    if (!integer.equals(anInteger2279)) {
		Integer integer_47_ = Integer.valueOf(i_46_);
		if (!integer.equals(integer_47_))
		    aList2277.set(i_46_, integer_47_);
	    }
	}
    }
    
    public int method3995(int i) {
	return aList2280.indexOf(Integer.valueOf(i));
    }
    
    public Object method3996(int i, int i_48_) {
	return ((List) aList2282.get(i)).get(i_48_);
    }
    
    public void method3997(int i, int i_49_) {
	method3957(i, i_49_, -150856521);
	for (int i_50_ = 0; i_50_ < aList2277.size(); i_50_++) {
	    Integer integer = (Integer) aList2277.get(i_50_);
	    if (!integer.equals(anInteger2279)) {
		Integer integer_51_ = Integer.valueOf(i_50_);
		if (!integer.equals(integer_51_))
		    aList2277.set(i_50_, integer_51_);
	    }
	}
    }
    
    public int method3998(int i, int i_52_) {
	if (aList2280.size() == 40)
	    throw new RuntimeException("");
	if (method3945(i, -1939508491) != -1)
	    throw new RuntimeException("");
	if (i_52_ == -1)
	    i_52_ = aList2280.size();
	method3959(i, i_52_, 1721237338);
	for (int i_53_ = i_52_ + 1; i_53_ < aList2280.size(); i_53_++) {
	    Integer integer = (Integer) aList2277.get(i_53_);
	    if (!integer.equals(anInteger2279) && integer.intValue() < i_53_)
		method3957(i_53_, i_53_ - 1, -1470279744);
	}
	return method3945(i, -1868619777);
    }
    
    void method3999(int i, int i_54_) {
	aList2280.add(i_54_, Integer.valueOf(i));
	aList2277.add(i_54_, anInteger2279);
	ArrayList arraylist = new ArrayList();
	for (int i_55_ = 0; i_55_ < aList2276.size(); i_55_++)
	    arraylist.add(null);
	aList2282.add(i_54_, arraylist);
    }
    
    public void method4000(int i, int i_56_, int i_57_) {
	method3957(i, i_56_, -1802107954);
	for (int i_58_ = 0; i_58_ < aList2277.size(); i_58_++) {
	    Integer integer = (Integer) aList2277.get(i_58_);
	    if (!integer.equals(anInteger2279)) {
		Integer integer_59_ = Integer.valueOf(i_58_);
		if (!integer.equals(integer_59_))
		    aList2277.set(i_58_, integer_59_);
	    }
	}
    }
    
    public Object method4001(int i, int i_60_, int i_61_) {
	return ((List) aList2282.get(i)).get(i_60_);
    }
    
    void method4002(int i, int i_62_) {
	aList2280.add(i_62_, Integer.valueOf(i));
	aList2277.add(i_62_, anInteger2279);
	ArrayList arraylist = new ArrayList();
	for (int i_63_ = 0; i_63_ < aList2276.size(); i_63_++)
	    arraylist.add(null);
	aList2282.add(i_62_, arraylist);
    }
    
    void method4003(int i, int i_64_) {
	aList2280.remove(i);
	aList2277.remove(i);
	aList2282.remove(i);
    }
    
    void method4004(int i) {
	aList2280.remove(i);
	aList2277.remove(i);
	aList2282.remove(i);
    }
    
    public int method4005(int i) {
	return ((Integer) aList2280.get(i)).intValue();
    }
    
    public void method4006(int i, int i_65_) {
	aList2276.add(i_65_, aList2276.remove(i));
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_65_, list.remove(i));
	}
    }
    
    public void method4007(int i, int i_66_) {
	aList2276.add(i_66_, aList2276.remove(i));
	Iterator iterator = aList2282.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_66_, list.remove(i));
	}
    }
    
    public int method4008(int i) {
	return ((Integer) aList2276.get(i)).intValue();
    }
    
    public void method4009(int i) {
	method4003(i, 1127174672);
	int i_67_ = i;
	for (int i_68_ = i; i_68_ < aList2280.size(); i_68_++) {
	    if (!method3943(i_68_, 1034376709)) {
		if (i_67_ != i_68_)
		    method3957(i_68_, i_67_, -315853586);
		i_67_ = i_68_ + 1;
	    }
	}
    }
    
    static final void method4010(Class683 class683, byte i) {
	int i_69_ = (class683.anIntArray8661
		     [(class683.anInt8662 -= 1552651121) * 501271953]);
	Class259 class259 = Class43.method1069(i_69_, -695254952);
	Class245 class245 = Class162.aClass245Array1764[i_69_ >> 16];
	Class470.method7733(class259, class245, class683, (byte) 0);
    }
    
    static final byte[] method4011(byte[] is, byte i) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	Class468 class468 = new Class468(class525_sub38);
	Class472 class472 = class468.method7701((byte) 3);
	int i_70_ = class468.method7700(-2046409190);
	if (i_70_ < 0 || (0 != -1911335593 * Class458.anInt5057
			  && i_70_ > -1911335593 * Class458.anInt5057))
	    throw new RuntimeException();
	if (Class472.aClass472_5152 == class472) {
	    byte[] is_71_ = new byte[i_70_];
	    class525_sub38.method16639(is_71_, 0, i_70_, 463628512);
	    return is_71_;
	}
	int i_72_ = class468.method7703((byte) 62);
	if (i_72_ < 0 || (Class458.anInt5057 * -1911335593 != 0
			  && i_72_ > -1911335593 * Class458.anInt5057))
	    throw new RuntimeException();
	byte[] is_73_;
	if (class472 == Class472.aClass472_5151) {
	    is_73_ = new byte[i_72_];
	    Class710.method14430(is_73_, i_72_, is, i_70_, 9);
	} else if (class472 == Class472.aClass472_5153) {
	    is_73_ = new byte[i_72_];
	    synchronized (Class458.aClass74_5049) {
		Class458.aClass74_5049.method1542(class525_sub38, is_73_,
						  1038366047);
	    }
	} else if (Class472.aClass472_5154 == class472) {
	    try {
		is_73_ = Class401.method6553(class525_sub38, i_72_, (byte) 49);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_73_;
    }
    
    public static final void method4012(byte i) {
	if (!client.aBool11180) {
	    client.aFloat11179 += (12.0F - client.aFloat11179) / 2.0F;
	    client.aBool11364 = true;
	    client.aBool11180 = true;
	}
    }
    
    static final void method4013(Class683 class683, int i) {
	Class522_Sub1.method16052(Class567.method9489((byte) 2), class683,
				  (byte) 2);
    }
}
