public class Lion extends Animal{
    private final int POIDSMAX=230;
    private final int AGEMAX=15;
    public Lion(){
        super();
        setName("Roi des animaux");
        setPoids(32);
    }

    public Lion(String n,int a,double p){
        super(n,a,p);
    }

    @Override
    public void manger() {
        this.setPoids(this.getPoids()+1.9);
    }

    @Override
    public void dormir() {
        this.setPoids(getPoids()-0.8);
    }

    @Override
    public void setAge(int age) {
        if (age>=0 && age<=AGEMAX) {
            super.setAge(age);
        }
    }

    @Override
    public void crier() {
        super.crier();
        System.out.println("roar");
    }

    @Override
    public void setPoids(double poids) {
        if (poids>=0  && poids<=POIDSMAX) {
            super.setPoids(poids);
        }
    }

    public void LionMangeGazelle(Gazelle g) {
        if (g != null) {
            this.setPoids(this.getPoids() + (g.getPoids()) / 3);
        }
    }

    @Override
    public void compareTo() {

    }
}
