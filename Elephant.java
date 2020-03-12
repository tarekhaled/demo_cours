public class Elephant extends Animal {
    private final static int POIDMAX=6000;
    private final static int AGEMAX=70;
    private final static int LGTROMPEMAX=2;
    private double lgTrompe;

    public Elephant() {
        super();
        setlgTrompe(2);
    }

    public Elephant(String n, int a, double p, double lgTrompe){super(n, a, p);setlgTrompe(lgTrompe);}

    public void setlgTrompe(double lgTrompe) {
        if (lgTrompe >= 0 && lgTrompe < LGTROMPEMAX) {
            this.lgTrompe = lgTrompe;
        }
    }

    public double getLgTrompe() {
        return lgTrompe;
    }

    @Override
    public void setPoids(double poids) {
        if (poids>=0  && poids<=POIDMAX) {
            super.setPoids(poids);
        }
    }

    @Override
    public void setAge(int age) {
        if (age>=0 && age<=AGEMAX) {
            super.setAge(age);
        }
    }

    @Override
    public void afficher(){
        System.out.println("je suis une"+this.getClass().getSimpleName()+"je m'appelle "+getName()+" j'ai "+getAge()+" ans"+" je pèse "+getPoids()+" et mes cornes mesurent "+getLgTrompe()+" cm");
        System.out.println("");
    }

    @Override
    public void manger() {
        setPoids(getPoids()+8);
        setlgTrompe(getLgTrompe()+0.03);
    }

    @Override
    public void crier() {
        System.out.println("barit barit barit");
        System.out.println("");
    }

    @Override
    public void dormir() {
        setPoids(getPoids()-1);
    }

    @Override
    public void courir() {
        setPoids(getPoids()-1.3);
    }

    @Override
    public void compareTo() {

    }
}
