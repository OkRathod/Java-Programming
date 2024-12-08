// [(Brute Force)]

//import java.util.Scanner;
//
//public class Euler_Phi {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//        int Result=N;
//        for(int i=0;i<N;i++){
//            if(gcd(N,i)!=1){
//                Result--;
//            }
//        }
//        System.out.println(Result);
//    }
//    static int gcd(int a, int b){
//        if (a < b){
//            return gcd(b,a);
//        }
//        if(b==0){
//            return a;
//        }
//        return gcd(b,a % b);
//    }
//}


import java.util.Scanner;

// [(Better Solution)]

public class Euler_Phi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Result=N;
        //Euler Phi Function
        for(int i=2;i*i<=N;i++){
          if(N%i==0){
              // Check For all The Prime Factors
              while(N%i==0){
                  N=N/i;
                  //Remove the number multiple of Prime Factor
              }
              // Remove those from Result also
              Result=Result-Result/i;
          }
        }
        if(N>1){
            //Subtract the final Number from the Result
            Result=Result-Result/N;
        }
        System.out.println(Result);
    }
}