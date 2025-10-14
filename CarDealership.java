
import java.util.Scanner;

public class CarDealership{

    public static void main(String[] args) {
    
    Model car1 = new Model();

// Start of while statement for when get_cartype is empty
while (car1.get_CarType().isEmpty()) { 
    // Decide on a car type
    System.out.println("\nThese are the car types available: "); 
    System.out.println("Sedan, Truck, SUV, Coupe, Convertible, Wagon, Minivan, Hatchback ");
    System.out.println("\nPlease pick a car type: ");

Scanner input = new Scanner(System.in);

car1.set_CarType(input.nextLine());

 // Validate the car type input (chosen is not get value anymore only to validate input in the try-catch thing)
try {
    Model.CarType chosen = Model.CarType.valueOf(car1.get_CarType().trim());
    car1.set_CarType(chosen.toString());
} catch (IllegalArgumentException e) {
    System.out.print("Invalid car type. ");
    car1.set_CarType(""); // Reset to loop again
}

} // End of While loop

System.out.println("You have chosen the car type: " + car1.get_CarType());


while(car1.get_Brand().isEmpty()){
System.out.println("\nHere are the available car brands you can pick from:");
for (Model.Brand brand : Model.Brand.values()) {
    System.out.print("- " + brand);
    System.out.print(" ");

}
System.out.println("");
System.out.println("\nPlease pick a car brand: ");
Scanner input2 = new Scanner(System.in);
car1.set_Brand(input2.nextLine());

try {
    Model.Brand chosen = Model.Brand.valueOf(car1.get_Brand().trim());
    car1.set_Brand(chosen.toString());
} catch (IllegalArgumentException e) {
    System.out.print("\nInvalid car brand. ");
    car1.set_Brand(""); // Reset to loop again
    continue;
}


System.out.println("");
System.out.println("You have chosen the car brand: " + car1.get_Brand());

}

System.out.println("\nPress Enter to continue:");
Scanner input1 = new Scanner(System.in);
input1.nextLine(); // Waits for user to press Enter


car1.set_PreMake(car1.get_CarType() + " " + car1.get_Brand()); // combining both brand and cartype to make a premake so It's more readable 

while(car1.get_CarType() != null && car1.get_Brand() != null && car1.get_Make() == null) //making sure both have a value 
{

    // CarType
    if(car1.get_Make().isEmpty()) {
    System.out.println("\nYou have selected your vehicle type to be: " + car1.get_CarType() + ", and your brand to be: " + car1.get_Brand() + ", Here are you available models for you: ");
    }


    }
switch(car1.get_CarType()) {
 

case "SUV":
switch(car1.get_Brand()) {
        
    case "Toyota":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Toyota SUV models: RAV4, Highlander, 4Runner");
            Scanner input3 = new Scanner(System.in);
            car1.set_Make(input3.nextLine());
        }
        case "Ford":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Ford SUV models: Explorer, Escape, Expedition");
            Scanner input4 = new Scanner(System.in);
            car1.set_Make(input4.nextLine());
        }
        case "Honda":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Honda SUV models: CR-V, Pilot, HR-V");
            Scanner input5 = new Scanner(System.in);
            car1.set_Make(input5.nextLine());
        }
        case "Chevrolet":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Chevrolet SUV models: Tahoe, Equinox, Traverse");
            Scanner input6 = new Scanner(System.in);
            car1.set_Make(input6.nextLine());
        }
            
        case "Nissan":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Nissan SUV models: Rogue, Murano, Pathfinder");
            Scanner input7 = new Scanner(System.in);
            car1.set_Make(input7.nextLine());
        }
        case "Hyundai":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Hyundai SUV models: Tucson, Santa Fe, Palisade");
            Scanner input8 = new Scanner(System.in);
            car1.set_Make(input8.nextLine());
        }
        ;
        case "Kia":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Kia SUV models: Sportage, Sorento, Telluride");
            Scanner input9 = new Scanner(System.in);
            car1.set_Make(input9.nextLine());
        }
        case "BMW":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available BMW SUV models: X3, X5, X7");
            Scanner input10 = new Scanner(System.in);
            car1.set_Make(input10.nextLine());
        }
            
        case "Mercedes":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Mercedes SUV models: GLC, GLE, GLS");
            Scanner input11 = new Scanner(System.in);
            car1.set_Make(input11.nextLine());
        }
            break;
        case "Audi":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Audi SUV models: Q5, Q7, Q8");
            Scanner input12 = new Scanner(System.in);
            car1.set_Make(input12.nextLine());
        }
        case "Volkswagen":
        while(car1.get_Make().isEmpty()){
            System.out.println("\nSelect one of the available Volkswagen SUV models: Tiguan, Atlas, Taos");
            Scanner input13 = new Scanner(System.in);
            car1.set_Make(input13.nextLine());
            
    
          }
        
          try{
            Model.SUVmakes chosen = Model.SUVmakes.valueOf(car1.get_Make().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("\nInvalid SUV make selected.");
                car1.set_Make(""); // Reset to loop again
            }
            break;

}
break;

