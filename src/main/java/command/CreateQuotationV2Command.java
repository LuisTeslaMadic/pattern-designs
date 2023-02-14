package command;

import command.operations.Quotation;

public class CreateQuotationV2Command implements Command {

    private Quotation quotation;

    public CreateQuotationV2Command(Quotation quotation){
        this.quotation = quotation;
    }

    @Override
    public void execute() {
        this.quotation.saveQuotation();
        this.quotation.sendGifole();
        this.quotation.sendEmailUser();
        this.quotation.sendPhone();
    }
}
