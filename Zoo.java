import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private Vector<Animal> maCollection;

    public Zoo(){
        maCollection = new Vector<>();
    }



    public void init(){
        for (int i=0; i<2; i++) {
            Lion lion = new Lion();
            maCollection.add(lion);
            Singe singe = new Singe();
            maCollection.add(singe);
            Gazelle gazelle = new Gazelle();
            maCollection.add(gazelle);
            Elephant elephant = new Elephant();
            maCollection.add(elephant);
        }
    }


    /*private void afficher(){
        for (int i=0; i<lesGazelles.length;i++) {
            if (lesGazelles[i] != null) {
                lesGazelles[i].afficher();
            }
            else {
                System.out.println("la Gazelle numéro "+i+" est morte :c");
                System.out.println("");
            }
        }
        for(Lion l:lesLions){
            System.out.println(l);
        }
        theSinge.afficher();
    }

    public void nourrir(){
        theSinge.manger();
        for(int i=0; i<lesLions.length;i++) {
            lesLions[i].manger();
        }
        for (Gazelle gazelle:lesGazelles){
            if(gazelle!=null) {
                gazelle.manger();
            }
        }
    }



    public void chanson(){
        theSinge.crier();
        for(int i=0; i<lesLions.length;i++) {
            lesLions[i].crier();
        }
        for (Gazelle gazelle:lesGazelles){
            if(gazelle!=null) {
                gazelle.crier();
            }
        }

    }
    */


    public void afficher(){
        for(Animal o: maCollection) {
            o.afficher();
        }
    }
    public void nourrir(){
        for(Animal o: maCollection) {
            o.manger();
        }
    }

    public void trier(){

    }

    public void lionmangegazelle(Lion lion, Gazelle gazelle){
        lion.LionMangeGazelle(gazelle);
    }

    public static void main(String[] args){
        Zoo z=new Zoo();
        z.init();
        z.afficher();
        z.trier();
        System.out.println("A table!");
        System.out.println("");
        z.nourrir();
        //z.LionMangeGazelle();
        z.afficher();
        //z.chanson();
    }
}
