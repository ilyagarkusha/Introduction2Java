package com.sda.homeworks.homework2;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch(){}

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public void start(){
        setStartTime(System.currentTimeMillis());
    }

    public void stop(){
        setEndTime(System.currentTimeMillis());
    }

    public void getElapsedTime(){
        double x = getEndTime() - getStartTime();
        System.out.println(x);
    }


    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();

        int[] array = new int[100000];

        for(int i = 0; i < array.length; i++){
            double x = Math.random() * 100000;
            array[i] = (int)x;
        }


        sort(array);


        stopwatch.stop();

        stopwatch.getElapsedTime();


    }

    public static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }



}
