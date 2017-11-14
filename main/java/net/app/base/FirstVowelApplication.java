package net.app.base;

public class FirstVowelApplication {

    public static void main(String[] args) throws VowelNotFoundException {
        VowelService v = new VowelService();
        try {
            System.out.println("Resultado --> " + v.getFirstVowel("aAbBABacafe"));
        } catch (Exception e) {
            throw new VowelNotFoundException();
        }
    }
}
