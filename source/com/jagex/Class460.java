/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class460 implements Callable
{
    Class525_Sub16_Sub12_Sub3 aClass525_Sub16_Sub12_Sub3_5069;
    URL anURL5070;
    Class470 this$0;
    
    public Object method7585() throws Exception {
	URLConnection urlconnection = anURL5070.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5141
		= Class251.method4508((byte) 8) * -5973667474414651689L;
	    bool = false;
	}
	return new Class465(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass525_Sub16_Sub12_Sub3_5069, anURL5070);
    }
    
    public Object call() throws Exception {
	URLConnection urlconnection = anURL5070.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5141
		= Class251.method4508((byte) 8) * -5973667474414651689L;
	    bool = false;
	}
	return new Class465(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass525_Sub16_Sub12_Sub3_5069, anURL5070);
    }
    
    Class460(Class470 class470, URL url,
	     Class525_Sub16_Sub12_Sub3 class525_sub16_sub12_sub3) {
	this$0 = class470;
	anURL5070 = url;
	aClass525_Sub16_Sub12_Sub3_5069 = class525_sub16_sub12_sub3;
    }
    
    public Object method7586() throws Exception {
	URLConnection urlconnection = anURL5070.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5141
		= Class251.method4508((byte) 8) * -5973667474414651689L;
	    bool = false;
	}
	return new Class465(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass525_Sub16_Sub12_Sub3_5069, anURL5070);
    }
    
    public Object method7587() throws Exception {
	URLConnection urlconnection = anURL5070.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5141
		= Class251.method4508((byte) 8) * -5973667474414651689L;
	    bool = false;
	}
	return new Class465(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass525_Sub16_Sub12_Sub3_5069, anURL5070);
    }
    
    static void method7588(Class553 class553, int i, int i_0_, int i_1_,
			   Class179 class179, int i_2_) {
	if (null != class179)
	    class553.method9169(i, i_0_, i_1_, class179.method2956(),
				class179.method3001(), class179.method2959(),
				class179.method2960(), class179.method2961(),
				class179.method2962(), class179.method2963());
    }
}
