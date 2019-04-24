package kingdom;

public class Mammal extends AbstractAnimal
{
  public Mammal(String name, int yearDiscovered)
  {
    super(name, yearDiscovered);
  }

  @Override
  public String toString()
  {
    return "\nname: " + name + " Year Discovered: " + yearDiscovered + " Id: " + id;
  }
}
