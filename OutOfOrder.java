public class OutOfOrder implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine vm){
        System.out.println("No operations allowed!");
    }

    @Override
    public void insertCoin(VendingMachine vm){
        System.out.println("No operations allowed!");
    }
    @Override
    public void dispenseItem(VendingMachine vm){
        System.out.println("No operations allowed!");
    }
    @Override
    public void setOutOfOrder(VendingMachine vm){
        System.out.println("No operations allowed!");
    }

    @Override
    public String getStateName(){
        return "OutOfOrder";
    }
}

