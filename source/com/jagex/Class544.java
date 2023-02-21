/* Class544 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class544 implements Interface60
{
    Hashtable aHashtable7195;
    Class458 aClass458_7196;
    Hashtable aHashtable7197 = new Hashtable();
    String aString7198;
    
    void method8916(String string, Class var_class, int i)
	throws Exception_Sub2 {
	Class var_class_0_ = (Class) aHashtable7195.get(string);
	if (var_class_0_ != null
	    && var_class_0_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub2(1, string);
	File file = null;
	if (file == null)
	    file = (File) aHashtable7197.get(string);
	if (file != null) {
	    try {
		file = new File(file.getCanonicalPath());
		Class var_class_1_ = Class.forName("java.lang.Runtime");
		Class var_class_2_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_2_.getDeclaredMethod("setAccessible",
						     (new Class[]
						      { Boolean.TYPE }));
		Method method_3_
		    = (var_class_1_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_3_, new Object[] { Boolean.TRUE });
		method_3_.invoke(Runtime.getRuntime(),
				 new Object[] { var_class, file.getPath() });
		method.invoke(method_3_, new Object[] { Boolean.FALSE });
		aHashtable7195.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7195.put(string, com.jagex.Class545.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub2(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub2(4, string);
    }
    
    public int method8917(String string, boolean bool, byte i)
	throws Exception_Sub1 {
	if (aHashtable7197.containsKey(string))
	    return 100;
	String string_4_ = null;
	Object object = null;
	String string_5_;
	if (bool) {
	    string_4_ = string;
	    string_5_ = string;
	} else {
	    string_5_ = Class601.method9897(string, 1560612708);
	    if (string_5_ == null)
		throw new Exception_Sub1(1, string);
	    if (string_4_ == null) {
		string_4_ = new StringBuilder().append(aString7198).append
				(string_5_).toString();
		if (null == aClass458_7196
		    || !aClass458_7196.method7473(string_4_, "", 2054619278))
		    throw new Exception_Sub1(2, string);
	    }
	}
	if (!aClass458_7196.method7486(string_4_, 485236237))
	    return aClass458_7196.method7499(string_4_, -2004837995);
	byte[] is = aClass458_7196.method7495(string_4_, "", 1361147540);
	if (is == null)
	    throw new Exception_Sub1(3, string);
	Object object_6_ = null;
	File file;
	try {
	    file = Class689_Sub2_Sub1.method18590(string_5_, (byte) -45);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub1(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub1(5, string);
	boolean bool_7_ = true;
	byte[] is_8_ = Class646.method10692(file, (byte) 63);
	if (null != is_8_ && is_8_.length == is.length) {
	    for (int i_9_ = 0; i_9_ < is_8_.length; i_9_++) {
		if (is_8_[i_9_] != is[i_9_]) {
		    bool_7_ = false;
		    break;
		}
	    }
	} else
	    bool_7_ = false;
	if (!bool_7_) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(6, string, throwable);
	    }
	}
	method8918(string, file, -661658926);
	return 100;
    }
    
    void method8918(String string, File file, int i) {
	aHashtable7197.put(string, file);
    }
    
    public boolean method384(String string, short i) {
	return aHashtable7197.containsKey(string);
    }
    
    public void method385(String string, int i) throws Exception_Sub2 {
	method8916(string, com.jagex.Class545.class, 2111346275);
    }
    
    public int method8919(String string, boolean bool) throws Exception_Sub1 {
	if (aHashtable7197.containsKey(string))
	    return 100;
	String string_10_ = null;
	Object object = null;
	String string_11_;
	if (bool) {
	    string_10_ = string;
	    string_11_ = string;
	} else {
	    string_11_ = Class601.method9897(string, 1560612708);
	    if (string_11_ == null)
		throw new Exception_Sub1(1, string);
	    if (string_10_ == null) {
		string_10_ = new StringBuilder().append(aString7198).append
				 (string_11_).toString();
		if (null == aClass458_7196
		    || !aClass458_7196.method7473(string_10_, "", 230623496))
		    throw new Exception_Sub1(2, string);
	    }
	}
	if (!aClass458_7196.method7486(string_10_, 1619562507))
	    return aClass458_7196.method7499(string_10_, -1470395085);
	byte[] is = aClass458_7196.method7495(string_10_, "", 868293726);
	if (is == null)
	    throw new Exception_Sub1(3, string);
	Object object_12_ = null;
	File file;
	try {
	    file = Class689_Sub2_Sub1.method18590(string_11_, (byte) -75);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub1(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub1(5, string);
	boolean bool_13_ = true;
	byte[] is_14_ = Class646.method10692(file, (byte) 63);
	if (null != is_14_ && is_14_.length == is.length) {
	    for (int i = 0; i < is_14_.length; i++) {
		if (is_14_[i] != is[i]) {
		    bool_13_ = false;
		    break;
		}
	    }
	} else
	    bool_13_ = false;
	if (!bool_13_) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(6, string, throwable);
	    }
	}
	method8918(string, file, -661658926);
	return 100;
    }
    
    public boolean method389(byte i) {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7195.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7195.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_15_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_15_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7195.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7197.get(string);
			Class var_class_16_
			    = (Class) aHashtable7195.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_16_.getClassLoader()));
			for (int i_17_ = 0; i_17_ < vector.size(); i_17_++) {
			    try {
				Object object = vector.elementAt(i_17_);
				Field field_18_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_18_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_19_
					= (String) field_18_.get(object);
				    if (string_19_ != null
					&& (string_19_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_20_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_21_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_20_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_21_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_21_.invoke(object,
							      new Object[0]);
					    field_20_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_21_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_20_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_18_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7195 = hashtable;
	return aHashtable7195.isEmpty();
    }
    
    static String method8920(String string) {
	if (Class512.aString5685.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class512.aString5685.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class512.aString5685.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    public boolean method210() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7195.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7195.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_22_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_22_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7195.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7197.get(string);
			Class var_class_23_
			    = (Class) aHashtable7195.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_23_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_24_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_24_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_25_
					= (String) field_24_.get(object);
				    if (string_25_ != null
					&& (string_25_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_26_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_27_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_26_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_27_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_27_.invoke(object,
							      new Object[0]);
					    field_26_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_27_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_26_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_24_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7195 = hashtable;
	return aHashtable7195.isEmpty();
    }
    
    void method8921(String string, Class var_class) throws Exception_Sub2 {
	Class var_class_28_ = (Class) aHashtable7195.get(string);
	if (var_class_28_ != null
	    && var_class_28_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub2(1, string);
	File file = null;
	if (file == null)
	    file = (File) aHashtable7197.get(string);
	if (file != null) {
	    try {
		file = new File(file.getCanonicalPath());
		Class var_class_29_ = Class.forName("java.lang.Runtime");
		Class var_class_30_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_30_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_31_
		    = (var_class_29_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_31_, new Object[] { Boolean.TRUE });
		method_31_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_31_, new Object[] { Boolean.FALSE });
		aHashtable7195.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7195.put(string, com.jagex.Class545.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub2(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub2(4, string);
    }
    
    public boolean method388() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7195.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7195.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_32_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_32_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7195.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7197.get(string);
			Class var_class_33_
			    = (Class) aHashtable7195.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_33_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_34_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_34_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_35_
					= (String) field_34_.get(object);
				    if (string_35_ != null
					&& (string_35_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_36_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_37_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_36_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_37_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_37_.invoke(object,
							      new Object[0]);
					    field_36_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_37_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_36_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_34_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7195 = hashtable;
	return aHashtable7195.isEmpty();
    }
    
    public boolean method386(String string) {
	return aHashtable7197.containsKey(string);
    }
    
    void method8922(String string, Class var_class) throws Exception_Sub2 {
	Class var_class_38_ = (Class) aHashtable7195.get(string);
	if (var_class_38_ != null
	    && var_class_38_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub2(1, string);
	File file = null;
	if (file == null)
	    file = (File) aHashtable7197.get(string);
	if (file != null) {
	    try {
		file = new File(file.getCanonicalPath());
		Class var_class_39_ = Class.forName("java.lang.Runtime");
		Class var_class_40_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_40_.getDeclaredMethod("setAccessible",
						      (new Class[]
						       { Boolean.TYPE }));
		Method method_41_
		    = (var_class_39_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_41_, new Object[] { Boolean.TRUE });
		method_41_.invoke(Runtime.getRuntime(),
				  new Object[] { var_class, file.getPath() });
		method.invoke(method_41_, new Object[] { Boolean.FALSE });
		aHashtable7195.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7195.put(string, com.jagex.Class545.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub2(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub2(4, string);
    }
    
    static String method8923(String string) {
	if (Class512.aString5685.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class512.aString5685.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class512.aString5685.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    static String method8924(String string) {
	if (Class512.aString5685.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class512.aString5685.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class512.aString5685.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    public Class544(Class458 class458) {
	aHashtable7195 = new Hashtable();
	aClass458_7196 = class458;
	String string = "";
	if (Class512.aString5685.startsWith("win")
	    || Class512.aString5685.startsWith("windows 7"))
	    string = new StringBuilder().append(string).append("windows/")
			 .toString();
	else if (Class512.aString5685.startsWith("linux"))
	    string = new StringBuilder().append(string).append("linux/")
			 .toString();
	else if (Class512.aString5685.startsWith("mac"))
	    string = new StringBuilder().append(string).append("macos/")
			 .toString();
	if (Class512.aString5687.startsWith("amd64")
	    || Class512.aString5687.startsWith("x86_64"))
	    string = new StringBuilder().append(string).append("x86_64/")
			 .toString();
	else if (Class512.aString5687.startsWith("i386")
		 || Class512.aString5687.startsWith("i486")
		 || Class512.aString5687.startsWith("i586")
		 || Class512.aString5687.startsWith("x86"))
	    string
		= new StringBuilder().append(string).append("x86/").toString();
	else if (Class512.aString5687.startsWith("ppc"))
	    string
		= new StringBuilder().append(string).append("ppc/").toString();
	else
	    string = new StringBuilder().append(string).append
			 ("universal/").toString();
	aString7198 = string;
    }
    
    public boolean method383() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7195.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7195.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_42_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_42_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7195.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7197.get(string);
			Class var_class_43_
			    = (Class) aHashtable7195.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_43_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_44_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_44_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_45_
					= (String) field_44_.get(object);
				    if (string_45_ != null
					&& (string_45_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_46_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_47_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_46_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_47_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_47_.invoke(object,
							      new Object[0]);
					    field_46_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_47_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_46_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_44_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7195 = hashtable;
	return aHashtable7195.isEmpty();
    }
    
    public int method8925(String string, boolean bool) throws Exception_Sub1 {
	if (aHashtable7197.containsKey(string))
	    return 100;
	String string_48_ = null;
	Object object = null;
	String string_49_;
	if (bool) {
	    string_48_ = string;
	    string_49_ = string;
	} else {
	    string_49_ = Class601.method9897(string, 1560612708);
	    if (string_49_ == null)
		throw new Exception_Sub1(1, string);
	    if (string_48_ == null) {
		string_48_ = new StringBuilder().append(aString7198).append
				 (string_49_).toString();
		if (null == aClass458_7196
		    || !aClass458_7196.method7473(string_48_, "", 1630249875))
		    throw new Exception_Sub1(2, string);
	    }
	}
	if (!aClass458_7196.method7486(string_48_, 1143615041))
	    return aClass458_7196.method7499(string_48_, -1630732064);
	byte[] is = aClass458_7196.method7495(string_48_, "", 663370756);
	if (is == null)
	    throw new Exception_Sub1(3, string);
	Object object_50_ = null;
	File file;
	try {
	    file = Class689_Sub2_Sub1.method18590(string_49_, (byte) 20);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub1(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub1(5, string);
	boolean bool_51_ = true;
	byte[] is_52_ = Class646.method10692(file, (byte) 63);
	if (null != is_52_ && is_52_.length == is.length) {
	    for (int i = 0; i < is_52_.length; i++) {
		if (is_52_[i] != is[i]) {
		    bool_51_ = false;
		    break;
		}
	    }
	} else
	    bool_51_ = false;
	if (!bool_51_) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(6, string, throwable);
	    }
	}
	method8918(string, file, -661658926);
	return 100;
    }
    
    void method8926(String string, File file) {
	aHashtable7197.put(string, file);
    }
    
    public int method8927(String string, boolean bool) throws Exception_Sub1 {
	if (aHashtable7197.containsKey(string))
	    return 100;
	String string_53_ = null;
	Object object = null;
	String string_54_;
	if (bool) {
	    string_53_ = string;
	    string_54_ = string;
	} else {
	    string_54_ = Class601.method9897(string, 1560612708);
	    if (string_54_ == null)
		throw new Exception_Sub1(1, string);
	    if (string_53_ == null) {
		string_53_ = new StringBuilder().append(aString7198).append
				 (string_54_).toString();
		if (null == aClass458_7196
		    || !aClass458_7196.method7473(string_53_, "", 1337375965))
		    throw new Exception_Sub1(2, string);
	    }
	}
	if (!aClass458_7196.method7486(string_53_, 1533160692))
	    return aClass458_7196.method7499(string_53_, -1793846470);
	byte[] is = aClass458_7196.method7495(string_53_, "", 146270707);
	if (is == null)
	    throw new Exception_Sub1(3, string);
	Object object_55_ = null;
	File file;
	try {
	    file = Class689_Sub2_Sub1.method18590(string_54_, (byte) 31);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub1(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub1(5, string);
	boolean bool_56_ = true;
	byte[] is_57_ = Class646.method10692(file, (byte) 63);
	if (null != is_57_ && is_57_.length == is.length) {
	    for (int i = 0; i < is_57_.length; i++) {
		if (is_57_[i] != is[i]) {
		    bool_56_ = false;
		    break;
		}
	    }
	} else
	    bool_56_ = false;
	if (!bool_56_) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(6, string, throwable);
	    }
	}
	method8918(string, file, -661658926);
	return 100;
    }
    
    public void method387(String string) throws Exception_Sub2 {
	method8916(string, com.jagex.Class545.class, 2127536659);
    }
    
    public static void method8928(float[] fs, int[] is, int i, int i_58_,
				  byte i_59_) {
	if (i < i_58_) {
	    int i_60_ = (i_58_ + i) / 2;
	    int i_61_ = i;
	    float f = fs[i_60_];
	    fs[i_60_] = fs[i_58_];
	    fs[i_58_] = f;
	    int i_62_ = is[i_60_];
	    is[i_60_] = is[i_58_];
	    is[i_58_] = i_62_;
	    for (int i_63_ = i; i_63_ < i_58_; i_63_++) {
		if (fs[i_63_] > f) {
		    float f_64_ = fs[i_63_];
		    fs[i_63_] = fs[i_61_];
		    fs[i_61_] = f_64_;
		    int i_65_ = is[i_63_];
		    is[i_63_] = is[i_61_];
		    is[i_61_++] = i_65_;
		}
	    }
	    fs[i_58_] = fs[i_61_];
	    fs[i_61_] = f;
	    is[i_58_] = is[i_61_];
	    is[i_61_] = i_62_;
	    method8928(fs, is, i, i_61_ - 1, (byte) -124);
	    method8928(fs, is, 1 + i_61_, i_58_, (byte) -118);
	}
    }
    
    static final void method8929(Class683 class683, int i) {
	Class524 class524
	    = class683.aClass656_Sub1_Sub3_Sub1_8654.method18616(-420974860);
	if (class524 == null)
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= "";
	else
	    class683.anObjectArray8636
		[(class683.anInt8644 += 1285561025) * 1373599041 - 1]
		= class524.method8734(1154625118);
    }
    
    static final void method8930(Class683 class683, byte i) {
	if (Class695.aBool8757 && null != Class96.aFrame1186)
	    Class332_Sub1.method15672(Class198_Sub13.aClass525_Sub30_9973
					  .aClass696_Sub41_10704
					  .method17337(-281374938),
				      -1, -1, false, (byte) 61);
    }
}
