public class Exercise01_06 {
	public static void main(String[] args){
    // 14 km in 45 mins 30 sec  
    // calculate average speed
    // - get formula for average speed in km 
    // - convert to miles 
    // 1 mile = 1.6 km 
    // print average speed. 
    //
    // EXPLNATION FOR CODE: Most of the variables used are in final state because they will not change during the program and I do not expect them to be changed so I kept them like that.
    // I also used String.format() method to keep my result in no more than 2 digits after the decimal. Keep it clean :) - I found out about that function after a quick google search. 
    final float KM_IN_MILE = 1.6f;

    final int DISTANCE_RAN_KM = 14;
    final float TIME_RAN_MIN = 14.5f;

    //calculating average speed in km
    final float AVG_SPEED_KM = DISTANCE_RAN_KM / TIME_RAN_MIN;
    final float AVG_SPEED_MILES = AVG_SPEED_KM * KM_IN_MILE;
    System.out.println(String.format("Average speed of a runner who runs 14km in 45 minutes and 30 seconds is %.2f miles per hour.", AVG_SPEED_MILES));
  }
}
