package ar.com.ada.collision.superclass;

import java.util.Objects;

public class Vehicle {
    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet(){
     String mensaje = "Este vehículo no tiene categoría asignada";
        return brand + model + year + mensaje;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vehicle)) return false;
        Vehicle that = (Vehicle) obj;
        return this.model.equals(that.model) &&
                this.brand.equals(that.brand) &&
                this.year.equals(that.year);
    }

    @Override
    public int hashCode() {
        return -30 * Objects.hash(this.brand, this.model, this.year);
    }

    @Override
    public String toString() {
        return "Vehículo "+
                "Marca: " + brand + '\'' +
                ", Modelo:'" + model + '\'' +
                ", Año:=" + year;
    }
}
