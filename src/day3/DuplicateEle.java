package day3;

public class DuplicateEle {
    public static void main(String[] args) {
        int [] a=new int[]{1,2,3,2,5,6,7,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate Elemnt is: "+a[i]);
                }
            }
        }
    }
}
