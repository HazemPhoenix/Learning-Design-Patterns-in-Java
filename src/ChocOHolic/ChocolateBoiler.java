package ChocOHolic;

public enum ChocolateBoiler {
    UNIQUE_INSTANCE;
    private boolean isEmpty = true;
    private boolean isBoiled = false;

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

