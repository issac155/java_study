// import java.util.Scanner;

// public class issac{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Col 1");
//         int col1 = sc.nextInt();
//         System.out.println("Enter row 1");
//         int row1 = sc.nextInt();
//         System.out.println("Enter col 2");
//         int col2 = sc.nextInt();
//         System.out.println("Enter row 2");
//         int row2 =sc.nextInt();
//         int a[][] = new int[col1][row1];
//         int b[][] = new int[col2][row2];
//         int c[][] = new int[col1][row1];
//         if (col1 ==col2 && row1==row2){
//             System.out.println("Enter matrix 1");
//             for (int i=0;i<a.length;i++){
//                 for (int j=0;j<a[i].length;j++){
//                     a[i][j] = sc.nextInt();

//                 }
//             }
//             System.out.println("Enter matrix 2");

//             for( int i=0;i<b.length;i++ ){
//                 for (int j = 0;j<b[i].length;j++ ){
//                     b[i][j]=sc.nextInt();
//                 }
//             }
//             System.out.println("Result matrix ");

//             for (int i=0;i<a.length;i++){
//                 for (int j=0;j<a[i].length;j++){
//                    c[i][j]= a[i][j]+b[i][j];

//                 }
//             }
//             for (int i=0;i<a.length;i++){
//                 for (int j=0;j<a[i].length;j++){
//                   System.out.print(c[i][j]+"");

//                 }
//                 System.out.println();
//             }


//         }
//         else{
//             System.out.println("Matrix cannot be added");
//         }
// sc.close();
//     }
// }


// public class issac {

//     public static void main(String[] args) {
//        int a[][] = {
//         {1,2,3},
//         {4,5,6},
//        };
//        int b[][] = {
//         {7,8,9},
//         {10,11,12},
//         {12,3,23}
//        };
//        int c[][] = new int[a.length][b[0].length];
//        for (int i = 0; i<a.length;i++){
//         for (int j = 0; j<b[0].length;j++){
//             for (int k = 0; k<a[0].length;k++){
//                 c[i][j]= c[i][j]+(a[i][k]*b[k][j]);
//             }
//        }


//     }
//     for (int i = 0; i<a.length;i++){
//         for (int j = 0; j<b[0].length;j++){
//            System.out.print(c[i][j] +"" +"");
//        }
//        System.out.println();

//     }

//     }
// }

// public class issac {

//      public static void main(String[] args) {
//         int a[][] = {
//             {1,2,3},
//             {4,5,6},
//         };
//         int c[][] = new int [a[0].length][a.length];
//         for (int i = 0; i<a[0].length;i++){
//             for(int j = 0 ; j<a.length;j++){
//                 c[i][j] = a[j][i];
//                 System.out.print(c[i][j] + "");
//             }
//             System.out.println("");
//         }
//      }
// }

// public class issac {
<<<<<<< Updated upstream

//     public static void main(String[] args) {

//         for(int i = 0; i<4; i++){
//             for (int j=0; j<4;j++){
//                 System.out.print("$");
//             }
//             System.out.println();
//         }
//     }
// }

// public class issac {

//     public static void main(String[] args) {
        
//         for (int i=0;i<4;i++){
//             for (int j=0; j<4;j++){
//                 if (i==0||i==3||j==0||j==3){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print("");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class issac {

//     public static void main(String[] args) {

//         int row = 4;
//         for (int i =0; i<row; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// When i = 0, the inner loop does not execute because j < i is false (since 0 < 0 is false). Thus, nothing is printed, and a newline is added.
// When i = 1, the inner loop runs once (j = 0), printing one asterisk (*) followed by a newline.
// When i = 2, the inner loop runs twice (j = 0, 1), printing two asterisks (**) followed by a newline.
// When i = 3, the inner loop runs thrice (j = 0, 1, 2), printing three asterisks (***) followed by a newline.


// class ABC{

//     int num1;
// int num2 ;
// int Result;

//     ABC(){
// num1 = 10;
// num2 =20;


//     }

//     void add(){
// Result = num1+num2;
// System.out.println("Sum of num1 and num2 is "+Result);
//     }
// }
//     public class issac {
    
