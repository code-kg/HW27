package HW27;

public class Main {
    public static void main(String[] args) {

        City bishkek = new City("wljcj");
        Raion [] raions = new Raion[4];

        raions[0] = new Raion("KOko");
        raions[1] = new Raion("Momo");
        raions[2] = new Raion("Spsp");
        raions[3] = new Raion("Ddodo");

        bishkek.setRaion(raions);
        bishkek.getRaion()[0].getChief();
        bishkek.getRaion(0);
        Departments departments = new Departments();
        String [] deps = new String[3];
        departments.setDepartment(deps);
        deps[0] = "wlkdncjw";
        deps[1] = "popopop";
        deps[2] = "lololo";
        for (int i=0; i<departments.getDepartment().length;i++){
            System.out.println(departments.getDepartment()[i]);
        }





//       Locality [] villages = new Villages[2];
//       villages[0] = new Villages("Bazarbaev", "Toktogul");
//       villages[1] = new Villages("Kazakbaev", "Kochkor");


    }
}
