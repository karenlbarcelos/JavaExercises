package org.JavaTips.AccessModifiersPack2.AccessModifiersPack1;

import org.JavaTips.AccessModifiersPack1.ExempleClass;

public class MethodAccessModifiersOutsidePackage {

    public static void main(String[] args) {

        org.JavaTips.AccessModifiersPack1.ExempleClass exempleClass = new ExempleClass();

        // fora da classe pode ser usado apenas o metodo public
        exempleClass.publicMethod();
        //exempleClass.protectedMethod();
        //exempleClass.privateMethod();
        //exempleClass.defaultMethod();
    }

}
