import java.util.*;
public class Main {

    public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	   int[][] a=new int[3][3];
	   boolean flag=false;
	   for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
               a[i][j]=in.nextInt();
       }
       for(int i=0;i<3;i++)
       {
           if(a[i][0]==a[i][1]&&a[i][1]==a[i][2])
               flag=true;
           if(a[i][0]==a[1][i]&&a[1][i]==a[2][i])
               flag=true;
       }
        if(a[0][0]==a[1][1]&&a[1][1]==a[2][2])
            flag=true;
        if(a[0][2]==a[1][1]&&a[1][1]==a[2][0])
            flag=true;
        if(flag==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
