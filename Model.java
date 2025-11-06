import java.util.Scanner;

public class Model {

    @Override
public String toString() {
    return "Car: " + _CarType +  + " " + _Make + 
           "\nSpecs: " + _Specifications;
}
// Above is toString method to print out the car details (Figure out how it works)
    // original full constructor (keeps your existing signature)
 
    //! Overloaded constructors for flexibility
    public Model() {
        this._CarType = "";
        this._Specifications = "";
        this._Make = "";
        this._PreMake = "";
    }


    public Model(String CarType, String specifications, String make, String preMake) {
        this._CarType = CarType;
        this._Specifications = specifications;
        this._Make = make; 
        this._PreMake = preMake;
    }
    public Model(String CarType, String specifications, String make) {
        this();
        this._CarType = CarType;
        this._Specifications = specifications;
        this._Make = make;
    }
    public Model(String CarType, String specifications) {
        this();
        this._CarType = CarType;
        this._Specifications = specifications;
    }
    public Model(String CarType) {
        this();           // calls the no-arg constructor that sets fields to ""
        this._CarType = CarType;
    }
   
    //! End of overloaded constructors, now enums
    
   
  
    
    public enum Specifications  {
        Engine, Transmission, FuelType, Color, Interior, Mileage, Price, Features, Warranty

    }

 

    public enum SUVmakes{
        RAV4, Highlander, _4Runner, Escape, Expedition, CR_V, Pilot, HR_V, Tucson, SantaFe, CX_5, CX_9, Q5, Q7, X3, X5, GLC, GLE, Tiguan, Atlas;

        @Override
        public String toString() {
            switch (this) {
                case _4Runner: return "4Runner";
                case CR_V: return "CR-V";
                case HR_V: return "HR-V";
                case CX_5: return "CX-5";
                case CX_9: return "CX-9";
                case Q5: return "Q5";
                case Q7: return "Q7";
                case X3: return "X3";
                case X5: return "X5";
                case GLC: return "GLC";
                case GLE: return "GLE";
                case Tiguan: return "Tiguan";
                case Atlas: return "Atlas";
                default: return name();
            }
        }
    }

// you could create a if statment like: if the make is ..... and the car tpye is .... car spepfications are .....
    private String _CarType = "";
    private String _Specifications = "";
    private String _PreMake = "";
    private String _Make = "";
public void set_CarType(String CarType) {
   _CarType = CarType;
}
public String get_CarType() {
  return _CarType;
  
  }
  


public void set_Specifications(String Specifications) {
    _Specifications = Specifications;
}

public String get_Specifications() {
    
        return _Specifications;
}

public void set_PreMake(String PreMake) {
    _PreMake = PreMake;
}

public String get_PreMake() {
 return _PreMake;

}

public void set_Make(String Make) {
    _Make = Make;
}

public String get_Make() {
    return _Make;
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
   
   
   
   
   
   
   
   



//! Trying some new stuff

    /*  
     public Model(String carType, String brand, String specifications) {
        this._CarType = carType;
        this._Brand = brand;
        this._Specifications = specifications;
        this.Continue = "";
        this.Make = "";
        this.PreMake = carType + " " + brand;

     }
    */





