public class Main {
    public static void main(String[] args) {

        Taschenrechner_Backend calculator = new Taschenrechner_Backend();

                double result = calculator.add(3,5);
                System.out.println("Das Ergebnis ist: "+result);

                result = calculator.subtract( 4,3.5);
                System.out.println("Das Ergebnis ist: "+result);
    }
}