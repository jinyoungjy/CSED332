package main.src.main.java.detecting;

public class LongParameterList {

    public static void main(String[] args) {
        LongParameterList example = new LongParameterList();

        // Example usage of the method with long parameter list
        example.exampleMethodWithLongParameterList(
                "Jinyoung Kim", 24, "postech", "010-1234-5678", "jyk2000@postech.ac.kr",
                "Software Engineer", "Korean", 180, 60, "Male", "Not Married", "Gaming"
        );
    }

    public void exampleMethodWithLongParameterList(String name, int age, String address, String phoneNumber,
                                                   String email,
                                                   String occupation, String nationality, double height, double weight,
                                                   String gender, String maritalStatus, String hobby) {
        // Just printing out the parameters for demonstration
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Occupation: " + occupation);
        System.out.println("Nationality: " + nationality);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Hobby: " + hobby);
    }
}