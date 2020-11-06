public class Demo {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    SuperArray words2 = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    words2.add("maguro");   words2.add("uni");   words2.add("una");
    words2.add("sakana");    words2.add("una");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray comparison = findOverlap(words, words2);
    System.out.println(comparison);
    System.out.println(words);
  }

  public static void removeDuplicates(SuperArray s){
    for (int i = s.size(); i >= 0; i--) {
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray A = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      A.add(a.get(i));
    }
    removeDuplicates(A);
    for (int i = A.size(); i >= 0; i--) {
      if (b.indexOf(A.get(i)) == -1) {
        A.remove(i);
      }
    }
    return A;
  }  

}
