//Q4. WAP to calculate to count total object created for a class.

package Assignment_3;

class Test {

    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    // various types of constructors
    // that can create objects
    //apply overloading concept on method
    public Test()
    {
    }
    public Test(int n)
    {
    }
    public Test(String s)
    {
    }
    public Test(float k)
    {
    }

    public static void main(String args[])
    {
        Test t1 = new Test();
        Test t2 = new Test(5);
        Test t3 = new Test("Siddhant");
        Test t4 = new Test(2.2f);

        System.out.println(Test.noOfObjects);
    }
}
