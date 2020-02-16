
package org.truffle.cs.mj.main;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.truffle.cs.mj.parser.RecursiveDescendScanner;
import org.truffle.cs.mj.parser.RecursiveDescentParser;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleRuntime;

public class MJRuntime {

    public static void main(String[] args) {
// parseRD(mjProgramRD);
// parseRD(whileLoopRD);
// parseRD(ifProgram);
// parseRDBenchmark(divAlgorithm);
// parseRD(mySample);
// parseRD(mjProgramRD);
// parseRD(ifProgram);
// parseRD(whileProgram);
// parseRD(whileIfProgram);
// parseRD(divAlgorithm);
// parseRD(recurseProgram);
// parseRD(recursiveProgram2);
        parseRD(divAlgorithm);
    }

    static String mySample = "program Sample {" + "void main() {print(0);print(1);} " + "}";
    static String mjExpr_2 = "program Sample {" + "void main() {" + "    print(4);" + "  }" + "}";
    static String mjExpr_1 = "program Sample {" + "void main() {" + "    print(4/2);" + "  }" + "}";

    static String mjExpr = "program Sample {" + "void main() {" + "    print(4 + 2);" + "  }" + "}";

    static String mjFunCall = "program Sample {" + "" + "void prinun(int i) {print(i);}" + "void main() {" + "print(1); " + "prinun(5);" + "}" + "}";
    static String mjProgramRD = ""//
                    + "program Sample { "//
                    + "void main(int i) int j; { \n"//
                    + "                 print(0);"//
                    + "                 print(12); \n" //
                    + "                 i = 3;\n"//
                    + "                 print(i);\n"//
                    + "                 print(i+12);\n"//
                    + "                 j=12;\n"//
                    + "                 print(i+j+12);\n"//
                    + "         }\n"//
                    + "}";

    static String ifProgram = "program Sample {"//
                    + "             void main(int i,int j){"//
                    + "                 if(i>j) {"//
                    + "                     print(i);" //
                    + "                 }else {"//
                    + "                     print(j);"//
                    + "                 }"//
                    + "                 print(0);"//
                    + "             }}";

    static String whileLoopRD = "program P {"//
                    + "             void foo(int i,int j) {print(i+j);}" //
                    + "             void main () int i;{ "//
                    + "                 i =0; "//
                    + "                 while(i<10) {"//
                    + "                     print(i); "//
                    + "                     i=i+1;"//
                    + "                     foo(i,2);" //
                    + "                 }"//
                    + "             }"//
                    + "}";
    static String whileIfProgram = "program P {"//
                    + "             void foo(int i,int j) {"//
                    + "                 if(i>j) {"//
                    + "                     print(i);" //
                    + "                 }else {"//
                    + "                     print(j);"//
                    + "                 }"//
                    + "                 print(0);"//
                    + "             }" //
                    + "             void main () int i;{ "//
                    + "                 i =0; "//
                    + "                 while(i<10) {"//
                    + "                     i=i+1;" //
                    + "                     foo(i,5);" //
                    + "                 }"//
                    + "             }"//
                    + "}";

    static String whileProgram = "program P {"//
                    + "             void main (){ "//
                    + "                 while(1<2) {"//
                    + "                     print(10);" //
                    + "                 }"//
                    + "             }"//
                    + "}";

    static String contbreakProgram = "program P {"//
                    + "             void main () int i;{ " //
                    + "                 i = 1;"//
                    + "                 while(i<20) {" //
                    + "                     i = i + 1;" //
                    + "                     if (i % 2 == 0) {" //
                    + "                         continue;" //
                    + "                     }" //
                    + "                     if (i % 15 == 0) {break;}"//
                    + "                     print(i); " //
                    + "                     " //
                    + "                 }"//
                    + "             }"//
                    + "}";

    static String returnProgram = "program P {"//
                    + "             void foo() {return 3;}" //
                    + "             void main () int i;{ " //
                    + "                 print(432+foo());"  //
                    + "             }"//
                    + "}";

