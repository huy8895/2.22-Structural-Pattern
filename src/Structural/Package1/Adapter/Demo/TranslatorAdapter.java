package Structural.Package1.Adapter.Demo;

public class TranslatorAdapter implements VietnameseTarget{

    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading words...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        adaptee.receive(vietnameseWords);

    }

    private String translate(String vietnameseWords){
        System.out.println("Translated!");
        return "こんにちは";
    }
}
