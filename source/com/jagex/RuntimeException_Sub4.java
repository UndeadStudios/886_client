/* RuntimeException_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class RuntimeException_Sub4 extends RuntimeException
{
    static long aLong12139;
    public static String aString12140;
    public static int anInt12141;
    public static int anInt12142;
    static Interface61 anInterface61_12143 = null;
    String aString12144;
    Throwable aThrowable12145;
    
    public static void method18807(String string, Throwable throwable) {
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
	    Class331_Sub1.method15693(string_0_, -715310171);
	    string_0_ = Class3.method529(string_0_, 1552651121);
	    URL url = null;
	    if (null != Class403.anApplet4139)
		url = Class403.anApplet4139.getCodeBase();
	    else if (anInterface61_12143 != null)
		url = anInterface61_12143.method390(-1356713574);
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
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (anInt12141 * 430363963).append
				  ("&cs=").append
				  (anInt12142 * 1504290403).append
				  ("&u=").append
				  (aString12140 != null
				   ? Class3.method529(aString12140, 1552651121)
				   : new StringBuilder().append("").append
					 (-1968431422738568733L * aLong12139)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class3.method529(string_1_, 1552651121))
				  .append
				  ("&v2=").append
				  (Class3.method529(string_2_, 1552651121))
				  .append
				  ("&e=").append
				  (string_0_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_3_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    static final String method18808(String string, String string_4_,
				    String string_5_) {
	for (int i = string.indexOf(string_4_); i != -1;
	     i = string.indexOf(string_4_, i + string_5_.length()))
	    string = new StringBuilder().append(string.substring(0, i)).append
			 (string_5_).append
			 (string.substring(i + string_4_.length())).toString();
	return string;
    }
    
    RuntimeException_Sub4(Throwable throwable, String string) {
	aString12144 = string;
	aThrowable12145 = throwable;
	initCause(throwable);
    }
    
    static final void method18809(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class531_Sub1.method15919(string, "%0a", "\n",
							  1017261925))
			       .toString());
    }
    
    public static void method18810(String string, Throwable throwable) {
	try {
	    String string_6_ = "";
	    if (throwable != null)
		string_6_ = Class40_Sub3.method17410(throwable, -16777216);
	    if (null != string) {
		if (null != throwable)
		    string_6_ = new StringBuilder().append(string_6_).append
				    (" | ").toString();
		string_6_ = new StringBuilder().append(string_6_).append
				(string).toString();
	    }
	    Class331_Sub1.method15693(string_6_, -1850024721);
	    string_6_ = Class3.method529(string_6_, 1552651121);
	    URL url = null;
	    if (null != Class403.anApplet4139)
		url = Class403.anApplet4139.getCodeBase();
	    else if (anInterface61_12143 != null)
		url = anInterface61_12143.method390(-2023033118);
	    if (null != url) {
		String string_7_ = "Unknown";
		String string_8_ = "1.1";
		try {
		    string_7_ = System.getProperty("java.vendor");
		    string_8_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_9_
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (anInt12141 * 430363963).append
				  ("&cs=").append
				  (anInt12142 * 1504290403).append
				  ("&u=").append
				  (aString12140 != null
				   ? Class3.method529(aString12140, 1552651121)
				   : new StringBuilder().append("").append
					 (-1968431422738568733L * aLong12139)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class3.method529(string_7_, 1552651121))
				  .append
				  ("&v2=").append
				  (Class3.method529(string_8_, 1552651121))
				  .append
				  ("&e=").append
				  (string_6_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_9_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    public static RuntimeException_Sub4 method18811(Throwable throwable,
						    String string) {
	RuntimeException_Sub4 runtimeexception_sub4;
	if (throwable instanceof RuntimeException_Sub4) {
	    runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub4 runtimeexception_sub4_10_
		= runtimeexception_sub4;
	    runtimeexception_sub4_10_.aString12144
		= stringbuilder.append
		      (runtimeexception_sub4_10_.aString12144).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub4
		= new RuntimeException_Sub4(throwable, string);
	return runtimeexception_sub4;
    }
    
    public static RuntimeException_Sub4 method18812(Throwable throwable,
						    String string) {
	RuntimeException_Sub4 runtimeexception_sub4;
	if (throwable instanceof RuntimeException_Sub4) {
	    runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub4 runtimeexception_sub4_11_
		= runtimeexception_sub4;
	    runtimeexception_sub4_11_.aString12144
		= stringbuilder.append
		      (runtimeexception_sub4_11_.aString12144).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub4
		= new RuntimeException_Sub4(throwable, string);
	return runtimeexception_sub4;
    }
    
    public static void method18813(String string, Throwable throwable) {
	try {
	    String string_12_ = "";
	    if (throwable != null)
		string_12_ = Class40_Sub3.method17410(throwable, -16777216);
	    if (null != string) {
		if (null != throwable)
		    string_12_ = new StringBuilder().append(string_12_).append
				     (" | ").toString();
		string_12_ = new StringBuilder().append(string_12_).append
				 (string).toString();
	    }
	    Class331_Sub1.method15693(string_12_, -1289713349);
	    string_12_ = Class3.method529(string_12_, 1552651121);
	    URL url = null;
	    if (null != Class403.anApplet4139)
		url = Class403.anApplet4139.getCodeBase();
	    else if (anInterface61_12143 != null)
		url = anInterface61_12143.method390(-1802123782);
	    if (null != url) {
		String string_13_ = "Unknown";
		String string_14_ = "1.1";
		try {
		    string_13_ = System.getProperty("java.vendor");
		    string_14_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_15_
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (anInt12141 * 430363963).append
				  ("&cs=").append
				  (anInt12142 * 1504290403).append
				  ("&u=").append
				  (aString12140 != null
				   ? Class3.method529(aString12140, 1552651121)
				   : new StringBuilder().append("").append
					 (-1968431422738568733L * aLong12139)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class3.method529(string_13_, 1552651121))
				  .append
				  ("&v2=").append
				  (Class3.method529(string_14_, 1552651121))
				  .append
				  ("&e=").append
				  (string_12_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_15_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    public static RuntimeException_Sub4 method18814(Throwable throwable,
						    String string) {
	RuntimeException_Sub4 runtimeexception_sub4;
	if (throwable instanceof RuntimeException_Sub4) {
	    runtimeexception_sub4 = (RuntimeException_Sub4) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub4 runtimeexception_sub4_16_
		= runtimeexception_sub4;
	    runtimeexception_sub4_16_.aString12144
		= stringbuilder.append
		      (runtimeexception_sub4_16_.aString12144).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub4
		= new RuntimeException_Sub4(throwable, string);
	return runtimeexception_sub4;
    }
    
    static final void method18815(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class531_Sub1.method15919(string, "%0a", "\n",
							  1017261925))
			       .toString());
    }
    
    static final String method18816(String string, String string_17_,
				    String string_18_) {
	for (int i = string.indexOf(string_17_); i != -1;
	     i = string.indexOf(string_17_, i + string_18_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_18_).append
		      (string.substring(i + string_17_.length())).toString();
	return string;
    }
    
    static String method18817(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub4) {
	    RuntimeException_Sub4 runtimeexception_sub4
		= (RuntimeException_Sub4) throwable;
	    string = new StringBuilder().append
			 (runtimeexception_sub4.aString12144).append
			 (" | ").toString();
	    throwable = runtimeexception_sub4.aThrowable12145;
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_19_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_19_));
	String string_20_ = bufferedreader.readLine();
	for (;;) {
	    String string_21_ = bufferedreader.readLine();
	    if (string_21_ == null)
		break;
	    int i = string_21_.indexOf('(');
	    int i_22_ = string_21_.indexOf(')', i + 1);
	    String string_23_;
	    if (-1 != i)
		string_23_ = string_21_.substring(0, i);
	    else
		string_23_ = string_21_;
	    string_23_ = string_23_.trim();
	    string_23_ = string_23_.substring(string_23_.lastIndexOf(' ') + 1);
	    string_23_
		= string_23_.substring(string_23_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_23_)
			 .toString();
	    if (i != -1 && -1 != i_22_) {
		int i_24_ = string_21_.indexOf(".java:", i);
		if (i_24_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_21_.substring(5 + i_24_, i_22_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_20_).toString();
	return string;
    }
}
