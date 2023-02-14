package command.invoker;

import command.Command;

public class QuotationInvoker {

    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void run(){
        this.command.execute();
    }

}
