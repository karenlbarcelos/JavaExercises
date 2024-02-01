package org.JavaTips.AccessModifiersPack1;

public class MethodAccessModifiersInsideSamePackage {

    public static void main(String[] args) {

        ExempleClass exempleClass = new ExempleClass();

        // fora da classe podem ser usados todos os metodos com excessao do private
        exempleClass.publicMethod();
        exempleClass.protectedMethod();
        //exempleClass.privateMethod();
        exempleClass.defaultMethod();
    }

}
