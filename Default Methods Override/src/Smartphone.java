import java.util.Objects;

public class Smartphone implements Cloneable {

    String brandName;
    String modelName;
    int batterymAh;

    SmartphonePrice producerPrice ;
    SmartphonePrice retailPrice;


    @Override
    public String toString() {
        return (brandName + modelName + batterymAh + retailPrice + producerPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = producerPrice;
        this.batterymAh = batterymAh;
        this.modelName = modelName;
        this.brandName = brandName;
        clonedSmartphone.retailPrice = null;
        return clonedSmartphone;
    }

    public  Smartphone(String brandName, String model, int batteryAh, SmartphonePrice prodP, SmartphonePrice retailP){

        this.brandName = brandName;
        this.modelName = model;
        this.batterymAh = batteryAh;
        this.producerPrice = prodP;
        this.retailPrice = retailP;

    }
}

