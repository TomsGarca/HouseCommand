import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Light light = new Light();
        Door door = new Door();

        DoorClCommand CLOSE = new DoorClCommand(door);
        DoorOpCommand OPEN = new DoorOpCommand(door);

        LightOffCommand OFF = new LightOffCommand(light);
        LightOnCommand ON = new LightOnCommand(light);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Abrir la puerta");
            System.out.println("2. Cerrar la puerta");
            System.out.println("3. Encender las luces");
            System.out.println("4. Apagar las luces");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("...");
                        OPEN.execute();
                        break;
                    case 2:
                        System.out.println("...");
                        CLOSE.execute();
                        break;
                    case 3:
                        System.out.println("...");
                        ON.execute();
                        break;
                    case 4:
                        System.out.println("...");
                        OFF.execute();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        sn.close();
        
    }
}
