package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency){
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency){
        super(brand, model, year);
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }


    @Override
    public String technicalSheet(){
        String mensaje;
        if(year < 2007){
            mensaje = "No existe modelo para este año";
        } else mensaje = "Es un auto de última tecnología!";
        return mensaje + this.toString();

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vehicle)) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return this.potency.equals(that.potency) &&
                super.equals(that);
    }


    @Override
    public int hashCode(){
        return -30 * Objects.hash(this.brand, this.model, this.year, this.potency);
    }


    @Override
    public String toString() {
        return "Vehículo Deportivo "+
                "Marca: " + this.brand +
                "Modelo: " + this.model +
                "Año:" + this.year +
                "Potencia: " + this.potency;
    }

}
