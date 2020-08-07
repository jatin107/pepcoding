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

public class TowerOfHanoi {


    public static void main(String[] str) {
        toh("A", "C", "B", 25);

    }

    private static void toh(String src, String dest, String helper, int n) {

        if (n == 1) { //base condition
            System.out.println("Move nth " + n + " peg " + src + " to  peg " + dest);
        } else {
            toh(src, helper, dest, n - 1);// faith 1
            System.out.println("Move nth " + n + " peg " + src + " to  peg " + dest);// work
            toh(helper, dest, src, n - 1);
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
