 class A{
    void add(int ...a)
    {
        int sum=0;
        for(int x:a){
             sum=sum+x;
        }   
        System.out.println("Sum is:"+sum);
    }
    }
     class vararg{
     public static void main(String[] args)
     {
        A a=new A();
        a.add();
        a.add(10,20,30);
     }
}
