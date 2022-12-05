import java.util.Objects;

public class SmartphonePrice implements  Cloneable {

    String priceType;
    double priceInEuros;

    @Override
    public Object clone() throws CloneNotSupportedException {
       SmartphonePrice clonedSmartPhonePrice = (SmartphonePrice) super.clone();


       return clonedSmartPhonePrice;
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType=" + priceType +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return priceType == that.priceType && priceInEuros == that.priceInEuros;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }


    public SmartphonePrice(String type, double price){

        priceType = type;
        priceInEuros = price;



    }

}

