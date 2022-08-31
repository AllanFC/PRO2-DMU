package Ex03;


public class CarInsurance {
    private final double basisPremium; // basis premium for a car insurance
    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */
    public CarInsurance (double basisPremium) {
        this.basisPremium = basisPremium;
    }
    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis premium is reduced with 5%,
     * - if the person have been driving without damages for:
     *    - 0 to 2 years, the basis premium is reduced with 0%,
     *    - 3 to 5 years, the basis premium is reduced with 15%,
     *    - 6 to 8 years, the basis premium is reduced with 25%,
     *    - more than 8 years, the basis premium is reduced with 35%.
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */
    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage) {
        double premium = 0;
        if(age >= 18 && age <= 24){
            premium += basisPremium * 0.25;
        } else if (age < 18 || yearsWithoutDamage < 0 || yearsWithoutDamage > age-18){
            throw new RuntimeException("Age or years without damage is invalid");
        }
        if(isWoman){
            premium -= basisPremium * 0.05;
        }
        if(yearsWithoutDamage >= 3 && yearsWithoutDamage <= 5){
            premium -= basisPremium * 0.15;
        } else if(yearsWithoutDamage >= 6 && yearsWithoutDamage <= 8){
            premium -= basisPremium * 0.25;
        } else if(yearsWithoutDamage > 8){
            premium -= basisPremium * 0.35;
        }
        return basisPremium + premium;
    }
}