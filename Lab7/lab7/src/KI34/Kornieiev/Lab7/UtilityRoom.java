package KI34.Kornieiev.Lab7;

class UtilityRoom implements Data
{

    private double URoomSize;
    private int URoomFloor;


    public UtilityRoom(double URSize, int URFloor)
    {
        URoomSize = URSize;
        URoomFloor = URFloor;
    }

    public int getFloor()
    {
        return URoomFloor;
    }

    public void setFloor(int q)
    {
        URoomFloor = q;
    }

    public double getSize()
    {
        return URoomSize;
    }

    public int compareTo(Data p)
    {
        Double s = URoomSize;
        return s.compareTo(p.getSize());
    }

    public void print()
    {
        System.out.print("Utility Room Size: " + URoomSize + ", Utility Room Floor: "+ URoomFloor + ";\n");
    }

}