    static String recurseProgram = "program P {"//
                    + "             void foo(int a) {print(a); " + "if (a < 0) {" + "return 0;" + "}"//
                    + "                 foo(a - 5);" //
                    + "             }" //
                    + "             void main ()int p;{ " //
                    + "                 p = foo(100);"  //
                    + "             }"//
                    + "}";

    static String recursiveProgram2 = "program p {"//
                    + "               void foo(int i) {"//
                    + "                        print(i);"//
                    + "                        if(i == 5){"//
                    + "                             return 100;"//
                    + "                         }"//
                    + "                         return foo(i-1);"//
                    + "                    }"//
                    + "               void main(){"//
                    + "                 print(foo(100));"//
                    + "                 }" //
                    + "             }";//

    static String divAlgorithm = "program DivAlgorithm {"//
                    + "             int flipSign(int a) int neg;int tmp; int tmpA; {" //
                    + "                 neg = 0;"//
                    + "                 tmp = 0;" //
                    + "                 tmpA = a;"//
                    + "                 if(a < 0){"//
                    + "                     tmp = 1;"//
                    + "                 } else {"//
                    + "                     tmp = -1;"//
                    + "                 }" //
                    + "                 while(tmpA != 0) {"//
                    + "                     neg = neg + tmp;"//
                    + "                     tmpA = tmpA + tmp;"//
                    + "                     print(tmpA);"//
                    + "                     print(neg);"//
                    + "                 }"//
                    + "                 return neg;"//
                    + "             }"//
                    + "             int sub(int a,int b) {"//
                    + "                 return a + flipSign(b);"//
                    + "             }"//
                    + "             int mul(int a,int b) int sum;int i; {"//
                    + "                 if(a<b) {"//
                    + "                     return mul(b,a);"//
                    + "                 }"//
                    + "                 sum = 0;"//
                    + "                 i =abs(b);"//
                    + "                 while(i>0) {"//
                    + "                     sum = sum +a;"//
                    + "                     i = i-1;"//
                    + "                 }"//
                    + "                 if(b < 0){"//
                    + "                     sum = flipSign(sum);"//
                    + "                 }"//
                    + "                 return sum;"//
                    + "             }" //
                    + "             void main (int a,int b){ " //
                    + "                 print(mul(a,b));"//
                    + "             }"//
                    + "}";

    static void parseRD(String code) {
        InputStream is = new ByteArrayInputStream(code.getBytes());
        RecursiveDescendScanner scanner = new RecursiveDescendScanner(new InputStreamReader(is));
        RecursiveDescentParser parser = new RecursiveDescentParser(scanner);
        parser.parse();
        TruffleRuntime runtime = Truffle.getRuntime();
// System.out.println("Calling main function...");
        CallTarget callTarget = runtime.createCallTarget(parser.getMain());
        for (int i = 0; i < 100; i++) {
            callTarget.call(5, 10);
        }
// callTarget.call();
    }

    static void parseRDBenchmark(String code) {
        InputStream is = new ByteArrayInputStream(code.getBytes());
        RecursiveDescendScanner scanner = new RecursiveDescendScanner(new InputStreamReader(is));
        RecursiveDescentParser parser = new RecursiveDescentParser(scanner);
        parser.parse();
        TruffleRuntime runtime = Truffle.getRuntime();
        System.out.println("Calling main function...");
        CallTarget callTarget = runtime.createCallTarget(parser.getMain());
// System.out.println("#################################################################");
// Random r = new Random(17);
//
// long start = System.currentTimeMillis();
// callTarget.call(123123, -12312312);
// long initialTimeNeeded = (System.currentTimeMillis() - start);
// System.out.println("Time needed " + initialTimeNeeded);
//
// // warmup
// for (int i = 0; i < 100; i++) {
// callTarget.call(i, i % 2 == 0 ? -i : i);
// callTarget.call(i % 2 == 0 ? -i : i, i);
// }
// for (int i = 0; i < 1000; i++) {
// callTarget.call(i, r.nextInt(1000));
// }
// System.out.println("#################################################################");
// start = System.currentTimeMillis();
// callTarget.call(123123, -12312312);
// System.out.println("Time needed " + (System.currentTimeMillis() - start) + " | vs initial time="
// + initialTimeNeeded);
// System.out.println("#################################################################");
    }

}
