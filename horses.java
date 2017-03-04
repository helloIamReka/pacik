public class horses {
    
    public static void main(String[] args) {
    // calculates mean results for horses
        
        String [] horseNames = new String[]{"Sánta", "Gebe", "Fakó", "Göthös"};
        int[][] results = new int[4][10];
        
        for (int i = 0; i < 4; i++) {       // fill the array
            for (int j = 0; j < 10; j++) {
                results[i][j] = (int) (Math.random()*8+1);
            } 
        }
        
        for (int i = 0; i < 4; i++) {       // list results for each horse
            System.out.print(horseNames[i]+" ");
            for (int j = 0; j < 10; j++) {
                System.out.print(results[i][j]+" ");   
            }
            System.out.println("");
        }
        int counter=0;      // add the numbers for each horse and calculate their mean results
        int[] meanCalc = new int[4];
        for (int i = 0; i < 4; i++) {
            counter=0;
            for (int j = 0; j < 10; j++) {
                counter+= results[i][j];
            }
            meanCalc[i] = counter;
            System.out.println(horseNames[i]+" mean result: " + meanCalc[i] / 10.0);
            }
        
        int min = meanCalc[0];       // the best result
        int minLoc=0;
        for (int i = 1; i < meanCalc.length; i++) {
            if (meanCalc[i]<min){
                min=meanCalc[i];
                minLoc = i;
            }
        }
        System.out.println("The best overall result belongs to: "+horseNames[minLoc]);
        
        int first = 0;     // sum of first places
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (results[i][j]==1)
                    first++;
            }
        }
        System.out.println("The horses obtained " + első + " first places together.");
        
        int firstThree = 0;        // 1-3 places
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (results[i][j] == 1 || results[i][j] == 2 || results[i][j] == 3)
                    firstThree++;
            }
        }
        System.out.println("There are " + firstThree + " medals.");
    
    
    
    }
    
}
