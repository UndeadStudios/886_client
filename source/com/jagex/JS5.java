/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public final class JS5
{
    Object[][] anObjectArrayArray5046;
    int anInt5047;
    boolean aBool5048;
    static Class74 aClass74_5049 = new Class74();
    Object[] anObjectArray5050;
    static final int anInt5051 = 0;
    public static final int anInt5052 = 1;
    Class461 aClass461_5053 = null;
    static final int anInt5054 = 2;
    Class454 aClass454_5055;
    static boolean aBool5056 = false;
    static int anInt5057 = 0;
    
    synchronized boolean method7469(int i, int i_0_, int[] is, int i_1_) {
	if (!archiveExists(i, 1053745117))
	    return false;
	if (anObjectArray5050[i] == null)
	    return false;
	int i_2_ = aClass461_5053.anIntArray5086[i];
	int[] is_3_ = aClass461_5053.anIntArrayArray5087[i];
	if (anObjectArrayArray5046[i] == null)
	    anObjectArrayArray5046[i]
		= new Object[aClass461_5053.childSizes[i]];
	Object[] objects = anObjectArrayArray5046[i];
	boolean bool = true;
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    int i_5_;
	    if (is_3_ == null)
		i_5_ = i_4_;
	    else
		i_5_ = is_3_[i_4_];
	    if (objects[i_5_] == null) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_6_;
	if (is != null
	    && (0 != is[0] || is[1] != 0 || 0 != is[2] || is[3] != 0)) {
	    is_6_ = Class23.method830(anObjectArray5050[i], true, 256081805);
	    RSBuffer class525_sub38 = new RSBuffer(is_6_);
	    int i_7_ = class525_sub38.readUnsignedByte(385815406);
	    int i_8_ = class525_sub38.readInt(1482091154);
	    int i_9_
		= (i_7_ == Class472.aClass472_5152.method80() ? 5 : 9) + i_8_;
	    class525_sub38.method16651(is, 5, i_9_, 1971899240);
	} else
	    is_6_ = Class23.method830(anObjectArray5050[i], false, 1184439290);
	byte[] is_10_;
	try {
	    is_10_ = Class214.method4011(is_6_, (byte) 71);
	} catch (RuntimeException runtimeexception) {
	    throw Class533.method8853
		      (runtimeexception,
		       new StringBuilder().append(null != is).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_6_.length).append
			   (" ").append
			   (Class272.method5023(is_6_, is_6_.length,
						1777895575))
			   .append
			   (" ").append
			   (Class272.method5023(is_6_, is_6_.length - 2,
						1777895575))
			   .append
			   (" ").append
			   (aClass461_5053.anIntArray5080[i]).append
			   (" ").append
			   (aClass461_5053.anInt5072 * -982549883).toString());
	}
	if (aBool5048)
	    anObjectArray5050[i] = null;
	if (i_2_ > 1) {
	    if (anInt5047 * 112467553 != 2) {
		int i_11_ = is_10_.length;
		int i_12_ = is_10_[--i_11_] & 0xff;
		i_11_ -= i_12_ * i_2_ * 4;
		RSBuffer class525_sub38 = new RSBuffer(is_10_);
		int[] is_13_ = new int[i_2_];
		class525_sub38.index = 339428471 * i_11_;
		for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
		    int i_15_ = 0;
		    for (int i_16_ = 0; i_16_ < i_2_; i_16_++) {
			i_15_ += class525_sub38.readInt(2108235718);
			is_13_[i_16_] += i_15_;
		    }
		}
		byte[][] is_17_ = new byte[i_2_][];
		for (int i_18_ = 0; i_18_ < i_2_; i_18_++) {
		    is_17_[i_18_] = new byte[is_13_[i_18_]];
		    is_13_[i_18_] = 0;
		}
		class525_sub38.index = i_11_ * 339428471;
		int i_19_ = 0;
		for (int i_20_ = 0; i_20_ < i_12_; i_20_++) {
		    int i_21_ = 0;
		    for (int i_22_ = 0; i_22_ < i_2_; i_22_++) {
			i_21_ += class525_sub38.readInt(1263250819);
			System.arraycopy(is_10_, i_19_, is_17_[i_22_],
					 is_13_[i_22_], i_21_);
			is_13_[i_22_] += i_21_;
			i_19_ += i_21_;
		    }
		}
		for (int i_23_ = 0; i_23_ < i_2_; i_23_++) {
		    int i_24_;
		    if (is_3_ == null)
			i_24_ = i_23_;
		    else
			i_24_ = is_3_[i_23_];
		    if (0 == anInt5047 * 112467553)
			objects[i_24_]
			    = Class525_Sub16_Sub6.method18288(is_17_[i_23_],
							      false,
							      781324756);
		    else
			objects[i_24_] = is_17_[i_23_];
		}
	    } else {
		int i_25_ = is_10_.length;
		int i_26_ = is_10_[--i_25_] & 0xff;
		i_25_ -= i_2_ * i_26_ * 4;
		RSBuffer class525_sub38 = new RSBuffer(is_10_);
		int i_27_ = 0;
		int i_28_ = 0;
		class525_sub38.index = 339428471 * i_25_;
		for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
		    int i_30_ = 0;
		    for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
			i_30_ += class525_sub38.readInt(1682086676);
			int i_32_;
			if (null == is_3_)
			    i_32_ = i_31_;
			else
			    i_32_ = is_3_[i_31_];
			if (i_32_ == i_0_) {
			    i_27_ += i_30_;
			    i_28_ = i_32_;
			}
		    }
		}
		if (0 == i_27_)
		    return true;
		byte[] is_33_ = new byte[i_27_];
		i_27_ = 0;
		class525_sub38.index = i_25_ * 339428471;
		int i_34_ = 0;
		for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
		    int i_36_ = 0;
		    for (int i_37_ = 0; i_37_ < i_2_; i_37_++) {
			i_36_ += class525_sub38.readInt(1584477104);
			int i_38_;
			if (null == is_3_)
			    i_38_ = i_37_;
			else
			    i_38_ = is_3_[i_37_];
			if (i_38_ == i_0_) {
			    System.arraycopy(is_10_, i_34_, is_33_, i_27_,
					     i_36_);
			    i_27_ += i_36_;
			}
			i_34_ += i_36_;
		    }
		}
		objects[i_28_] = is_33_;
	    }
	} else {
	    int i_39_;
	    if (null == is_3_)
		i_39_ = 0;
	    else
		i_39_ = is_3_[0];
	    if (anInt5047 * 112467553 == 0)
		objects[i_39_] = Class525_Sub16_Sub6.method18288(is_10_, false,
								 -79310150);
	    else
		objects[i_39_] = is_10_;
	}
	return true;
    }
    
    synchronized boolean method7470(byte i) {
	if (aClass461_5053 == null) {
	    aClass461_5053 = aClass454_5055.method7361(-2021659291);
	    if (aClass461_5053 == null)
		return false;
	    anObjectArray5050
		= new Object[aClass461_5053.anInt5079 * 1259617575];
	    anObjectArrayArray5046
		= new Object[aClass461_5053.anInt5079 * 1259617575][];
	}
	return true;
    }
    
    public int method7471(int i) {
	if (!method7470((byte) 123))
	    throw new IllegalStateException("");
	return -982549883 * aClass461_5053.anInt5072;
    }
    
    synchronized boolean archiveExists(int i, int i_40_) {
	if (!method7470((byte) 115))
	    return false;
	if (i < 0 || i >= aClass461_5053.childSizes.length
	    || 0 == aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public boolean method7473(String string, String string_41_, int i) {
	if (!method7470((byte) 59))
	    return false;
	string = string.toLowerCase();
	string_41_ = string_41_.toLowerCase();
	int i_42_ = (aClass461_5053.aClass265_5078.method4796
		     (Class221.method4214(string, -139959496), -1595858416));
	if (i_42_ < 0)
	    return false;
	int i_43_
	    = (aClass461_5053.aClass265Array5071[i_42_].method4796
	       (Class221.method4214(string_41_, -2115134160), -1595858416));
	if (i_43_ < 0)
	    return false;
	return true;
    }
    
    synchronized void method7474(int i, byte i_44_) {
	if (aBool5048)
	    anObjectArray5050[i] = aClass454_5055.method7370(i, (byte) 11);
	else
	    anObjectArray5050[i] = (Class525_Sub16_Sub6.method18288
				    (aClass454_5055.method7370(i, (byte) 11),
				     false, -379395561));
    }
    
    public void method7475(int i, int i_45_) {
	aClass454_5055.method7363(i, 393418517);
    }
    
    public byte[] getFile(int i, int i_46_, int i_47_) {
	return method7477(i, i_46_, null, -1348852104);
    }
    
    public synchronized byte[] method7477(int i, int i_48_, int[] is,
					  int i_49_) {
	if (!method7536(i, i_48_, -1541718587))
	    return null;
	byte[] is_50_ = null;
	if (anObjectArrayArray5046[i] == null
	    || null == anObjectArrayArray5046[i][i_48_]) {
	    boolean bool = method7469(i, i_48_, is, -1925261857);
	    if (!bool) {
		method7474(i, (byte) 42);
		bool = method7469(i, i_48_, is, -1635637461);
		if (!bool)
		    return null;
	    }
	}
	if (anObjectArrayArray5046[i] == null)
	    throw new RuntimeException("");
	if (null != anObjectArrayArray5046[i][i_48_]) {
	    is_50_ = Class23.method830(anObjectArrayArray5046[i][i_48_], false,
				       912473334);
	    if (is_50_ == null)
		throw new RuntimeException("");
	}
	if (is_50_ != null) {
	    if (112467553 * anInt5047 == 1) {
		anObjectArrayArray5046[i][i_48_] = null;
		if (1 == aClass461_5053.childSizes[i])
		    anObjectArrayArray5046[i] = null;
	    } else if (2 == anInt5047 * 112467553)
		anObjectArrayArray5046[i] = null;
	}
	return is_50_;
    }
    
    public synchronized boolean method7478(int i, int i_51_, short i_52_) {
	if (!method7536(i, i_51_, 2089307514))
	    return false;
	if (anObjectArrayArray5046[i] != null
	    && null != anObjectArrayArray5046[i][i_51_])
	    return true;
	if (null != anObjectArray5050[i])
	    return true;
	method7474(i, (byte) 42);
	if (anObjectArray5050[i] != null)
	    return true;
	return false;
    }
    
    boolean method7479(String string, String string_53_, byte i) {
	if (!method7470((byte) 5))
	    return false;
	string = string.toLowerCase();
	string_53_ = string_53_.toLowerCase();
	int i_54_ = (aClass461_5053.aClass265_5078.method4796
		     (Class221.method4214(string, -639778334), -1595858416));
	if (!archiveExists(i_54_, -314877769))
	    return false;
	int i_55_
	    = (aClass461_5053.aClass265Array5071[i_54_].method4796
	       (Class221.method4214(string_53_, -997150997), -1595858416));
	return method7478(i_54_, i_55_, (short) 9304);
    }
    
    synchronized boolean method7480(int i) {
	if (!method7470((byte) 123))
	    return false;
	if (i < 0 || i >= aClass461_5053.childSizes.length
	    || 0 == aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method7481(short i) {
	if (!method7470((byte) 99))
	    return false;
	boolean bool = true;
	for (int i_56_ = 0; i_56_ < aClass461_5053.anIntArray5083.length;
	     i_56_++) {
	    int i_57_ = aClass461_5053.anIntArray5083[i_56_];
	    if (anObjectArray5050[i_57_] == null) {
		method7474(i_57_, (byte) 42);
		if (null == anObjectArray5050[i_57_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method7482(String string, String string_58_) {
	if (!method7470((byte) 119))
	    return false;
	string = string.toLowerCase();
	string_58_ = string_58_.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -1048975950), -1595858416));
	if (i < 0)
	    return false;
	int i_59_
	    = (aClass461_5053.aClass265Array5071[i].method4796
	       (Class221.method4214(string_58_, -550058863), -1595858416));
	if (i_59_ < 0)
	    return false;
	return true;
    }
    
    public synchronized int method7483(byte i) {
	if (!method7470((byte) 111))
	    return 0;
	int i_60_ = 0;
	int i_61_ = 0;
	for (int i_62_ = 0; i_62_ < anObjectArray5050.length; i_62_++) {
	    if (aClass461_5053.anIntArray5086[i_62_] > 0) {
		i_60_ += 100;
		i_61_ += method7515(i_62_, (byte) 13);
	    }
	}
	if (i_60_ == 0)
	    return 100;
	int i_63_ = i_61_ * 100 / i_60_;
	return i_63_;
    }
    
    public synchronized byte[] getTextureData(int i, int i_64_) {
	if (!method7470((byte) 91))
	    return null;
	if (1 == aClass461_5053.childSizes.length)
	    return getFile(0, i, 913795804);
	if (!archiveExists(i, 1894795119))
	    return null;
	if (aClass461_5053.childSizes[i] == 1)
	    return getFile(i, 0, 1542242804);
	throw new RuntimeException();
    }
    
    public boolean method7485(String string) {
	int i = method7521("", -2116786302);
	if (i != -1)
	    return method7479("", string, (byte) -17);
	return method7479(string, "", (byte) -106);
    }
    
    public boolean method7486(String string, int i) {
	if (!method7470((byte) 45))
	    return false;
	string = string.toLowerCase();
	int i_65_ = (aClass461_5053.aClass265_5078.method4796
		     (Class221.method4214(string, -461948790), -1595858416));
	return method7558(i_65_, (byte) 92);
    }
    
    public int getFileCountForArchive(int i, int i_66_) {
	if (!archiveExists(i, -1736056378))
	    return 0;
	return aClass461_5053.childSizes[i];
    }
    
    static final byte[] method7488(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	Class468 class468 = new Class468(class525_sub38);
	Class472 class472 = class468.method7701((byte) 3);
	int i = class468.method7700(-1952060673);
	if (i < 0
	    || 0 != -1911335593 * anInt5057 && i > -1911335593 * anInt5057)
	    throw new RuntimeException();
	if (Class472.aClass472_5152 == class472) {
	    byte[] is_67_ = new byte[i];
	    class525_sub38.readBytes(is_67_, 0, i, 1345580610);
	    return is_67_;
	}
	int i_68_ = class468.method7703((byte) 45);
	if (i_68_ < 0
	    || anInt5057 * -1911335593 != 0 && i_68_ > -1911335593 * anInt5057)
	    throw new RuntimeException();
	byte[] is_69_;
	if (class472 == Class472.aClass472_5151) {
	    is_69_ = new byte[i_68_];
	    Class710.method14430(is_69_, i_68_, is, i, 9);
	} else if (class472 == Class472.aClass472_5153) {
	    is_69_ = new byte[i_68_];
	    synchronized (aClass74_5049) {
		aClass74_5049.method1542(class525_sub38, is_69_, -982321503);
	    }
	} else if (Class472.aClass472_5154 == class472) {
	    try {
		is_69_ = Class401.method6553(class525_sub38, i_68_, (byte) 73);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_69_;
    }
    
    public synchronized void method7489(int i, int i_70_) {
	if (archiveExists(i, -1537502110)) {
	    if (anObjectArrayArray5046 != null)
		anObjectArrayArray5046[i] = null;
	}
    }
    
    public int method7490() {
	if (!method7470((byte) 66))
	    throw new IllegalStateException("");
	return -982549883 * aClass461_5053.anInt5072;
    }
    
    public JS5(Class454 class454, boolean bool, int i) {
	if (i < 0 || i > 2)
	    throw new IllegalArgumentException("");
	aClass454_5055 = class454;
	aBool5048 = bool;
	anInt5047 = i * 2109801889;
    }
    
    public synchronized int method7491(int i) {
	if (!archiveExists(i, 1607392982))
	    return 0;
	if (anObjectArray5050[i] != null)
	    return 100;
	return aClass454_5055.method7362(i, (byte) 0);
    }
    
    synchronized boolean method7492(int i, int i_71_, int[] is) {
	if (!archiveExists(i, -1452639196))
	    return false;
	if (anObjectArray5050[i] == null)
	    return false;
	int i_72_ = aClass461_5053.anIntArray5086[i];
	int[] is_73_ = aClass461_5053.anIntArrayArray5087[i];
	if (anObjectArrayArray5046[i] == null)
	    anObjectArrayArray5046[i]
		= new Object[aClass461_5053.childSizes[i]];
	Object[] objects = anObjectArrayArray5046[i];
	boolean bool = true;
	for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
	    int i_75_;
	    if (is_73_ == null)
		i_75_ = i_74_;
	    else
		i_75_ = is_73_[i_74_];
	    if (objects[i_75_] == null) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_76_;
	if (is != null
	    && (0 != is[0] || is[1] != 0 || 0 != is[2] || is[3] != 0)) {
	    is_76_ = Class23.method830(anObjectArray5050[i], true, 1136835123);
	    RSBuffer class525_sub38 = new RSBuffer(is_76_);
	    int i_77_ = class525_sub38.readUnsignedByte(908382490);
	    int i_78_ = class525_sub38.readInt(1763861591);
	    int i_79_ = ((i_77_ == Class472.aClass472_5152.method80() ? 5 : 9)
			 + i_78_);
	    class525_sub38.method16651(is, 5, i_79_, 2013568798);
	} else
	    is_76_
		= Class23.method830(anObjectArray5050[i], false, 1627568247);
	byte[] is_80_;
	try {
	    is_80_ = Class214.method4011(is_76_, (byte) -65);
	} catch (RuntimeException runtimeexception) {
	    throw Class533.method8853
		      (runtimeexception,
		       new StringBuilder().append(null != is).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_76_.length).append
			   (" ").append
			   (Class272.method5023(is_76_, is_76_.length,
						1777895575))
			   .append
			   (" ").append
			   (Class272.method5023(is_76_, is_76_.length - 2,
						1777895575))
			   .append
			   (" ").append
			   (aClass461_5053.anIntArray5080[i]).append
			   (" ").append
			   (aClass461_5053.anInt5072 * -982549883).toString());
	}
	if (aBool5048)
	    anObjectArray5050[i] = null;
	if (i_72_ > 1) {
	    if (anInt5047 * 112467553 != 2) {
		int i_81_ = is_80_.length;
		int i_82_ = is_80_[--i_81_] & 0xff;
		i_81_ -= i_82_ * i_72_ * 4;
		RSBuffer class525_sub38 = new RSBuffer(is_80_);
		int[] is_83_ = new int[i_72_];
		class525_sub38.index = 339428471 * i_81_;
		for (int i_84_ = 0; i_84_ < i_82_; i_84_++) {
		    int i_85_ = 0;
		    for (int i_86_ = 0; i_86_ < i_72_; i_86_++) {
			i_85_ += class525_sub38.readInt(2096539597);
			is_83_[i_86_] += i_85_;
		    }
		}
		byte[][] is_87_ = new byte[i_72_][];
		for (int i_88_ = 0; i_88_ < i_72_; i_88_++) {
		    is_87_[i_88_] = new byte[is_83_[i_88_]];
		    is_83_[i_88_] = 0;
		}
		class525_sub38.index = i_81_ * 339428471;
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < i_82_; i_90_++) {
		    int i_91_ = 0;
		    for (int i_92_ = 0; i_92_ < i_72_; i_92_++) {
			i_91_ += class525_sub38.readInt(1872590394);
			System.arraycopy(is_80_, i_89_, is_87_[i_92_],
					 is_83_[i_92_], i_91_);
			is_83_[i_92_] += i_91_;
			i_89_ += i_91_;
		    }
		}
		for (int i_93_ = 0; i_93_ < i_72_; i_93_++) {
		    int i_94_;
		    if (is_73_ == null)
			i_94_ = i_93_;
		    else
			i_94_ = is_73_[i_93_];
		    if (0 == anInt5047 * 112467553)
			objects[i_94_]
			    = Class525_Sub16_Sub6.method18288(is_87_[i_93_],
							      false,
							      -1763631065);
		    else
			objects[i_94_] = is_87_[i_93_];
		}
	    } else {
		int i_95_ = is_80_.length;
		int i_96_ = is_80_[--i_95_] & 0xff;
		i_95_ -= i_72_ * i_96_ * 4;
		RSBuffer class525_sub38 = new RSBuffer(is_80_);
		int i_97_ = 0;
		int i_98_ = 0;
		class525_sub38.index = 339428471 * i_95_;
		for (int i_99_ = 0; i_99_ < i_96_; i_99_++) {
		    int i_100_ = 0;
		    for (int i_101_ = 0; i_101_ < i_72_; i_101_++) {
			i_100_ += class525_sub38.readInt(1011770422);
			int i_102_;
			if (null == is_73_)
			    i_102_ = i_101_;
			else
			    i_102_ = is_73_[i_101_];
			if (i_102_ == i_71_) {
			    i_97_ += i_100_;
			    i_98_ = i_102_;
			}
		    }
		}
		if (0 == i_97_)
		    return true;
		byte[] is_103_ = new byte[i_97_];
		i_97_ = 0;
		class525_sub38.index = i_95_ * 339428471;
		int i_104_ = 0;
		for (int i_105_ = 0; i_105_ < i_96_; i_105_++) {
		    int i_106_ = 0;
		    for (int i_107_ = 0; i_107_ < i_72_; i_107_++) {
			i_106_ += class525_sub38.readInt(1397086325);
			int i_108_;
			if (null == is_73_)
			    i_108_ = i_107_;
			else
			    i_108_ = is_73_[i_107_];
			if (i_108_ == i_71_) {
			    System.arraycopy(is_80_, i_104_, is_103_, i_97_,
					     i_106_);
			    i_97_ += i_106_;
			}
			i_104_ += i_106_;
		    }
		}
		objects[i_98_] = is_103_;
	    }
	} else {
	    int i_109_;
	    if (null == is_73_)
		i_109_ = 0;
	    else
		i_109_ = is_73_[0];
	    if (anInt5047 * 112467553 == 0)
		objects[i_109_]
		    = Class525_Sub16_Sub6.method18288(is_80_, false,
						      239857429);
	    else
		objects[i_109_] = is_80_;
	}
	return true;
    }
    
    public boolean method7493(String string, int i) {
	if (!method7470((byte) 99))
	    return false;
	string = string.toLowerCase();
	int i_110_ = (aClass461_5053.aClass265_5078.method4796
		      (Class221.method4214(string, -980556384), -1595858416));
	if (i_110_ < 0)
	    return false;
	return true;
    }
    
    public int method7494(int i) {
	if (!archiveExists(i, -1001747493))
	    return 0;
	return aClass461_5053.childSizes[i];
    }
    
    public synchronized byte[] method7495(String string, String string_111_,
					  int i) {
	if (!method7470((byte) 107))
	    return null;
	string = string.toLowerCase();
	string_111_ = string_111_.toLowerCase();
	int i_112_ = (aClass461_5053.aClass265_5078.method4796
		      (Class221.method4214(string, -822107564), -1595858416));
	if (!archiveExists(i_112_, 2083952117))
	    return null;
	int i_113_
	    = (aClass461_5053.aClass265Array5071[i_112_].method4796
	       (Class221.method4214(string_111_, -200085674), -1595858416));
	return getFile(i_112_, i_113_, 789306840);
    }
    
    public void method7496(boolean bool, boolean bool_114_) {
	if (method7470((byte) 63)) {
	    if (bool) {
		aClass461_5053.anIntArray5077 = null;
		aClass461_5053.aClass265_5078 = null;
	    }
	    if (bool_114_) {
		aClass461_5053.anIntArrayArray5088 = null;
		aClass461_5053.aClass265Array5071 = null;
	    }
	}
    }
    
    static final byte[] method7497(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	Class468 class468 = new Class468(class525_sub38);
	Class472 class472 = class468.method7701((byte) 3);
	int i = class468.method7700(-2082687748);
	if (i < 0
	    || 0 != -1911335593 * anInt5057 && i > -1911335593 * anInt5057)
	    throw new RuntimeException();
	if (Class472.aClass472_5152 == class472) {
	    byte[] is_115_ = new byte[i];
	    class525_sub38.readBytes(is_115_, 0, i, 760459497);
	    return is_115_;
	}
	int i_116_ = class468.method7703((byte) 75);
	if (i_116_ < 0 || (anInt5057 * -1911335593 != 0
			   && i_116_ > -1911335593 * anInt5057))
	    throw new RuntimeException();
	byte[] is_117_;
	if (class472 == Class472.aClass472_5151) {
	    is_117_ = new byte[i_116_];
	    Class710.method14430(is_117_, i_116_, is, i, 9);
	} else if (class472 == Class472.aClass472_5153) {
	    is_117_ = new byte[i_116_];
	    synchronized (aClass74_5049) {
		aClass74_5049.method1542(class525_sub38, is_117_, -1320891653);
	    }
	} else if (Class472.aClass472_5154 == class472) {
	    try {
		is_117_
		    = Class401.method6553(class525_sub38, i_116_, (byte) 87);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_117_;
    }
    
    public int method7498(String string) {
	if (!method7470((byte) 78))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -2130293653), -1595858416));
	if (!archiveExists(i, 526834245))
	    return -1;
	return i;
    }
    
    public int method7499(String string, int i) {
	if (!method7470((byte) 103))
	    return 0;
	string = string.toLowerCase();
	int i_118_ = (aClass461_5053.aClass265_5078.method4796
		      (Class221.method4214(string, -1347056384), -1595858416));
	return method7515(i_118_, (byte) 89);
    }
    
    synchronized boolean method7500() {
	if (aClass461_5053 == null) {
	    aClass461_5053 = aClass454_5055.method7361(-2021659291);
	    if (aClass461_5053 == null)
		return false;
	    anObjectArray5050
		= new Object[aClass461_5053.anInt5079 * 1259617575];
	    anObjectArrayArray5046
		= new Object[aClass461_5053.anInt5079 * 1259617575][];
	}
	return true;
    }
    
    public int method7501() {
	if (!method7470((byte) 124))
	    throw new IllegalStateException("");
	return -982549883 * aClass461_5053.anInt5072;
    }
    
    public boolean method7502(int i, int i_119_) {
	if (!method7470((byte) 22))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7536(0, i, 1536481989);
	if (!archiveExists(i, 169465705))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7536(i, 0, 35579066);
	throw new RuntimeException();
    }
    
    public int method7503() {
	if (!method7470((byte) 69))
	    throw new IllegalStateException("");
	return -982549883 * aClass461_5053.anInt5072;
    }
    
    synchronized boolean method7504(int i) {
	if (!method7470((byte) 27))
	    return false;
	if (i < 0 || i >= aClass461_5053.childSizes.length
	    || 0 == aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public int method7505(int i) {
	if (!method7470((byte) 110))
	    return -1;
	return aClass461_5053.childSizes.length;
    }
    
    public synchronized boolean method7506(int i, int i_120_) {
	if (!method7470((byte) 57))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7478(0, i, (short) 1620);
	if (!archiveExists(i, -1265464074))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7478(i, 0, (short) 28948);
	throw new RuntimeException();
    }
    
    public synchronized boolean method7507(int i, int i_121_) {
	if (!method7470((byte) 38))
	    return false;
	if (i < 0 || i_121_ < 0 || i >= aClass461_5053.childSizes.length
	    || i_121_ >= aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_121_).toString());
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method7508(int i, int i_122_) {
	if (!method7470((byte) 68))
	    return false;
	if (i < 0 || i_122_ < 0 || i >= aClass461_5053.childSizes.length
	    || i_122_ >= aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_122_).toString());
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method7509(int i, int i_123_) {
	if (!method7470((byte) 83))
	    return false;
	if (i < 0 || i_123_ < 0 || i >= aClass461_5053.childSizes.length
	    || i_123_ >= aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_123_).toString());
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method7510(int i, int i_124_) {
	if (!method7470((byte) 58))
	    return false;
	if (i < 0 || i_124_ < 0 || i >= aClass461_5053.childSizes.length
	    || i_124_ >= aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_124_).toString());
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method7511(int i, int i_125_) {
	if (!method7470((byte) 124))
	    return false;
	if (i < 0 || i_125_ < 0 || i >= aClass461_5053.childSizes.length
	    || i_125_ >= aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_125_).toString());
	    return false;
	}
	return true;
    }
    
    synchronized void method7512(int i) {
	if (aBool5048)
	    anObjectArray5050[i] = aClass454_5055.method7370(i, (byte) 11);
	else
	    anObjectArray5050[i] = (Class525_Sub16_Sub6.method18288
				    (aClass454_5055.method7370(i, (byte) 11),
				     false, -631153822));
    }
    
    synchronized void method7513(int i) {
	if (aBool5048)
	    anObjectArray5050[i] = aClass454_5055.method7370(i, (byte) 11);
	else
	    anObjectArray5050[i] = (Class525_Sub16_Sub6.method18288
				    (aClass454_5055.method7370(i, (byte) 11),
				     false, 689191965));
    }
    
    public void method7514(int i) {
	aClass454_5055.method7363(i, -95282892);
    }
    
    public synchronized int method7515(int i, byte i_126_) {
	if (!archiveExists(i, 733785450))
	    return 0;
	if (anObjectArray5050[i] != null)
	    return 100;
	return aClass454_5055.method7362(i, (byte) 0);
    }
    
    public synchronized boolean method7516(int i, int i_127_) {
	if (!method7536(i, i_127_, 897787928))
	    return false;
	if (anObjectArrayArray5046[i] != null
	    && null != anObjectArrayArray5046[i][i_127_])
	    return true;
	if (null != anObjectArray5050[i])
	    return true;
	method7474(i, (byte) 42);
	if (anObjectArray5050[i] != null)
	    return true;
	return false;
    }
    
    public synchronized boolean method7517(int i, int i_128_) {
	if (!method7536(i, i_128_, 1234813311))
	    return false;
	if (anObjectArrayArray5046[i] != null
	    && null != anObjectArrayArray5046[i][i_128_])
	    return true;
	if (null != anObjectArray5050[i])
	    return true;
	method7474(i, (byte) 42);
	if (anObjectArray5050[i] != null)
	    return true;
	return false;
    }
    
    public synchronized boolean method7518(int i, int i_129_) {
	if (!method7536(i, i_129_, -1714278931))
	    return false;
	if (anObjectArrayArray5046[i] != null
	    && null != anObjectArrayArray5046[i][i_129_])
	    return true;
	if (null != anObjectArray5050[i])
	    return true;
	method7474(i, (byte) 42);
	if (anObjectArray5050[i] != null)
	    return true;
	return false;
    }
    
    public synchronized boolean method7519() {
	if (!method7470((byte) 118))
	    return false;
	boolean bool = true;
	for (int i = 0; i < aClass461_5053.anIntArray5083.length; i++) {
	    int i_130_ = aClass461_5053.anIntArray5083[i];
	    if (anObjectArray5050[i_130_] == null) {
		method7474(i_130_, (byte) 42);
		if (null == anObjectArray5050[i_130_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public synchronized boolean method7520(int i) {
	if (!method7470((byte) 56))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7478(0, i, (short) 13100);
	if (!archiveExists(i, -1050834840))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7478(i, 0, (short) 29440);
	throw new RuntimeException();
    }
    
    public int method7521(String string, int i) {
	if (!method7470((byte) 26))
	    return -1;
	string = string.toLowerCase();
	int i_131_ = (aClass461_5053.aClass265_5078.method4796
		      (Class221.method4214(string, -1185293872), -1595858416));
	if (!archiveExists(i_131_, -1553820210))
	    return -1;
	return i_131_;
    }
    
    public synchronized boolean method7522(int i) {
	if (!method7470((byte) 97))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7478(0, i, (short) 1942);
	if (!archiveExists(i, -248731052))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7478(i, 0, (short) 22690);
	throw new RuntimeException();
    }
    
    public synchronized boolean method7523(int i) {
	if (!method7470((byte) 22))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7478(0, i, (short) 4859);
	if (!archiveExists(i, 255209621))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7478(i, 0, (short) 4292);
	throw new RuntimeException();
    }
    
    public int method7524(int i) {
	if (!archiveExists(i, 848769584))
	    return 0;
	return aClass461_5053.childSizes[i];
    }
    
    public synchronized int method7525(int i) {
	if (!archiveExists(i, -1880794670))
	    return 0;
	if (anObjectArray5050[i] != null)
	    return 100;
	return aClass454_5055.method7362(i, (byte) 0);
    }
    
    public synchronized int method7526(int i) {
	if (!archiveExists(i, 1241839619))
	    return 0;
	if (anObjectArray5050[i] != null)
	    return 100;
	return aClass454_5055.method7362(i, (byte) 0);
    }
    
    public synchronized boolean method7527(int i, int i_132_) {
	if (!method7536(i, i_132_, -421864612))
	    return false;
	if (anObjectArrayArray5046[i] != null
	    && null != anObjectArrayArray5046[i][i_132_])
	    return true;
	if (null != anObjectArray5050[i])
	    return true;
	method7474(i, (byte) 42);
	if (anObjectArray5050[i] != null)
	    return true;
	return false;
    }
    
    public synchronized int method7528() {
	if (!method7470((byte) 27))
	    return 0;
	int i = 0;
	int i_133_ = 0;
	for (int i_134_ = 0; i_134_ < anObjectArray5050.length; i_134_++) {
	    if (aClass461_5053.anIntArray5086[i_134_] > 0) {
		i += 100;
		i_133_ += method7515(i_134_, (byte) 30);
	    }
	}
	if (i == 0)
	    return 100;
	int i_135_ = i_133_ * 100 / i;
	return i_135_;
    }
    
    public synchronized int method7529() {
	if (!method7470((byte) 82))
	    return 0;
	int i = 0;
	int i_136_ = 0;
	for (int i_137_ = 0; i_137_ < anObjectArray5050.length; i_137_++) {
	    if (aClass461_5053.anIntArray5086[i_137_] > 0) {
		i += 100;
		i_136_ += method7515(i_137_, (byte) 14);
	    }
	}
	if (i == 0)
	    return 100;
	int i_138_ = i_136_ * 100 / i;
	return i_138_;
    }
    
    boolean method7530(String string, String string_139_) {
	if (!method7470((byte) 92))
	    return false;
	string = string.toLowerCase();
	string_139_ = string_139_.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -972945653), -1595858416));
	if (!archiveExists(i, 1266194933))
	    return false;
	int i_140_
	    = (aClass461_5053.aClass265Array5071[i].method4796
	       (Class221.method4214(string_139_, -1231402774), -1595858416));
	return method7478(i, i_140_, (short) 8772);
    }
    
    public boolean method7531(int i) {
	if (!method7470((byte) 46))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7536(0, i, 1101134444);
	if (!archiveExists(i, 1592801985))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7536(i, 0, -758755582);
	throw new RuntimeException();
    }
    
    public int method7532(int i) {
	if (!archiveExists(i, 1282132301))
	    return 0;
	return aClass461_5053.childSizes[i];
    }
    
    public boolean method7533(String string) {
	if (!method7470((byte) 67))
	    return false;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -1111029148), -1595858416));
	return method7558(i, (byte) 94);
    }
    
    public boolean method7534(String string, int i) {
	int i_141_ = method7521("", -2116786302);
	if (i_141_ != -1)
	    return method7479("", string, (byte) 12);
	return method7479(string, "", (byte) 30);
    }
    
    public int method7535(int i) {
	if (!archiveExists(i, -944495666))
	    return 0;
	return aClass461_5053.childSizes[i];
    }
    
    public synchronized boolean method7536(int i, int i_142_, int i_143_) {
	if (!method7470((byte) 103))
	    return false;
	if (i < 0 || i_142_ < 0 || i >= aClass461_5053.childSizes.length
	    || i_142_ >= aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_142_).toString());
	    return false;
	}
	return true;
    }
    
    public int method7537() {
	if (!method7470((byte) 17))
	    return -1;
	return aClass461_5053.childSizes.length;
    }
    
    public synchronized void method7538(int i) {
	if (archiveExists(i, -449600303)) {
	    if (anObjectArrayArray5046 != null)
		anObjectArrayArray5046[i] = null;
	}
    }
    
    public void method7539(boolean bool, boolean bool_144_) {
	if (method7470((byte) 61)) {
	    if (bool) {
		aClass461_5053.anIntArray5077 = null;
		aClass461_5053.aClass265_5078 = null;
	    }
	    if (bool_144_) {
		aClass461_5053.anIntArrayArray5088 = null;
		aClass461_5053.aClass265Array5071 = null;
	    }
	}
    }
    
    public synchronized int[] method7540(int i, int i_145_) {
	if (!archiveExists(i, 693714291))
	    return null;
	int[] is = aClass461_5053.anIntArrayArray5087[i];
	if (is == null) {
	    is = new int[aClass461_5053.anIntArray5086[i]];
	    for (int i_146_ = 0; i_146_ < is.length; i_146_++)
		is[i_146_] = i_146_;
	}
	return is;
    }
    
    public int method7541(String string) {
	if (!method7470((byte) 83))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -613392894), -1595858416));
	if (!archiveExists(i, 1386793021))
	    return -1;
	return i;
    }
    
    public void method7542(boolean bool, boolean bool_147_) {
	if (method7470((byte) 95)) {
	    if (bool) {
		aClass461_5053.anIntArray5077 = null;
		aClass461_5053.aClass265_5078 = null;
	    }
	    if (bool_147_) {
		aClass461_5053.anIntArrayArray5088 = null;
		aClass461_5053.aClass265Array5071 = null;
	    }
	}
    }
    
    public int method7543(String string) {
	if (!method7470((byte) 75))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -1465347477), -1595858416));
	return method7515(i, (byte) 42);
    }
    
    public int method7544(String string) {
	if (!method7470((byte) 57))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -727191604), -1595858416));
	if (!archiveExists(i, 1410983427))
	    return -1;
	return i;
    }
    
    public int method7545(String string) {
	if (!method7470((byte) 125))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -1938909040), -1595858416));
	if (!archiveExists(i, -211642778))
	    return -1;
	return i;
    }
    
    public void method7546(boolean bool, boolean bool_148_) {
	if (method7470((byte) 80)) {
	    if (bool) {
		aClass461_5053.anIntArray5077 = null;
		aClass461_5053.aClass265_5078 = null;
	    }
	    if (bool_148_) {
		aClass461_5053.anIntArrayArray5088 = null;
		aClass461_5053.aClass265Array5071 = null;
	    }
	}
    }
    
    public void method7547(boolean bool, boolean bool_149_, int i) {
	if (method7470((byte) 5)) {
	    if (bool) {
		aClass461_5053.anIntArray5077 = null;
		aClass461_5053.aClass265_5078 = null;
	    }
	    if (bool_149_) {
		aClass461_5053.anIntArrayArray5088 = null;
		aClass461_5053.aClass265Array5071 = null;
	    }
	}
    }
    
    public int method7548(String string) {
	if (!method7470((byte) 95))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -487298233), -1595858416));
	if (!archiveExists(i, -1512061558))
	    return -1;
	return i;
    }
    
    public int method7549(int i) {
	if (!method7470((byte) 19))
	    return -1;
	int i_150_ = aClass461_5053.aClass265_5078.method4796(i, -1595858416);
	if (!archiveExists(i_150_, -895293759))
	    return -1;
	return i_150_;
    }
    
    synchronized boolean method7550(int i) {
	if (!method7470((byte) 20))
	    return false;
	if (i < 0 || i >= aClass461_5053.childSizes.length
	    || 0 == aClass461_5053.childSizes[i]) {
	    if (aBool5056)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    boolean method7551(String string, String string_151_) {
	if (!method7470((byte) 54))
	    return false;
	string = string.toLowerCase();
	string_151_ = string_151_.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -231302377), -1595858416));
	if (!archiveExists(i, 1118242960))
	    return false;
	int i_152_
	    = (aClass461_5053.aClass265Array5071[i].method4796
	       (Class221.method4214(string_151_, -1120567957), -1595858416));
	return method7478(i, i_152_, (short) 20040);
    }
    
    public synchronized boolean method7552(int i) {
	if (!archiveExists(i, 704627096))
	    return false;
	if (anObjectArray5050[i] != null)
	    return true;
	method7474(i, (byte) 42);
	if (null != anObjectArray5050[i])
	    return true;
	return false;
    }
    
    public boolean method7553(String string) {
	int i = method7521("", -2116786302);
	if (i != -1)
	    return method7479("", string, (byte) -39);
	return method7479(string, "", (byte) -5);
    }
    
    public boolean method7554(String string) {
	int i = method7521("", -2116786302);
	if (i != -1)
	    return method7479("", string, (byte) -6);
	return method7479(string, "", (byte) -21);
    }
    
    public boolean method7555(String string) {
	int i = method7521("", -2116786302);
	if (i != -1)
	    return method7479("", string, (byte) 56);
	return method7479(string, "", (byte) -23);
    }
    
    public boolean method7556(String string) {
	int i = method7521("", -2116786302);
	if (i != -1)
	    return method7479("", string, (byte) -15);
	return method7479(string, "", (byte) -2);
    }
    
    public int method7557(int i, int i_153_) {
	if (!method7470((byte) 51))
	    return -1;
	int i_154_ = aClass461_5053.aClass265_5078.method4796(i, -1595858416);
	if (!archiveExists(i_154_, -331658056))
	    return -1;
	return i_154_;
    }
    
    public synchronized boolean method7558(int i, byte i_155_) {
	if (!archiveExists(i, -1984357238))
	    return false;
	if (anObjectArray5050[i] != null)
	    return true;
	method7474(i, (byte) 42);
	if (null != anObjectArray5050[i])
	    return true;
	return false;
    }
    
    public boolean method7559(String string) {
	if (!method7470((byte) 64))
	    return false;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -518128696), -1595858416));
	return method7558(i, (byte) 65);
    }
    
    public boolean method7560(String string) {
	if (!method7470((byte) 32))
	    return false;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -1583276399), -1595858416));
	return method7558(i, (byte) 77);
    }
    
    public synchronized boolean method7561(int i) {
	if (!method7470((byte) 19))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7478(0, i, (short) 913);
	if (!archiveExists(i, 1827482176))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7478(i, 0, (short) 9812);
	throw new RuntimeException();
    }
    
    public int method7562(String string) {
	if (!method7470((byte) 10))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -398151936), -1595858416));
	return method7515(i, (byte) 11);
    }
    
    public int method7563(String string) {
	if (!method7470((byte) 14))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass461_5053.aClass265_5078.method4796
		 (Class221.method4214(string, -1605153081), -1595858416));
	return method7515(i, (byte) 94);
    }
    
    static final byte[] method7564(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	Class468 class468 = new Class468(class525_sub38);
	Class472 class472 = class468.method7701((byte) 3);
	int i = class468.method7700(-2112966302);
	if (i < 0
	    || 0 != -1911335593 * anInt5057 && i > -1911335593 * anInt5057)
	    throw new RuntimeException();
	if (Class472.aClass472_5152 == class472) {
	    byte[] is_156_ = new byte[i];
	    class525_sub38.readBytes(is_156_, 0, i, 78008704);
	    return is_156_;
	}
	int i_157_ = class468.method7703((byte) 84);
	if (i_157_ < 0 || (anInt5057 * -1911335593 != 0
			   && i_157_ > -1911335593 * anInt5057))
	    throw new RuntimeException();
	byte[] is_158_;
	if (class472 == Class472.aClass472_5151) {
	    is_158_ = new byte[i_157_];
	    Class710.method14430(is_158_, i_157_, is, i, 9);
	} else if (class472 == Class472.aClass472_5153) {
	    is_158_ = new byte[i_157_];
	    synchronized (aClass74_5049) {
		aClass74_5049.method1542(class525_sub38, is_158_, 2124399356);
	    }
	} else if (Class472.aClass472_5154 == class472) {
	    try {
		is_158_
		    = Class401.method6553(class525_sub38, i_157_, (byte) 33);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_158_;
    }
    
    static final byte[] method7565(byte[] is) {
	RSBuffer class525_sub38 = new RSBuffer(is);
	Class468 class468 = new Class468(class525_sub38);
	Class472 class472 = class468.method7701((byte) 3);
	int i = class468.method7700(-2001567090);
	if (i < 0
	    || 0 != -1911335593 * anInt5057 && i > -1911335593 * anInt5057)
	    throw new RuntimeException();
	if (Class472.aClass472_5152 == class472) {
	    byte[] is_159_ = new byte[i];
	    class525_sub38.readBytes(is_159_, 0, i, 472629827);
	    return is_159_;
	}
	int i_160_ = class468.method7703((byte) 7);
	if (i_160_ < 0 || (anInt5057 * -1911335593 != 0
			   && i_160_ > -1911335593 * anInt5057))
	    throw new RuntimeException();
	byte[] is_161_;
	if (class472 == Class472.aClass472_5151) {
	    is_161_ = new byte[i_160_];
	    Class710.method14430(is_161_, i_160_, is, i, 9);
	} else if (class472 == Class472.aClass472_5153) {
	    is_161_ = new byte[i_160_];
	    synchronized (aClass74_5049) {
		aClass74_5049.method1542(class525_sub38, is_161_, -1371986976);
	    }
	} else if (Class472.aClass472_5154 == class472) {
	    try {
		is_161_
		    = Class401.method6553(class525_sub38, i_160_, (byte) 106);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_161_;
    }
    
    public boolean method7566(int i) {
	if (!method7470((byte) 121))
	    return false;
	if (1 == aClass461_5053.childSizes.length)
	    return method7536(0, i, 899077796);
	if (!archiveExists(i, 1358945528))
	    return false;
	if (aClass461_5053.childSizes[i] == 1)
	    return method7536(i, 0, 819706058);
	throw new RuntimeException();
    }
    
    public int method7567() {
	if (!method7470((byte) 99))
	    return -1;
	return aClass461_5053.childSizes.length;
    }
    
    static final void method7568(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub39_10677
		  .method17324(-16711936);
    }
    
    static void method7569(Class245 class245, Class259 class259, byte i) {
	if (null != class259) {
	    if (class259.anInt2576 * 1534974651 != -1) {
		Class259 class259_162_
		    = (class245.aClass259Array2426
		       [-1549235523 * class259.anInt2606 & 0xffff]);
		if (null != class259_162_) {
		    if (class259_162_.aClass259Array2755
			== class259_162_.aClass259Array2655) {
			class259_162_.aClass259Array2755
			    = (new Class259
			       [class259_162_.aClass259Array2655.length]);
			class259_162_.aClass259Array2755[0] = class259;
			Class692.method14119(class259_162_.aClass259Array2655,
					     0,
					     class259_162_.aClass259Array2755,
					     1,
					     1534974651 * class259.anInt2576);
			Class692.method14119
			    (class259_162_.aClass259Array2655,
			     1 + 1534974651 * class259.anInt2576,
			     class259_162_.aClass259Array2755,
			     1 + 1534974651 * class259.anInt2576,
			     (class259_162_.aClass259Array2655.length
			      - class259.anInt2576 * 1534974651 - 1));
		    } else {
			int i_163_ = 0;
			Class259[] class259s;
			for (class259s = class259_162_.aClass259Array2755;
			     (i_163_ < class259s.length
			      && class259 != class259s[i_163_]);
			     i_163_++) {
			    /* empty */
			}
			if (i_163_ < class259s.length) {
			    Class692.method14119(class259s, 0, class259s, 1,
						 i_163_);
			    class259s[0] = class259;
			}
		    }
		}
	    } else {
		Class259[] class259s = class245.method4472((byte) 2);
		int i_164_;
		for (i_164_ = 0;
		     (i_164_ < class259s.length
		      && class259 != class259s[i_164_]);
		     i_164_++) {
		    /* empty */
		}
		if (i_164_ < class259s.length) {
		    Class692.method14119(class259s, 0, class259s, 1, i_164_);
		    class259s[0] = class259;
		}
	    }
	}
    }
    
    static final void method7570(Class259 class259, Class245 class245,
				 Class683 class683, int i) {
	String string
	    = (String) (class683.anObjectArray8636
			[(class683.anInt8644 -= 1285561025) * 1373599041]);
	if (Class558.method9375(string, class683, (byte) 3) != null)
	    string = string.substring(0, string.length() - 1);
	class259.anObjectArray2721
	    = Class656_Sub1_Sub5_Sub1.method18727(string, class683,
						  -1919002519);
	class259.aBool2695 = true;
    }
}
