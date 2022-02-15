public class a3 {
    public a3(){
        for(int i=0;i<4;i++){
            String output="";
            for(int ii=4-i;ii>0;ii--){
                output=output.concat(" ");
            }
            for(int ii=0;ii<(i*2)+1;ii++){
                output=output.concat("*");
            }
            System.out.println (output);
        }
        System.out.println ("\n");
    }

    public a3(int x){
        if(x<=0){
            return;
        }
        for(int i=0;i<x;i++){
            String output="";
            for(int ii=x-i;ii>0;ii--){
                output=output.concat(" ");
            }
            for(int ii=0;ii<(i*2)+1;ii++){
                output=output.concat("*");
            }
            System.out.println (output);
        }
        System.out.println ("\n");
        return;
    }
}
