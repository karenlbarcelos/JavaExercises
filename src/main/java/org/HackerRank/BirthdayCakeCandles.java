package org.HackerRank;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        int maximum = Integer.MIN_VALUE;

        //get the height of the tallest candle
        for (Integer candle : candles) {
            if(candle >= maximum)
                maximum = candle;
        }

        int result = 0;
        for (Integer candle : candles){
            if(candle == maximum)
                result++;
        }

        return result;
    }
}
