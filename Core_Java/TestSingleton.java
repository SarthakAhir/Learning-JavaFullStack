public final class TestSingleton{

private static final TestSingleton t1 = new TestSingleton();

private TestSingleton(){}

public static TestSingleton getTestSingleton(){
return t1;

}
public void test(){

System.out.println("test() TestSingleton called");
}
}