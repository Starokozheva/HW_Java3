package Task;

public class Open {

    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду: " + canBuy);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen || isReweOpen) {
            return true;
        } else {
            return false;
        }
    }
}
