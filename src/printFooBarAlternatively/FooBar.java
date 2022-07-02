package printFooBarAlternatively;

class FooBar {
    private int n;
    volatile int methodCompleted;
    public FooBar(int n) {
        this.n = n;
        methodCompleted = 0;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if(i>0)
            {
                while(methodCompleted!=2);
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            methodCompleted = 1;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            while(methodCompleted != 1);
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            methodCompleted = 2;
        }
    }
}