package Lesson4;

public class TestScores {
    private int testScore1;
    private int getTestScore2;
    private int getTestScore3;

    public int getTestScore1() {
        return testScore1;
    }

    public void setTestScore1(int testScore1) {
        this.testScore1 = testScore1;
    }

    public int getGetTestScore2() {
        return getTestScore2;
    }

    public void setTestScore2(int getTestScore2) {
        this.getTestScore2 = getTestScore2;
    }

    public int getGetTestScore3() {
        return getTestScore3;
    }

    public void setTestScore3(int getTestScore3) {
        this.getTestScore3 = getTestScore3;
    }

    public double average(){
        return (getTestScore1()+getTestScore2+getGetTestScore3())/3;
    }
}
