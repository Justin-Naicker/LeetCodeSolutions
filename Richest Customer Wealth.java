class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customerAccounts : accounts) {
            int wealth = 0;

            for (int account : customerAccounts) {
                wealth += account;
            }

            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}
