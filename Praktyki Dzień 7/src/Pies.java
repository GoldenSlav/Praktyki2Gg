public class Pies extends Zwierze implements ZwierzeDomowe{

    @Override
    public int wiek() {
        return 5;
    }

    @Override
    public void wydajDzwiek() { System.out.println("Hau! Hau!"); }

    @Override
    public void slodziak() {
        System.out.println("*pies zwija się w kulkę i kładzie się obok*");
    }

    @Override
    public void zabawa() { System.out.println("Hau! Rzuć piłke! Hau!"); }
}
