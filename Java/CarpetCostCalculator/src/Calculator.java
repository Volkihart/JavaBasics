public class Calculator {

private Floor floor;
private Carpet carpet;

public Calculator(Floor floor, Carpet carpet){
    this.floor = floor;
    this.carpet = carpet;
}

public double getTotalCost(){
    double res = this.floor.getArea() * this.carpet.getCost();
    return res;
}

}
