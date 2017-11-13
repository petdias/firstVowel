package net.app.base;

public class VowelNotFoundException extends Exception {

    public VowelNotFoundException() {
        super("Nenhuma vogal seguida de consoante seguida de vogal foi encontrada");
    }
}
