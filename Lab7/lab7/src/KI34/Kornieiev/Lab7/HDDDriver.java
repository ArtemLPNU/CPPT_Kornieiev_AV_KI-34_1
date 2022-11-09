package KI34.Kornieiev.Lab7;
import java.util.*;
import java.io.*;

public class HDDDriver {
    public static void main(String[] args)
    {
        Building <? super Data> building1 = new Building <Data>();
        building1.AddData(new Flat(200.5, 4, 2));
        building1.AddData(new UtilityRoom(200, 2));
        building1.AddData(new Flat(150, 2, 4));
        building1.AddData(new UtilityRoom(200, 6));

        Data res = building1.findMax();
        System.out.print("The biggest apartment: \n");
        res.print();
    }

}
