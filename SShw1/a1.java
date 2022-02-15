public class a1 {
    public a1(){
        for(int i=0;i<4;i++){
            String output="";
            for(int ii=0;ii<=i;ii++){
                output=output.concat("*");
            }
            System.out.println (output);
        }
        System.out.println ("\n");
    }

    public a1(int x){
        if(x<=0){
            return;
        }
        for(int i=0;i<x;i++){
            String output="";
            for(int ii=0;ii<=i;ii++){
                output=output.concat("*");
            }
            System.out.println (output);
        }
        System.out.println ("\n");
        return;
    }
}
