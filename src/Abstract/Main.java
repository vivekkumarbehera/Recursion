package Abstract;

public class Main  {
    public static void main(String[] args) {
        Son s = new Son(23);
        s.carrer();
        s.Partner();

        Daughter d = new Daughter(12);
        d.carrer();
        d.Partner();
    }
}
