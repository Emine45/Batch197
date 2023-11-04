package day05_logicaloperations_ifstatement;

public class C01PreincrementPostincrement {
    public static void main(String[] args) {
        /*
               int a =12;
                Increment            Decrement
                1) a=a+2;           a= a-2;
                2) a+=3;            a-=3;
                3) a= a*5;          a *= 5;
                4) a= a/5           a /= 5;
                Java gives us oppurtunity to increment first (pre increment) or increment
                later (post increment)when we use two operations at the same time with
                special format to increment
         */
        int a = 12; // print on console and increment
        // preincrement  System.out.println(++a);
        a+=1; // 13 special format to increment by 1
        System.out.println(a); //13
        System.out.println(++a);//14
        // postincrement System.out.println(a++);
        System.out.println(a); // 14
        a+=1; // 15
        System.out.println(a++); //15
        System.out.println(a);// 16
        int b = a++;
        System.out.println(b); // 16
        System.out.println(a); // 17
        // predecrement  "--a"
        int c= --a;
        System.out.println(c); // 16
        // postdecrement  " a--"
        int d = a--;
        System.out.println(d);//16
        System.out.println(a);//15

    }
}