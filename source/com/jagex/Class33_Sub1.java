/* Class33_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class33_Sub1 extends Class33
{
    static final String aString10997 = "java.net.useSystemProxies";
    ProxySelector aProxySelector10998 = ProxySelector.getDefault();
    
    public Socket method952() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_0_ = 521016137 * anInt306 == 443;
	List list;
	List list_1_;
	try {
	    list
		= aProxySelector10998.select(new URI(new StringBuilder().append
							 (bool_0_ ? "https"
							  : "http")
							 .append
							 ("://").append
							 (aString307)
							 .toString()));
	    list_1_
		= aProxySelector10998.select(new URI(new StringBuilder().append
							 (bool_0_ ? "http"
							  : "https")
							 .append
							 ("://").append
							 (aString307)
							 .toString()));
	} catch (URISyntaxException urisyntaxexception) {
	    return method949((byte) 89);
	}
	list.addAll(list_1_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_2_ = objects;
	for (int i = 0; i < objects_2_.length; i++) {
	    Object object = objects_2_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_3_ = method17370(proxy, 772895680);
		if (socket_3_ == null)
		    continue;
		socket = socket_3_;
	    } catch (IOException_Sub1 ioexception_sub1_4_) {
		ioexception_sub1 = ioexception_sub1_4_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (ioexception_sub1 != null)
	    throw ioexception_sub1;
	return method949((byte) 88);
    }
    
    public Socket method950(int i) throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_5_ = 521016137 * anInt306 == 443;
	List list;
	List list_6_;
	try {
	    list
		= aProxySelector10998.select(new URI(new StringBuilder().append
							 (bool_5_ ? "https"
							  : "http")
							 .append
							 ("://").append
							 (aString307)
							 .toString()));
	    list_6_
		= aProxySelector10998.select(new URI(new StringBuilder().append
							 (bool_5_ ? "http"
							  : "https")
							 .append
							 ("://").append
							 (aString307)
							 .toString()));
	} catch (URISyntaxException urisyntaxexception) {
	    return method949((byte) 86);
	}
	list.addAll(list_6_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_7_ = objects;
	for (int i_8_ = 0; i_8_ < objects_7_.length; i_8_++) {
	    Object object = objects_7_[i_8_];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_9_ = method17370(proxy, 546000981);
		if (socket_9_ == null)
		    continue;
		socket = socket_9_;
	    } catch (IOException_Sub1 ioexception_sub1_10_) {
		ioexception_sub1 = ioexception_sub1_10_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (ioexception_sub1 != null)
	    throw ioexception_sub1;
	return method949((byte) 49);
    }
    
    Socket method17370(Proxy proxy, int i) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method949((byte) 40);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (object != null) {
		    Method method_11_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_11_.setAccessible(true);
		    if (((Boolean) method_11_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_12_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_12_.setAccessible(true);
			Method method_13_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_13_.setAccessible(true);
			String string_14_
			    = ((String)
			       method_12_.invoke(object, new Object[0]));
			String string_15_
			    = ((String)
			       method_13_.invoke(object,
						 (new Object[]
						  { new URL(new StringBuilder
								().append
								("https://")
								.append
								(aString307)
								.append
								("/")
								.toString()),
						    "https" })));
			string = new StringBuilder().append(string_14_).append
				     (": ").append
				     (string_15_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method17371(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string, 456454136);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress(aString307,
						 anInt306 * 521016137));
	    return socket;
	}
	return null;
    }
    
    Socket method17371(String string, int i, String string_16_, int i_17_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_16_)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString307).append
				   (":").append
				   (521016137 * anInt306).append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString307).append
				   (":").append
				   (anInt306 * 521016137).append
				   (" HTTP/1.0\n").append
				   (string_16_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_18_ = bufferedreader.readLine();
	if (string_18_ != null) {
	    if (string_18_.startsWith("HTTP/1.0 200")
		|| string_18_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_18_.startsWith("HTTP/1.0 407")
		|| string_18_.startsWith("HTTP/1.1 407")) {
		int i_19_ = 0;
		String string_20_ = "proxy-authenticate: ";
		for (string_18_ = bufferedreader.readLine();
		     string_18_ != null && i_19_ < 50; i_19_++) {
		    if (string_18_.toLowerCase().startsWith(string_20_)) {
			string_18_
			    = string_18_.substring(string_20_.length()).trim();
			int i_21_ = string_18_.indexOf(' ');
			if (-1 != i_21_)
			    string_18_ = string_18_.substring(0, i_21_);
			throw new IOException_Sub1(string_18_);
		    }
		    string_18_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    Socket method17372(Proxy proxy) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method949((byte) 22);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (object != null) {
		    Method method_22_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_22_.setAccessible(true);
		    if (((Boolean) method_22_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_23_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_23_.setAccessible(true);
			Method method_24_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_24_.setAccessible(true);
			String string_25_
			    = ((String)
			       method_23_.invoke(object, new Object[0]));
			String string_26_
			    = ((String)
			       method_24_.invoke(object,
						 (new Object[]
						  { new URL(new StringBuilder
								().append
								("https://")
								.append
								(aString307)
								.append
								("/")
								.toString()),
						    "https" })));
			string = new StringBuilder().append(string_25_).append
				     (": ").append
				     (string_26_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method17371(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string, 456454136);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress(aString307,
						 anInt306 * 521016137));
	    return socket;
	}
	return null;
    }
    
    public Socket method953() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_27_ = 521016137 * anInt306 == 443;
	List list;
	List list_28_;
	try {
	    list
		= aProxySelector10998.select(new URI(new StringBuilder().append
							 (bool_27_ ? "https"
							  : "http")
							 .append
							 ("://").append
							 (aString307)
							 .toString()));
	    list_28_
		= aProxySelector10998.select(new URI(new StringBuilder().append
							 (bool_27_ ? "http"
							  : "https")
							 .append
							 ("://").append
							 (aString307)
							 .toString()));
	} catch (URISyntaxException urisyntaxexception) {
	    return method949((byte) 14);
	}
	list.addAll(list_28_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_29_ = objects;
	for (int i = 0; i < objects_29_.length; i++) {
	    Object object = objects_29_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_30_ = method17370(proxy, -1431202963);
		if (socket_30_ == null)
		    continue;
		socket = socket_30_;
	    } catch (IOException_Sub1 ioexception_sub1_31_) {
		ioexception_sub1 = ioexception_sub1_31_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (ioexception_sub1 != null)
	    throw ioexception_sub1;
	return method949((byte) 115);
    }
    
    Socket method17373(String string, int i, String string_32_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_32_)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString307).append
				   (":").append
				   (521016137 * anInt306).append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString307).append
				   (":").append
				   (anInt306 * 521016137).append
				   (" HTTP/1.0\n").append
				   (string_32_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_33_ = bufferedreader.readLine();
	if (string_33_ != null) {
	    if (string_33_.startsWith("HTTP/1.0 200")
		|| string_33_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_33_.startsWith("HTTP/1.0 407")
		|| string_33_.startsWith("HTTP/1.1 407")) {
		int i_34_ = 0;
		String string_35_ = "proxy-authenticate: ";
		for (string_33_ = bufferedreader.readLine();
		     string_33_ != null && i_34_ < 50; i_34_++) {
		    if (string_33_.toLowerCase().startsWith(string_35_)) {
			string_33_
			    = string_33_.substring(string_35_.length()).trim();
			int i_36_ = string_33_.indexOf(' ');
			if (-1 != i_36_)
			    string_33_ = string_33_.substring(0, i_36_);
			throw new IOException_Sub1(string_33_);
		    }
		    string_33_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    Class33_Sub1() {
	/* empty */
    }
    
    Socket method17374(String string, int i, String string_37_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_37_)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString307).append
				   (":").append
				   (521016137 * anInt306).append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString307).append
				   (":").append
				   (anInt306 * 521016137).append
				   (" HTTP/1.0\n").append
				   (string_37_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_38_ = bufferedreader.readLine();
	if (string_38_ != null) {
	    if (string_38_.startsWith("HTTP/1.0 200")
		|| string_38_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_38_.startsWith("HTTP/1.0 407")
		|| string_38_.startsWith("HTTP/1.1 407")) {
		int i_39_ = 0;
		String string_40_ = "proxy-authenticate: ";
		for (string_38_ = bufferedreader.readLine();
		     string_38_ != null && i_39_ < 50; i_39_++) {
		    if (string_38_.toLowerCase().startsWith(string_40_)) {
			string_38_
			    = string_38_.substring(string_40_.length()).trim();
			int i_41_ = string_38_.indexOf(' ');
			if (-1 != i_41_)
			    string_38_ = string_38_.substring(0, i_41_);
			throw new IOException_Sub1(string_38_);
		    }
		    string_38_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    static final void method17375(Class683 class683, int i) {
	MagnetConfig.method2454(class683, class683.aClass656_Sub1_Sub3_Sub1_8654,
			    (byte) -47);
    }
}
