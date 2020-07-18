class Singleton{
    private static Singleton single_instance=null;
    public String st;
    private Singleton()
    {
        st="I am Student of B.Tech";
    }
    public static Singleton Singleton()
    {
        if(single_instance==null)
        {
            single_instance=new Singleton();
        }
        return single_instance;
    }
}

class Demo_Main
{
    public static void main(String args[])
    {
        Singleton A=Singleton.Singleton();
        Singleton B=Singleton.Singleton();
        A.st=(A.st).toUpperCase();
        System.out.println("1st statement:"+ A.st);
        System.out.println("2nd statement:"+ B.st);
    }
}
        
        