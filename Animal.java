abstract class Animal implements Individu, Comparable {
    protected String name;
    protected int age;
    protected double poids;

    public Animal(){
        this("Pinoccio",0,66);
    }

    public Animal(String n,int a,double p){
        setName(n);
        setAge(a);
        setPoids(p);
    }

    public void afficher(){
        System.out.println("je suis un"+this.getClass().getSimpleName()+" je m'appelle "+getName()+" j'ai "+getAge()+" ans"+" je pèse "+getPoids());
        System.out.println("");
    }

    @Override
    public String toString() {
        return ("je suis un"+this.getClass().getSimpleName()+" je m'appelle "+getName()+" j'ai "+getAge()+" ans"+" je pèse "+getPoids());
    }

    public void vieillir(){
        setAge(getAge()+1);
    }

    public void crier(){
    }

    public void sauter() {
    }
    public void courir(){
    }

    public double getPoids() {
        return poids;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
}
