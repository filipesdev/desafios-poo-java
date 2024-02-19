package entitites;

public class Student {

    public String name;
    public double avarage1;
    public double avarage2;
    public double avarage3;

    public double getAvarage() {
        return avarage1 + avarage2 + avarage3;
    }

    public double calculateMissingPoints() {

         if (getAvarage() < 60) {
             return 60 - getAvarage();
         } else {
             return 0.0;
         }
    }
}
