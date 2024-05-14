package STRUCTURAL_DESIGN_PATTERN.Adaptor_design_pattern;

public class Yes_Bank_Adpaptor implements BankApi{
    YES_BANK_API api = new YES_BANK_API();
    @Override
    public int checkBalance() {
        return api.balanceChecker();
    }

    @Override
    public boolean transferMoney() {
        return api.transferMoney();
    }
}
