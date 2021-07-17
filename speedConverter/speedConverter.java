public class speedConverter {
    // 1st method
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }else {

            return Math.round(kilometersPerHour/1.609);

        }
    }

    // 2nd method

    public static void  printConversion(double kilometersPerHour){
        if (kilometersPerHour< 0){
            System.out.println(" The input number is invalid");
        } else {
            long milesPerHour= toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour+ " mi/h");

        }
    }
}
