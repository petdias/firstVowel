package net.app.base;

public class FirstVowelApplication {

    public static void main(String[] args) {
        VowelService v = new VowelService();

        System.out.println("Resultado --> " + v.getFirstVowel("aAbBABacafe"));
    }
}
