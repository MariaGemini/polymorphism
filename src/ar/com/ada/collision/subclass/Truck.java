package ar.com.ada.collision.subclass;
import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    public Truck(){
    }

    public Truck(Integer maxLoad){
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad){
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }

    public void setMaxLoad(Integer maxLoad){
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad(){
        return maxLoad;
    }

    @Override
    public String technicalSheet() {
        String mensaje = " ";
        if ( maxLoad <= 100 ) {
            mensaje = "Para iniciar un negocio de flete, está muy bien este auto";
        } else {
            mensaje = "Tienes que usar este auto en el campo, es una máquina de trabajo!";
        }
        return this.toString() + '\n' + mensaje;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vehicle)) return false;
        Truck that = (Truck) obj;
        return this.maxLoad.equals(that.maxLoad) &&
                super.equals(that);
    }

    @Override
    public int hashCode(){
        return -30 * Objects.hash(this.brand, this.model, this.year, this.maxLoad);
    }

    @Override
    public String toString() {
        return "Camión "+
                " Marca: " + this.brand +
                " Modelo: " + this.model +
                " Año: " + this.year +
                " Carga Max: " + this.maxLoad;

    }

}
