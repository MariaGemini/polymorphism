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

    // @Override
    //   public int technicalSheet(){
    //     return x;

    //}

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
                "Marca: " + brand +
                ", Modelo:'" + model +
                ", Año:=" + year +
                "Carga Max: " + maxLoad;

    }

}
