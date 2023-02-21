/* Class525_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class525_Sub12 extends Class525
{
    public int anInt10512;
    int anInt10513;
    public int anInt10514;
    boolean aBool10515 = true;
    int anInt10516;
    int anInt10517;
    int anInt10518;
    public int anInt10519;
    public int anInt10520;
    int anInt10521;
    Class604 aClass604_10522;
    static long aLong10523;
    boolean aBool10524 = false;
    public static Class709 aClass709_10525 = new Class709();
    public static Class709 aClass709_10526 = new Class709();
    int anInt10527;
    
    static final void method16231(Class525_Sub12 class525_sub12,
				  boolean bool) {
	if (class525_sub12.aBool10524) {
	    if (1293980647 * class525_sub12.anInt10516 < 0
		|| Class198.method3767(client.aClass507_11137
					   .method8362((byte) -1),
				       1293980647 * class525_sub12.anInt10516,
				       -759310977 * class525_sub12.anInt10518,
				       (byte) 2)) {
		if (!bool)
		    Class442.method7125
			(1334650435 * class525_sub12.anInt10527,
			 class525_sub12.anInt10513 * -833422411,
			 class525_sub12.anInt10514 * -1168021715,
			 class525_sub12.anInt10512 * -1370300329,
			 class525_sub12.anInt10516 * 1293980647,
			 -1902379651 * class525_sub12.anInt10517,
			 -759310977 * class525_sub12.anInt10518, -1, 0,
			 1164167591);
		else
		    Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				       -833422411 * class525_sub12.anInt10513,
				       -1168021715 * class525_sub12.anInt10514,
				       class525_sub12.anInt10512 * -1370300329,
				       null, (byte) -5);
		class525_sub12.method8755(-1933461091);
	    }
	} else if (class525_sub12.aBool10515
		   && -1168021715 * class525_sub12.anInt10514 >= 1
		   && class525_sub12.anInt10512 * -1370300329 >= 1
		   && (-1168021715 * class525_sub12.anInt10514
		       <= client.aClass507_11137.method8412(1748076879) - 2)
		   && (-1370300329 * class525_sub12.anInt10512
		       <= client.aClass507_11137.method8352((byte) -101) - 2)
		   && (class525_sub12.anInt10519 * -1427028605 < 0
		       || Class198.method3767(client.aClass507_11137
						  .method8362((byte) -1),
					      (-1427028605
					       * class525_sub12.anInt10519),
					      (class525_sub12.anInt10521
					       * -582357193),
					      (byte) 2))) {
	    if (!bool)
		Class442.method7125(1334650435 * class525_sub12.anInt10527,
				    class525_sub12.anInt10513 * -833422411,
				    class525_sub12.anInt10514 * -1168021715,
				    -1370300329 * class525_sub12.anInt10512,
				    class525_sub12.anInt10519 * -1427028605,
				    class525_sub12.anInt10520 * 471577503,
				    -582357193 * class525_sub12.anInt10521, -1,
				    0, 1164167591);
	    else
		Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				   -833422411 * class525_sub12.anInt10513,
				   class525_sub12.anInt10514 * -1168021715,
				   -1370300329 * class525_sub12.anInt10512,
				   class525_sub12.aClass604_10522, (byte) 32);
	    class525_sub12.aBool10515 = false;
	    if (!bool
		&& (class525_sub12.anInt10519 * -1427028605
		    == class525_sub12.anInt10516 * 1293980647)
		&& class525_sub12.anInt10516 * 1293980647 == -1)
		class525_sub12.method8755(-1933461091);
	    else if (!bool
		     && (class525_sub12.anInt10519 * -1427028605
			 == class525_sub12.anInt10516 * 1293980647)
		     && (class525_sub12.anInt10517 * -1902379651
			 == 471577503 * class525_sub12.anInt10520)
		     && (class525_sub12.anInt10518 * -759310977
			 == -582357193 * class525_sub12.anInt10521))
		class525_sub12.method8755(-1933461091);
	}
    }
    
    static {
	aLong10523 = -2216155640095277509L;
    }
    
    public static void method16232(int i, int i_0_, int i_1_, int i_2_,
				   int i_3_, int i_4_, int i_5_) {
	Class525_Sub12 class525_sub12 = null;
	for (Class525_Sub12 class525_sub12_6_
		 = (Class525_Sub12) aClass709_10525.method14372((short) -3349);
	     null != class525_sub12_6_;
	     class525_sub12_6_
		 = (Class525_Sub12) aClass709_10525.method14353(-1116964367)) {
	    if (i == class525_sub12_6_.anInt10527 * 1334650435
		&& class525_sub12_6_.anInt10514 * -1168021715 == i_0_
		&& -1370300329 * class525_sub12_6_.anInt10512 == i_1_
		&& i_2_ == class525_sub12_6_.anInt10513 * -833422411) {
		class525_sub12 = class525_sub12_6_;
		break;
	    }
	}
	if (null == class525_sub12) {
	    class525_sub12 = new Class525_Sub12();
	    class525_sub12.anInt10527 = i * 1175967339;
	    class525_sub12.anInt10513 = 1323719325 * i_2_;
	    class525_sub12.anInt10514 = 527073445 * i_0_;
	    class525_sub12.anInt10512 = i_1_ * 681315175;
	    if (i_0_ >= 0 && i_1_ >= 0
		&& i_0_ < client.aClass507_11137.method8412(294134663)
		&& i_1_ < client.aClass507_11137.method8352((byte) -18))
		Class425.method6776(class525_sub12, 1432627589);
	    aClass709_10525.method14345(class525_sub12, (byte) 0);
	}
	class525_sub12.anInt10519 = i_3_ * 126087467;
	class525_sub12.anInt10521 = i_4_ * 2029844103;
	class525_sub12.anInt10520 = i_5_ * -852973473;
	class525_sub12.aBool10515 = true;
	class525_sub12.aBool10524 = false;
    }
    
    static void method16233(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			    int i_11_, Class604 class604) {
	Class525_Sub12 class525_sub12 = null;
	for (Class525_Sub12 class525_sub12_12_
		 = ((Class525_Sub12)
		    aClass709_10526.method14372((short) -19887));
	     class525_sub12_12_ != null;
	     class525_sub12_12_
		 = (Class525_Sub12) aClass709_10526.method14353(-1632342714)) {
	    if (class525_sub12_12_.anInt10527 * 1334650435 == i
		&& i_7_ == -1168021715 * class525_sub12_12_.anInt10514
		&& i_8_ == class525_sub12_12_.anInt10512 * -1370300329
		&& i_9_ == class525_sub12_12_.anInt10513 * -833422411) {
		class525_sub12 = class525_sub12_12_;
		break;
	    }
	}
	if (class525_sub12 == null) {
	    class525_sub12 = new Class525_Sub12();
	    class525_sub12.anInt10527 = 1175967339 * i;
	    class525_sub12.anInt10513 = i_9_ * 1323719325;
	    class525_sub12.anInt10514 = 527073445 * i_7_;
	    class525_sub12.anInt10512 = i_8_ * 681315175;
	    aClass709_10526.method14345(class525_sub12, (byte) 0);
	}
	class525_sub12.anInt10519 = 126087467 * i_10_;
	class525_sub12.anInt10521 = 2029844103 * i_11_;
	class525_sub12.aClass604_10522 = class604;
	class525_sub12.aBool10515 = true;
	class525_sub12.aBool10524 = false;
    }
    
    static void method16234(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			    int i_17_, Class604 class604) {
	Class525_Sub12 class525_sub12 = null;
	for (Class525_Sub12 class525_sub12_18_
		 = (Class525_Sub12) aClass709_10526.method14372((short) -2170);
	     class525_sub12_18_ != null;
	     class525_sub12_18_
		 = (Class525_Sub12) aClass709_10526.method14353(-1418440029)) {
	    if (class525_sub12_18_.anInt10527 * 1334650435 == i
		&& i_13_ == -1168021715 * class525_sub12_18_.anInt10514
		&& i_14_ == class525_sub12_18_.anInt10512 * -1370300329
		&& i_15_ == class525_sub12_18_.anInt10513 * -833422411) {
		class525_sub12 = class525_sub12_18_;
		break;
	    }
	}
	if (class525_sub12 == null) {
	    class525_sub12 = new Class525_Sub12();
	    class525_sub12.anInt10527 = 1175967339 * i;
	    class525_sub12.anInt10513 = i_15_ * 1323719325;
	    class525_sub12.anInt10514 = 527073445 * i_13_;
	    class525_sub12.anInt10512 = i_14_ * 681315175;
	    aClass709_10526.method14345(class525_sub12, (byte) 0);
	}
	class525_sub12.anInt10519 = 126087467 * i_16_;
	class525_sub12.anInt10521 = 2029844103 * i_17_;
	class525_sub12.aClass604_10522 = class604;
	class525_sub12.aBool10515 = true;
	class525_sub12.aBool10524 = false;
    }
    
    static final void method16235() {
	for (Class525_Sub12 class525_sub12
		 = ((Class525_Sub12)
		    aClass709_10525.method14372((short) -31735));
	     class525_sub12 != null;
	     class525_sub12
		 = (Class525_Sub12) aClass709_10525.method14353(-2043545319))
	    Class699.method14237(class525_sub12, false, -695314597);
	for (Class525_Sub12 class525_sub12
		 = (Class525_Sub12) aClass709_10526.method14372((short) -1048);
	     class525_sub12 != null;
	     class525_sub12
		 = (Class525_Sub12) aClass709_10526.method14353(-1891987494))
	    Class699.method14237(class525_sub12, true, 1557556840);
    }
    
    static void method16236(int i, int i_19_, int i_20_, int i_21_, int i_22_,
			    int i_23_, Class604 class604) {
	Class525_Sub12 class525_sub12 = null;
	for (Class525_Sub12 class525_sub12_24_
		 = ((Class525_Sub12)
		    aClass709_10526.method14372((short) -30014));
	     class525_sub12_24_ != null;
	     class525_sub12_24_
		 = (Class525_Sub12) aClass709_10526.method14353(-1237427042)) {
	    if (class525_sub12_24_.anInt10527 * 1334650435 == i
		&& i_19_ == -1168021715 * class525_sub12_24_.anInt10514
		&& i_20_ == class525_sub12_24_.anInt10512 * -1370300329
		&& i_21_ == class525_sub12_24_.anInt10513 * -833422411) {
		class525_sub12 = class525_sub12_24_;
		break;
	    }
	}
	if (class525_sub12 == null) {
	    class525_sub12 = new Class525_Sub12();
	    class525_sub12.anInt10527 = 1175967339 * i;
	    class525_sub12.anInt10513 = i_21_ * 1323719325;
	    class525_sub12.anInt10514 = 527073445 * i_19_;
	    class525_sub12.anInt10512 = i_20_ * 681315175;
	    aClass709_10526.method14345(class525_sub12, (byte) 0);
	}
	class525_sub12.anInt10519 = 126087467 * i_22_;
	class525_sub12.anInt10521 = 2029844103 * i_23_;
	class525_sub12.aClass604_10522 = class604;
	class525_sub12.aBool10515 = true;
	class525_sub12.aBool10524 = false;
    }
    
    public static final void method16237() {
	for (Class525_Sub12 class525_sub12
		 = ((Class525_Sub12)
		    aClass709_10525.method14372((short) -19920));
	     class525_sub12 != null;
	     class525_sub12
		 = (Class525_Sub12) aClass709_10525.method14353(-1541233810)) {
	    if (!class525_sub12.aBool10524) {
		class525_sub12.aBool10515 = true;
		if (-1168021715 * class525_sub12.anInt10514 >= 0
		    && class525_sub12.anInt10512 * -1370300329 >= 0
		    && (-1168021715 * class525_sub12.anInt10514
			< client.aClass507_11137.method8412(1681032440))
		    && (-1370300329 * class525_sub12.anInt10512
			< client.aClass507_11137.method8352((byte) -77)))
		    Class425.method6776(class525_sub12, 1069278829);
	    } else
		class525_sub12.method8755(-1933461091);
	}
	for (Class525_Sub12 class525_sub12
		 = ((Class525_Sub12)
		    aClass709_10526.method14372((short) -19927));
	     class525_sub12 != null;
	     class525_sub12
		 = (Class525_Sub12) aClass709_10526.method14353(-1130178043)) {
	    if (!class525_sub12.aBool10524)
		class525_sub12.aBool10515 = true;
	    else
		class525_sub12.method8755(-1933461091);
	}
    }
    
    public static final void method16238() {
	for (Class525_Sub12 class525_sub12
		 = (Class525_Sub12) aClass709_10525.method14372((short) -4543);
	     class525_sub12 != null;
	     class525_sub12
		 = (Class525_Sub12) aClass709_10525.method14353(-1312719873)) {
	    if (!class525_sub12.aBool10524) {
		class525_sub12.aBool10515 = true;
		if (-1168021715 * class525_sub12.anInt10514 >= 0
		    && class525_sub12.anInt10512 * -1370300329 >= 0
		    && (-1168021715 * class525_sub12.anInt10514
			< client.aClass507_11137.method8412(1732789106))
		    && (-1370300329 * class525_sub12.anInt10512
			< client.aClass507_11137.method8352((byte) -30)))
		    Class425.method6776(class525_sub12, 2004854683);
	    } else
		class525_sub12.method8755(-1933461091);
	}
	for (Class525_Sub12 class525_sub12
		 = (Class525_Sub12) aClass709_10526.method14372((short) -4649);
	     class525_sub12 != null;
	     class525_sub12
		 = (Class525_Sub12) aClass709_10526.method14353(-1828203514)) {
	    if (!class525_sub12.aBool10524)
		class525_sub12.aBool10515 = true;
	    else
		class525_sub12.method8755(-1933461091);
	}
    }
    
    static final void method16239(Class525_Sub12 class525_sub12) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 31);
	if (class546 != null) {
	    Interface62 interface62 = null;
	    if (0 == class525_sub12.anInt10513 * -833422411)
		interface62
		    = (Interface62) (class546.method8968
				     (class525_sub12.anInt10527 * 1334650435,
				      class525_sub12.anInt10514 * -1168021715,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) -41));
	    if (-833422411 * class525_sub12.anInt10513 == 1)
		interface62
		    = (Interface62) (class546.method8970
				     (class525_sub12.anInt10527 * 1334650435,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) 1));
	    if (-833422411 * class525_sub12.anInt10513 == 2)
		interface62
		    = (Interface62) (class546.method8972
				     (class525_sub12.anInt10527 * 1334650435,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      client.anInterface63_11091, 332483378));
	    if (3 == -833422411 * class525_sub12.anInt10513)
		interface62
		    = (Interface62) (class546.method8974
				     (1334650435 * class525_sub12.anInt10527,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) -2));
	    if (null != interface62) {
		class525_sub12.anInt10516
		    = interface62.method406((byte) 1) * -1944793129;
		class525_sub12.anInt10518
		    = interface62.method72(-1504213803) * -1982600577;
		class525_sub12.anInt10517
		    = interface62.method413(1675374167) * 874914773;
	    } else {
		class525_sub12.anInt10516 = 1944793129;
		class525_sub12.anInt10518 = 0;
		class525_sub12.anInt10517 = 0;
	    }
	}
    }
    
    static void method16240(int i, int i_25_, int i_26_, int i_27_, int i_28_,
			    int i_29_, Class604 class604) {
	Class525_Sub12 class525_sub12 = null;
	for (Class525_Sub12 class525_sub12_30_
		 = ((Class525_Sub12)
		    aClass709_10526.method14372((short) -13522));
	     class525_sub12_30_ != null;
	     class525_sub12_30_
		 = (Class525_Sub12) aClass709_10526.method14353(-1711493629)) {
	    if (class525_sub12_30_.anInt10527 * 1334650435 == i
		&& i_25_ == -1168021715 * class525_sub12_30_.anInt10514
		&& i_26_ == class525_sub12_30_.anInt10512 * -1370300329
		&& i_27_ == class525_sub12_30_.anInt10513 * -833422411) {
		class525_sub12 = class525_sub12_30_;
		break;
	    }
	}
	if (class525_sub12 == null) {
	    class525_sub12 = new Class525_Sub12();
	    class525_sub12.anInt10527 = 1175967339 * i;
	    class525_sub12.anInt10513 = i_27_ * 1323719325;
	    class525_sub12.anInt10514 = 527073445 * i_25_;
	    class525_sub12.anInt10512 = i_26_ * 681315175;
	    aClass709_10526.method14345(class525_sub12, (byte) 0);
	}
	class525_sub12.anInt10519 = 126087467 * i_28_;
	class525_sub12.anInt10521 = 2029844103 * i_29_;
	class525_sub12.aClass604_10522 = class604;
	class525_sub12.aBool10515 = true;
	class525_sub12.aBool10524 = false;
    }
    
    static final void method16241(int i, int i_31_, int i_32_, int i_33_,
				  Class604 class604) {
	if (i_32_ >= 1 && i_33_ >= 1
	    && i_32_ <= client.aClass507_11137.method8412(1626774851) - 2
	    && i_33_ <= client.aClass507_11137.method8352((byte) -56) - 2) {
	    if (client.aClass507_11137.method8358((byte) 45) != null) {
		Interface62 interface62
		    = client.aClass507_11137.method8359(398839993)
			  .method15976(i, i_31_, i_32_, i_33_, 620360054);
		if (null != interface62) {
		    if (interface62 instanceof Class656_Sub1_Sub3_Sub3)
			((Class656_Sub1_Sub3_Sub3) interface62)
			    .method18707(class604, (byte) 1);
		    else if (interface62 instanceof Class656_Sub1_Sub1_Sub2)
			((Class656_Sub1_Sub1_Sub2) interface62)
			    .method18720(class604, 1332334147);
		    else if (interface62 instanceof Class656_Sub1_Sub5_Sub1)
			((Class656_Sub1_Sub5_Sub1) interface62)
			    .method18723(class604, -902665898);
		    else if (interface62 instanceof Class656_Sub1_Sub4_Sub1)
			((Class656_Sub1_Sub4_Sub1) interface62)
			    .method18729(class604, -1507698026);
		}
	    }
	}
    }
    
    static final void method16242(Class525_Sub12 class525_sub12) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 52);
	if (class546 != null) {
	    Interface62 interface62 = null;
	    if (0 == class525_sub12.anInt10513 * -833422411)
		interface62
		    = (Interface62) (class546.method8968
				     (class525_sub12.anInt10527 * 1334650435,
				      class525_sub12.anInt10514 * -1168021715,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) -37));
	    if (-833422411 * class525_sub12.anInt10513 == 1)
		interface62
		    = (Interface62) (class546.method8970
				     (class525_sub12.anInt10527 * 1334650435,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) 1));
	    if (-833422411 * class525_sub12.anInt10513 == 2)
		interface62
		    = (Interface62) (class546.method8972
				     (class525_sub12.anInt10527 * 1334650435,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      client.anInterface63_11091, 332483378));
	    if (3 == -833422411 * class525_sub12.anInt10513)
		interface62
		    = (Interface62) (class546.method8974
				     (1334650435 * class525_sub12.anInt10527,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) -77));
	    if (null != interface62) {
		class525_sub12.anInt10516
		    = interface62.method406((byte) 1) * -1944793129;
		class525_sub12.anInt10518
		    = interface62.method72(-1535801515) * -1982600577;
		class525_sub12.anInt10517
		    = interface62.method413(1471187675) * 874914773;
	    } else {
		class525_sub12.anInt10516 = 1944793129;
		class525_sub12.anInt10518 = 0;
		class525_sub12.anInt10517 = 0;
	    }
	}
    }
    
    static final void method16243(Class525_Sub12 class525_sub12) {
	Class546 class546 = client.aClass507_11137.method8358((byte) 91);
	if (class546 != null) {
	    Interface62 interface62 = null;
	    if (0 == class525_sub12.anInt10513 * -833422411)
		interface62
		    = (Interface62) (class546.method8968
				     (class525_sub12.anInt10527 * 1334650435,
				      class525_sub12.anInt10514 * -1168021715,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) -81));
	    if (-833422411 * class525_sub12.anInt10513 == 1)
		interface62
		    = (Interface62) (class546.method8970
				     (class525_sub12.anInt10527 * 1334650435,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) 1));
	    if (-833422411 * class525_sub12.anInt10513 == 2)
		interface62
		    = (Interface62) (class546.method8972
				     (class525_sub12.anInt10527 * 1334650435,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      client.anInterface63_11091, 332483378));
	    if (3 == -833422411 * class525_sub12.anInt10513)
		interface62
		    = (Interface62) (class546.method8974
				     (1334650435 * class525_sub12.anInt10527,
				      -1168021715 * class525_sub12.anInt10514,
				      -1370300329 * class525_sub12.anInt10512,
				      (byte) -80));
	    if (null != interface62) {
		class525_sub12.anInt10516
		    = interface62.method406((byte) 1) * -1944793129;
		class525_sub12.anInt10518
		    = interface62.method72(-1805048231) * -1982600577;
		class525_sub12.anInt10517
		    = interface62.method413(1439323097) * 874914773;
	    } else {
		class525_sub12.anInt10516 = 1944793129;
		class525_sub12.anInt10518 = 0;
		class525_sub12.anInt10517 = 0;
	    }
	}
    }
    
    static final void method16244(Class525_Sub12 class525_sub12,
				  boolean bool) {
	if (class525_sub12.aBool10524) {
	    if (1293980647 * class525_sub12.anInt10516 < 0
		|| Class198.method3767(client.aClass507_11137
					   .method8362((byte) -1),
				       1293980647 * class525_sub12.anInt10516,
				       -759310977 * class525_sub12.anInt10518,
				       (byte) 2)) {
		if (!bool)
		    Class442.method7125
			(1334650435 * class525_sub12.anInt10527,
			 class525_sub12.anInt10513 * -833422411,
			 class525_sub12.anInt10514 * -1168021715,
			 class525_sub12.anInt10512 * -1370300329,
			 class525_sub12.anInt10516 * 1293980647,
			 -1902379651 * class525_sub12.anInt10517,
			 -759310977 * class525_sub12.anInt10518, -1, 0,
			 1164167591);
		else
		    Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				       -833422411 * class525_sub12.anInt10513,
				       -1168021715 * class525_sub12.anInt10514,
				       class525_sub12.anInt10512 * -1370300329,
				       null, (byte) 17);
		class525_sub12.method8755(-1933461091);
	    }
	} else if (class525_sub12.aBool10515
		   && -1168021715 * class525_sub12.anInt10514 >= 1
		   && class525_sub12.anInt10512 * -1370300329 >= 1
		   && (-1168021715 * class525_sub12.anInt10514
		       <= client.aClass507_11137.method8412(1290762479) - 2)
		   && (-1370300329 * class525_sub12.anInt10512
		       <= client.aClass507_11137.method8352((byte) -41) - 2)
		   && (class525_sub12.anInt10519 * -1427028605 < 0
		       || Class198.method3767(client.aClass507_11137
						  .method8362((byte) -1),
					      (-1427028605
					       * class525_sub12.anInt10519),
					      (class525_sub12.anInt10521
					       * -582357193),
					      (byte) 2))) {
	    if (!bool)
		Class442.method7125(1334650435 * class525_sub12.anInt10527,
				    class525_sub12.anInt10513 * -833422411,
				    class525_sub12.anInt10514 * -1168021715,
				    -1370300329 * class525_sub12.anInt10512,
				    class525_sub12.anInt10519 * -1427028605,
				    class525_sub12.anInt10520 * 471577503,
				    -582357193 * class525_sub12.anInt10521, -1,
				    0, 1164167591);
	    else
		Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				   -833422411 * class525_sub12.anInt10513,
				   class525_sub12.anInt10514 * -1168021715,
				   -1370300329 * class525_sub12.anInt10512,
				   class525_sub12.aClass604_10522, (byte) -2);
	    class525_sub12.aBool10515 = false;
	    if (!bool
		&& (class525_sub12.anInt10519 * -1427028605
		    == class525_sub12.anInt10516 * 1293980647)
		&& class525_sub12.anInt10516 * 1293980647 == -1)
		class525_sub12.method8755(-1933461091);
	    else if (!bool
		     && (class525_sub12.anInt10519 * -1427028605
			 == class525_sub12.anInt10516 * 1293980647)
		     && (class525_sub12.anInt10517 * -1902379651
			 == 471577503 * class525_sub12.anInt10520)
		     && (class525_sub12.anInt10518 * -759310977
			 == -582357193 * class525_sub12.anInt10521))
		class525_sub12.method8755(-1933461091);
	}
    }
    
    static final void method16245(Class525_Sub12 class525_sub12,
				  boolean bool) {
	if (class525_sub12.aBool10524) {
	    if (1293980647 * class525_sub12.anInt10516 < 0
		|| Class198.method3767(client.aClass507_11137
					   .method8362((byte) -1),
				       1293980647 * class525_sub12.anInt10516,
				       -759310977 * class525_sub12.anInt10518,
				       (byte) 2)) {
		if (!bool)
		    Class442.method7125
			(1334650435 * class525_sub12.anInt10527,
			 class525_sub12.anInt10513 * -833422411,
			 class525_sub12.anInt10514 * -1168021715,
			 class525_sub12.anInt10512 * -1370300329,
			 class525_sub12.anInt10516 * 1293980647,
			 -1902379651 * class525_sub12.anInt10517,
			 -759310977 * class525_sub12.anInt10518, -1, 0,
			 1164167591);
		else
		    Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				       -833422411 * class525_sub12.anInt10513,
				       -1168021715 * class525_sub12.anInt10514,
				       class525_sub12.anInt10512 * -1370300329,
				       null, (byte) 77);
		class525_sub12.method8755(-1933461091);
	    }
	} else if (class525_sub12.aBool10515
		   && -1168021715 * class525_sub12.anInt10514 >= 1
		   && class525_sub12.anInt10512 * -1370300329 >= 1
		   && (-1168021715 * class525_sub12.anInt10514
		       <= client.aClass507_11137.method8412(923846224) - 2)
		   && (-1370300329 * class525_sub12.anInt10512
		       <= client.aClass507_11137.method8352((byte) -43) - 2)
		   && (class525_sub12.anInt10519 * -1427028605 < 0
		       || Class198.method3767(client.aClass507_11137
						  .method8362((byte) -1),
					      (-1427028605
					       * class525_sub12.anInt10519),
					      (class525_sub12.anInt10521
					       * -582357193),
					      (byte) 2))) {
	    if (!bool)
		Class442.method7125(1334650435 * class525_sub12.anInt10527,
				    class525_sub12.anInt10513 * -833422411,
				    class525_sub12.anInt10514 * -1168021715,
				    -1370300329 * class525_sub12.anInt10512,
				    class525_sub12.anInt10519 * -1427028605,
				    class525_sub12.anInt10520 * 471577503,
				    -582357193 * class525_sub12.anInt10521, -1,
				    0, 1164167591);
	    else
		Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				   -833422411 * class525_sub12.anInt10513,
				   class525_sub12.anInt10514 * -1168021715,
				   -1370300329 * class525_sub12.anInt10512,
				   class525_sub12.aClass604_10522, (byte) -89);
	    class525_sub12.aBool10515 = false;
	    if (!bool
		&& (class525_sub12.anInt10519 * -1427028605
		    == class525_sub12.anInt10516 * 1293980647)
		&& class525_sub12.anInt10516 * 1293980647 == -1)
		class525_sub12.method8755(-1933461091);
	    else if (!bool
		     && (class525_sub12.anInt10519 * -1427028605
			 == class525_sub12.anInt10516 * 1293980647)
		     && (class525_sub12.anInt10517 * -1902379651
			 == 471577503 * class525_sub12.anInt10520)
		     && (class525_sub12.anInt10518 * -759310977
			 == -582357193 * class525_sub12.anInt10521))
		class525_sub12.method8755(-1933461091);
	}
    }
    
    static final void method16246(Class525_Sub12 class525_sub12,
				  boolean bool) {
	if (class525_sub12.aBool10524) {
	    if (1293980647 * class525_sub12.anInt10516 < 0
		|| Class198.method3767(client.aClass507_11137
					   .method8362((byte) -1),
				       1293980647 * class525_sub12.anInt10516,
				       -759310977 * class525_sub12.anInt10518,
				       (byte) 2)) {
		if (!bool)
		    Class442.method7125
			(1334650435 * class525_sub12.anInt10527,
			 class525_sub12.anInt10513 * -833422411,
			 class525_sub12.anInt10514 * -1168021715,
			 class525_sub12.anInt10512 * -1370300329,
			 class525_sub12.anInt10516 * 1293980647,
			 -1902379651 * class525_sub12.anInt10517,
			 -759310977 * class525_sub12.anInt10518, -1, 0,
			 1164167591);
		else
		    Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				       -833422411 * class525_sub12.anInt10513,
				       -1168021715 * class525_sub12.anInt10514,
				       class525_sub12.anInt10512 * -1370300329,
				       null, (byte) 38);
		class525_sub12.method8755(-1933461091);
	    }
	} else if (class525_sub12.aBool10515
		   && -1168021715 * class525_sub12.anInt10514 >= 1
		   && class525_sub12.anInt10512 * -1370300329 >= 1
		   && (-1168021715 * class525_sub12.anInt10514
		       <= client.aClass507_11137.method8412(393078152) - 2)
		   && (-1370300329 * class525_sub12.anInt10512
		       <= client.aClass507_11137.method8352((byte) -57) - 2)
		   && (class525_sub12.anInt10519 * -1427028605 < 0
		       || Class198.method3767(client.aClass507_11137
						  .method8362((byte) -1),
					      (-1427028605
					       * class525_sub12.anInt10519),
					      (class525_sub12.anInt10521
					       * -582357193),
					      (byte) 2))) {
	    if (!bool)
		Class442.method7125(1334650435 * class525_sub12.anInt10527,
				    class525_sub12.anInt10513 * -833422411,
				    class525_sub12.anInt10514 * -1168021715,
				    -1370300329 * class525_sub12.anInt10512,
				    class525_sub12.anInt10519 * -1427028605,
				    class525_sub12.anInt10520 * 471577503,
				    -582357193 * class525_sub12.anInt10521, -1,
				    0, 1164167591);
	    else
		Class50.method1131(class525_sub12.anInt10527 * 1334650435,
				   -833422411 * class525_sub12.anInt10513,
				   class525_sub12.anInt10514 * -1168021715,
				   -1370300329 * class525_sub12.anInt10512,
				   class525_sub12.aClass604_10522, (byte) 28);
	    class525_sub12.aBool10515 = false;
	    if (!bool
		&& (class525_sub12.anInt10519 * -1427028605
		    == class525_sub12.anInt10516 * 1293980647)
		&& class525_sub12.anInt10516 * 1293980647 == -1)
		class525_sub12.method8755(-1933461091);
	    else if (!bool
		     && (class525_sub12.anInt10519 * -1427028605
			 == class525_sub12.anInt10516 * 1293980647)
		     && (class525_sub12.anInt10517 * -1902379651
			 == 471577503 * class525_sub12.anInt10520)
		     && (class525_sub12.anInt10518 * -759310977
			 == -582357193 * class525_sub12.anInt10521))
		class525_sub12.method8755(-1933461091);
	}
    }
    
    static final void method16247(int i, int i_34_, int i_35_, int i_36_,
				  int i_37_, int i_38_, int i_39_, int i_40_,
				  int i_41_) {
	if (i_35_ >= 1 && i_36_ >= 1
	    && i_35_ <= client.aClass507_11137.method8412(1947062313) - 2
	    && i_36_ <= client.aClass507_11137.method8352((byte) -56) - 2) {
	    int i_42_ = i;
	    if (i_42_ < 3 && client.aClass507_11137.method8360(1858753130)
				 .method7774(i_35_, i_36_, 2023521014))
		i_42_++;
	    if (client.aClass507_11137.method8358((byte) 44) != null) {
		client.aClass507_11137.method8359(423240694).method15979
		    (Class501.aClass182_5564, i, i_34_, i_35_, i_36_,
		     710451719);
		if (i_37_ >= 0) {
		    int i_43_
			= Class198_Sub13.aClass525_Sub30_9973
			      .aClass696_Sub11_10688.method17067((short) 255);
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub11_10688),
			 1, (byte) -2);
		    client.aClass507_11137.method8359(-225980212).method15968
			(Class501.aClass182_5564, i_42_, i, i_35_, i_36_,
			 i_37_, i_38_, i_39_, i_40_, i_41_, 1043314366);
		    Class198_Sub13.aClass525_Sub30_9973.method16502
			((Class198_Sub13.aClass525_Sub30_9973
			  .aClass696_Sub11_10688),
			 i_43_, (byte) -35);
		}
		Class350_Sub2_Sub1.method18173
		    (Class581.aClass656_Sub1_Sub3_Sub1_Sub1_7705.aByte10867,
		     1336562624);
	    }
	}
    }
    
    static final void method16248(int i, int i_44_, int i_45_, int i_46_,
				  Class604 class604) {
	if (i_45_ >= 1 && i_46_ >= 1
	    && i_45_ <= client.aClass507_11137.method8412(390012724) - 2
	    && i_46_ <= client.aClass507_11137.method8352((byte) -70) - 2) {
	    if (client.aClass507_11137.method8358((byte) 51) != null) {
		Interface62 interface62
		    = client.aClass507_11137.method8359(-501689298)
			  .method15976(i, i_44_, i_45_, i_46_, -1691987964);
		if (null != interface62) {
		    if (interface62 instanceof Class656_Sub1_Sub3_Sub3)
			((Class656_Sub1_Sub3_Sub3) interface62)
			    .method18707(class604, (byte) 1);
		    else if (interface62 instanceof Class656_Sub1_Sub1_Sub2)
			((Class656_Sub1_Sub1_Sub2) interface62)
			    .method18720(class604, 1332334147);
		    else if (interface62 instanceof Class656_Sub1_Sub5_Sub1)
			((Class656_Sub1_Sub5_Sub1) interface62)
			    .method18723(class604, 1417715022);
		    else if (interface62 instanceof Class656_Sub1_Sub4_Sub1)
			((Class656_Sub1_Sub4_Sub1) interface62)
			    .method18729(class604, -2135987667);
		}
	    }
	}
    }
    
    Class525_Sub12() {
	/* empty */
    }
    
    static final void method16249(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub9_10691
		  .method17050(501271953) == 1 ? 1 : 0;
    }
}
