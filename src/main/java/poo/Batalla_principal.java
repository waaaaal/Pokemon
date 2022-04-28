package poo;

import java.util.Scanner;

public class Batalla_principal {

    private static int turno = 0;
    private static Scanner sc;
    private static int pok_act1;
    private static int pok_act2; // numero de pokemon

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("//////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////");
        System.out.println("        Bienvenido al juego pokemon    ");
        System.out.println("//////////////////////////////////////////");
        System.out.println("//////////////////////////////////////////");
        System.out.println(" ");
        System.out.println("");

        int opcion2; //Guardaremos la opcion del usuario
        do {
            System.out.println("1. Opcion 1 es ver tus pokemons");
            System.out.println("2. ");

            System.out.println("0. para salir");
            opcion2 = sc.nextInt();
            switch (opcion2) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    mostrarpokemons();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;

            }
        } while (opcion2 != 0);

        System.out.println("Es el turno del jugador 1");
        System.out.println("seleccione su opción de juego;");
        System.out.println("                               ");

        int opcion; //Guardaremos la opcion del usuario
        do {
            System.out.println("1. Opcion 1 es cambiar de turno de jugador");
            System.out.println("2. atacar");
            System.out.println("3. ver como vamos en la batalla");
            System.out.println("4. imprimir mi turno actual de batalla");
            System.out.println("0. para salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    cambiar_turno();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                   
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    mostrarpokemons();
                    break;

            }
        } while (opcion != 0);

        /*
        array normal
        int [] mi_tal=new int[5];
        mi_tal[0]=1;
         
        //Creamos un array de objetos de la clase empleados
        Empleado arrayObjetos[]=new Empleado[3];
 
        //Creamos objetos en cada posicion
        arrayObjetos[0]=new Empleado("Fernando", "Ureña", 23, 1000);
        arrayObjetos[1]=new Empleado("Epi", "Dermis", 30, 1500);
        arrayObjetos[2]=new Empleado("Blas", "Femia", 25, 1200);
        
         */
        // por polimorfismo hacemos un pokemon agua y sacamos de 
        //la clase tipo. new es llamar al constructor de esa clase
        /*Pokemon[] array1pokemon = new Pokemon[2];
        array1pokemon[0] = new P_Agua(1, 2, true);
        array1pokemon[1] = new P_Tierra(1, 3, true);
        array1pokemon[2] = new P_Fuego(1, 4, true);

        Pokemon[] array2pokemon = new Pokemon[2];
        array1pokemon[0] = new P_Agua(1, 3, true);
        array1pokemon[1] = new P_Tierra(1, 4, true);
        array1pokemon[2] = new P_Fuego(1, 4, true);

        /*
        Pokemon[] arraypokemon1 = {
            new P_Agua(1, 1, true), // esto es igual que meter en 0 o 1 o 2
            new P_Agua(1, 1, true)
        };
         */
    }

    public static void cambiar_turno() {
        //turno por defecto es 0 que es el jugador 1

        if (turno == 0) {
            turno = 1;
            System.out.println("tu turno es " + turno);
        } else {
            turno = 0;
            System.out.println("tu turno es " + turno);
        }

    }

    static void batalla_ataque(Pokemon p1, Pokemon p2) {

        if (turno == 0) {

            p1.atacar(p2);

        } else {
            p2.atacar(p1);
        }

    }

    static void ver_status_batalla(Pokemon p1, Pokemon p2) {

        System.out.println(" pokemon1 ");
        System.out.println(" " + p1.getFuerza() + p1.getPh() + p1.isEstado());
        System.out.println(" pokemon2 ");
        System.out.println(" " + p1.getFuerza() + p2.getPh() + p2.isEstado());

    }

    static void imprimir_turno_jugador() {

        System.out.println(" el turno actual es " + turno);
    }

    static void esperar() {

    }

    public static void Menu() {

    }

    static void mostrarpokemons() {
           
        
        if(turno==0){
            
        
        
        for (int i = 0; i < teamj1.length; i++) {
                System.out.println(" pokemons del equipo 1 son " +teamj1[i].getTipo_pokemon() +"   " +teamj1[i].getFuerza() +"    " +teamj1[i].isEstado());
        }
        } else {
            
           for (int i = 0; i < teamj2.length; i++) {
                System.out.println(" pokemons del equipo 2 son " +teamj2[i].getFuerza() +teamj2[i].isEstado());
        }  
            
            
        }
        
        
        
        
        
        
    }

    static Pokemon p1_j1 = new P_Fuego(400, 150, true);
    static Pokemon p1_j2 = new P_Agua(400, 130, true);
    static Pokemon p1_j3 = new P_Fuego(322, 120, true);
    static Pokemon teamj1[] = new Pokemon[]{p1_j1, p1_j2, p1_j3};

    static Pokemon p2_j1 = new P_Fuego(400, 120, true);
    static Pokemon p2_j2 = new P_Agua(210, 125, true);
    static Pokemon p2_j3 = new P_Tierra(400, 120, true);
    static Pokemon teamj2[] = new Pokemon[]{p2_j1, p2_j2, p2_j3};

}
