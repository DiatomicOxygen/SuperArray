public class SuperTester {
  public static void main(String[] args) {
    //Assignment 14
    //Test for a and b (Constructor)
    /*
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

    System.out.println(A1.isEmpty());
    System.out.println(A2.isEmpty());

    //A1.clear();
    //System.out.println(A1.isEmpty());

    System.out.println(A1);
    System.out.println(A2);

    System.out.println(A1.contains("1839"));
    System.out.println(A1.contains("banana"));
    System.out.println(A1.contains("bananan"));

    SuperArray A3 = new SuperArray(2);
    System.out.println(A3.add("bananan"));
    System.out.println(A3.add("bananan"));
    System.out.println(A3.add("bananan"));

    System.out.println(A1);
    A1.add(4, "ADDED");
    System.out.println(A1);

    //System.out.println(A1.remove(5));
    System.out.println(A1);

    System.out.println(A1.indexOf("bananan"));
    System.out.println(A1.indexOf("ban"));
    System.out.println(A1.lastIndexOf("bananan"));

    String[] a = A1.toArray();
    a[0] = "BAnaNA";
    System.out.println(A1);
    */
    SuperArray A4 = new SuperArray(2);
    A4.add("bananan");
    A4.add("bananan");
    A4.add("bananan");
    /*
    System.out.println(A1.equals(A3));
    System.out.println(A1.equals(A2));
    System.out.println(A3.equals(A4));
    */
    SuperArray A6 = new SuperArray(2);
    SuperArray A5 = new SuperArray(2);
    //System.out.println(A5.equals(A6));

    System.out.println(constructorTester(0));
    System.out.println(constructorTester(10));
    System.out.println(constructorTester(-100));

    System.out.println(getTester(A4, -1));
    System.out.println(getTester(A4, 6));
    System.out.println(getTester(A4, 1));

    System.out.println(setTester(A4, -1, "asdf"));
    System.out.println(setTester(A4, 6, "asdf"));
    System.out.println(setTester(A4, 1, "asdf"));

    System.out.println(addTester(A4, -1, "asdf"));
    System.out.println(addTester(A4, 6, "asdf"));
    System.out.println(addTester(A4, 1, "asdf"));

    System.out.println(removeTester(A4, -1));
    System.out.println(removeTester(A4, 6));
    System.out.println(removeTester(A4, 1));
    
  }

  public static boolean constructorTester(int initialCapacity) {
    try {
      SuperArray E1 = new SuperArray(initialCapacity);
      return true;
    } catch (IllegalArgumentException e) {
      return false;
    }
  }

  public static boolean getTester(SuperArray Super, int index) {
     try {
       Super.get(index);
       return true;
     } catch (IndexOutOfBoundsException e) {
       return false;
     }
   }

  public static boolean setTester(SuperArray Super, int index, String element) {
    try {
      Super.set(index, element);
      return true;
    } catch (IndexOutOfBoundsException e) {
      return false;
    }
  }

  public static boolean addTester(SuperArray Super, int index, String element) {
    try {
      Super.add(index, element);
      return true;
    } catch (IndexOutOfBoundsException e) {
      return false;
    }
  }

  public static boolean removeTester(SuperArray Super, int index) {
    try {
      Super.remove(index);
      return true;
    } catch (IndexOutOfBoundsException e) {
      return false;
    }
  }

}
