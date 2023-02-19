class Demo extends Thread
{

    public void run()
    {
        //super.run();
        int i=0;
        for(i=1;i<10;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+ ": "+i);
            
                Thread.sleep(500);
            }
            catch(InterruptedException obj)
            {

            }
        }
    } 
}

class ThreadDemo6
{
    public static void main(String arr[]) throws InterruptedException
    {
        System.out.println("Inside main thread");
        Demo obj1=new Demo();
        Demo obj2=new Demo();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        t1.setName(" First");
        t2.setName("second");

        t1.join();
        t2.join();

        System.out.println("priority of thread is :"+t1.getPriority());
        System.out.println("priority of thread is :"+t2.getPriority());

        t1.setPriority(10);
        t2.setPriority(2);

        System.out.println("priority of thread is :"+t1.getPriority());
        System.out.println("priority of thread is :"+t2.getPriority());


        System.out.println("priority of main thread is :"+Thread.currentThread().getPriority());
        System.out.println("End of main");
    }
}


                            