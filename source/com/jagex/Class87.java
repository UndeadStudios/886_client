/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class87
{
    public Interface45[] anInterface45Array891;
    
    void method1651(RSBuffer class525_sub38) {
	anInterface45Array891
	    = new Interface45[class525_sub38.readUnsignedByte(1549247954)];
	Class392[] class392s = Class531_Sub2.method15934((short) 16383);
	for (int i = 0; i < anInterface45Array891.length; i++)
	    anInterface45Array891[i]
		= method1653(class525_sub38,
			     class392s[class525_sub38.readUnsignedByte(1445095928)],
			     -1143201315);
    }
    
    void method1652(RSBuffer class525_sub38, int i) {
	anInterface45Array891
	    = new Interface45[class525_sub38.readUnsignedByte(1169496445)];
	Class392[] class392s = Class531_Sub2.method15934((short) 16383);
	for (int i_0_ = 0; i_0_ < anInterface45Array891.length; i_0_++)
	    anInterface45Array891[i_0_]
		= method1653(class525_sub38,
			     class392s[class525_sub38.readUnsignedByte(1922514245)],
			     -963916487);
    }
    
    Interface45 method1653(RSBuffer class525_sub38, Class392 class392,
                           int i) {
	if (class392 == Class392.aClass392_4078)
	    return Class475.method7777(class525_sub38, (byte) -80);
	if (Class392.aClass392_4073 == class392)
	    return Class14.method744(class525_sub38, -1654616101);
	if (Class392.aClass392_4076 == class392)
	    return Class184.method3607(class525_sub38, (byte) 94);
	if (class392 == Class392.aClass392_4080)
	    return Class206_Sub1.method15714(class525_sub38, -151192479);
	if (class392 == Class392.aClass392_4072)
	    return Class40_Sub2.method17401(class525_sub38, -332783305);
	if (class392 == Class392.aClass392_4075)
	    return Class653.method10788(class525_sub38, -1499808233);
	if (class392 == Class392.aClass392_4077)
	    return Class561.method9424(class525_sub38, -1154636121);
	if (Class392.aClass392_4079 == class392)
	    return Class43.method1070(class525_sub38, -1981793030);
	if (class392 == Class392.aClass392_4074)
	    return Class522.method8702(class525_sub38, 1992497371);
	if (Class392.aClass392_4081 == class392)
	    return Class350_Sub2_Sub3.method18209(class525_sub38, 22633458);
	if (Class392.aClass392_4082 == class392)
	    return Class290.method5275(class525_sub38, -1968708663);
	return null;
    }
    
    Interface45 method1654(RSBuffer class525_sub38, Class392 class392) {
	if (class392 == Class392.aClass392_4078)
	    return Class475.method7777(class525_sub38, (byte) -123);
	if (Class392.aClass392_4073 == class392)
	    return Class14.method744(class525_sub38, 385806394);
	if (Class392.aClass392_4076 == class392)
	    return Class184.method3607(class525_sub38, (byte) 62);
	if (class392 == Class392.aClass392_4080)
	    return Class206_Sub1.method15714(class525_sub38, -151192479);
	if (class392 == Class392.aClass392_4072)
	    return Class40_Sub2.method17401(class525_sub38, -979876177);
	if (class392 == Class392.aClass392_4075)
	    return Class653.method10788(class525_sub38, -1830510401);
	if (class392 == Class392.aClass392_4077)
	    return Class561.method9424(class525_sub38, -760380967);
	if (Class392.aClass392_4079 == class392)
	    return Class43.method1070(class525_sub38, -69282517);
	if (class392 == Class392.aClass392_4074)
	    return Class522.method8702(class525_sub38, 2021656091);
	if (Class392.aClass392_4081 == class392)
	    return Class350_Sub2_Sub3.method18209(class525_sub38, -2002193535);
	if (Class392.aClass392_4082 == class392)
	    return Class290.method5275(class525_sub38, -2043123237);
	return null;
    }
    
    Interface45 method1655(RSBuffer class525_sub38, Class392 class392) {
	if (class392 == Class392.aClass392_4078)
	    return Class475.method7777(class525_sub38, (byte) -111);
	if (Class392.aClass392_4073 == class392)
	    return Class14.method744(class525_sub38, -1572195747);
	if (Class392.aClass392_4076 == class392)
	    return Class184.method3607(class525_sub38, (byte) 96);
	if (class392 == Class392.aClass392_4080)
	    return Class206_Sub1.method15714(class525_sub38, -151192479);
	if (class392 == Class392.aClass392_4072)
	    return Class40_Sub2.method17401(class525_sub38, -1781162965);
	if (class392 == Class392.aClass392_4075)
	    return Class653.method10788(class525_sub38, -332056118);
	if (class392 == Class392.aClass392_4077)
	    return Class561.method9424(class525_sub38, -1773021677);
	if (Class392.aClass392_4079 == class392)
	    return Class43.method1070(class525_sub38, -1639444885);
	if (class392 == Class392.aClass392_4074)
	    return Class522.method8702(class525_sub38, 1583917390);
	if (Class392.aClass392_4081 == class392)
	    return Class350_Sub2_Sub3.method18209(class525_sub38, -556565135);
	if (Class392.aClass392_4082 == class392)
	    return Class290.method5275(class525_sub38, -2054839139);
	return null;
    }
    
    Interface45 method1656(RSBuffer class525_sub38, Class392 class392) {
	if (class392 == Class392.aClass392_4078)
	    return Class475.method7777(class525_sub38, (byte) -44);
	if (Class392.aClass392_4073 == class392)
	    return Class14.method744(class525_sub38, -56864246);
	if (Class392.aClass392_4076 == class392)
	    return Class184.method3607(class525_sub38, (byte) 54);
	if (class392 == Class392.aClass392_4080)
	    return Class206_Sub1.method15714(class525_sub38, -151192479);
	if (class392 == Class392.aClass392_4072)
	    return Class40_Sub2.method17401(class525_sub38, -509624310);
	if (class392 == Class392.aClass392_4075)
	    return Class653.method10788(class525_sub38, -1918085896);
	if (class392 == Class392.aClass392_4077)
	    return Class561.method9424(class525_sub38, -1141161151);
	if (Class392.aClass392_4079 == class392)
	    return Class43.method1070(class525_sub38, -1024146819);
	if (class392 == Class392.aClass392_4074)
	    return Class522.method8702(class525_sub38, 1072800191);
	if (Class392.aClass392_4081 == class392)
	    return Class350_Sub2_Sub3.method18209(class525_sub38, -38448364);
	if (Class392.aClass392_4082 == class392)
	    return Class290.method5275(class525_sub38, -2116424402);
	return null;
    }
    
    Class87() {
	/* empty */
    }
    
    static final void method1657(Class683 class683, int i) {
	int i_1_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	int i_2_ = Class453_Sub2.method15918(i_1_, (byte) 72);
	if (i_2_ < 0)
	    throw new RuntimeException();
	class683.anIntArray8661[((class683.anInt8662 += 1552651121) * 501271953
				 - 1)]
	    = i_2_;
    }
    
    public static void method1658(int i) {
	Class616.aClass10_8053 = new Class10(8);
	Class616.anInt8054 = 0;
	Iterator iterator = Class616.aList8050.iterator();
	while (iterator.hasNext()) {
	    Class633 class633 = (Class633) iterator.next();
	    class633.method10331();
	}
    }
    
    public static int method1659(int i) {
	return 10;
    }
}
