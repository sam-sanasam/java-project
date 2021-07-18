public class megaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobyte){
        if (kilobyte < 0){
            System.out.printf("Invalid values");
        }else{
            int calculatedMB =(kilobyte/1024);
            int calculatedKB=(kilobyte%1024);
            System.out.printf( kilobyte +" KB = " +calculatedMB+" MB and "+calculatedKB+" KB");

        }
    }
}



