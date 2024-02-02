package org.JavaTips.StaticVariable;

class Player{

    private String name;
    private static int count;

    public Player(String name){
        super();
        this.name = name;
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class StaticVariable {

    public static void main(String[] args) {

        //static - torna a variável compartilhável entre várias instâncias.
        Player player1 = new Player("Messi");
        Player player2 = new Player("Ronaldo");

        System.out.println(player1.getCount());
        System.out.println(player2.getCount());
    }
}
