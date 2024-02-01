package org.JavaTips.Equals;

import java.util.Objects;

class Client {
    private int id;

    public Client(int id){
        super();
        this.id = id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null) return false;
        if(getClass() != that.getClass()) return false;
        Client other = (Client) that;
        if (id != other.id) return false;

        return true;
    }

    // este metodo distribui os objetos uniformemente entre os diferentes "buckets" (onde os valores sao armazenados)
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
}

public class EqualsRunner {

    public static void main(String[] args) {

        Client c1 = new Client(1);
        Client c2 = new Client(1);
        Client c3 = new Client(2);

        //equal compara apenas o mesmo objeto
        System.out.println(c1.equals(c2));  //return *false* before equal method overrided

        System.out.println(c1.equals(c3));  //return true
    }
}
