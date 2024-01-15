package org.ExcepcionalHandling;

public class ExcepcionalHandlingRunner2 {

    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        try {
//            String str = null;
//            str.length();

            int[] i = {1,2};
            int number = i[3];

            System.out.println("Method2 Ended");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Matched ArrayIndex...etc");
            ex.printStackTrace();//faz com que tod0 rastreamento da pilha (StackTrace) para saida
        }catch (NullPointerException ex) {
            System.out.println("Matched NullpointerExcepcion");
            ex.printStackTrace();//faz com que tod0 rastreamento da pilha (StackTrace) para saida
        } catch (Exception ex) {
            System.out.println("Matched Excepcion");
            ex.printStackTrace();//faz com que tod0 rastreamento da pilha (StackTrace) para saida
        }
    }
}
