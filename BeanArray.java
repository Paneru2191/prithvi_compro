public class BeanArray {
    public static void main(String[] args) {
        int a[]={1,2,9,13,7,5,16};
        System.out.println(isBean(a));
    }
    public static int isBean(int[] a){
    boolean nine=false;
    boolean thirteen=false;
    boolean seven=false;
    boolean sixteen=false;
    for(int i=0;i<a.length;i++){
        if(a[i]==9){
           nine=true;
        }
        else if(a[i]==13)
        {
            thirteen=true;
        }
        else if(a[i]==7){
            seven=true;
        }
        else if(a[i]==16){
            sixteen=true;
        }
    }
    if((!nine||thirteen) && (!seven||!sixteen)) return 1;
    return 0;
   }
}
