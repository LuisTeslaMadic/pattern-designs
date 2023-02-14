package command;

import command.invoker.QuotationInvoker;
import command.operations.Quotation;

public class main {

    public static void main(String[] args){
        Quotation quotation = new Quotation();
        CreateQuotationV2Command createQuotationCommand = new CreateQuotationV2Command(quotation);
        QuotationInvoker quotationInvoker = new QuotationInvoker();
        quotationInvoker.setCommand(createQuotationCommand);
        quotationInvoker.run();
    }

}
