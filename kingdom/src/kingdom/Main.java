package kingdom;

import java.util.ArrayList;

public class Main
{
  //print checker
  public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester)
  {
    for (AbstractAnimal a : animals)
    {
      if (tester.test(a))
      {
        System.out.println(a);
      }
    }
  }

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
    animalList.add(koala);
    animalList.add(perch);
    animalList.add(armadillo);
    animalList.add(raccoon);
    animalList.add(pigeon);
    animalList.add(salmon);
    animalList.add(zebra);
    animalList.add(peacock);
    animalList.add(toucan);
    animalList.add(bigFoot);
    animalList.add(parrot);
    animalList.add(swan);
    animalList.add(sloth);
    animalList.add(catfish);


    animalList.sort((a1, a2) -> a1.getYear() - a2.getYear());

    System.out.println("\n*** Sorted By Year(descending) \n");
    System.out.println(animalList.toString());

    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

    System.out.println("\n*** Sorted Alphabetically \n");
    System.out.println(animalList.toString());


    animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));

    System.out.println("\n*** Sorted Alphabetically By Move Type \n");
    animalList.forEach(a -> System.out.println(a.move()));

    System.out.println("\n*** Only animals with lungs discovered in 1758 \n");

    printAnimals(animalList, a -> (a.breath() == "Lungs") && (a.getYear() == 1758));

    System.out.println("\n*** Only animals with gills that lay eggs \n");
    printAnimals(animalList, a -> (a.breath() == "Gills") && (a.reproduce() == "Eggs"));

    System.out.println("\n*** Only animals discovered in 1758, sorted alphabetically \n");
    animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalList, a -> a.getYear() == 1758);

    System.out.println("\n*** Only mammals, sorted alphabetically(Stretch) \n");
    printAnimals(animalList, a -> a instanceof Mammal );
  }
}
