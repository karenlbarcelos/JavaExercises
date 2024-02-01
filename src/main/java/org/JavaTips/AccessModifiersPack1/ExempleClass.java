package org.JavaTips.AccessModifiersPack1;

public class ExempleClass {

    public void publicMethod() {}
    protected void protectedMethod() {}
    private void privateMethod() {}
    void defaultMethod() {}

    public static void main(String[] args) {

        ExempleClass exempleClass = new ExempleClass();

        // dentro da classe podem ser usados todos os metodos
        exempleClass.publicMethod();
        exempleClass.protectedMethod();  //disponivel para o mesmo pacote e para outras classe se esta for estendidas
        exempleClass.privateMethod();
        exempleClass.defaultMethod();    //disponivel nesta classe e no mesmo pacote
    }
}
