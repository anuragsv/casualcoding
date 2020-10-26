public class WeeklyPay {

    public double calculatePay (double hours, double payRate) {
        if (hours > 40) {
            hours -= 40;

            if (payRate > 20) {
                return 40 * payRate + hours * payRate * 1.25;
            } else {
                return 40 * payRate + hours * payRate * 1.5;
            }
        } else {
            return hours * payRate;
        }
    }

}
