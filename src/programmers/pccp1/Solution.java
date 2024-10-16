package programmers.pccp1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class Solution {
    static LocalTime videoTime;
    static LocalTime posTime;
    static LocalTime startTime;
    static LocalTime endTime;

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //1. LocalTime 객체화
        String[] video = video_len.split(":");
        String[] p = pos.split(":");
        String[] start = op_start.split(":");
        String[] end = op_end.split(":");

        videoTime = parse(video);
        posTime = parse(p);
        startTime = parse(start);
        endTime = parse(end);

        //2. 오프닝 건너뛰기
        skipOp();
        //3. command에 따른 명령 처리(10초 전, 10초 후)
        for (int i=0; i<commands.length; i++){
            String command = commands[i];
            if (command.equals("prev")){//10초 전
                prevTime();
            }else if(command.equals("next")){//10초 후
                nextTime();
            }

            skipOp();
        }
        //4. LocalTime -> String return

        return posTime.format(DateTimeFormatter.ofPattern("mm:ss"));
    }

    //LocalTime 파싱 함수
    private static LocalTime parse(String[] time){
        int min = Integer.parseInt(time[0]);
        int sec = Integer.parseInt(time[1]);
        return LocalTime.of(0, min, sec);
    }

    // 오프닝 스킵 함수
    private static void skipOp() {
        if (!posTime.isBefore(startTime)& !posTime.isAfter(endTime)){
            posTime = endTime;
        }
    }

    // 10초 전으로 이동
    private static void prevTime(){
        int minute = posTime.getMinute();
        int second = posTime.getSecond();

        if (minute == 0 && second < 10){
            posTime = LocalTime.of(0, 0, 0);
            return;
        }

        posTime = posTime.minusSeconds(10L);
    }

    // 10초 후로 이동
    private static void nextTime(){
        posTime = posTime.plusSeconds(10L);

        if (posTime.isAfter(videoTime)){
            posTime = videoTime;
        }
    }
    public static void main(String[] args) {

        System.out.println(
                solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"}));
        System.out.println(
                solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"}));
        System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"}));
        System.out.println(solution("30:00", "29:55", "01:00", "01:30", new String[]{"next"}));
    }
}//Solution end
