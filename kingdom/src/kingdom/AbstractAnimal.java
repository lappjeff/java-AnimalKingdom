package kingdom;

public abstract class AbstractAnimal
{
  private static int maxId = 0;
  int id;
  String name;
  int yearDiscovered;

  public AbstractAnimal(String name, int yearDiscovered)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  public abstract String move();
  public abstract String breath();
  public abstract String reproduce();

  public String eat(String food)
  {
    return name + " eats some " + food;
  }

  public String toString()
  {
    return "\nName: " + name + "\nYear Discovered: " + yearDiscovered + "\nId: " + id;
  }
}
