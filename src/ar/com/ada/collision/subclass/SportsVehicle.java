package ar.com.ada.collision.subclass;
import ar.com.ada.collision.superclass.Vehicle;
import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm;

    public SportsVehicle() {
    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    @Override
    public String technicalSheet() {
        if (rpm < 50) {
            String mensaje = "El auto es muy bonito, pero sólo sirve para ir a pasear";
        } else if (rpm < 300) {
            String mensaje = "Con este auto puede desafiar a cualquiera en la pista";
        } else if (rpm < 600) {
            String mensaje = "si tienes este auto, debe considerar participar en NASCAR";
        } else if (rpm > 600) {
            String mensaje = "¿Eres parte del elenco de Rápidos y Furiosos?";
        }
        return this.toString() ;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vehicle)) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return this.rpm.equals(that.rpm) &&
                super.equals(that);
    }


    @Override
    public int hashCode(){
        return -30 * Objects.hash(this.brand, this.model, this.year, this.rpm);
    }


        @Override
        public String toString() {
            return "Vehículo Deportivo "+
                    "Marca: " + brand + '\'' +
                    ", Modelo:'" + model + '\'' +
                    ", Año:=" + year;
        }

}
