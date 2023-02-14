package command;

import command.operations.Quotation;

public class CreateQuotationCommand implements Command {

    private Quotation quotation;

    public CreateQuotationCommand(Quotation quotation){
        this.quotation = quotation;
    }

    @Override
    public void execute() {
       this.quotation.saveQuotation();
       this.quotation.sendGifole();
       this.quotation.sendEmailUser();
    }
}
