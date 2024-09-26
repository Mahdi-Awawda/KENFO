public class Find_Min_ROI {
        public static double calculateROI(double[] costs, double initialBalance) {
            double lowerBound = 0;
            double upperBound = 100;
            double tolerance = 0.000000000000001;
            double assumedROI;

            while (upperBound - lowerBound > tolerance) {
                assumedROI = (upperBound + lowerBound) / 2;
                double balance = initialBalance;

                for (double cost : costs) {
                    balance = balance * (1 + assumedROI / 100) - cost;
                    if (balance < 0) {
                        break;
                    }
                }

                if (balance < 0) {
                    lowerBound = assumedROI;
                } else {
                    upperBound = assumedROI;
                }
            }

            return (upperBound + lowerBound) / 2;
        }

        public static void main(String[] args) {


            double initialBalance_2023 = 21411768000.0; // 21.4 billion €

            double required_ROI_First_Scenario = calculateROI(Data.First_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 1st Scenario: " + required_ROI_First_Scenario + "%");

            double required_ROI_Second_Scenario = calculateROI(Data.Second_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 2nd Scenario: " + required_ROI_Second_Scenario + "%");

            double required_ROI_Third_Scenario = calculateROI(Data.Third_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 3rd Scenario: " + required_ROI_Third_Scenario + "%");

            double required_ROI_Fourth_Scenario = calculateROI(Data.Fourth_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 4th Scenario: " + required_ROI_Fourth_Scenario + "%");

            double required_ROI_Fifth_Scenario = calculateROI(Data.Fifth_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 5th Scenario: " + required_ROI_Fifth_Scenario + "%");

            double required_ROI_Sixth_Scenario = calculateROI(Data.Sixth_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 6th Scenario: " + required_ROI_Sixth_Scenario + "%");

            double required_ROI_Seventh_Scenario = calculateROI(Data.Seventh_Scenario, initialBalance_2023);
            System.out.println("Required yearly ROI for 7th Scenario: " + required_ROI_Seventh_Scenario + "%");

        }


}
