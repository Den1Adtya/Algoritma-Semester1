package Sesi_6;

public class Array3d {
    public static void main(String[] args) {
        String[][][] labKomputer = {
            {
              {"putra","naban","reggie","dwi",null},
              {"zaim","robby","revan",null,null},
            },
            {
              {"abi","naufal","gizane","mudi","ibnu"},
              {"deni","ilham","ade","fahrul","nanda"},
            },
            {
              {"lukman","nazril","rizki","alex",null},
              {"asril","iqbal","hafiz","mato",null},
            },
            {
              {"salwa","jibril","esa","isti",null}  ,
              {"restu","rosya","naura","zaskia",null}
            }
        };
        for(int i = 0; i<labKomputer.length; i++){
          System.out.println("baris " +(i+1)+ ":");
          for (int j = 0;j<labKomputer[i].length;j++){
            System.out.println("kelompok "+(j==0 ? "depan" : "belakang")+":");
            
              for (int k = 0;k<labKomputer[i][j].length;k++){
              System.out.print(labKomputer[i][j][k]+" ");
          } System.out.println();
          }
          
         
        }
}
}