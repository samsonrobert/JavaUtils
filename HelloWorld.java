/**
 * Class HelloWorld.java
 */

public Class HelloWorld{

  /* HelloWorld */
  private HelloWorld helloWorld;
  
  /* Method main */
  public static void main(String args[]){
    System.out.println("Hello World!");
  }
  
  /* Method getInstance */
  public static HelloWorld getInstance(){
    if(helloWorld == null){
      helloWorld = new HelloWorld();
    }
    return helloWorld;
  }
  
}
