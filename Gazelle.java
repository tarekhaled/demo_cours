public class Gazelle extends Animal{
    public double lgcorne;
    private final int POIDSMAX=60;
    private final int AGEMAX=12;
    private final int LGCORNEMAX=40;

    public Gazelle(){
        super("Corne dure",0,7);
        setLgcorne(2);
    }

    public Gazelle(String n,int a, double p,double lg){ super(n,a,p);setLgcorne(lg);}

    @Override
    public void afficher(){
        System.out.println("je suis une"+this.getClass().getSimpleName()+"je m'appelle "+getName()+" j'ai "+getAge()+" ans"+" je pèse "+getPoids()+" et mes cornes mesurent "+getLgcorne()+" cm");
        System.out.println("");
    }

    public double getLgcorne() {
        return lgcorne;
    }

    @Override
    public void setAge(int age) {
        if (age>=0 && age<=AGEMAX) {
            super.setAge(age);
        }
    }

    @Override
    public void compareTo() {

    }

    @Override
    public void manger() {
        this.setPoids(this.getPoids()+0.075);
    }


    @Override
    public void dormir() {
        this.setPoids(getPoids()-0.05);
    }


    @Override
    public void setPoids(double poids) {
        if (poids>=0  && poids<=POIDSMAX) {
            super.setPoids(poids);
        }
    }

    public void setLgcorne(double lgcorne) {
        if (lgcorne>=0 && lgcorne<LGCORNEMAX) {
            this.lgcorne = lgcorne;
        }
    }
}
