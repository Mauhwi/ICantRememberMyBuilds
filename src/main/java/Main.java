import model.eso.Classes;
import model.eso.Esochar;

public class Main {
    public static void main(String[] args) {
        Esochar firstchar = new Esochar();
        firstchar.setCharClass(Classes.Shadow);
        System.out.println(firstchar.getCharClass() + " " + firstchar.getCharClass().getImagePath());
    }
}
