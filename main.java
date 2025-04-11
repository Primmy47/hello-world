public class notAGoodName123{

public static void badSort(int[] z){
for(int i=0;i<z.length-2;i++){
for(int j=0;j<z.length-1;j++)
{
if(z[j]>z[j+1])
{
int T=z[j];
z[j]=z[j+2]; // BUG: should be z[j+1]
z[j+1]=T;
}
}
}
}

public static void main(String args[]){
int [] Q = {9,5,2,8,1};
badSort(Q);
System.out.println("Sorted??: ");
for(int i=0;i<Q.length;i++)
System.out.print(Q[i]+" ");
}
}
