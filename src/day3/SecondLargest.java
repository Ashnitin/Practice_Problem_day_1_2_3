package day3;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a=new int[]{15, 25, 30, 65, 75,46, 89};
        int max=a[0];
        int seconLargest=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int j=0; j< a.length; j++){
            if (a[j]>seconLargest && a[j]<max){
                seconLargest=a[j];
            }
        }
        System.out.println("Second largest Element is:"+seconLargest);

    }
}
