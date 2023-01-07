public class Ejemplo {

    public static void main(String[] args) {

        int absoluto = Math.abs(-1);
        System.out.println("absoluto = " + absoluto);
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        double redondearArriba = Math.ceil(3.5);
        System.out.println("redondear = " + redondearArriba);

        double redondearAbajo = Math.floor(3.5);
        System.out.println("redondearAbajo = " + redondearAbajo);

        long redondear = Math.round(3.49);
        System.out.println("redondear = " + redondear);

        double Pi = Math.PI;
        System.out.println("Pi = " + Pi);

    }

}