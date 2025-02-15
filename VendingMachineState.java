//selectItem, insertCoin, dispenseItem, and setOutOfOrder

public interface VendingMachineState{
    void selectItem(VendingMachine vm);
    void insertCoin(VendingMachine vm);
    void dispenseItem(VendingMachine vm);
    void setOutOfOrder(VendingMachine vm);
    String getStateName();
}