package io.bugdone.account;

public interface AccountCommandService {
    String createAccount(CreateAccountCommand createAccountCommand);

    void creditMoney(CreditMoneyCommand creditMoneyCommand);

    void debitMoney(DebitMoneyCommand debitMoneyCommand);

    void borrowCredit(AskCreditLineCommand askCreditLineCommand);

    void validatePayment(ValidatePaymentCommand validatePaymentCommand);

    void reimburseCreditLine(ReimburseCreditLineCommand reimburseCreditLineCommand);
}
