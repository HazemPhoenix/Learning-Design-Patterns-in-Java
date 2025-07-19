package ChocOHolic;

public enum ChocolateBoiler {
    UNIQUE_INSTANCE;
    private boolean isEmpty;
    private boolean isBoiled;

    private ChocolateBoiler(){
        isBoiled = false;
        isEmpty = true;
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

