public class Student {


        private String name;
        private double gpa;
        private int classes ;

        public Student(String n, int c, double g) {
            name = n;
            classes = c;
            gpa = g;
        }

        public void introduction(){
            System.out.println("Hello my name is " + name + " and I have a " + gpa + " gpa with " +  classes + " classes" );
        }

        public void passing(){
            if (gpa >= 65){
                System.out.println("My gpa is " + gpa + " and I am passing!");
            }
            if (gpa < 65){
                System.out.println("My gpa is " + gpa + " and I am failing. " +"I need to get extra help");

            }
        }
}
