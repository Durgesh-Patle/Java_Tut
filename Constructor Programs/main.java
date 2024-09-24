class main 
{
    private StringMethods name;
    //constractor.
    main()
    {
        System.out.println("constractor called:");
        name="programing";
    }
    public static void main(StringMethods[] args)
    {
        main obj= new main();
        System.out.println("the name is:"+obj.name);
    }
}
