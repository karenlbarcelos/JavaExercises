package org.JavaTips.AccessModifiersPack2.AccessModifiersPack1;

public class ExempleClass {

    public void publicMethod() {}
    protected void protectedMethod() {}
    private void privateMethod() {}
    void defaultMethod() {}

    public static void main(String[] args) {

        ExempleClass exempleClass = new ExempleClass();

        // dentro da classe podem ser usados todos os metodos
        exempleClass.publicMethod();
        exempleClass.protectedMethod();
        exempleClass.privateMethod();
        exempleClass.defaultMethod();
    }
}
