package ie.tudublin;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    //declaring private variable.
    private int numLives = 9;

    //public accessors
    public int getnumLives()
    {
        return numLives;
    }

    public void setnumLives(int numLives)
    {
        this.numLives = numLives;
    }

    //meathod to take lives away from the cat
    public void Kill()
    {
        //taking lives away
        if (numLives>0) {
            numLives = numLives-1;
            System.out.println("Ouch!");
        }

        //declaing if dead
        if (numLives == 0) {
            System.out.println("Dead");
        }
        
    }

}