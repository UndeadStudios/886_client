/* Class611 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class611
{
    int anInt8013;
    int anInt8014;
    Class10 aClass10_8015;
    Class697 aClass697_8016 = new Class697();
    
    public final void method10027() {
	aClass697_8016.method14199(-147807733);
	aClass10_8015.method688((short) -9156);
	anInt8014 = anInt8013;
    }
    
    public final Object method10028(Interface71 interface71) {
	long l = interface71.method491();
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = (Class525_Sub16_Sub14) aClass10_8015.method684(l);
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass10_8015.method696(-2057538770))) {
	    if (class525_sub16_sub14.anInterface71_11839
		    .method488(interface71)) {
		Object object = class525_sub16_sub14.method18449();
		if (object == null) {
		    class525_sub16_sub14.method8755(-1933461091);
		    class525_sub16_sub14.method16266(-1925745724);
		    anInt8014 += class525_sub16_sub14.anInt11840;
		} else {
		    if (class525_sub16_sub14.method18450()) {
			Class525_Sub16_Sub14_Sub1 class525_sub16_sub14_sub1
			    = (new Class525_Sub16_Sub14_Sub1
			       (interface71, object,
				class525_sub16_sub14.anInt11840));
			aClass10_8015.method695(class525_sub16_sub14_sub1,
						(class525_sub16_sub14.aLong7113
						 * -5126207504388691097L));
			aClass697_8016.method14184(class525_sub16_sub14_sub1,
						   728171782);
			class525_sub16_sub14_sub1.aLong10553 = 0L;
			class525_sub16_sub14.method8755(-1933461091);
			class525_sub16_sub14.method16266(-1925745724);
		    } else {
			aClass697_8016.method14184(class525_sub16_sub14,
						   728171782);
			class525_sub16_sub14.aLong10553 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final void method10029(Interface71 interface71) {
	long l = interface71.method491();
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = (Class525_Sub16_Sub14) aClass10_8015.method684(l);
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass10_8015.method696(-2057538770))) {
	    if (class525_sub16_sub14.anInterface71_11839
		    .method488(interface71)) {
		method10030(class525_sub16_sub14);
		break;
	    }
	}
    }
    
    final void method10030(Class525_Sub16_Sub14 class525_sub16_sub14) {
	if (class525_sub16_sub14 != null) {
	    class525_sub16_sub14.method8755(-1933461091);
	    class525_sub16_sub14.method16266(-1925745724);
	    anInt8014 += class525_sub16_sub14.anInt11840;
	}
    }
    
    public final void method10031(Object object, Interface71 interface71) {
	method10034(object, interface71, 1);
    }
    
    public final void method10032() {
	aClass697_8016.method14199(1138357019);
	aClass10_8015.method688((short) -7658);
	anInt8014 = anInt8013;
    }
    
    public final void method10033(int i) {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -94));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		if (class525_sub16_sub14.method18449() == null) {
		    class525_sub16_sub14.method8755(-1933461091);
		    class525_sub16_sub14.method16266(-1925745724);
		    anInt8014 += class525_sub16_sub14.anInt11840;
		}
	    } else if ((class525_sub16_sub14.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub14_Sub2 class525_sub16_sub14_sub2
		    = (new Class525_Sub16_Sub14_Sub2
		       (class525_sub16_sub14.anInterface71_11839,
			class525_sub16_sub14.method18449(),
			class525_sub16_sub14.anInt11840));
		aClass10_8015.method695(class525_sub16_sub14_sub2,
					(class525_sub16_sub14.aLong7113
					 * -5126207504388691097L));
		Class6.method556(class525_sub16_sub14_sub2,
				 class525_sub16_sub14, -191013873);
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
	    }
	}
    }
    
    final void method10034(Object object, Interface71 interface71, int i) {
	if (i > anInt8013)
	    throw new IllegalStateException();
	method10029(interface71);
	anInt8014 -= i;
	while (anInt8014 < 0) {
	    Class525_Sub16_Sub14 class525_sub16_sub14
		= ((Class525_Sub16_Sub14)
		   aClass697_8016.method14196(-551252480));
	    method10030(class525_sub16_sub14);
	}
	Class525_Sub16_Sub14_Sub1 class525_sub16_sub14_sub1
	    = new Class525_Sub16_Sub14_Sub1(interface71, object, i);
	aClass10_8015.method695(class525_sub16_sub14_sub1,
				interface71.method491());
	aClass697_8016.method14184(class525_sub16_sub14_sub1, 728171782);
	class525_sub16_sub14_sub1.aLong10553 = 0L;
    }
    
    public final void method10035(Object object, Interface71 interface71) {
	method10034(object, interface71, 1);
    }
    
    public final Object method10036(Interface71 interface71) {
	long l = interface71.method491();
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = (Class525_Sub16_Sub14) aClass10_8015.method684(l);
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass10_8015.method696(-2057538770))) {
	    if (class525_sub16_sub14.anInterface71_11839
		    .method488(interface71)) {
		Object object = class525_sub16_sub14.method18449();
		if (object == null) {
		    class525_sub16_sub14.method8755(-1933461091);
		    class525_sub16_sub14.method16266(-1925745724);
		    anInt8014 += class525_sub16_sub14.anInt11840;
		} else {
		    if (class525_sub16_sub14.method18450()) {
			Class525_Sub16_Sub14_Sub1 class525_sub16_sub14_sub1
			    = (new Class525_Sub16_Sub14_Sub1
			       (interface71, object,
				class525_sub16_sub14.anInt11840));
			aClass10_8015.method695(class525_sub16_sub14_sub1,
						(class525_sub16_sub14.aLong7113
						 * -5126207504388691097L));
			aClass697_8016.method14184(class525_sub16_sub14_sub1,
						   728171782);
			class525_sub16_sub14_sub1.aLong10553 = 0L;
			class525_sub16_sub14.method8755(-1933461091);
			class525_sub16_sub14.method16266(-1925745724);
		    } else {
			aClass697_8016.method14184(class525_sub16_sub14,
						   728171782);
			class525_sub16_sub14.aLong10553 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final void method10037(Interface71 interface71) {
	long l = interface71.method491();
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = (Class525_Sub16_Sub14) aClass10_8015.method684(l);
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass10_8015.method696(-2057538770))) {
	    if (class525_sub16_sub14.anInterface71_11839
		    .method488(interface71)) {
		method10030(class525_sub16_sub14);
		break;
	    }
	}
    }
    
    public final void method10038(Object object, Interface71 interface71) {
	method10034(object, interface71, 1);
    }
    
    public final void method10039() {
	aClass697_8016.method14199(231332910);
	aClass10_8015.method688((short) 7058);
	anInt8014 = anInt8013;
    }
    
    public final void method10040() {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -66));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
		anInt8014 += class525_sub16_sub14.anInt11840;
	    }
	}
    }
    
    public final void method10041(Object object, Interface71 interface71) {
	method10034(object, interface71, 1);
    }
    
    public final void method10042(int i) {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -116));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		if (class525_sub16_sub14.method18449() == null) {
		    class525_sub16_sub14.method8755(-1933461091);
		    class525_sub16_sub14.method16266(-1925745724);
		    anInt8014 += class525_sub16_sub14.anInt11840;
		}
	    } else if ((class525_sub16_sub14.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub14_Sub2 class525_sub16_sub14_sub2
		    = (new Class525_Sub16_Sub14_Sub2
		       (class525_sub16_sub14.anInterface71_11839,
			class525_sub16_sub14.method18449(),
			class525_sub16_sub14.anInt11840));
		aClass10_8015.method695(class525_sub16_sub14_sub2,
					(class525_sub16_sub14.aLong7113
					 * -5126207504388691097L));
		Class6.method556(class525_sub16_sub14_sub2,
				 class525_sub16_sub14, -274426010);
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
	    }
	}
    }
    
    public final void method10043(int i) {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -45));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		if (class525_sub16_sub14.method18449() == null) {
		    class525_sub16_sub14.method8755(-1933461091);
		    class525_sub16_sub14.method16266(-1925745724);
		    anInt8014 += class525_sub16_sub14.anInt11840;
		}
	    } else if ((class525_sub16_sub14.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub14_Sub2 class525_sub16_sub14_sub2
		    = (new Class525_Sub16_Sub14_Sub2
		       (class525_sub16_sub14.anInterface71_11839,
			class525_sub16_sub14.method18449(),
			class525_sub16_sub14.anInt11840));
		aClass10_8015.method695(class525_sub16_sub14_sub2,
					(class525_sub16_sub14.aLong7113
					 * -5126207504388691097L));
		Class6.method556(class525_sub16_sub14_sub2,
				 class525_sub16_sub14, -1160498613);
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
	    }
	}
    }
    
    public final void method10044(int i) {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -36));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		if (class525_sub16_sub14.method18449() == null) {
		    class525_sub16_sub14.method8755(-1933461091);
		    class525_sub16_sub14.method16266(-1925745724);
		    anInt8014 += class525_sub16_sub14.anInt11840;
		}
	    } else if ((class525_sub16_sub14.aLong10553
			+= 7693047446987161823L) * 7105793357836614431L
		       > (long) i) {
		Class525_Sub16_Sub14_Sub2 class525_sub16_sub14_sub2
		    = (new Class525_Sub16_Sub14_Sub2
		       (class525_sub16_sub14.anInterface71_11839,
			class525_sub16_sub14.method18449(),
			class525_sub16_sub14.anInt11840));
		aClass10_8015.method695(class525_sub16_sub14_sub2,
					(class525_sub16_sub14.aLong7113
					 * -5126207504388691097L));
		Class6.method556(class525_sub16_sub14_sub2,
				 class525_sub16_sub14, -380493574);
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
	    }
	}
    }
    
    public final void method10045() {
	aClass697_8016.method14199(-716947432);
	aClass10_8015.method688((short) 19039);
	anInt8014 = anInt8013;
    }
    
    public final void method10046() {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -9));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
		anInt8014 += class525_sub16_sub14.anInt11840;
	    }
	}
    }
    
    public final void method10047() {
	aClass697_8016.method14199(-61711265);
	aClass10_8015.method688((short) 14808);
	anInt8014 = anInt8013;
    }
    
    public final void method10048() {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -22));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
		anInt8014 += class525_sub16_sub14.anInt11840;
	    }
	}
    }
    
    public Class611(int i) {
	anInt8013 = i;
	anInt8014 = i;
	int i_0_;
	for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
	    /* empty */
	}
	aClass10_8015 = new Class10(i_0_);
    }
    
    public final void method10049() {
	for (Class525_Sub16_Sub14 class525_sub16_sub14
		 = ((Class525_Sub16_Sub14)
		    aClass697_8016.method14186((byte) -25));
	     class525_sub16_sub14 != null;
	     class525_sub16_sub14 = ((Class525_Sub16_Sub14)
				     aClass697_8016.method14201((byte) -1))) {
	    if (class525_sub16_sub14.method18450()) {
		class525_sub16_sub14.method8755(-1933461091);
		class525_sub16_sub14.method16266(-1925745724);
		anInt8014 += class525_sub16_sub14.anInt11840;
	    }
	}
    }
}
