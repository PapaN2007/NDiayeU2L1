public class CatRunner{
    public static void main(String[] args){

        Cat cat1 = new Cat("Mikey", 8, 12.4);
        cat1.printCatInfo();
        cat1.introduce();

        System.out.println("");



        Cat cat2 = new Cat("Thomas", 5, 5.7);
        cat2.introduce();
        cat2.printCatInfo();
    }

}
