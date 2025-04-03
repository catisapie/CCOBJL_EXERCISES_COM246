public class App {
         public static void main(String[] args) throws Exception {

            // Datascientist object
            DataScientist dataScientist1 = new DataScientist("John", null, null);

            System.out.println("My name is " + dataScientist1.name);
            System.out.println("His work is " + dataScientist1.getWork());
            System.out.println("He earns " + dataScientist1.getSalary());

            // Researcher object
            Researcher researcher1 = new Researcher("Jane", null, null);

            System.out.println("My name is " + researcher1.name); 
            System.out.println("His works is " + researcher1.getWork()); 
            System.out.println("She earns " + researcher1.getSalary());

            Car mycar = new Car(6, "10kwh");

            System.out.println("My car has a " + mycar.getBattery() + " battery");
            System.out.println(" and it also has " + mycar.getCylinder() + " cylinders");

    }
}
