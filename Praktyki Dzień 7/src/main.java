public class main {
    public static void main(String[] args) {
        //
        // ZADANIE 1
        //
        System.out.println("");
        System.out.println("ZADANIE 1");
        System.out.println("");
        Pies pies = new Pies();
        pies.wiek();
        pies.wydajDzwiek();
        pies.sen();
        pies.rozciąganie();
        //
        // ZADANIE 2
        //
        System.out.println("");
        System.out.println("ZADANIE 2");
        System.out.println("");
        samochod samochod = new samochod();
        System.out.println("Jest awaria? = " + samochod.awaria());
        samochod.jazdaDoPrzodu();
        samochod.skrecwLewo();
        samochod.skrecwPrawo();
        samochod.stop();
        //
        // ZADANIE 3
        //
        System.out.println("");
        System.out.println("ZADANIE 3");
        System.out.println("");
        podajRocznikWina podajRocznikWina = new podajRocznikWina();
        podajRocznikWina.gotowanie();
        podajRocznikWina.nalewanie();
        podajRocznikWina.rocznik();
        podajRocznikWina.butelkowanie();
        podajRocznikWina.spozycie();
        //
        // ZADANIE 4
        //
        System.out.println("");
        System.out.println("ZADANIE 4");
        System.out.println("");
        pies.slodziak();
        pies.zabawa();
        //
        // ZADANIE 5
        //
        System.out.println("");
        System.out.println("ZADANIE 5");
        System.out.println("");
        Kwadrat kwadrat = new Kwadrat(6);
        System.out.println("Obwód kwadratu = "+kwadrat.obliczObwod()+"\n"+"Pole kwadratu = "+kwadrat.obliczPole());
    }
}
