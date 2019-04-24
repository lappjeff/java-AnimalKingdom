package kingdom;

import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {

    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigFoot = new Mammal("Bigfoot", 2021);

    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);


    ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();

    animalList.add(panda);
    animalList.add(zebra);
    animalList.add(koala);
    animalList.add(sloth);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(bigFoot);
    animalList.add(pigeon);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(salmon);
    animalList.add(catfish);
    animalList.add(perch);

    System.out.println(animalList.toString());

  }
}
