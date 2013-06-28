@Grab('com.googlecode.gbench:gbench:0.4.2-groovy-2.1') 
import gbench.BenchmarkBuilder 
import groovy.transform.CompileStatic 
  
int fib(int n) { 
    if (n < 2) return n
    return fib(n - 1) + fib(n - 2)  
} 
  
@CompileStatic 
int fib2(int n) { 
    if (n < 2) return n 
    return fib2(n - 1) + fib2(n - 2)  
} 
  
new BenchmarkBuilder().run { 
    int n = 20 
    "Normal Version" { fib n } 
    "@CompileStatic Version" { fib2 n } 
}.prettyPrint()

// * JVM: Java HotSpot(TM) 64-Bit Server VM (23.6-b04, Oracle Corporation)
//     * JRE: 1.7.0_10
//     * Total Memory: 81.1875 MB
//     * Maximum Memory: 1123.5625 MB
// * OS: Mac OS X (10.7.5, x86_64) 

// Options
// =======
// * Warm Up: Auto 
// * CPU Time Measurement: On

//                          user  system    cpu   real

// Normal Version          92622       7  92630  92626
// @CompileStatic Version  39974       3  39977  39976