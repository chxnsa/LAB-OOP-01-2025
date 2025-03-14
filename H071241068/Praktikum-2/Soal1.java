class Person{
    String name;
    int age;
    boolean isMale;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }

    void setGender(boolean isMale){
        this.isMale = isMale;
   
    }

    String getGender(){
        return (isMale) ? "Male" : "Female"; 
    }
}




public class Soal1{
    public static void main(String[] args) {
        Person andi = new Person();
        andi.setName("Andi Khaerunnisa Oddang");
        andi.setAge(19);
        andi.setGender(false);

        System.out.println("name = " + andi.getName());
        System.out.println("age = " + andi.getAge());
        System.out.println("gender = " + andi.getGender());

    }
}