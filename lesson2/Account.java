package lesson2;

public interface Account {
    
    double getBalance();
    void put(double amount);
    default void put(int amount) { this.put(Double.valueOf(amount)); }
    void take(double amount);
    default void take(int amount) { this.take(Double.valueOf(amount)); }

}
