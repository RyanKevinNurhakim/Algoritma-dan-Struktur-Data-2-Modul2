package modul2tugas;
public class Modul2TugasNomer4 {
    public static void main(String[] args) {
        int[][] P = {
            {2,1,-5},
            {3,4,2}
        };
        int[][] tranpose = new int [3][2];
        for (int i=0; i<P.length; i++){
            for (int j=0; j<P[0].length; j++){
                tranpose[j][i]= P[i][j];                
                        
            }
        }
        for (int i=0; i<P[0].length; i++){
            for (int j=0; j<P.length; j++){
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        }
    }   
}

//Ryan Kevin Nurhakim_20090117_2A