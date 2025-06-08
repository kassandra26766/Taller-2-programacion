import java.util.Scanner;

public class vuelos {
     public static void main(String[] args) throws Exception
      {


/* 
Establezca el número de asientos disponibles en un avión: //10 asientos disponibles.
Cancelaciones validas solo si se hacen en menos de 48 horas.
Máximo 3 maletas permitidas con un peso de 23 kg.
*/

 Scanner dato = new Scanner (System.in);
int asientosDisponibles =10;
int cancelaciones =2;
int horasAnticipacion;
int maletas =3;
int peso =23; 

// Asientos 
System.out.print("Ingrese el número de asientos: ");
int asientos =dato.nextInt();

if (asientos <= 0) {
 System.out.println("Debe ingresar al menos 1 asiento.");
        } else if (asientos > asientosDisponibles) {
            System.out.println("No hay suficientes asientos disponibles.");
        } else {
            asientosDisponibles -= asientos;
            System.out.println("Asientos restantes: " + asientosDisponibles);

        } 
      
        // Cancelaciones
        System.out.print("¿Con cuántas horas de anticipación desea cancelar?: ");
        horasAnticipacion = dato.nextInt();

        if (horasAnticipacion >= 48) {
            System.out.println("Cancelación válida. Reserva anulada.");
            asientosDisponibles +=10 ;
        } else {
            System.out.println("No es posible cancelar con menos de 48 horas de anticipación.");
        }

 // Equipaje
        System.out.print("Ingrese la cantidad de maletas: ");
        maletas = dato.nextInt();

        if (maletas > 3) {
            System.out.println("Exceso de maletas. Solo se permiten 3.");
        } else {
            System.out.print("Ingrese el peso total del equipaje (kg): ");
            peso = dato.nextInt();

            if (peso> 23) {
                System.out.println("Equipaje excede el peso máximo permitido de 23 kg.");
            } else {
                System.out.println("Equipaje aceptado. ¡Buen viaje!");
            }
        }

        dato.close();
    }
}



     

  

