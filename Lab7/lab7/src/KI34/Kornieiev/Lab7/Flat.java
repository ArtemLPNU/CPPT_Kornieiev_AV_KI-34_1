package KI34.Kornieiev.Lab7;

class Flat implements Data
{
    private double flatSize;
    private int flatPeople;

    private int flatFloor;

    public Flat(double flSize, int flPeople, int flFloor)
    {
        flatSize = flSize;
        flatPeople = flPeople;
        flatFloor = flFloor;
    }


    public int getPeople()
    {
        return flatPeople;
    }

    public void getFileName(int n)
    {
        flatPeople = n;
    }

    public int getFloor()
    {
        return flatFloor;
    }

    public void setFloor(int f)
    {
        flatFloor = f;
    }

    public void setSize(double m)
    {
        flatSize = m;
    }

    public double getSize()
    {
        return flatSize;
    }

    public int compareTo(Data p)
    {
        Double s = flatSize;
        return s.compareTo(p.getSize());
    }


    public void print()
    {
        System.out.print("Flat Size: " + flatSize +
                ",  People live in the flat: " + flatPeople + ", Flat Floor: " + flatFloor + ";\n");
    }
}


