public class gyakorlas {
    
    public static void main(String[] args) {
    //versenylovak
        
        String [] lónév = new String[]{"Sánta", "Gebe", "Fakó", "Göthös"};
        int[][] helyezés = new int[4][10];
        
        for (int i = 0; i < 4; i++) {       //benépesítem a tömböt
            for (int j = 0; j < 10; j++) {
                helyezés[i][j] = (int) (Math.random()*8+1);
            } 
        }
        
        for (int i = 0; i < 4; i++) {       //lovanként felsorolom a helyezésüket
            System.out.print(lónév[i]+" ");
            for (int j = 0; j < 10; j++) {
                System.out.print(helyezés[i][j]+" ");   
            }
            System.out.println("");
        }
        int counter=0;      //összeadom lovanként a számokat, összesített eredmény, majd átlag
        int[] nemtudommitcsinálok= new int[4];
        for (int i = 0; i < 4; i++) {
            counter=0;
            for (int j = 0; j < 10; j++) {
                counter+=helyezés[i][j];
            }
            nemtudommitcsinálok[i]=counter;
            System.out.println(lónév[i]+" átlaga: "+nemtudommitcsinálok[i]/10.0);
            }
        
        int min = nemtudommitcsinálok[0];       //legjobb összesített eredmény
        int minhely=0;
        for (int i = 1; i < nemtudommitcsinálok.length; i++) {
            if (nemtudommitcsinálok[i]<min){
                min=nemtudommitcsinálok[i];
                minhely=i;
            }
        }
        System.out.println("A legjobb összesített eredmény tulajdonosa: "+lónév[minhely]);
        
        int első=0;     //első helyezések száma
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (helyezés[i][j]==1)
                    első++;
            }
        }
        System.out.println("Összesen "+első+" első helyezést értek el a lovak.");
        
        int elsőhárom=0;        //1-3 helyezések száma
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (helyezés[i][j]==1 || helyezés[i][j]==2 || helyezés[i][j]==3)
                    elsőhárom++;
            }
        }
        System.out.println("Összesen "+elsőhárom+" érem lóg az istálló falán.");
    
    
    
    }
    
}
