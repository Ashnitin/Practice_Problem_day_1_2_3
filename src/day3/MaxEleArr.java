package day3;

public class MaxEleArr {
    public static void main(String[] args) {
        int[] a=new int[]{15, 25, 30, 65, 75};
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maimum Element is:"+max);
    }
}
