/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class2
{
    public int[] anIntArray15;
    public int[] anIntArray16;
    static final int anInt17 = 2;
    static final int anInt18 = 4;
    static final int anInt19 = 8;
    static final int anInt20 = 2;
    public short[] aShortArray21;
    public int[] anIntArray22 = new int[3];
    public int[] anIntArray23;
    public short[] aShortArray24;
    static final int anInt25 = 1;
    static int anInt26;
    public static int anInt27;
    
    public static Class2 method517(Class8 class8,
				   RSBuffer class525_sub38) {
	return Class175_Sub2.method15603(class8, class525_sub38, 2,
					 -1681681137);
    }
    
    Class2(Class8 class8) {
	anIntArray16 = new int[3];
	anIntArray15 = new int[2];
	anIntArray23 = new int[2];
	anIntArray22[0] = 1508242079 * class8.anInt78;
	anIntArray22[1] = class8.anInt91 * -1343555447;
	anIntArray22[2] = class8.anInt82 * 74846191;
	anIntArray16[0] = -1747988637 * class8.anInt93;
	anIntArray16[1] = 49799703 * class8.anInt94;
	anIntArray16[2] = class8.anInt62 * -2096722129;
	anIntArray15[0] = 1730663877 * class8.anInt103;
	anIntArray15[1] = class8.anInt104 * -252626025;
	anIntArray23[0] = 1522045387 * class8.anInt105;
	anIntArray23[1] = class8.anInt106 * -769283651;
	if (null != class8.aShortArray68) {
	    aShortArray24 = new short[class8.aShortArray68.length];
	    System.arraycopy(class8.aShortArray68, 0, aShortArray24, 0,
			     aShortArray24.length);
	}
	if (null != class8.aShortArray71) {
	    aShortArray21 = new short[class8.aShortArray71.length];
	    System.arraycopy(class8.aShortArray71, 0, aShortArray21, 0,
			     aShortArray21.length);
	}
    }
    
    static Class2 method518(Class8 class8, RSBuffer class525_sub38,
			    int i) {
	Class2 class2 = new Class2(class8);
	int i_0_ = class525_sub38.readUnsignedByte(1097586594);
	boolean bool = (i_0_ & 0x1) != 0;
	boolean bool_1_ = (i_0_ & 0x2) != 0;
	boolean bool_2_ = 0 != (i_0_ & 0x4);
	boolean bool_3_ = (i_0_ & 0x8) != 0;
	if (bool) {
	    if (i <= 1) {
		class2.anIntArray22[0]
		    = class525_sub38.readUnsignedShort((byte) 116);
		class2.anIntArray16[0] = class525_sub38.readUnsignedShort((byte) 6);
	    } else {
		class2.anIntArray22[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray16[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-1 != class8.anInt91 * -1343555447
		|| -1 != 49799703 * class8.anInt94) {
		if (i <= 1) {
		    class2.anIntArray22[1]
			= class525_sub38.readUnsignedShort((byte) 89);
		    class2.anIntArray16[1]
			= class525_sub38.readUnsignedShort((byte) 18);
		} else {
		    class2.anIntArray22[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	    if (-1 != class8.anInt82 * 74846191
		|| class8.anInt62 * -2096722129 != -1) {
		if (i <= 1) {
		    class2.anIntArray22[2]
			= class525_sub38.readUnsignedShort((byte) 65);
		    class2.anIntArray16[2]
			= class525_sub38.readUnsignedShort((byte) 88);
		} else {
		    class2.anIntArray22[2]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[2]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_1_) {
	    if (i <= 1) {
		class2.anIntArray15[0] = class525_sub38.readUnsignedShort((byte) 55);
		class2.anIntArray23[0] = class525_sub38.readUnsignedShort((byte) 52);
	    } else {
		class2.anIntArray15[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray23[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-252626025 * class8.anInt104 != -1
		|| -1 != class8.anInt106 * -769283651) {
		if (i <= 1) {
		    class2.anIntArray15[1]
			= class525_sub38.readUnsignedShort((byte) 78);
		    class2.anIntArray23[1]
			= class525_sub38.readUnsignedShort((byte) 57);
		} else {
		    class2.anIntArray15[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray23[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_2_) {
	    int i_4_ = class525_sub38.readUnsignedShort((byte) 105);
	    int[] is = new int[4];
	    is[0] = i_4_ & 0xf;
	    is[1] = i_4_ >> 4 & 0xf;
	    is[2] = i_4_ >> 8 & 0xf;
	    is[3] = i_4_ >> 12 & 0xf;
	    for (int i_5_ = 0; i_5_ < 4; i_5_++) {
		if (is[i_5_] != 15)
		    class2.aShortArray24[is[i_5_]]
			= (short) class525_sub38.readUnsignedShort((byte) 66);
	    }
	}
	if (bool_3_) {
	    int i_6_ = class525_sub38.readUnsignedByte(1223736691);
	    int[] is = new int[2];
	    is[0] = i_6_ & 0xf;
	    is[1] = i_6_ >> 4 & 0xf;
	    for (int i_7_ = 0; i_7_ < 2; i_7_++) {
		if (is[i_7_] != 15)
		    class2.aShortArray21[is[i_7_]]
			= (short) class525_sub38.readUnsignedShort((byte) 25);
	    }
	}
	return class2;
    }
    
    static Class2 method519(Class8 class8, RSBuffer class525_sub38,
			    int i) {
	Class2 class2 = new Class2(class8);
	int i_8_ = class525_sub38.readUnsignedByte(43571187);
	boolean bool = (i_8_ & 0x1) != 0;
	boolean bool_9_ = (i_8_ & 0x2) != 0;
	boolean bool_10_ = 0 != (i_8_ & 0x4);
	boolean bool_11_ = (i_8_ & 0x8) != 0;
	if (bool) {
	    if (i <= 1) {
		class2.anIntArray22[0] = class525_sub38.readUnsignedShort((byte) 21);
		class2.anIntArray16[0] = class525_sub38.readUnsignedShort((byte) 58);
	    } else {
		class2.anIntArray22[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray16[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-1 != class8.anInt91 * -1343555447
		|| -1 != 49799703 * class8.anInt94) {
		if (i <= 1) {
		    class2.anIntArray22[1]
			= class525_sub38.readUnsignedShort((byte) 52);
		    class2.anIntArray16[1]
			= class525_sub38.readUnsignedShort((byte) 115);
		} else {
		    class2.anIntArray22[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	    if (-1 != class8.anInt82 * 74846191
		|| class8.anInt62 * -2096722129 != -1) {
		if (i <= 1) {
		    class2.anIntArray22[2]
			= class525_sub38.readUnsignedShort((byte) 127);
		    class2.anIntArray16[2]
			= class525_sub38.readUnsignedShort((byte) 35);
		} else {
		    class2.anIntArray22[2]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[2]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_9_) {
	    if (i <= 1) {
		class2.anIntArray15[0] = class525_sub38.readUnsignedShort((byte) 55);
		class2.anIntArray23[0] = class525_sub38.readUnsignedShort((byte) 81);
	    } else {
		class2.anIntArray15[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray23[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-252626025 * class8.anInt104 != -1
		|| -1 != class8.anInt106 * -769283651) {
		if (i <= 1) {
		    class2.anIntArray15[1]
			= class525_sub38.readUnsignedShort((byte) 6);
		    class2.anIntArray23[1]
			= class525_sub38.readUnsignedShort((byte) 105);
		} else {
		    class2.anIntArray15[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray23[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_10_) {
	    int i_12_ = class525_sub38.readUnsignedShort((byte) 49);
	    int[] is = new int[4];
	    is[0] = i_12_ & 0xf;
	    is[1] = i_12_ >> 4 & 0xf;
	    is[2] = i_12_ >> 8 & 0xf;
	    is[3] = i_12_ >> 12 & 0xf;
	    for (int i_13_ = 0; i_13_ < 4; i_13_++) {
		if (is[i_13_] != 15)
		    class2.aShortArray24[is[i_13_]]
			= (short) class525_sub38.readUnsignedShort((byte) 25);
	    }
	}
	if (bool_11_) {
	    int i_14_ = class525_sub38.readUnsignedByte(2136793089);
	    int[] is = new int[2];
	    is[0] = i_14_ & 0xf;
	    is[1] = i_14_ >> 4 & 0xf;
	    for (int i_15_ = 0; i_15_ < 2; i_15_++) {
		if (is[i_15_] != 15)
		    class2.aShortArray21[is[i_15_]]
			= (short) class525_sub38.readUnsignedShort((byte) 29);
	    }
	}
	return class2;
    }
    
    public static Class2 method520(Class8 class8,
				   RSBuffer class525_sub38) {
	return Class175_Sub2.method15603(class8, class525_sub38, 2,
					 -321068187);
    }
    
    public static Class2 method521(Class8 class8,
				   RSBuffer class525_sub38) {
	return Class175_Sub2.method15603(class8, class525_sub38, 2,
					 -1089991281);
    }
    
    static Class2 method522(Class8 class8, RSBuffer class525_sub38,
			    int i) {
	Class2 class2 = new Class2(class8);
	int i_16_ = class525_sub38.readUnsignedByte(810268239);
	boolean bool = (i_16_ & 0x1) != 0;
	boolean bool_17_ = (i_16_ & 0x2) != 0;
	boolean bool_18_ = 0 != (i_16_ & 0x4);
	boolean bool_19_ = (i_16_ & 0x8) != 0;
	if (bool) {
	    if (i <= 1) {
		class2.anIntArray22[0]
		    = class525_sub38.readUnsignedShort((byte) 112);
		class2.anIntArray16[0] = class525_sub38.readUnsignedShort((byte) 7);
	    } else {
		class2.anIntArray22[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray16[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-1 != class8.anInt91 * -1343555447
		|| -1 != 49799703 * class8.anInt94) {
		if (i <= 1) {
		    class2.anIntArray22[1]
			= class525_sub38.readUnsignedShort((byte) 111);
		    class2.anIntArray16[1]
			= class525_sub38.readUnsignedShort((byte) 74);
		} else {
		    class2.anIntArray22[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	    if (-1 != class8.anInt82 * 74846191
		|| class8.anInt62 * -2096722129 != -1) {
		if (i <= 1) {
		    class2.anIntArray22[2]
			= class525_sub38.readUnsignedShort((byte) 40);
		    class2.anIntArray16[2]
			= class525_sub38.readUnsignedShort((byte) 118);
		} else {
		    class2.anIntArray22[2]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[2]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_17_) {
	    if (i <= 1) {
		class2.anIntArray15[0] = class525_sub38.readUnsignedShort((byte) 57);
		class2.anIntArray23[0] = class525_sub38.readUnsignedShort((byte) 19);
	    } else {
		class2.anIntArray15[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray23[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-252626025 * class8.anInt104 != -1
		|| -1 != class8.anInt106 * -769283651) {
		if (i <= 1) {
		    class2.anIntArray15[1]
			= class525_sub38.readUnsignedShort((byte) 111);
		    class2.anIntArray23[1]
			= class525_sub38.readUnsignedShort((byte) 21);
		} else {
		    class2.anIntArray15[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray23[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_18_) {
	    int i_20_ = class525_sub38.readUnsignedShort((byte) 94);
	    int[] is = new int[4];
	    is[0] = i_20_ & 0xf;
	    is[1] = i_20_ >> 4 & 0xf;
	    is[2] = i_20_ >> 8 & 0xf;
	    is[3] = i_20_ >> 12 & 0xf;
	    for (int i_21_ = 0; i_21_ < 4; i_21_++) {
		if (is[i_21_] != 15)
		    class2.aShortArray24[is[i_21_]]
			= (short) class525_sub38.readUnsignedShort((byte) 107);
	    }
	}
	if (bool_19_) {
	    int i_22_ = class525_sub38.readUnsignedByte(592537106);
	    int[] is = new int[2];
	    is[0] = i_22_ & 0xf;
	    is[1] = i_22_ >> 4 & 0xf;
	    for (int i_23_ = 0; i_23_ < 2; i_23_++) {
		if (is[i_23_] != 15)
		    class2.aShortArray21[is[i_23_]]
			= (short) class525_sub38.readUnsignedShort((byte) 108);
	    }
	}
	return class2;
    }
    
    public static Class2 method523(Class8 class8,
				   RSBuffer class525_sub38) {
	return Class175_Sub2.method15603(class8, class525_sub38, 2, 739178048);
    }
    
    static Class2 method524(Class8 class8, RSBuffer class525_sub38,
			    int i) {
	Class2 class2 = new Class2(class8);
	int i_24_ = class525_sub38.readUnsignedByte(263897670);
	boolean bool = (i_24_ & 0x1) != 0;
	boolean bool_25_ = (i_24_ & 0x2) != 0;
	boolean bool_26_ = 0 != (i_24_ & 0x4);
	boolean bool_27_ = (i_24_ & 0x8) != 0;
	if (bool) {
	    if (i <= 1) {
		class2.anIntArray22[0] = class525_sub38.readUnsignedShort((byte) 66);
		class2.anIntArray16[0] = class525_sub38.readUnsignedShort((byte) 13);
	    } else {
		class2.anIntArray22[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray16[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-1 != class8.anInt91 * -1343555447
		|| -1 != 49799703 * class8.anInt94) {
		if (i <= 1) {
		    class2.anIntArray22[1]
			= class525_sub38.readUnsignedShort((byte) 50);
		    class2.anIntArray16[1]
			= class525_sub38.readUnsignedShort((byte) 64);
		} else {
		    class2.anIntArray22[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	    if (-1 != class8.anInt82 * 74846191
		|| class8.anInt62 * -2096722129 != -1) {
		if (i <= 1) {
		    class2.anIntArray22[2]
			= class525_sub38.readUnsignedShort((byte) 4);
		    class2.anIntArray16[2]
			= class525_sub38.readUnsignedShort((byte) 76);
		} else {
		    class2.anIntArray22[2]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[2]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_25_) {
	    if (i <= 1) {
		class2.anIntArray15[0] = class525_sub38.readUnsignedShort((byte) 30);
		class2.anIntArray23[0]
		    = class525_sub38.readUnsignedShort((byte) 107);
	    } else {
		class2.anIntArray15[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray23[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-252626025 * class8.anInt104 != -1
		|| -1 != class8.anInt106 * -769283651) {
		if (i <= 1) {
		    class2.anIntArray15[1]
			= class525_sub38.readUnsignedShort((byte) 81);
		    class2.anIntArray23[1]
			= class525_sub38.readUnsignedShort((byte) 18);
		} else {
		    class2.anIntArray15[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray23[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_26_) {
	    int i_28_ = class525_sub38.readUnsignedShort((byte) 32);
	    int[] is = new int[4];
	    is[0] = i_28_ & 0xf;
	    is[1] = i_28_ >> 4 & 0xf;
	    is[2] = i_28_ >> 8 & 0xf;
	    is[3] = i_28_ >> 12 & 0xf;
	    for (int i_29_ = 0; i_29_ < 4; i_29_++) {
		if (is[i_29_] != 15)
		    class2.aShortArray24[is[i_29_]]
			= (short) class525_sub38.readUnsignedShort((byte) 97);
	    }
	}
	if (bool_27_) {
	    int i_30_ = class525_sub38.readUnsignedByte(1566038348);
	    int[] is = new int[2];
	    is[0] = i_30_ & 0xf;
	    is[1] = i_30_ >> 4 & 0xf;
	    for (int i_31_ = 0; i_31_ < 2; i_31_++) {
		if (is[i_31_] != 15)
		    class2.aShortArray21[is[i_31_]]
			= (short) class525_sub38.readUnsignedShort((byte) 1);
	    }
	}
	return class2;
    }
    
    static Class2 method525(Class8 class8, RSBuffer class525_sub38,
			    int i) {
	Class2 class2 = new Class2(class8);
	int i_32_ = class525_sub38.readUnsignedByte(887816158);
	boolean bool = (i_32_ & 0x1) != 0;
	boolean bool_33_ = (i_32_ & 0x2) != 0;
	boolean bool_34_ = 0 != (i_32_ & 0x4);
	boolean bool_35_ = (i_32_ & 0x8) != 0;
	if (bool) {
	    if (i <= 1) {
		class2.anIntArray22[0] = class525_sub38.readUnsignedShort((byte) 8);
		class2.anIntArray16[0]
		    = class525_sub38.readUnsignedShort((byte) 126);
	    } else {
		class2.anIntArray22[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray16[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-1 != class8.anInt91 * -1343555447
		|| -1 != 49799703 * class8.anInt94) {
		if (i <= 1) {
		    class2.anIntArray22[1]
			= class525_sub38.readUnsignedShort((byte) 124);
		    class2.anIntArray16[1]
			= class525_sub38.readUnsignedShort((byte) 24);
		} else {
		    class2.anIntArray22[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	    if (-1 != class8.anInt82 * 74846191
		|| class8.anInt62 * -2096722129 != -1) {
		if (i <= 1) {
		    class2.anIntArray22[2]
			= class525_sub38.readUnsignedShort((byte) 7);
		    class2.anIntArray16[2]
			= class525_sub38.readUnsignedShort((byte) 26);
		} else {
		    class2.anIntArray22[2]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray16[2]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_33_) {
	    if (i <= 1) {
		class2.anIntArray15[0]
		    = class525_sub38.readUnsignedShort((byte) 103);
		class2.anIntArray23[0] = class525_sub38.readUnsignedShort((byte) 61);
	    } else {
		class2.anIntArray15[0]
		    = class525_sub38.readBigSmart(-2043778683);
		class2.anIntArray23[0]
		    = class525_sub38.readBigSmart(-2043778683);
	    }
	    if (-252626025 * class8.anInt104 != -1
		|| -1 != class8.anInt106 * -769283651) {
		if (i <= 1) {
		    class2.anIntArray15[1]
			= class525_sub38.readUnsignedShort((byte) 19);
		    class2.anIntArray23[1]
			= class525_sub38.readUnsignedShort((byte) 71);
		} else {
		    class2.anIntArray15[1]
			= class525_sub38.readBigSmart(-2043778683);
		    class2.anIntArray23[1]
			= class525_sub38.readBigSmart(-2043778683);
		}
	    }
	}
	if (bool_34_) {
	    int i_36_ = class525_sub38.readUnsignedShort((byte) 63);
	    int[] is = new int[4];
	    is[0] = i_36_ & 0xf;
	    is[1] = i_36_ >> 4 & 0xf;
	    is[2] = i_36_ >> 8 & 0xf;
	    is[3] = i_36_ >> 12 & 0xf;
	    for (int i_37_ = 0; i_37_ < 4; i_37_++) {
		if (is[i_37_] != 15)
		    class2.aShortArray24[is[i_37_]]
			= (short) class525_sub38.readUnsignedShort((byte) 66);
	    }
	}
	if (bool_35_) {
	    int i_38_ = class525_sub38.readUnsignedByte(67050825);
	    int[] is = new int[2];
	    is[0] = i_38_ & 0xf;
	    is[1] = i_38_ >> 4 & 0xf;
	    for (int i_39_ = 0; i_39_ < 2; i_39_++) {
		if (is[i_39_] != 15)
		    class2.aShortArray21[is[i_39_]]
			= (short) class525_sub38.readUnsignedShort((byte) 118);
	    }
	}
	return class2;
    }
    
    public static int method526(Random random, int i, int i_40_) {
	if (null == random) {
	    random = Class93.aRandom909;
	    if (random == null) {
		synchronized (Class93.anObject908) {
		    if (Class93.aRandom909 == null)
			Class93.aRandom909 = new Random();
		    random = Class93.aRandom909;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class72.method1537(i, (byte) 0))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_41_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_42_;
	do
	    i_42_ = random.nextInt();
	while (i_42_ >= i_41_);
	return Class672.method11057(i_42_, i, 2042353271);
    }
    
    static final void method527(Class683 class683, byte i) {
	Class453_Sub3.aClass309_Sub1_10316.method5528((byte) -48);
    }
    
    static void method528(int i) {
	Class447.aClass709_4900 = null;
	Class556_Sub1.anInt10625 = 0;
	Class556_Sub1.anInt7517 = 0;
	Class562.aClass259_7558 = null;
	Class556_Sub1.method9247();
	Class556_Sub1.aClass709_7473.method14344(-1245140012);
	Class556_Sub1.aClass529_7509 = null;
	Class556_Sub1.aClass200_7486.method3791((byte) 4);
	Class556_Sub1.aClass200_7508.method3791((byte) -46);
	Class604.aClass157_7958 = null;
	Class556_Sub1.anInt10626 = -106402817;
	Class556_Sub1.anInt10627 = 107721765;
	if (Class556_Sub1.aClass40_Sub2_7464 != null) {
	    Class556_Sub1.aClass40_Sub2_7464.method1019(164627823);
	    Class556_Sub1.aClass40_Sub2_7464.method17397(128, 64, -615092481);
	}
	if (null != Class556_Sub1.aClass40_Sub17_7465)
	    Class556_Sub1.aClass40_Sub17_7465.method17487(64, 64, 1318543851);
	if (Class556_Sub1.aClass40_Sub11_7463 != null)
	    Class556_Sub1.aClass40_Sub11_7463.method1018(256, (byte) -24);
	Class575.aClass40_Sub10_7647.method1018(64, (byte) -32);
    }
}
