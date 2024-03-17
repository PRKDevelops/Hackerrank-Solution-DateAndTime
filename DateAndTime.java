import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;
public class DateAndTime {
	Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int day = sc.nextInt();
    int year = sc.nextInt();
    
public static String findDay(int month, int day, int year) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year,month - 1,day);
    String dayOfWeek = calendar.getDisplayName(
        Calendar.DAY_OF_WEEK,
        Calendar.LONG,
        Locale.US).toUpperCase();
        return dayOfWeek;
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = DateAndTime.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

