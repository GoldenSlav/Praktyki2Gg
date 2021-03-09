public class samochod implements Pojazd{
    @Override
    public void jazdaDoPrzodu()
    {
        System.out.println("ruszam do przodu");
    }
    @Override
    public void stop()
    {
        System.out.println("Zatrzymywanie pojazdu");
    }
    @Override
    public boolean awaria()
    {
        return false;
    }

    @Override
    public void skrecwLewo() {
        System.out.println("Skręcam w lewo");

    }

    @Override
    public void skrecwPrawo() {
        System.out.println("Skręcam w prawo");

    }
}

