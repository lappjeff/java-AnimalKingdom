package kingdom;

public class Fish extends AbstractAnimal
{
  public Fish(String name, int yearDiscovered)
  {
    super(name, yearDiscovered);
  }

  @Override
  public String move()
  {
    return "Swim";
  }

  @Override
  public String breath()
  {
    return "Gills";
  }

  @Override
  public String reproduce()
  {
    return "Eggs";
  }
}
