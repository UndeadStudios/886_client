/* Class40_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class40_Sub3 extends Class40
{
    public Class40_Sub3(Class668 class668, Class666 class666,
			Class458 class458) {
	super(class668, class666, class458, Class663.aClass663_8504, 16,
	      new Class45(com.jagex.Class570.class));
    }
    
    static String method17410(Throwable throwable, int i) throws IOException {
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
	String string_0_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_0_));
	String string_1_ = bufferedreader.readLine();
	for (;;) {
	    String string_2_ = bufferedreader.readLine();
	    if (string_2_ == null)
		break;
	    int i_3_ = string_2_.indexOf('(');
	    int i_4_ = string_2_.indexOf(')', i_3_ + 1);
	    String string_5_;
	    if (-1 != i_3_)
		string_5_ = string_2_.substring(0, i_3_);
	    else
		string_5_ = string_2_;
	    string_5_ = string_5_.trim();
	    string_5_ = string_5_.substring(string_5_.lastIndexOf(' ') + 1);
	    string_5_ = string_5_.substring(string_5_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_5_)
			 .toString();
	    if (i_3_ != -1 && -1 != i_4_) {
		int i_6_ = string_2_.indexOf(".java:", i_3_);
		if (i_6_ >= 0)
		    string
			= new StringBuilder().append(string).append
			      (string_2_.substring(5 + i_6_, i_4_)).toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_1_).toString();
	return string;
    }
}
