package main.com.epam.skipass.enums;

public enum Duration {

	HALFDAY(6), DAY_1(24), DAY_2(48), DAY_5(120);

    private int durationInHours;

    private Duration(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public int getDurationInHours() {
        return durationInHours;
    }
}
