public class StudentRunner{
    public static void main(String[] args){

        Student student1 = new Student("Sam", 7, 93.89);
        student1.introduction();
        student1.passing();

        System.out.println(" ");

        Student student2 = new Student("Annabell", 9, 62.6);
        student2.passing();
        student2.introduction();

    }

}