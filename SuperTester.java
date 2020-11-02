public class SuperTester {
  public static void main(String[] args) {
    //Assignment 14
    //Test for a and b (Constructor)
    SuperArray A1 = new SuperArray();

    //Test for c
    System.out.println(A1.size());

    //Test for c and d (length of data was set to 3)
    System.out.println(A1.add(""));
    System.out.println(A1.add("123"));
    System.out.println(A1.size());
    System.out.println(A1.add("bananan"));
    System.out.println(A1.size());
    System.out.println(A1.add("bananan"));
    System.out.println(A1.size());

    //Test for e
    System.out.println(A1.get(0));
    System.out.println(A1.get(1));
    System.out.println(A1.get(2));
    System.out.println(A1.get(3));

    //test for f
    System.out.println(A1.set(2,"Banora"));
    System.out.println(A1.set(0, "Baonana"));
    System.out.println(A1.get(0));
    System.out.println(A1.get(1));
    System.out.println(A1.get(2));
    System.out.println(A1.get(3));

    //test for g (method was public when I tested it)
    SuperArray A2 = new SuperArray();
    //System.out.println(A2.size());
    //System.out.println(A2.resize());
    //System.out.println(A1.size());
    //System.out.println(A1.resize());

    //test for modified d (length of data was set to 3 again)
    System.out.println(A1.add("bananan"));
    System.out.println(A1.size());
  }
}
