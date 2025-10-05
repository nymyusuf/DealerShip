
import java.util.Scanner;

public class CarDealership{

    //! Now that I put any value beisdes truck the code breaks?
    public static void main(String[] args) {
        
    Model car1 = new Model();

    // Possibly add a while statement for this whole thing, if every value is empty 

while (car1.get_CarType().isEmpty()) { 
    // Decide on a car type
    System.out.println("These are the car types available: "); 
    System.out.println("Sedan, Truck, SUV, Coupe, Convertible, Wagon, Minivan, Hatchback ");
    System.out.println("Please pick a car type: ");

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

/* Now that we got thier car type, we have to create a some sort of if statement for whenever   */


//! this does not make any sense bro


while(car1.get_Make().isEmpty()){

   System.out.println("Since you havve chosen" + car1.get_CarType() + " , now you must pick your car make.");


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








break; // only for switch statement
   }
 //Just so it does not infneinlty loop. 






    }//String args
} //Car Dealership{










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