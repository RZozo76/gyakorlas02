package hu.helixlab;

public class Main {

    public static void main(String[] args) {
        /*Deklaráltam egy int típusú változót.
    	Tekintetel arra, hogy a feladatban megadott output adatokból kiderül, hogy ez a téglalap egy négyzet, így elég egy változó.
    	  Majd ezzel az értékkel inicializáltam a terület és kerület eredményét adó area és perimeter változót és az eredmény kiírattam a konzolra.*/
        int side = 4;
        int area = side * side;
        int perimeter = 4 * side;

        System.out.println("A téglalap területe: " + area + " cm^2");
        System.out.println("A téglalap kerülete: " + perimeter + " cm");
    }
    }
