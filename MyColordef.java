package project4;

public class MyColordef {
   private static String RED="red";
   private static String GREEN="green";
   private static String BLUE="blue";
   private static MyColor color;
   MyColordef(MyColor color)
   {
	   this.color=color;
   }
public static MyColor getColor() {
	return color;
}
public static void setColor(MyColor color) {
	MyColordef.color = color;
}
}
