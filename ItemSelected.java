public class ItemSelected implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine vm){
        System.out.println("Item already selected");
    }

    @Override
    public void insertCoin(VendingMachine vm){
        System.out.println("Coin inserted!");
        vm.setState(new Dispensing());
    }

    @Override
    public void dispenseItem(VendingMachine vm){
        System.out.println("Item is now being dispensed!");
        vm.setState(new Dispensing());
    }

    @Override
    public void setOutOfOrder(VendingMachine vm){
        System.out.println("Vending Machine is now out of order");
        vm.setState(new OutOfOrder());
        
    }

    @Override
    public String getStateName(){
        return "ItemSelected";
    }
   

}

