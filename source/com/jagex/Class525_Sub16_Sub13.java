/* Class525_Sub16_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.DataInputStream;
import java.net.URL;

public class Class525_Sub16_Sub13 extends Class525_Sub16
{
    Class656_Sub1_Sub3_Sub5 aClass656_Sub1_Sub3_Sub5_11838;
    
    public Class525_Sub16_Sub13
	(Class656_Sub1_Sub3_Sub5 class656_sub1_sub3_sub5) {
	aClass656_Sub1_Sub3_Sub5_11838 = class656_sub1_sub3_sub5;
    }
    
    public static void method18448(String string, Throwable throwable,
				   byte i) {
	try {
	    String string_0_ = "";
	    if (throwable != null)
		string_0_ = Class40_Sub3.method17410(throwable, -16777216);
	    if (null != string) {
		if (null != throwable)
		    string_0_ = new StringBuilder().append(string_0_).append
				    (" | ").toString();
		string_0_ = new StringBuilder().append(string_0_).append
				(string).toString();
	    }
	    Class331_Sub1.method15693(string_0_, -1223364987);
	    string_0_ = Class3.method529(string_0_, 1552651121);
	    URL url = null;
	    if (null != Class403.anApplet4139)
		url = Class403.anApplet4139.getCodeBase();
	    else if (RuntimeException_Sub4.anInterface61_12143 != null)
		url = RuntimeException_Sub4.anInterface61_12143
			  .method390(-1271929649);
	    if (null != url) {
		String string_1_ = "Unknown";
		String string_2_ = "1.1";
		try {
		    string_1_ = System.getProperty("java.vendor");
		    string_2_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_3_
		    = (new URL
		       (url,
			new StringBuilder().append("clienterror.ws?c=").append
			    (RuntimeException_Sub4.anInt12141 * 430363963)
			    .append
			    ("&cs=").append
			    (RuntimeException_Sub4.anInt12142 * 1504290403)
			    .append
			    ("&u=").append
			    (RuntimeException_Sub4.aString12140 != null
			     ? Class3.method529((RuntimeException_Sub4
						 .aString12140),
						1552651121)
			     : new StringBuilder().append("").append
				   (-1968431422738568733L
				    * RuntimeException_Sub4.aLong12139)
				   .toString())
			    .append
			    ("&v1=").append
			    (Class3.method529(string_1_, 1552651121)).append
			    ("&v2=").append
			    (Class3.method529(string_2_, 1552651121)).append
			    ("&e=").append
			    (string_0_).toString()));
		DataInputStream datainputstream
		    = new DataInputStream(url_3_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
}
