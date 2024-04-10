/**
 * Solution8_timeNeededToBuyTickets
 */
class Solution8_timeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int value = 0;
        while (value < tickets.length) {
            if (tickets[value] != 0) {
                time++;
                tickets[value]--;
            }
            if (tickets[k] == 0) {
                return time;
            }
            value++;
            if (value == tickets.length) {
                value = 0;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        Solution8_timeNeededToBuyTickets test = new Solution8_timeNeededToBuyTickets();
        int[] tickets = {5,1,1,1 };
        int k = 0;
        System.out.println("Test: " + test.timeRequiredToBuy(tickets, k));
    }
}