/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class126
{
    int anInt1469;
    
    void method2231() {
	OpenGL.glEndList();
    }
    
    void method2232() {
	OpenGL.glEndList();
    }
    
    void method2233(int i) {
	OpenGL.glNewList(anInt1469 + i, 4864);
    }
    
    void method2234(char c) {
	OpenGL.glCallList(anInt1469 + c);
    }
    
    void method2235(int i) {
	OpenGL.glNewList(anInt1469 + i, 4864);
    }
    
    void method2236(int i) {
	OpenGL.glNewList(anInt1469 + i, 4864);
    }
    
    Class126(Class182_Sub3 class182_sub3, int i) {
	anInt1469 = OpenGL.glGenLists(i);
    }
    
    void method2237(int i) {
	OpenGL.glNewList(anInt1469 + i, 4864);
    }
    
    void method2238() {
	OpenGL.glEndList();
    }
}
