public class Singe extends Animal {
    private final int POIDSMAX=60;
    private final int AGEMAX=23;

    public Singe(){
        super("Monkey",0,4);
    }

    public Singe(String n,int a,double p){ super(n, a, p);}

    @Override
    public void setAge(int age) {
        if (age>=0 && age<=AGEMAX) {
            super.setAge(age);
        }
    }

    @Override
    public void manger() {
        this.setPoids(this.getPoids()+0.3);
    }

    @Override
    public void dormir() {
        this.setPoids(getPoids()-0.1);
    }

    @Override
    public void compareTo() {

    }

    @Override
    public void crier() {
        super.crier();
        System.out.println("groin");
    }

    @Override
    public void setPoids(double poids) {
        if (poids>=0  && poids<=POIDSMAX) {
            super.setPoids(poids);
        }
    }
}
