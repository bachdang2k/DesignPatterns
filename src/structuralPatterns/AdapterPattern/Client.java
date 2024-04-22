package structuralPatterns.AdapterPattern;

public class Client {

    public static void main(String[] args) {
        VietnameseTarget cli = new TranslatorAdapter(new EnglishAdaptee());
        cli.send("Xin chao");
    }

}
