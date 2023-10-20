package day3;

public class smallEleArr {
    public static void main(String[] args) {
        int[] a=new int[]{75, 25, 30, 65, 15};
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum Element:"+min);
    }
}