case "Sedan":
while(car1.get_Make().isEmpty()){
    System.out.println("\nSedan models coming soon!");
    Scanner input14 = new Scanner(System.in);
    car1.set_Make(input14.nextLine());
}
break;
case "Truck":
while(car1.get_Make().isEmpty()){
    System.out.println("\nTruck models coming soon!");
    Scanner input15 = new Scanner(System.in);
    car1.set_Make(input15.nextLine());
}
break;
case "Coupe":
while(car1.get_Make().isEmpty()){
    System.out.println("\nCoupe models coming soon!");
    Scanner input16 = new Scanner(System.in);
    car1.set_Make(input16.nextLine());
}
break;
case "Convertible":
while(car1.get_Make().isEmpty()){
    System.out.println("\nConvertible models coming soon!");
    Scanner input17 = new Scanner(System.in);
    car1.set_Make(input17.nextLine());
}
break;
case "Wagon":
while(car1.get_Make().isEmpty()){
    System.out.println("\nWagon models coming soon!");
    Scanner input18 = new Scanner(System.in);
    car1.set_Make(input18.nextLine());
}
break;
case "Minivan":
while(car1.get_Make().isEmpty()){
    System.out.println("\nMinivan models coming soon!");
    Scanner input19 = new Scanner(System.in);
    car1.set_Make(input19.nextLine());
}
break;
case "Hatchback":
while(car1.get_Make().isEmpty()){
    System.out.println("\nHatchback models coming soon!");
    Scanner input20 = new Scanner(System.in);
    car1.set_Make(input20.nextLine());
}
break;
default:
System.out.println("Error: Invalid car type.");
break;

}



System.out.println("\nYou have selected the following car: " + car1.get_PreMake() + " " + car1.get_Make() );
System.out.println("\nHere are the specifications of your selected car: ");
System.out.println("");

    } //? Class closing bracket
}//? Main closing bracket

    











































































































































































//? Prob rubbish below 
/* 
   switch(car1.get_CarType()){
case "Sedan":
System.out.println("Testing for SUV");
break;
case "Truck":
System.out.println("Testing for SUV");
break;
case "SUV":
System.out.println("Testing for SUV");
break;
case "Coupe":
System.out.println("Testing for SUV");
break;
case "Convertible":
System.out.println("Testing for SUV");
break;
case "Wagon":
System.out.println("Testing for SUV");
break;
case "Minivan":
System.out.println("Testing for SUV");
break;
case "Hatchback":
System.out.println("Testing for zSUV");
break;
     }

Scanner input = new Scanner(System.in);














    //! trying to figure out how to coutnuie the program despite the wrong input from the user 

 //? This is first attempt of doing this. 

 /* 
 if (car1.get_CarType().isEmpty()) {
    
    String input = scanner.nextLine();
    car1.set_CarType(input);
    // setting the cartype for car1 despite the fact that input could be wrong or right 
    try {
                // check if input matches something in the enum
               
                Model.CarType chosen = Model.CarType.valueOf(input.trim().toUpperCase());
                car1.set_CarType(chosen.toString());  // store as String like your Model class
                


            } catch (IllegalArgumentException e) {
                
                car1.set_CarType(null);
                System.out.println("Invalid car type. Please choose from the list: "); //Catch the illegal argument 
                for (Model.CarType type : Model.CarType.values()) { //
                    System.out.print(type + " ");
                }
                
            }

        }
    } // While closing bracket
     */

    //? This is first attempt of doing this. 


    

    
/* 
    if (car1.get_CarType() Model.CarType.valueOf){
    System.out.println("You have selected: " + car1.get_CarType());
  
    System.out.println("Since you have selected " + car1.get_CarType() + " Please chose the following models for your car type");
    }
*/
    //! trying to figure out how to coutnuie the program despite the wrong input from the user 








    
/*if (car1.get_CarType = Model.CarType.values()){
    System.out.println("You have selected: " + car1.get_CarType());
  
    System.out.println("Since you have selected " + car1.get_CarType() + " Please chose the following models for your car type");
    }
}
// You did not have any code at the $PLACEHOLDER$ before. It was just an empty spot for further logic, such as prompting for car model, color, etc., after the car type selection.

}



/* car1.set_CarType("SUV")  ;
 
System.out.println(car1.get_CarType());
   
*/    



//! CHATGPT TO FIX ISSSUE BELOW - 
 

 /*
  while (true) {                               // <-- now break has somewhere to break from
    if (car1.get_CarType() == null || car1.get_CarType().isEmpty()) {
        System.out.print("Enter car type: ");
        String input = scanner.nextLine();

        try {
            Model.CarType chosen = Model.CarType.valueOf(input.trim().toUpperCase());
            car1.set_CarType(chosen.toString()); // or store the enum itself if you can
            System.out.println("You have selected: " + car1.get_CarType());
            break;                               // <-- valid now
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid car type. Choose from:");
            for (Model.CarType type : Model.CarType.values()) {
                System.out.print(type + " ");
            }
            System.out.println(); // newline and loop again
        }
    } else {
        break; // already had a value—exit loop
    }
}

  */