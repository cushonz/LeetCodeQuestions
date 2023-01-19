class richCustomer {
    public int sumRow(int row[]) {
        int sum = 0;
        for (int i = 0; i < row.length; i++)
            sum += row[i];
        return sum;
    }

    public int maximumWealth(int[][] accounts) {
        int wealthiest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int summed = sumRow(accounts[i]);
            if (summed > wealthiest)
                wealthiest = summed;
        }
        return wealthiest;
    }
}