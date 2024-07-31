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