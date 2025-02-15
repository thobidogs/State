public class VendingMachineDemo {
    public static void main (String[] args){    

        VendingMachine vm = new VendingMachine("Juice | Water | Cola | Coffee", 20);
        vm.selectItem();
        vm.insertCoin();
        vm.dispenseItem();
        vm.setOutOfOrder();

        VendingMachine vm2 = new VendingMachine("Juice | Water | Cola | Coffee", 20);
        vm2.insertCoin();
        vm2.dispenseItem();
        vm2.selectItem();
        vm2.selectItem();
        vm2.insertCoin();
        vm2.dispenseItem();
        vm2.setOutOfOrder();
    }
}