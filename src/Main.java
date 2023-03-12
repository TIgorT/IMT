public class Main {
    public static void main(String[] args) {
        bodyMassIndex service = new bodyMassIndex();
        int index = service.calculation( 98, 1.87);
        System.out.println("Индекс массы тела: " + index);
    }
}