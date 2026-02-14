package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int seconds) {
        if (seconds > 60) {
            minutes = seconds / 60;
            seconds %= 60;
        }

        if (minutes > 60) {
            hours = minutes / 60;
            minutes %= 60;
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes > 60) {
            this.hours += minutes / 60;
        }
        this.minutes = minutes % 60;
    }

    public void setSeconds(int seconds) {
        if (seconds > 60) {
            int minutes = seconds / 60;
            this.hours += minutes / 60;
            this.minutes += minutes % 60;
        }
        this.seconds = seconds % 60;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void add(TimeSpan span) {
        int seconds = this.seconds + span.seconds;
        int minutes = this.minutes + span.minutes + seconds / 60;
        int hours = this.hours + span.hours + minutes / 60;

        this.seconds = seconds % 60;
        this.minutes = minutes % 60;
        this.hours = hours;
    }

    public void subtract(TimeSpan span) {
        this.hours -= span.hours;
        this.minutes -= span.minutes;
        this.seconds -= span.seconds;

        if (this.seconds < 0) {
            this.minutes -= -this.seconds / 60;
            this.seconds %= 60 * (-1);
        }

        if (this.minutes < 0) {
            this.hours -= -this.minutes / 60;
            this.minutes %= 60 * (-1);
        }
    }

    public String toString() {
        return String.format("hours: %d; minutes: %d; seconds: %d", this.hours, this.minutes, this.seconds);
    }
}
