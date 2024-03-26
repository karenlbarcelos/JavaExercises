package org.HashMap;

public class HashMap {

    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];
    }

    public int hash(String key){

        int hashCode = 0;
        for(int i = 0; i < key.length(); i++){
            hashCode = hashCode + Character.codePointAt(key, i);
        }

        return hashCode;
    }

    public static void main(String[] args) {

        HashMap newHashMap = new HashMap(3);
        System.out.println(newHashMap.hash("c")); // => 99
        System.out.println(newHashMap.hash("ca")); // => 196
        System.out.println(newHashMap.hash("car"));
        System.out.println(newHashMap.hash("cara"));
    }
}
