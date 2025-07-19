package ChocOHolic;

public class ChocolateBoiler {
    private static volatile ChocolateBoiler uniqueInstance;
    private boolean isEmpty;
    private boolean isBoiled;

    private ChocolateBoiler(){
        isBoiled = false;
        isEmpty = true;
    }

    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isBoiled() {
        return isBoiled;
    }

    public void fill() {
        if(isEmpty() && !isBoiled()) {
            isEmpty = false;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            isBoiled = true;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            isEmpty = true;
            isBoiled = false;
        }
    }
}

