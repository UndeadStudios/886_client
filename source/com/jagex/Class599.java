/* Class599 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.List;

public class Class599 implements Interface69
{
    int anInt7848;
    Class372 aClass372_7849;
    boolean aBool7850;
    JS5 aClass458_7851;
    Interface70 anInterface70_7852;
    byte[] aByteArray7853;
    boolean aBool7854;
    int anInt7855;
    Class200 aClass200_7856;
    Class595 aClass595_7857 = Class595.aClass595_7836;
    
    public Class595 method455() {
	return aClass595_7857;
    }
    
    public void method211(int i) {
	if (Class595.aClass595_7837 == aClass595_7857) {
	    byte[] is = aClass458_7851.getTextureData(anInt7848 * 1058726367,
						  2000391396);
	    if (null != is) {
		aByteArray7853 = is;
		method9855(746987434);
		aClass595_7857 = Class595.aClass595_7838;
		if (null != anInterface70_7852)
		    anInterface70_7852.method482(this, is.length,
						 anInt7848 * 1058726367, false,
						 (byte) -99);
	    }
	}
    }
    
    public Class488 method434(byte i) {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, 957937631);
	return class488;
    }
    
    public Class595 method471(int i) {
	return aClass595_7857;
    }
    
    public boolean method478() {
	if (null == aClass200_7856)
	    return false;
	List list = method9861((byte) 0);
	if (list == null || list.size() <= 0)
	    aBool7854 = false;
	return aBool7854;
    }
    
    void method9855(int i) {
	/* empty */
    }
    
    public byte[] method436(int i, int i_0_) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	return aByteArray7853;
    }
    
    public int method437(byte i) {
	if (aByteArray7853 != null)
	    return aByteArray7853.length;
	return 0;
    }
    
    public Class477 method438(byte i) {
	return Class477.aClass477_5190;
    }
    
    void method9856() {
	/* empty */
    }
    
    public void method443(RSBuffer class525_sub38, int i) {
	if (null != aClass200_7856) {
	    if (null != anInterface70_7852)
		anInterface70_7852.method486(this, 962972586);
	    if (aBool7854)
		throw new RuntimeException("");
	    synchronized (aClass200_7856) {
		List list = method9861((byte) 0);
		if (list != null) {
		    list.add(class525_sub38);
		    anInt7855
			+= -383135007 * class525_sub38.buffer.length;
		    method9857(list, anInt7855 * -1965625055, -1896509305);
		}
	    }
	}
    }
    
    public RSBuffer method441(int i, int i_1_) {
	if (null == aClass200_7856)
	    return null;
	RSBuffer class525_sub38 = null;
	if (anInterface70_7852 != null)
	    anInterface70_7852.method486(this, 962972586);
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (list.size() > i)
		class525_sub38 = (RSBuffer) list.get(i);
	}
	return class525_sub38;
    }
    
    public RSBuffer method464(int i) {
	if (null == aClass200_7856)
	    return null;
	RSBuffer class525_sub38 = null;
	if (anInterface70_7852 != null)
	    anInterface70_7852.method486(this, 962972586);
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (list.size() > i)
		class525_sub38 = (RSBuffer) list.get(i);
	}
	return class525_sub38;
    }
    
    public boolean method442(int i) {
	return null != aClass200_7856 && aBool7850;
    }
    
    public int method479() {
	return anInt7848 * 1058726367;
    }
    
    public void method461(boolean bool, int i) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	aBool7854 = bool;
    }
    
    public boolean method477(int i) {
	if (null == aClass200_7856)
	    return false;
	List list = method9861((byte) 0);
	if (list == null || list.size() <= 0)
	    aBool7854 = false;
	return aBool7854;
    }
    
    void method9857(List list, int i, int i_2_) {
	if (aClass200_7856 != null && list != null && i >= 0) {
	    synchronized (aClass200_7856) {
		aClass200_7856.method3786((long) (1058726367 * anInt7848));
		if (i <= aClass200_7856.method3827(-1930682883))
		    aClass200_7856.method3789(list,
					      (long) (1058726367 * anInt7848),
					      i, (byte) -19);
		else {
		    aBool7850 = false;
		    aBool7854 = false;
		    anInt7855 = 0;
		}
	    }
	}
    }
    
    public boolean method470() {
	return null != aClass200_7856 && aBool7850;
    }
    
    public void method192() {
	if (Class595.aClass595_7837 == aClass595_7857) {
	    byte[] is = aClass458_7851.getTextureData(anInt7848 * 1058726367,
						  2073889478);
	    if (null != is) {
		aByteArray7853 = is;
		method9855(-1263438846);
		aClass595_7857 = Class595.aClass595_7838;
		if (null != anInterface70_7852)
		    anInterface70_7852.method482(this, is.length,
						 anInt7848 * 1058726367, false,
						 (byte) -8);
	    }
	}
    }
    
    public Class488 method448() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, -831245117);
	return class488;
    }
    
    public boolean method456() {
	return false;
    }
    
    public boolean method459(int i, byte i_3_) {
	if (null == aClass200_7856)
	    return false;
	boolean bool = false;
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public Class488 method451() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, 1352590876);
	return class488;
    }
    
    public Class488 method452() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, -1442069747);
	return class488;
    }
    
    public Class488 method453() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, 386230140);
	return class488;
    }
    
    public Class488 method454() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, -1877596085);
	return class488;
    }
    
    List method9858() {
	if (null == aClass200_7856 || false == aBool7850)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass200_7856) {
	    list = (List) aClass200_7856.method3785((long) (1058726367
							    * anInt7848));
	    if (null == list && aBool7850) {
		list = new ArrayList();
		aClass200_7856.method3789(list,
					  (long) (anInt7848 * 1058726367), 0,
					  (byte) -28);
	    }
	}
	return list;
    }
    
    public void method445(RSBuffer class525_sub38) {
	if (null != aClass200_7856) {
	    if (null != anInterface70_7852)
		anInterface70_7852.method486(this, 962972586);
	    if (aBool7854)
		throw new RuntimeException("");
	    synchronized (aClass200_7856) {
		List list = method9861((byte) 0);
		if (list != null) {
		    list.add(class525_sub38);
		    anInt7855
			+= -383135007 * class525_sub38.buffer.length;
		    method9857(list, anInt7855 * -1965625055, -1896509305);
		}
	    }
	}
    }
    
    public void method450(boolean bool) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	aBool7854 = bool;
    }
    
    void method9859() {
	/* empty */
    }
    
    public int method439(int i) {
	return anInt7848 * 1058726367;
    }
    
    void method9860() {
	/* empty */
    }
    
    public byte[] method458(int i) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	return aByteArray7853;
    }
    
    public byte[] method449(int i) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	return aByteArray7853;
    }
    
    public byte[] method460(int i) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	return aByteArray7853;
    }
    
    public int method444(int i) {
	if (null == aClass200_7856)
	    return 0;
	int i_4_ = 0;
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (list != null)
		i_4_ = list.size();
	}
	return i_4_;
    }
    
    public Class477 method462() {
	return Class477.aClass477_5190;
    }
    
    public boolean method474(byte i) {
	return false;
    }
    
    public int method446() {
	if (aByteArray7853 != null)
	    return aByteArray7853.length;
	return 0;
    }
    
    List method9861(byte i) {
	if (null == aClass200_7856 || false == aBool7850)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass200_7856) {
	    list = (List) aClass200_7856.method3785((long) (1058726367
							    * anInt7848));
	    if (null == list && aBool7850) {
		list = new ArrayList();
		aClass200_7856.method3789(list,
					  (long) (anInt7848 * 1058726367), 0,
					  (byte) -111);
	    }
	}
	return list;
    }
    
    public RSBuffer method475(int i) {
	if (null == aClass200_7856)
	    return null;
	RSBuffer class525_sub38 = null;
	if (anInterface70_7852 != null)
	    anInterface70_7852.method486(this, 962972586);
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (list.size() > i)
		class525_sub38 = (RSBuffer) list.get(i);
	}
	return class525_sub38;
    }
    
    public RSBuffer method466(int i) {
	if (null == aClass200_7856)
	    return null;
	RSBuffer class525_sub38 = null;
	if (anInterface70_7852 != null)
	    anInterface70_7852.method486(this, 962972586);
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (list.size() > i)
		class525_sub38 = (RSBuffer) list.get(i);
	}
	return class525_sub38;
    }
    
    public boolean method467(int i) {
	if (null == aClass200_7856)
	    return false;
	boolean bool = false;
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    void method9862(List list, int i) {
	if (aClass200_7856 != null && list != null && i >= 0) {
	    synchronized (aClass200_7856) {
		aClass200_7856.method3786((long) (1058726367 * anInt7848));
		if (i <= aClass200_7856.method3827(-1797605057))
		    aClass200_7856.method3789(list,
					      (long) (1058726367 * anInt7848),
					      i, (byte) -76);
		else {
		    aBool7850 = false;
		    aBool7854 = false;
		    anInt7855 = 0;
		}
	    }
	}
    }
    
    public boolean method469(int i) {
	if (null == aClass200_7856)
	    return false;
	boolean bool = false;
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public void method463(RSBuffer class525_sub38) {
	if (null != aClass200_7856) {
	    if (null != anInterface70_7852)
		anInterface70_7852.method486(this, 962972586);
	    if (aBool7854)
		throw new RuntimeException("");
	    synchronized (aClass200_7856) {
		List list = method9861((byte) 0);
		if (list != null) {
		    list.add(class525_sub38);
		    anInt7855
			+= -383135007 * class525_sub38.buffer.length;
		    method9857(list, anInt7855 * -1965625055, -1896509305);
		}
	    }
	}
    }
    
    public boolean method228() {
	return null != aClass200_7856 && aBool7850;
    }
    
    public int method472() {
	if (null == aClass200_7856)
	    return 0;
	int i = 0;
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (list != null)
		i = list.size();
	}
	return i;
    }
    
    public void method447(boolean bool) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	aBool7854 = bool;
    }
    
    public boolean method457() {
	return false;
    }
    
    public Class488 method440() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, 760862936);
	return class488;
    }
    
    public boolean method473() {
	if (null == aClass200_7856)
	    return false;
	List list = method9861((byte) 0);
	if (list == null || list.size() <= 0)
	    aBool7854 = false;
	return aBool7854;
    }
    
    public boolean method476() {
	if (null == aClass200_7856)
	    return false;
	List list = method9861((byte) 0);
	if (list == null || list.size() <= 0)
	    aBool7854 = false;
	return aBool7854;
    }
    
    public Class599(JS5 class458, int i, Class372 class372,
                    Interface70 interface70, Class200 class200) {
	aClass458_7851 = class458;
	anInt7848 = i * 1693587999;
	aClass372_7849 = class372;
	anInterface70_7852 = interface70;
	aClass200_7856 = class200;
	aBool7850 = null != aClass200_7856;
	aClass595_7857 = Class595.aClass595_7837;
    }
    
    public boolean method435() {
	if (null == aClass200_7856)
	    return false;
	List list = method9861((byte) 0);
	if (list == null || list.size() <= 0)
	    aBool7854 = false;
	return aBool7854;
    }
    
    public Class488 method433() {
	Class488 class488 = new Class488(aClass372_7849);
	class488.method7870(this, 1649949785);
	return class488;
    }
    
    List method9863() {
	if (null == aClass200_7856 || false == aBool7850)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass200_7856) {
	    list = (List) aClass200_7856.method3785((long) (1058726367
							    * anInt7848));
	    if (null == list && aBool7850) {
		list = new ArrayList();
		aClass200_7856.method3789(list,
					  (long) (anInt7848 * 1058726367), 0,
					  (byte) -3);
	    }
	}
	return list;
    }
    
    public boolean method468(int i) {
	if (null == aClass200_7856)
	    return false;
	boolean bool = false;
	synchronized (aClass200_7856) {
	    List list = method9861((byte) 0);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public void method465(boolean bool) {
	if (null != anInterface70_7852)
	    anInterface70_7852.method486(this, 962972586);
	aBool7854 = bool;
    }
    
    public int method480() {
	return anInt7848 * 1058726367;
    }
    
    static final void method9864(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_5_ = 10;
	byte[] is = { (byte) class683.anIntArray8661
			     [class683.anInt8662 * 501271953] };
	byte[] is_6_ = { (byte) class683.anIntArray8661
				[1 + class683.anInt8662 * 501271953] };
	Class515.method8595(class259, i_5_, is, is_6_, class683, (short) 535);
    }
    
    static final void method9865(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_7_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_8_ = class683.anIntArray8661[1 + class683.anInt8662 * 501271953];
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class169.method2728(class679.aClass259_8623, i_7_, i_8_, -27349815);
    }
    
    static final void method9866(Class683 class683, byte i) {
	class683.anInt8662 -= -1189665054;
	int i_9_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_10_
	    = class683.anIntArray8661[1 + 501271953 * class683.anInt8662] - 1;
	ItemDefinitions class8
	    = ((ItemDefinitions)
	       Class313_Sub2.aClass40_Sub22_10106.method76(i_9_, 1668834147));
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = class8.method638(i_10_, 2076577028);
    }
    
    static final void method9867(Class683 class683, int i) {
	Class198_Sub13.aClass525_Sub30_9973.method16502
	    (Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub28_10720,
	     (class683.anIntArray8661
	      [(class683.anInt8662 -= 1552651121) * 501271953]),
	     (byte) -64);
	Class650.method10715(-1758466106);
    }
    
    public static int method9868(int i, int i_11_, int i_12_, int i_13_) {
	i_12_ &= 0x3;
	if (0 == i_12_)
	    return i;
	if (i_12_ == 1)
	    return i_11_;
	if (i_12_ == 2)
	    return 4095 - i;
	return 4095 - i_11_;
    }
    
    static final void method9869(Class683 class683, int i) {
	class683.anInt8662 -= 1915637188;
	int i_14_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_15_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_16_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 2];
	int i_17_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 3];
	WorldTile class65 = (WorldTile) Class525_Sub22.aClass40_Sub15_10585
					.method76(i_16_, -1260504424);
	if (class65.aClass495_699.method80() != i_14_
	    || class65.aClass495_698.method80() != i_15_)
	    throw new RuntimeException(new StringBuilder().append(i_16_).append
					   (" ").append
					   (i_17_).toString());
	if (i_15_ == Class495.aClass495_5387.method80())
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class65.method1410(i_17_, -666884441);
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= class65.method1427(i_17_, -1859238395);
    }
}
