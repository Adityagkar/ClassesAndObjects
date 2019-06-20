public class Dog {
    String name;
    String breed;
    int age;
    String color;

    void bark(){
        System.out.println("BOW WOW !!");
    }

   public static void main(String args[]){
        Dog dog1 = new Dog();
        dog1.age = 1;
        dog1.name ="alexa";
        dog1.breed = "chowchow";

        dog1.bark();
       Dog dog2= new Dog();
       dog2.age = 2;
       dog2.name ="coco";
       dog2.breed = "chowchow";
   }
}


