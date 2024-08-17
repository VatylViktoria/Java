package com.education.ztu;

public class Car {
    private String brand;
    private final Engine engine;

    public Car(){
        this("Unknown brand");
    }

    public Car(String brand){
        this.brand = brand;
        this.engine = new Engine();
    }

    public boolean engineIsRunning(){
        return engine.isEngineWorks();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    static class Engine {
        private boolean engineWorks;

        public Engine(){
            this.engineWorks = false;
        }

        public void startEngine(){
            setEngineWorks(true);
        }

        public void stopEngine(){
            setEngineWorks(false);
        }

        public boolean isEngineWorks() {
            return engineWorks;
        }

        public void setEngineWorks(boolean engineWorks) {
            this.engineWorks = engineWorks;
        }
    }
}
