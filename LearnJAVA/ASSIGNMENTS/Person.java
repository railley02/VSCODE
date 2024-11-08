public class Person{
    //create the Field
     String name;
     int age;
     String address;
    //Constructor
     Person(String name, int age, String address){
 
     this.name = name;
     this.age = age;
     this.address = address;
  }
  //call display method
  void displayPersonInfo(){
     System.out.println("name: " + name);
     System.out.println("age: " + age);
     System.out.println("address: " + address);
     System.out.println();
  }
     public static void main(String[] args) {
 
         Person person1 =  new Person("Railley", 19, "Valenzuela");
         Person person2 =  new Person("Angelica", 69, "Bulacan");
         Person person3 =  new Person("Iris", 74, "Rizal");
 
         person1.displayPersonInfo();
         person2.displayPersonInfo();
         person3.displayPersonInfo();
 
     }
  }
 