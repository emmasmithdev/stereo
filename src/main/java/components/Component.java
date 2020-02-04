package components;

public abstract class Component {

    private String make;
    private int model;

    public Component(String make, int model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public String play(){
        return "Playing a choon";
    }

    public String stop(){
        return "Silence";
    }
}
