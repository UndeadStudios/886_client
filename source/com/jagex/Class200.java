/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class200
{
    Class697 aClass697_2195 = new Class697();
    int anInt2196;
    Class10 aClass10_2197;
    int anInt2198;
    Interface25 anInterface25_2199;
    
    public void method3782() {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -85));
	     class525_sub16_sub5 != null;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(210561711)) {
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
		anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
	    }
	}
    }
    
    public void method3783(Interface25 interface25, byte i) {
	anInterface25_2199 = interface25;
    }
    
    public Object method3784() {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method690((byte) 40);
	while (class525_sub16_sub5 != null) {
	    Object object = class525_sub16_sub5.method18257(-1889830463);
	    if (object == null) {
		Class525_Sub16_Sub5 class525_sub16_sub5_0_
		    = class525_sub16_sub5;
		class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				       aClass10_2197.method690((byte) -14));
		class525_sub16_sub5_0_.method8755(-1933461091);
		class525_sub16_sub5_0_.method16266(-1925745724);
		anInt2196 += -1235992217 * class525_sub16_sub5_0_.anInt11759;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3785(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	if (null == class525_sub16_sub5)
	    return null;
	Object object = class525_sub16_sub5.method18257(-1889830463);
	if (null == object) {
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	    anInt2196 += class525_sub16_sub5.anInt11759 * -1235992217;
	    return null;
	}
	if (class525_sub16_sub5.method18258(1751695143)) {
	    Class525_Sub16_Sub5_Sub2 class525_sub16_sub5_sub2
		= new Class525_Sub16_Sub5_Sub2(object,
					       (class525_sub16_sub5.anInt11759
						* 277941823));
	    aClass10_2197.method695(class525_sub16_sub5_sub2,
				    (-5126207504388691097L
				     * class525_sub16_sub5.aLong7113));
	    aClass697_2195.method14184(class525_sub16_sub5_sub2, 728171782);
	    class525_sub16_sub5_sub2.aLong10553 = 0L;
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	} else {
	    aClass697_2195.method14184(class525_sub16_sub5, 728171782);
	    class525_sub16_sub5.aLong10553 = 0L;
	}
	return object;
    }
    
    public void method3786(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	method3787(class525_sub16_sub5, -1670080993);
    }
    
    void method3787(Class525_Sub16_Sub5 class525_sub16_sub5, int i) {
	if (null != class525_sub16_sub5) {
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
	}
    }
    
    public void method3788(Object object, long l) {
	method3789(object, l, 1, (byte) -15);
    }
    
    public void method3789(Object object, long l, int i, byte i_1_) {
	if (i > anInt2198 * 794808389)
	    throw new IllegalStateException();
	method3786(l);
	anInt2196 -= 1433490137 * i;
	while (anInt2196 * 466619753 < 0) {
	    Class525_Sub16_Sub5 class525_sub16_sub5
		= ((Class525_Sub16_Sub5)
		   aClass697_2195.method14196(-1955536664));
	    if (class525_sub16_sub5 == null)
		throw new RuntimeException("");
	    if (class525_sub16_sub5.method18258(1882611891)) {
		/* empty */
	    }
	    method3787(class525_sub16_sub5, -1670080993);
	    if (anInterface25_2199 != null)
		anInterface25_2199.method142(class525_sub16_sub5
						 .method18257(-1889830463),
					     (byte) -66);
	}
	Class525_Sub16_Sub5_Sub2 class525_sub16_sub5_sub2
	    = new Class525_Sub16_Sub5_Sub2(object, i);
	aClass10_2197.method695(class525_sub16_sub5_sub2, l);
	aClass697_2195.method14184(class525_sub16_sub5_sub2, 728171782);
	class525_sub16_sub5_sub2.aLong10553 = 0L;
    }
    
    public int method3790() {
	return 794808389 * anInt2198;
    }
    
    public void method3791(byte i) {
	aClass697_2195.method14199(1837008355);
	aClass10_2197.method688((short) -9087);
	anInt2196 = anInt2198 * -1335712643;
    }
    
    public Object method3792(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	if (null == class525_sub16_sub5)
	    return null;
	Object object = class525_sub16_sub5.method18257(-1889830463);
	if (null == object) {
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	    anInt2196 += class525_sub16_sub5.anInt11759 * -1235992217;
	    return null;
	}
	if (class525_sub16_sub5.method18258(-170055413)) {
	    Class525_Sub16_Sub5_Sub2 class525_sub16_sub5_sub2
		= new Class525_Sub16_Sub5_Sub2(object,
					       (class525_sub16_sub5.anInt11759
						* 277941823));
	    aClass10_2197.method695(class525_sub16_sub5_sub2,
				    (-5126207504388691097L
				     * class525_sub16_sub5.aLong7113));
	    aClass697_2195.method14184(class525_sub16_sub5_sub2, 728171782);
	    class525_sub16_sub5_sub2.aLong10553 = 0L;
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	} else {
	    aClass697_2195.method14184(class525_sub16_sub5, 728171782);
	    class525_sub16_sub5.aLong10553 = 0L;
	}
	return object;
    }
    
    public int method3793(int i) {
	return anInt2196 * 466619753;
    }
    
    public int method3794(int i) {
	int i_2_ = 0;
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -42));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (!class525_sub16_sub5.method18258(1303532723))
		i_2_++;
	}
	return i_2_;
    }
    
    public void method3795(int i) {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -113));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(-53174314)) {
		if (class525_sub16_sub5.method18257(-1889830463) == null) {
		    class525_sub16_sub5.method8755(-1933461091);
		    class525_sub16_sub5.method16266(-1925745724);
		    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
		}
	    } else if ((class525_sub16_sub5.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub5_Sub1 class525_sub16_sub5_sub1
		    = (new Class525_Sub16_Sub5_Sub1
		       (class525_sub16_sub5.method18257(-1889830463),
			277941823 * class525_sub16_sub5.anInt11759));
		aClass10_2197.method695(class525_sub16_sub5_sub1,
					(-5126207504388691097L
					 * class525_sub16_sub5.aLong7113));
		Class6.method556(class525_sub16_sub5_sub1, class525_sub16_sub5,
				 -1743911037);
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
	    }
	}
    }
    
    public Object method3796(int i) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method689(1204706165);
	while (class525_sub16_sub5 != null) {
	    Object object = class525_sub16_sub5.method18257(-1889830463);
	    if (null == object) {
		Class525_Sub16_Sub5 class525_sub16_sub5_3_
		    = class525_sub16_sub5;
		class525_sub16_sub5
		    = (Class525_Sub16_Sub5) aClass10_2197.method690((byte) 29);
		class525_sub16_sub5_3_.method8755(-1933461091);
		class525_sub16_sub5_3_.method16266(-1925745724);
		anInt2196 += class525_sub16_sub5_3_.anInt11759 * -1235992217;
	    } else
		return object;
	}
	return null;
    }
    
    public Class200(int i) {
	this(i, i);
    }
    
    public int method3797() {
	int i = 0;
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -33));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (!class525_sub16_sub5.method18258(-164578524))
		i++;
	}
	return i;
    }
    
    public void method3798(Interface25 interface25) {
	anInterface25_2199 = interface25;
    }
    
    public int method3799() {
	int i = 0;
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -128));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (!class525_sub16_sub5.method18258(181233066))
		i++;
	}
	return i;
    }
    
    public void method3800(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	method3787(class525_sub16_sub5, -1670080993);
    }
    
    public void method3801(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	method3787(class525_sub16_sub5, -1670080993);
    }
    
    void method3802(Class525_Sub16_Sub5 class525_sub16_sub5) {
	if (null != class525_sub16_sub5) {
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
	}
    }
    
    public void method3803(Interface25 interface25) {
	anInterface25_2199 = interface25;
    }
    
    public void method3804(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	method3787(class525_sub16_sub5, -1670080993);
    }
    
    public Class200(int i, int i_4_) {
	anInt2198 = i * 1613677197;
	anInt2196 = 1433490137 * i;
	int i_5_;
	for (i_5_ = 1; i_5_ + i_5_ < i && i_5_ < i_4_; i_5_ += i_5_) {
	    /* empty */
	}
	aClass10_2197 = new Class10(i_5_);
    }
    
    public void method3805(int i, int i_6_) {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -59));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(-289407575)) {
		if (class525_sub16_sub5.method18257(-1889830463) == null) {
		    class525_sub16_sub5.method8755(-1933461091);
		    class525_sub16_sub5.method16266(-1925745724);
		    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
		}
	    } else if ((class525_sub16_sub5.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub5_Sub1 class525_sub16_sub5_sub1
		    = (new Class525_Sub16_Sub5_Sub1
		       (class525_sub16_sub5.method18257(-1889830463),
			277941823 * class525_sub16_sub5.anInt11759));
		aClass10_2197.method695(class525_sub16_sub5_sub1,
					(-5126207504388691097L
					 * class525_sub16_sub5.aLong7113));
		Class6.method556(class525_sub16_sub5_sub1, class525_sub16_sub5,
				 -1410742485);
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
	    }
	}
    }
    
    public void method3806(Object object, long l, int i) {
	if (i > anInt2198 * 794808389)
	    throw new IllegalStateException();
	method3786(l);
	anInt2196 -= 1433490137 * i;
	while (anInt2196 * 466619753 < 0) {
	    Class525_Sub16_Sub5 class525_sub16_sub5
		= (Class525_Sub16_Sub5) aClass697_2195.method14196(-533220988);
	    if (class525_sub16_sub5 == null)
		throw new RuntimeException("");
	    if (class525_sub16_sub5.method18258(630465548)) {
		/* empty */
	    }
	    method3787(class525_sub16_sub5, -1670080993);
	    if (anInterface25_2199 != null)
		anInterface25_2199.method142(class525_sub16_sub5
						 .method18257(-1889830463),
					     (byte) -10);
	}
	Class525_Sub16_Sub5_Sub2 class525_sub16_sub5_sub2
	    = new Class525_Sub16_Sub5_Sub2(object, i);
	aClass10_2197.method695(class525_sub16_sub5_sub2, l);
	aClass697_2195.method14184(class525_sub16_sub5_sub2, 728171782);
	class525_sub16_sub5_sub2.aLong10553 = 0L;
    }
    
    public void method3807(Object object, long l, int i) {
	if (i > anInt2198 * 794808389)
	    throw new IllegalStateException();
	method3786(l);
	anInt2196 -= 1433490137 * i;
	while (anInt2196 * 466619753 < 0) {
	    Class525_Sub16_Sub5 class525_sub16_sub5
		= ((Class525_Sub16_Sub5)
		   aClass697_2195.method14196(-1020149686));
	    if (class525_sub16_sub5 == null)
		throw new RuntimeException("");
	    if (class525_sub16_sub5.method18258(1099218009)) {
		/* empty */
	    }
	    method3787(class525_sub16_sub5, -1670080993);
	    if (anInterface25_2199 != null)
		anInterface25_2199.method142(class525_sub16_sub5
						 .method18257(-1889830463),
					     (byte) 14);
	}
	Class525_Sub16_Sub5_Sub2 class525_sub16_sub5_sub2
	    = new Class525_Sub16_Sub5_Sub2(object, i);
	aClass10_2197.method695(class525_sub16_sub5_sub2, l);
	aClass697_2195.method14184(class525_sub16_sub5_sub2, 728171782);
	class525_sub16_sub5_sub2.aLong10553 = 0L;
    }
    
    public void method3808(int i) {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -50));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(194613847)) {
		if (class525_sub16_sub5.method18257(-1889830463) == null) {
		    class525_sub16_sub5.method8755(-1933461091);
		    class525_sub16_sub5.method16266(-1925745724);
		    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
		}
	    } else if ((class525_sub16_sub5.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub5_Sub1 class525_sub16_sub5_sub1
		    = (new Class525_Sub16_Sub5_Sub1
		       (class525_sub16_sub5.method18257(-1889830463),
			277941823 * class525_sub16_sub5.anInt11759));
		aClass10_2197.method695(class525_sub16_sub5_sub1,
					(-5126207504388691097L
					 * class525_sub16_sub5.aLong7113));
		Class6.method556(class525_sub16_sub5_sub1, class525_sub16_sub5,
				 -1355617509);
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
	    }
	}
    }
    
    public void method3809(byte i) {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -77));
	     class525_sub16_sub5 != null;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(1383942345)) {
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
		anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
	    }
	}
    }
    
    public void method3810(int i) {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -36));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(1284292950)) {
		if (class525_sub16_sub5.method18257(-1889830463) == null) {
		    class525_sub16_sub5.method8755(-1933461091);
		    class525_sub16_sub5.method16266(-1925745724);
		    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
		}
	    } else if ((class525_sub16_sub5.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub5_Sub1 class525_sub16_sub5_sub1
		    = (new Class525_Sub16_Sub5_Sub1
		       (class525_sub16_sub5.method18257(-1889830463),
			277941823 * class525_sub16_sub5.anInt11759));
		aClass10_2197.method695(class525_sub16_sub5_sub1,
					(-5126207504388691097L
					 * class525_sub16_sub5.aLong7113));
		Class6.method556(class525_sub16_sub5_sub1, class525_sub16_sub5,
				 -1345988388);
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
	    }
	}
    }
    
    public void method3811(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	method3787(class525_sub16_sub5, -1670080993);
    }
    
    public void method3812() {
	aClass697_2195.method14199(-980331269);
	aClass10_2197.method688((short) -7757);
	anInt2196 = anInt2198 * -1335712643;
    }
    
    public void method3813() {
	aClass697_2195.method14199(-359744273);
	aClass10_2197.method688((short) -5481);
	anInt2196 = anInt2198 * -1335712643;
    }
    
    public int method3814() {
	return 794808389 * anInt2198;
    }
    
    public int method3815() {
	return 794808389 * anInt2198;
    }
    
    public void method3816(int i) {
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -11));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (class525_sub16_sub5.method18258(-314642191)) {
		if (class525_sub16_sub5.method18257(-1889830463) == null) {
		    class525_sub16_sub5.method8755(-1933461091);
		    class525_sub16_sub5.method16266(-1925745724);
		    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
		}
	    } else if ((class525_sub16_sub5.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub5_Sub1 class525_sub16_sub5_sub1
		    = (new Class525_Sub16_Sub5_Sub1
		       (class525_sub16_sub5.method18257(-1889830463),
			277941823 * class525_sub16_sub5.anInt11759));
		aClass10_2197.method695(class525_sub16_sub5_sub1,
					(-5126207504388691097L
					 * class525_sub16_sub5.aLong7113));
		Class6.method556(class525_sub16_sub5_sub1, class525_sub16_sub5,
				 -551019586);
		class525_sub16_sub5.method8755(-1933461091);
		class525_sub16_sub5.method16266(-1925745724);
	    }
	}
    }
    
    public int method3817() {
	return 794808389 * anInt2198;
    }
    
    public Object method3818(int i) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method690((byte) -61);
	while (class525_sub16_sub5 != null) {
	    Object object = class525_sub16_sub5.method18257(-1889830463);
	    if (object == null) {
		Class525_Sub16_Sub5 class525_sub16_sub5_7_
		    = class525_sub16_sub5;
		class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				       aClass10_2197.method690((byte) -118));
		class525_sub16_sub5_7_.method8755(-1933461091);
		class525_sub16_sub5_7_.method16266(-1925745724);
		anInt2196 += -1235992217 * class525_sub16_sub5_7_.anInt11759;
	    } else
		return object;
	}
	return null;
    }
    
    public void method3819(long l) {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method684(l);
	method3787(class525_sub16_sub5, -1670080993);
    }
    
    public int method3820() {
	int i = 0;
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = ((Class525_Sub16_Sub5)
		    aClass697_2195.method14186((byte) -109));
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (!class525_sub16_sub5.method18258(620531288))
		i++;
	}
	return i;
    }
    
    public int method3821() {
	int i = 0;
	for (Class525_Sub16_Sub5 class525_sub16_sub5
		 = (Class525_Sub16_Sub5) aClass697_2195.method14186((byte) -8);
	     null != class525_sub16_sub5;
	     class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				    aClass697_2195.method14201((byte) -1))) {
	    if (!class525_sub16_sub5.method18258(740934316))
		i++;
	}
	return i;
    }
    
    public int method3822() {
	return anInt2196 * 466619753;
    }
    
    public Object method3823() {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method689(425606037);
	while (class525_sub16_sub5 != null) {
	    Object object = class525_sub16_sub5.method18257(-1889830463);
	    if (null == object) {
		Class525_Sub16_Sub5 class525_sub16_sub5_8_
		    = class525_sub16_sub5;
		class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				       aClass10_2197.method690((byte) -24));
		class525_sub16_sub5_8_.method8755(-1933461091);
		class525_sub16_sub5_8_.method16266(-1925745724);
		anInt2196 += class525_sub16_sub5_8_.anInt11759 * -1235992217;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3824() {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method689(1050599662);
	while (class525_sub16_sub5 != null) {
	    Object object = class525_sub16_sub5.method18257(-1889830463);
	    if (null == object) {
		Class525_Sub16_Sub5 class525_sub16_sub5_9_
		    = class525_sub16_sub5;
		class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				       aClass10_2197.method690((byte) -76));
		class525_sub16_sub5_9_.method8755(-1933461091);
		class525_sub16_sub5_9_.method16266(-1925745724);
		anInt2196 += class525_sub16_sub5_9_.anInt11759 * -1235992217;
	    } else
		return object;
	}
	return null;
    }
    
    void method3825(Class525_Sub16_Sub5 class525_sub16_sub5) {
	if (null != class525_sub16_sub5) {
	    class525_sub16_sub5.method8755(-1933461091);
	    class525_sub16_sub5.method16266(-1925745724);
	    anInt2196 += -1235992217 * class525_sub16_sub5.anInt11759;
	}
    }
    
    public Object method3826() {
	Class525_Sub16_Sub5 class525_sub16_sub5
	    = (Class525_Sub16_Sub5) aClass10_2197.method689(471947795);
	while (class525_sub16_sub5 != null) {
	    Object object = class525_sub16_sub5.method18257(-1889830463);
	    if (null == object) {
		Class525_Sub16_Sub5 class525_sub16_sub5_10_
		    = class525_sub16_sub5;
		class525_sub16_sub5 = ((Class525_Sub16_Sub5)
				       aClass10_2197.method690((byte) 122));
		class525_sub16_sub5_10_.method8755(-1933461091);
		class525_sub16_sub5_10_.method16266(-1925745724);
		anInt2196 += class525_sub16_sub5_10_.anInt11759 * -1235992217;
	    } else
		return object;
	}
	return null;
    }
    
    public int method3827(int i) {
	return 794808389 * anInt2198;
    }
    
    static boolean method3828(int i) {
	boolean bool = true;
	if (Class112.aClass173_1383 == null) {
	    if (Class462.aClass458_5095
		    .method7506(Class549.anInt7287 * 1429429129, -2082171503))
		Class112.aClass173_1383
		    = Class187.method3668(Class462.aClass458_5095,
					  1429429129 * Class549.anInt7287);
	    else
		bool = false;
	}
	if (Class525_Sub7_Sub13.aClass173_11726 == null) {
	    if (Class462.aClass458_5095
		    .method7506(-2122121723 * Class695.anInt8756, 385364648))
		Class525_Sub7_Sub13.aClass173_11726
		    = Class187.method3668(Class462.aClass458_5095,
					  Class695.anInt8756 * -2122121723);
	    else
		bool = false;
	}
	if (Class496.aClass173_5542 == null) {
	    if (Class462.aClass458_5095.method7506(410930347 * (Class308_Sub1
								.anInt10142),
						   -527333991))
		Class496.aClass173_5542
		    = Class187.method3668(Class462.aClass458_5095,
					  (Class308_Sub1.anInt10142
					   * 410930347));
	    else
		bool = false;
	}
	if (null == Class525_Sub16_Sub3.aClass7_11414) {
	    if (Class276.aClass458_2875
		    .method7506(Class112.anInt1379 * 2145217499, 157346186))
		Class525_Sub16_Sub3.aClass7_11414
		    = Class7.aClass404_53.method6580((client
						      .anInterface50_11252),
						     (Class112.anInt1379
						      * 2145217499),
						     1147943202);
	    else
		bool = false;
	}
	if (Class112.aClass173_Sub2Array1384 == null) {
	    if (Class462.aClass458_5095
		    .method7506(2145217499 * Class112.anInt1379, -1869086450))
		Class112.aClass173_Sub2Array1384
		    = ((Class173_Sub2[])
		       Class187.method3671(Class462.aClass458_5095,
					   2145217499 * Class112.anInt1379));
	    else
		bool = false;
	}
	return bool;
    }
    
    static int method3829(int i, int i_11_, int i_12_) {
	if (i_11_ == 9)
	    i = 1 + i & 0x3;
	if (10 == i_11_)
	    i = 3 + i & 0x3;
	if (i_11_ == 11)
	    i = i + 3 & 0x3;
	return i;
    }
    
    static final void method3830(Class683 class683, int i) {
	class683.anInt8662 -= 362986067;
	int i_13_ = class683.anIntArray8661[501271953 * class683.anInt8662];
	int i_14_
	    = class683.anIntArray8661[501271953 * class683.anInt8662 + 1];
	int i_15_
	    = class683.anIntArray8661[2 + 501271953 * class683.anInt8662];
	Integer integer
	    = (Integer) client.aClass229_11119.method4356
			    (i_13_, 2125973149)
			    .method4001(i_14_, i_15_, -1248968673);
	if (integer == null)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= integer.intValue();
    }
    
    public static int method3831(int i, int i_16_, boolean bool, short i_17_) {
	Class525_Sub10 class525_sub10
	    = Class190.method3692(i, bool, (byte) 100);
	if (class525_sub10 == null)
	    return -1;
	if (i_16_ < 0 || i_16_ >= class525_sub10.anIntArray10507.length)
	    return -1;
	return class525_sub10.anIntArray10507[i_16_];
    }
    
    static final void method3832(Class683 class683, int i) {
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = Class198_Sub13.aClass525_Sub30_9973.aClass696_Sub1_10693
		  .method16893(682639620) ? 1 : 0;
    }
    
    static final void method3833(Class683 class683, byte i) {
	Class679 class679 = (class683.aBool8665 ? class683.aClass679_8642
			     : class683.aClass679_8658);
	Class259 class259 = class679.aClass259_8623;
	if (372293357 * class259.anInt2740 != -1)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= -1408303227 * class259.anInt2741;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method3834(Class683 class683, int i) {
	class683.anInt8662 -= -1189665054;
	int i_18_ = class683.anIntArray8661[class683.anInt8662 * 501271953];
	int i_19_
	    = class683.anIntArray8661[class683.anInt8662 * 501271953 + 1];
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_18_ | i_19_;
    }
}