//         public static void main(String[] args) {
//             ABC obj =new ABC();
//             obj.add();
//     }
// }


// class Cal{
//     int num1;
//     int num2;
//     int Result;

//     void sum(int a,int b){

//         num1 = a;
//         num2 =b;
//         System.out.println(num1+num2);


//     }
//     void sum(double a, double b){
//         num1 = (int)a;
//         num2 = (int)b;
//         System.out.println(num1+num2);

//     }

// }

// public class issac {

//     public static void main(String[] args){
//         Cal obj = new Cal();
//         obj.sum(10,20);
//         obj.sum(10.5,60.5);
//     }
// }

// Class Add{
//     int num1;
//     int num2;

//     public int  add (){
    
        
//     }
// }

// class grandparent {
//     int a ;
//     void display(){
//         System.out.println("Parent");
//     }

// }

// class parent extends grandparent{
//     int b;
//     void show(){
//         System.out.println("Child");
//     }
// }

// class child extends parent{
//     int c;
//     void print(){
//         System.out.println("Child");
//     }
// }

// public class issac{
//     public static void main(String[] args){

//         child obj = new  child();
//         obj.a = 10;
//         obj.b = 30;
//         obj.c = 50;
//         obj.display();
//         obj.show();
//         obj.print();
//         System.out.println(obj.a);
        
//     }
// }
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // Create an empty map to store numbers and their indices
//         Map<Integer, Integer> map = new HashMap<>();
        
//         // Loop through the array
//         for (int i = 0; i < nums.length; i++) {
//             // Calculate the complement
//             int complement = target - nums[i];
            
//             // Check if the complement exists in the map
//             if (map.containsKey(complement)) {
//                 // If it exists, return the indices
//                 return new int[]{i, map.get(complement)};
//             }
            
//             // If it doesn't exist, add the current number and its index to the map
//             map.put(nums[i], i);
//         }
        
//         // If no pair is found, return null
//         return null;
//     }
// }

//two sum


// import java.util.HashMap;
// import java.util.Map;

// public class issac{

//     public int[] twoSum(int[] num, int target){

//         Map<Integer,Integer>Map = new HashMap<>();

//         for ( int i = 0; i<num.length; i++){
//             int ans = target- num[i];

//             if (Map.containsKey(ans)){
//                 return new int[] { Map.get(ans) ,i};
//             }
//             Map.put(num[i], i);
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         issac obj = new issac();
//         int[] num = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = obj.twoSum(num, target);
//         if (result != null) {
//             System.out.println("Indices: " + result[0] + ", " + result[1]);
//         } else {
//             System.out.println("null");
//         }
//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
        
    int temp = x;
    int rev = 0;

    while(x>0){
       int  digit = x%10;
        rev = (rev*10)+digit;
       x= x/10;
    }

    if (rev==temp){
        return true;

    }
<<<<<<< HEAD
    else{
        return false;
    }
    }
}

// solved 


// var declaration given value in temp 
// another one as rev store rev value
//an loop next check x value greater that o
// first take module of x by 10 save in a variable digit
// then rev
=======
}
=======

//     public static void main(String[] args) {

//         for(int i = 0; i<4; i++){
//             for (int j=0; j<4;j++){
//                 System.out.print("$");
//             }
//             System.out.println();
//         }
//     }
// }


// public class issac{
//     public static void main(String[] args){

//         for(int i= 0 ; i<4;i++){//row 0 1 2 i = 1 ,j =0 i= 1 j = 1 
//             for (int j=0;j<i;j++){//col 
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     } 
// }


// class demo{
//     String name;

//     int age;


//     void view(){
//         System.out.println("My name is "+name+"my age is "+age);
//     }
// }
// public class issac{
//     public static void main(String[] args){
//     demo obj = new demo();
//       obj.name = "issac";
//       obj.age= 24;
//       obj.view();

//     }
// }
>>>>>>> Stashed changes
>>>>>>> 9fbbfb5c1e5cbdef3bb877696e4e2e756468feb9
