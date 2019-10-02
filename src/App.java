import ar.com.ada.collision.subclass.ElectricalVehicle;
import ar.com.ada.collision.subclass.SportsVehicle;
import ar.com.ada.collision.subclass.Truck;
import ar.com.ada.collision.superclass.Vehicle;

public class App {
    public static void main(String[] args) {
//        Vehicle vehiculo1 = new Vehicle("Puegeot", "Zaraza", 2001);
//        Vehicle vehiculoElectrico1 = new ElectricalVehicle("Peugeot", "Zaraza2", 2020, 500);
//        Vehicle vehiculoDeportivo = new SportsVehicle("Renault", "Zaraza3", 2020, 300);
//        Vehicle camion1 = new Truck("Renault2", "zaraza3", 2000, 600);
//
//        System.out.println(vehiculo1.technicalSheet());
//        System.out.println(vehiculoElectrico1.technicalSheet());
//        System.out.println(vehiculoDeportivo.technicalSheet());
//        System.out.println(camion1.technicalSheet());

        Vehicle[] arrayDeVehiculos = new Vehicle[12];
        arrayDeVehiculos[0] = new Vehicle("Ford", "Ka", 2005 );
        arrayDeVehiculos[1] = new Vehicle("Ferrari", "Zaraza", 2019 );
        arrayDeVehiculos[2] = new Vehicle("Peugeot", "207", 2018 );
        arrayDeVehiculos[3] = new ElectricalVehicle("Tesla", "Model 3", 2000, 120);
        arrayDeVehiculos[4] = new ElectricalVehicle("Audi", "e-tron", 2018, 130);
        arrayDeVehiculos[5] = new ElectricalVehicle("Jaguar", "I-PACE", 2017, 150);
        arrayDeVehiculos[6] = new SportsVehicle("Ferrari", "Testarossa", 2018, 6000);
        arrayDeVehiculos[7] = new SportsVehicle("Chevrolet", "Camaro", 2016, 40);
        arrayDeVehiculos[8] = new SportsVehicle("Ford", "Mustang", 2019, 500);
        arrayDeVehiculos[9] = new Truck("Mercedes-Benz", "Axor 2541", 2018, 225);
        arrayDeVehiculos[10] = new Truck("Iveco", "2000", 2014, 50);
        arrayDeVehiculos[11] = new Truck("Scania", "XT", 2018, 600);

        for (int i = 0; i < arrayDeVehiculos.length; i++){
            System.out.println("Vehículo" + " " + (i+1));
            System.out.println(arrayDeVehiculos[i].technicalSheet());
        }




    }

}
