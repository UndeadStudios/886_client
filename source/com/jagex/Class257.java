/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class257
{
    static Map aMap2549;
    public static final long aLong2550 = 60000L;
    public static final long aLong2551 = 1000L;
    static HashMap aHashMap2552 = new HashMap();
    
    static TimeZone method4654(String string) {
	synchronized (aHashMap2552) {
	    TimeZone timezone = (TimeZone) aHashMap2552.get(string);
	    if (null == timezone) {
		timezone = TimeZone.getTimeZone(string);
		aHashMap2552.put(string, timezone);
	    }
	    TimeZone timezone_0_ = timezone;
	    return timezone_0_;
	}
    }
    
    public static String method4655(Date date, String string, int i) {
	return method4656(date, string, method4657(-1193536153),
			  Class666.aClass666_8562, 1363274152);
    }
    
    static String method4656(Date date, String string, TimeZone timezone,
			     Class666 class666, int i) {
	if (null == aMap2549) {
	    aMap2549 = new HashMap(7);
	    Class666[] class666s = Class666.method11022((short) -7926);
	    for (int i_1_ = 0; i_1_ < class666s.length; i_1_++) {
		Class666 class666_2_ = class666s[i_1_];
		aMap2549.put(class666_2_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2549.get(class666);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (simpledateformat == null)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class666.method11004(628961167));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_3_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_3_;
    }
    
    static TimeZone method4657(int i) {
	return method4658("Europe/London", -1920477735);
    }
    
    static TimeZone method4658(String string, int i) {
	synchronized (aHashMap2552) {
	    TimeZone timezone = (TimeZone) aHashMap2552.get(string);
	    if (null == timezone) {
		timezone = TimeZone.getTimeZone(string);
		aHashMap2552.put(string, timezone);
	    }
	    TimeZone timezone_4_ = timezone;
	    return timezone_4_;
	}
    }
    
    Class257() throws Throwable {
	throw new Error();
    }
    
    static {
	Calendar.getInstance(method4658("Europe/London", -1920477735));
    }
    
    static String method4659(Date date, String string, TimeZone timezone,
			     Class666 class666) {
	if (null == aMap2549) {
	    aMap2549 = new HashMap(7);
	    Class666[] class666s = Class666.method11022((short) -20510);
	    for (int i = 0; i < class666s.length; i++) {
		Class666 class666_5_ = class666s[i];
		aMap2549.put(class666_5_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2549.get(class666);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (simpledateformat == null)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class666.method11004(-687496026));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_6_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_6_;
    }
    
    static String method4660(Date date, String string, TimeZone timezone,
			     Class666 class666) {
	if (null == aMap2549) {
	    aMap2549 = new HashMap(7);
	    Class666[] class666s = Class666.method11022((short) -11806);
	    for (int i = 0; i < class666s.length; i++) {
		Class666 class666_7_ = class666s[i];
		aMap2549.put(class666_7_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2549.get(class666);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (simpledateformat == null)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class666.method11004(601504827));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_8_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_8_;
    }
    
    static final void method4661(Class683 class683, int i) {
	int i_9_ = (class683.anIntArray8661
		    [(class683.anInt8662 -= 1552651121) * 501271953]);
	if (1819257147 * client.anInt11362 == 2
	    && i_9_ < client.anInt11204 * -883281325)
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= client.aClass66Array11356[i_9_].aBool710 ? 1 : 0;
	else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
    
    static final void method4662(Class683 class683, byte i) {
	if (null != Class473.aClass353_5161) {
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 1;
	    class683.aClass353_8652 = Class473.aClass353_5161;
	    class683.aMap8657.put(Class453.aClass453_4945,
				  Class587.method9692(class683.aClass353_8652,
						      -1301235093));
	} else
	    class683.anIntArray8661
		[(class683.anInt8662 += 1552651121) * 501271953 - 1]
		= 0;
    }
}
