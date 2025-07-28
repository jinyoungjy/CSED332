package main.src.main.java.detecting;

public class DuplicatedCode {
    public static void main(String[] args) {
        DuplicatedCode example = new DuplicatedCode();
        example.duplicatedMethod1();
        example.duplicatedMethod2();
        example.duplicatedMethod3();
    }

    public void duplicatedMethod1() {
        thisisSimilarmethod1();
        thisisSimilarmethod2();
        thisisSimilarmethod3();
    }
    public void duplicatedMethod2() {
        thisisSimilarmethod4();
        thisisSimilarmethod5();
        thisisSimilarmethod6();
    }

    public void duplicatedMethod3() {
        thisisSimilarmethod7();
        thisisSimilarmethod8();
        thisisSimilarmethod9();
    }

}
