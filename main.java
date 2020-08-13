import voiture.*;

class main
{
  public static void main(String[] args)
  {
    Car v = new Car("Lotus");
    HyperCar v2 = new HyperCar("Ferrari");

    v.move(180, 1000);
    v2.move(280, 879);

    if(v instanceof Car)
    {
      System.out.println("C'est une voiture de sport de type MR");
    }
    else
    {
      System.out.println("Error System");
    }

    if(v2 instanceof HyperCar)
    {
      System.out.println("C'est une HyperCar donc plus cher mais plus puissant");
    }
    else
    {
      System.out.println("Error System");
    }


  }
}
