import java.util.Random;

public class Ejemplo3 {

    public static void main(String[] args) {

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double rand = Math.random();
        System.out.println("rand = " + rand);

        rand *= colores.length;
        System.out.println("rand = " + rand);

        rand = Math.floor(rand);
        System.out.println("rand = " + rand);

        System.out.println("Colores = " + colores[(int) rand]);

        Random randObj = new Random();
        int randInt = randObj.nextInt(1,7); //Aleatorio rango específico entre 1 y 7
        //int randInt = 15 + randObj.nextInt(25-15); //Aleatorio partiendo desde 15 hasta 25
        System.out.println("randInt = " + randInt);

        randInt = randObj.nextInt(colores.length);
        System.out.println("Aleatorio entre 0 y 5 = " + randInt);
        System.out.println("Colores2 = " + colores[randInt]);


    }

}