public class Main {
    public static void main(String[] args) {

        SmartphonePrice producerSmartPhone =  new SmartphonePrice(" Samsung ", 82.0);
        SmartphonePrice producerSmartPhone2 = new SmartphonePrice(" Xiaomi ", 70.2);

        /*_______________________________________*/

        SmartphonePrice retailSmartPhone1 = new SmartphonePrice(" Iphone ", 200.50);

        SmartphonePrice retailSmartPhone2 = new SmartphonePrice(" Redmi ", 99);

        Smartphone phone1 = new Smartphone("OneNote ", "OneNote plus ", 43 , retailSmartPhone1 , producerSmartPhone);
        Smartphone phone2 = new Smartphone("TwoNote ", "TwoNote plus ", 50 , retailSmartPhone2 , producerSmartPhone2);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());

        if (producerSmartPhone.equals(producerSmartPhone2)) {
            System.out.println("This is the only like this ");
        } else {
            System.out.println("It's a clone ");
        }
        boolean result = phone1.equals(phone2);
        System.out.println("They are equal? " + result);

        try {
            Smartphone clonedSmartphone2 = phone1.clone();
            clonedSmartphone2.brandName = "SmartNameBrand ";
        } catch (Exception exception) {

            exception.printStackTrace();
            System.out.println("Error ");
        }

        //boolean result = phone1.equals(p)



    }
}
