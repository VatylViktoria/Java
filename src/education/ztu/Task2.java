package education.ztu;

public class Task2 {
    public String name;
    private Double number;

    {
        this.number = 200.0;
    }

    public Task2(){}

    public Task2(String name, Double number){
        this.name = name;
        this.number = number;
    }

    public Double getNumber(){
        return this.number;
    }

    @Annotable(key = "is amount in the storage enough?")
    public Boolean isEnough(Double count){
        return count <= this.number;
    }
}
