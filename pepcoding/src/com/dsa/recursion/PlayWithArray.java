package com.dsa.recursion;
/*
print-decreasing-numbers-using-recursion/video
https://www.pepcoding.com/resources/data-structures-and-algorithms/recursion/print-decreasing-numbers-using-recursion/video
Mathematical function like f(x)= f(x)+2 or x^2
PMI concept= principle of mathematical
1.whole number prove(lhs=rhs)
2.assume for k it is true (lhs=rhs)
3.proof that for k+1 it is true (lhs=rhs)
example f(x)= n(n+1)/2

recursion
concept: expectation=  do work +faith

*/

public class PlayWithArray {


    public static void main(String[] str) {
        int[] ar = {1, 2, 3, 18, 4};
        // printArray(ar,ar.length);
        //  printArrayRevese(ar,ar.length);
        System.out.println(findlargest(ar, ar.length, ar[ar.length - 1]));
        System.out.println(ar[findlargestIndex(ar, 0)]);

    }

    private static int findlargestIndex(int[] ar, int i) {
        if (i == ar.length - 1)// base condition
            return i;// current max index
        else {
            int restMax = findlargestIndex(ar, i + 1);
            if (ar[i] > ar[restMax])
                return i;
            else
                return restMax;


        }

    }

    private static int findlargest(int[] ar, int length, int max) {
        if (length == 0)//base condition
            return max;
        int localmax = findlargest(ar, length - 1, ar[length - 1]); //faith : find the max in short array
        if (localmax > max)
            return localmax;
        else
            return max;


    }

    private static void printArray(int[] ar, int i) {

        if (i == 0) { //base condition

        } else {
            printArray(ar, i - 1);
            System.out.println(ar[i - 1]);


        }
    }

    private static void printArrayRevese(int[] ar, int i) {

        if (i == 0) { //base condition

        } else {

            System.out.println(ar[i - 1]);
            printArrayRevese(ar, i - 1);


        }
    }

}
/*
Output :
"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:F:\NPTEL\MBA\Java IDE\Intellij 2019.3.4\lib\idea_rt.jar=50604:F:\NPTEL\MBA\Java IDE\Intellij 2019.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;E:\gitrepo\pepcoding\out\production\pepcoding" com.dsa.recursion.PrintNumbers
5
4
3
2
1
-----
1
2
3
4
5
-----
5
4
3
2
1
1
2
3
4
5


*/
