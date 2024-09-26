public class Find_Min_Capital_Injection {

    // Method to calculate the initial balance for a given ROI and costs
        public static double calculateInitialBalance(double[] costs, double targetROI) {
            double lowerBound = 0;
            double upperBound = Double.MAX_VALUE;
            double tolerance = 0.01; // Adjust tolerance as needed
            double initialBalance;

            while (upperBound - lowerBound > tolerance) {
                initialBalance = (upperBound + lowerBound) / 2;
                double balance = initialBalance;

                for (double cost : costs) {
                    balance = balance * (1 + targetROI / 100) - cost;
                    if (balance < 0) {
                        break;
                    }
                }

                if (balance < 0) {
                    lowerBound = initialBalance;
                } else {
                    upperBound = initialBalance;
                }
            }

            return (upperBound + lowerBound) / 2;
        }

        public static void main(String[] args) {

            // Calculate initial balance for First_Scenario
            double initialBalance_First_Scenario = calculateInitialBalance(Data.First_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 1st Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_First_Scenario);
            // Calculate needed top-up for First_Scenario
            double neededTopUp_First_Scenario = initialBalance_First_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 1st Scenario: %.2f%n", neededTopUp_First_Scenario);

            // Calculate initial balance for Second_Scenario
            double initialBalance_Second_Scenario = calculateInitialBalance(Data.Second_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 2nd Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_Second_Scenario);
            double neededTopUp_Second_Scenario = initialBalance_Second_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 2nd Scenario: %.2f%n", neededTopUp_Second_Scenario);

            // Calculate initial balance for Third_Scenario
            double initialBalance_Third_Scenario = calculateInitialBalance(Data.Third_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 3rd Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_Third_Scenario);
            double neededTopUp_Third_Scenario = initialBalance_Third_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 3rd Scenario: %.2f%n", neededTopUp_Third_Scenario);

            // Calculate initial balance for Fourth_Scenario
            double initialBalance_Fourth_Scenario = calculateInitialBalance(Data.Fourth_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 4th Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_Fourth_Scenario);
            double neededTopUp_Fourth_Scenario = initialBalance_Fourth_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 4th Scenario: %.2f%n", neededTopUp_Fourth_Scenario);

            // Calculate initial balance for Fifth_Scenario
            double initialBalance_Fifth_Scenario = calculateInitialBalance(Data.Fifth_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 5th Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_Fifth_Scenario);
            double neededTopUp_Fifth_Scenario = initialBalance_Fifth_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 5th Scenario: %.2f%n", neededTopUp_Fifth_Scenario);

            // Calculate initial balance for Sixth_Scenario
            double initialBalance_Sixth_Scenario = calculateInitialBalance(Data.Sixth_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 6th Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_Sixth_Scenario);
            double neededTopUp_Sixth_Scenario = initialBalance_Sixth_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 6th Scenario: %.2f%n", neededTopUp_Sixth_Scenario);

            // Calculate initial balance for Seventh_Scenario
            double initialBalance_Seventh_Scenario = calculateInitialBalance(Data.Seventh_Scenario, Data.targetROI);
            System.out.printf("Initial balance needed for 7th Scenario with %.2f%% ROI: %.2f%n", Data.targetROI, initialBalance_Seventh_Scenario);
            double neededTopUp_Seventh_Scenario = initialBalance_Seventh_Scenario - Data.currentFundValue2023;
            System.out.printf("Needed top-up for 7th Scenario: %.2f%n", neededTopUp_Seventh_Scenario);
        }
}
