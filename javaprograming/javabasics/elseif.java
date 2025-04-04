package javabasics;
// PROGRAM OF AGE BY ELSEIF 


// import java.util.*;

// public class elseif {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter youre age ");
//         int age = sc.nextInt();
//         if (age > 18) {
//             System.out.println("you are adult now mister ");
//         } else if (age < 18 && age > 13) {
//             System.out.println("youre teenager my boiii ");
//         } else {
//             System.out.println("youre lil boyyy");
//         }
//     }
// }




// INCOME TEXT CALCULATOR 


//  import java.util.*;

// public class elseif {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter youre salary  ");
//         int income = sc.nextInt();
//         if (income < 500000) {
//             System.out.println("you have zero text to pay ");
//         } else if (income < 1000000 && income > 500000) {
//             System.out.println("your text on your  salary is " + income*0.2);
//         } else {
//             System.out.println("your text on your salary is "+ income*0.3);
//         }
//     }
// }


// GREATES NUMBER OF THREE 


 import java.util.*;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number  ");
        int num = sc.nextInt();
        System.out.println("enter second number  ");
        int num2 = sc.nextInt();
        System.out.println("enter third number  ");
        int num3 = sc.nextInt();
        if (num > num2 && num>num3) {
            System.out.println("the greater number is " + num);
        } else if (num2 > num3) {
            System.out.println("the greater number is  "+ num2);
        } else {
            System.out.println("the grater number is "+ num3);
        }
    }
}


