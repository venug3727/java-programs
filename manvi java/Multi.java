public class ThreadExample
 {
    public static void main(String[] args) 
{
        Thread thread1 = new Thread(new DisplayEveryTenSeconds());
        Thread thread2 = new Thread(new DisplayEveryTwoSeconds());

        thread1.start();
        thread2.start();
    }
}

class DisplayEveryTenSeconds implements Runnable 
{
    public void run() 
{
        while (true) 
{
            try
 {
                Thread.sleep(10000);
                System.out.println("BMS College of Engineering");
            } 
catch (InterruptedException e) 
{
                e.printStackTrace();
            }
        }
    }
}

class DisplayEveryTwoSeconds implements Runnable
 {
    public void run() 
{
        while (true)
 {
            try 
{
                Thread.sleep(2000);
                System.out.println("CSE");
            }
 catch (InterruptedException e)
 {
                e.printStackTrace();
            }
        }
    }
}