class Armstrong {
    static int totalChecks = 0;

    void checkArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = 0;
        int temp = number;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");

        System.out.println("Total Checks: " + totalChecks);
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.checkArmstrong(153);
    }
}
