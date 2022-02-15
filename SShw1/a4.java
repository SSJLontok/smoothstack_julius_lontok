public class a4 {
    public a4(){
        for(int i=0;i<=4;i++){
            String output="";
            for(int ii=0;ii<i;ii++){
                output=output.concat(" ");
            }
            for(int ii=((4-i)*2)-1;ii>=0;ii--){
                output=output.concat("*");
            }
            System.out.println (output);
        }
        System.out.println ("\n");
        return;
    }

    public a4(int x){
        if(x<=0){
            return;
        }
        for(int i=0;i<x;i++){
            String output="";
            for(int ii=0;ii<i;ii++){
                output=output.concat(" ");
            }
            for(int ii=((x-i)*2)-1;ii>0;ii--){
                output=output.concat("*");
            }
            System.out.println (output);
        }
        System.out.println ("\n");
        return;
    }
}
