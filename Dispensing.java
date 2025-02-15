public class Dispensing implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine vm){
        System.out.println("Item is now being dispensed!");
        vm.setState(new Idle());
    }

    @Override
    public void insertCoin(VendingMachine vm){
        System.out.println("Item is now being dispensed!");
        vm.setState(new Idle());
    }
    @Override
    public void dispenseItem(VendingMachine vm){
        System.out.println("Item is now being dispensed!");
        vm.setState(new Idle());
    }
    @Override
    public void setOutOfOrder(VendingMachine vm){
        System.out.println("Item is now being dispensed!");
        vm.setState(new Idle());
    }

    @Override
    public String getStateName(){
        return "Dispensing";
    }
   

}

