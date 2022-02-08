
public class Desktop implements Hardware,Software{
private void desktopModel() {
System.out.println("The desktop model is :Hp");
}
//public static void main(String[] args) {
	
//}
@Override
public void softwareResources() {
	System.out.println("The best software resource is : google");
	
}
@Override
public void hardwareResources() {
System.out.println("best hardware resource is sccm");	
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
}
}
