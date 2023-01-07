public class Ejemplo2 {

    public static void main(String[] args) {
        
        Double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        Double log = Math.log(10); //logaritmo natural
        System.out.println("log = " + log);

        Double pot = Math.pow(10,3);
        System.out.println("pot = " + pot);

        Double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        Double rd = 1.57;
        Double grados = Math.toDegrees(rd);
        System.out.println("Convertir " + rd+ " radianes a grados = " + grados + "°");

        Double gr = 90.00;
        Double radianes = Math.toRadians(gr);
        System.out.println("Convertir "+ gr + "° grados a radianes = " + radianes);

        //Funciones trigonométricas

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(180): " + Math.cos(radianes));

    }
}