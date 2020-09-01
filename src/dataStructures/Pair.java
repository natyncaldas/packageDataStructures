package dataStructures;

import java.util.Objects;

public class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(){
        this(null, null);
    }

    public Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirst() {
        return value1;
    }

    public void setFirst(V1 value1) {
        this.value1 = value1;
    }

    public V2 getSecond() {
        return value2;
    }

    public void setSecond(V2 value2) {
        this.value2 = value2;
    }

    protected void setPair(Pair other){
        this.value1 = (V1) other.value1;
        this.value2 = (V2) other.value2;
    }

    public boolean equals(Pair other){
        return (this.value1.equals(other.value1) && this.value2.equals(other.value2));
    }

    @Override
    public String toString(){
        return "["+this.value1+", "+this.value2+"]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value1, this.value2);
    }

    public void swap(){
        V1 tmp = this.value1;
        this.value1 = (V1) this.value2;
        this.value2 = (V2) tmp;
    }

    public void swap(Pair other){
        Pair tmp = new Pair(this.value1, this.value2);
        this.setPair(other);
        other.setPair(tmp);
    }
}
