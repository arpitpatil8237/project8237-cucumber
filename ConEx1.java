class Parent1{
	public  Parent1(){
		//super();
	System.out.println("Parent1 Con");
	}
}
class Parent2 extends Parent1 {
	public  Parent2(){
		//super();
		System.out.println("Parent2 Con");
	}

}
class Parent3 extends Parent2{
	public  Parent3(){
		//super();
		System.out.println("Parent3 Con");
	}

}
   public class ConEx1 extends Parent3{

   public static void main(String[] args){
	ConEx1 obj=new ConEx1();


}

}