import java.util.Scanner;

public class sieve {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        boolean Array[] = new boolean[N+1];

        for(int i=0;i<N+1;i++){
            Array[i]=true;
        }

        for(int i=2;i<N+1;i++){
            if(Array[i]==false){
                continue;
            }else{
                for(int j=i+1;j<N+1;j++){
                    if(Array[j]==false){
                        continue;
                    }
                    else{
                        if(j%i==0){
                            Array[j]=false;
                        }
                        continue;
                    }
                }
            };
        }

        for(int i=2; i<N;i++){
            if(Array[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}
