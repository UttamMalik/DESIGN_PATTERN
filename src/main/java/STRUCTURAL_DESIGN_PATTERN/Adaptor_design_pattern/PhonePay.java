package STRUCTURAL_DESIGN_PATTERN.Adaptor_design_pattern;

public class PhonePay {
    public static void main(String[] args) {
        BankApi api = new Icici_Bank_Adaptor();
        System.out.println(api.checkBalance());
        System.out.println(api.transferMoney());

        BankApi anotherApi = new Yes_Bank_Adpaptor();
        System.out.println(anotherApi.checkBalance());
        System.out.println(anotherApi.transferMoney());
    }
}
