import java.util.ArrayList;

public class Array {
     ArrayList<Constructor> array1 = new ArrayList<>();
     ArrayList<Constructor> array2 = new ArrayList<>();



    Constructor c1 = new Constructor("pepe" , "ingeniero");
    Constructor c2 = new Constructor("maria", "medico");
    Constructor c3 = new Constructor("julian", "mecanico");

    Constructor c4 = new Constructor("antonio" , "influencer");
    Constructor c5 = new Constructor("adriana", "veterinario");
    Constructor c6 = new Constructor("marco", "aqruitecto");

    public void agregarC() {
        array1.add(c1);
        array1.add(c2);
        array1.add(c3);
    }

    public void agregarC2() {
        array2.add(c4);
        array2.add(c5);
        array2.add(c6);
    }
}
