package Lesson13;

public class LandTract {
    private int length;
    private int height;

    public LandTract() {
    }

    public LandTract(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return length*height;
    }
    public boolean equals(LandTract obj){
        if (area()==obj.area()){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "LandTract{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }
}
