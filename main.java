mport java.util.Locale;

public class Main {
    public static void main(String[] args) {

        short[] a={6,8,10,12,14,16};
        float[] x=new float[18];
        double f[][] = new double[6][18];

        float min= (float) -13.0, max= 10.0F;

        for(int j=0;j<18;j++){
            x[j]=(float) (Math.random()*(max-min+1)+min);
        }

        for(int i=0;i<6;i++){
            for(int j=0;j<18;j++){

                double eq=(x[j]-1.5)/23;

                if(a[i]==14){
                    f[i][j]=Math.cos(Math.pow(x[j]/2,(Math.atan(eq)+1)/0.25));
                }

                else if(a[i]==10 || a[i]==12 || a[i]==16){
                    f[i][j]=Math.sin(Math.atan(eq*eq));
                }

                else{
                    f[i][j]=Math.pow(Math.log(Math.acos(eq)), Math.tan((Math.exp(x[j])/3)/4)+1);
                }
            }
        }

        for(int i=0;i<6;i++){
            for(int j=0;j<18;j++){
                System.out.format("%.5f ", f[i][j]);
            }
            System.out.println();
        }


    }
}
