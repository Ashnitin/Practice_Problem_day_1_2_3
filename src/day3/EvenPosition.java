package day3;

public class EvenPosition {
    public static void main(String[] args) {
        int[] a=new int[]{75, 25, 30, 65, 15, 18};
        for(int i=1;i<a.length;i=i+2){
            System.out.println("Array element of even position: "+a[i]);
        }
    }
}
