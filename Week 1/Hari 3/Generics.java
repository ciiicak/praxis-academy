class Test<T>{
    T obj;
    Test(T obj) {  this.obj = obj;  }  // constructor 
    public T getObject()  { return this.obj; } 
}

class Main{
    public static void main(String[] args) {
        // instance of Integer type 
        Test <Integer> iObj = new Test<Integer>(123123); 
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        Test <String> sObj = 
                          new Test<String>("GeeksForNoob"); 
        System.out.println(sObj.getObject()); 
    }
}