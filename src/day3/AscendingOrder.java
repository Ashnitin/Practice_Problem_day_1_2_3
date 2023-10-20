package day3;

public class AscendingOrder {
    public static void main(String[] args) {
        int [] a=new int[]{5,4,8,9,7,1};
        int temp=0;
        System.out.println("Orignal Array: ");
            for (int i=0;i<a.length;i++){
                System.out.println(a[i]+" ");
            }
        for (int i=0;i<a.length;i++)
        {
         for(int j=i+1;j<a.length;j++){
             if(a[i]>a[j]){
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
             }
         }
        }
        System.out.println("Ascending Array:");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
