package BasicMaths;

// 1344. Angle Between Hands of a Clock

// Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.
// Answers within 10-5 of the actual value will be accepted as correct.



public class AngleBetweenHandsOfAClock_1344 {
    public double angleClock(int hour, int minutes) {
        double x = hour + minutes / 60.0;
        double diff = (11.0 * x) % 12.0;
        return Math.min(diff, 12.0 - diff) * 30.0;
    }
}
