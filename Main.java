public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(0);
        f = new Feeder(250);
        System.out.println(f.simulateManyDays(10, 5));
        f = new Feeder(0);
        System.out.println(f.simulateManyDays(5, 10));
    }

}
