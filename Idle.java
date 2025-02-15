public class Idle implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine vm){
        System.out.println("Please select item: " + vm.getItemInventory() + "\nBalance: " + vm.getBalance());
        vm.setState(new ItemSelected());
    }

    @Override
    public void insertCoin(VendingMachine vm){
        System.out.println("Please select item first before inserting coin");
    }

    @Override
    public void dispenseItem(VendingMachine vm){
        System.out.println("Please select item first then insert a coin to dispense");
    }

    @Override
    public void setOutOfOrder(VendingMachine vm){
        System.out.println("Vending Machine is now out of order");
        vm.setState(new OutOfOrder());
    }

    @Override
    public String getStateName(){
        return "Idle";
    }

}