public class VendingMachine{
    private String itemInventory;
    private int balance;
    private VendingMachineState vendingMachineState;

    public VendingMachine( String itemInventory, int balance) {
        vendingMachineState = new Idle();
        this.balance = balance;
        this.itemInventory = itemInventory;
    }

    public void setState(VendingMachineState vs){
        this.vendingMachineState = vs;
    }
    

    public void selectItem(){
        vendingMachineState.selectItem(this);
    }

    public void insertCoin(){
        vendingMachineState.insertCoin(this);
    }
    public void dispenseItem(){
        vendingMachineState.dispenseItem(this);
    }
    public void setOutOfOrder(){
        vendingMachineState.setOutOfOrder(this);
    }

    public String getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(String itemInventory) {
        this.itemInventory = itemInventory;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
    


}