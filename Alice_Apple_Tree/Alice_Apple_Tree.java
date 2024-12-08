import java.util.Scanner;

public class Alice_Apple_Tree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("The Number of Red apples want:");
        int M=sc.nextInt();

        System.out.println("Number of apples on each tree");
        int K=sc.nextInt();

        System.out.println("Number of trees in North");
        int N=sc.nextInt();

        System.out.println("Number of trees in South");
        int S=sc.nextInt();

        System.out.println("Number of trees in East");
        int E=sc.nextInt();

        System.out.println("Number of trees in West");
        int W=sc.nextInt();

        if(M<=S*K){
            System.out.println("Got all Apples Needed");
        } else if (M<=S*K+E+W) {
            System.out.println("Got all Apples Needed");
        }
        else{
            System.out.println("Did Not Get Sufficient Apples");
        }
    }
}
