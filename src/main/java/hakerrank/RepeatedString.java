package hakerrank;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long stringLength = s.length();

        long wholeString = 0L;
        long partitionString = 0L;

        long quotitent = n / stringLength;
        long remainder = n % stringLength;

        for(long i = 0L; i < stringLength; i++){

            if ((s.charAt((int) i)) == 'a'){

                if(i < remainder){
                    partitionString++;
                }

                wholeString++;
            }

        }
        return (wholeString * quotitent) + partitionString;

    }

}
