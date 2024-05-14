package STRUCTURAL_DESIGN_PATTERN.Adaptor_design_pattern;

public class Icici_Bank_Adaptor implements BankApi{
    ICICI_BANK_API api = new ICICI_BANK_API();
    @Override
    public int checkBalance() {
        return api.balanceInquery();
    }

    @Override
    public boolean transferMoney() {
        return api.fundTransfer();
    }
}
