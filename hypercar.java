class HyperCar
{

    public HyperCar(String name)
    {
      this.mName = name;
      this.mKh = 350;
      this.mPoids = 1250;
      this.mPosX = 870;
      this.mPosY = 280;
      System.out.println(this.mName + " - " + this.mPoids + " kg " + this.mKh + " Km/h");


    }

    public void move(int x, int y)
    {
      this.mPosX = x;
      this.mPosY = y;
      System.out.println(" la distance : " + this.mPosY + " La vitesse " + this.mPosX);


    }

  private int mPosX;
  private int mPosY;
  private float mPoids;
  private int mKh;
  private String mName;
}
