import java.util.Scanner;

public class Model {

    public enum CarType {
        Sedan, Truck, SUV, Coupe, Convertible, Wagon, Minivan, Hatchback
    }
    
    public enum Make {
    Ford, Chevrolet, Toyota, Honda, Nissan, BMW, Mercedes, Audi, Volkswagen, Hyundai, Kia
   }
    
    public enum Specifications  {
        Engine, Transmission, FuelType, Color, Interior, Mileage, Price, Features, Warranty

    }

    private String _CarType = "";
    private String _Make = "";
    private String _Specifications = "";
 

public void set_CarType(String CarType) {
   _CarType = CarType;
}
public String get_CarType() {
  return _CarType;
  
  }
  
public void set_Make(String Make) {
    _Make = Make;
}

public String get_Make(){
    return _Make;
}

public void set_Specifications(String Specifications) {
    _Specifications = Specifications;
}

public String get_Specifications() {
    
        return _Specifications;
}
   



//! tried something before

    public void showCarTypes() {
        System.out.println("These are the car types available: ");
        System.out.println("Sedan, Truck, SUV, Coupe, Convertible, Wagon, Minivan, Hatchback ");
        System.out.println("Please pick a car type: ");

        Scanner scanner = new Scanner(System.in);
        // You can add logic here to read user input if needed
    }
}




//! Some Foreign Solution ion know, figure this out either way, didn't work for list stuff yuh yuh. 
/*
      private static <T extends Enum<T>> T parseEnum(Class<T> enumClass, String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Value is required. Valid options: " + enumOptions(enumClass));
        }

        try {
            return Enum.valueOf(enumClass, value.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Invalid value '" + value + "'. Valid options: " + enumOptions(enumClass));
        }
    }

    private static <T extends Enum<T>> String enumOptions(Class<T> enumClass) {
        T[] constants = enumClass.getEnumConstants();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < constants.length; i++) {
            builder.append(constants[i].name());
            if (i < constants.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
   
*/
   
   
   
   
   
   
   
   





    





