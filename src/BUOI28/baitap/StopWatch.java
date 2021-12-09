package BUOI28.baitap;

import java.time.LocalTime;

public class StopWatch {
    double startTime;
    double endTime;

    public StopWatch() {
    }

    public void getStartTime() {
        startTime = System.currentTimeMillis();
    }

    public void getEndTime() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;

    }
}
class StopWatchMain{
    public static void main(String[] args) {
                StopWatch stopWatch = new StopWatch();
        long[] arr = new long[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random() * 1000);
        }

        stopWatch.getStartTime();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        stopWatch.getEndTime();
        System.out.println(stopWatch.getElapsedTime());
    }
    }
