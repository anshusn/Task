package eg2;

public class TrainMain {

	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
		System.out.println("---------------------------------------------");
		System.out.println("#   Code       Station          Arr.     Dep.");
		System.out.println("---------------------------------------------");
		Train train1=new Train(1,"YPR","Yasvantpur Jn","","23:40");
		Printschedule(train1);
		Train train2=new Train(2,"GTL","Guntakal Jn","03:45","03:50");
		Printschedule(train2);
		Train train3=new Train(3,"SC","Secundrabad Jn","08:55","09:10");
		Printschedule(train3);
		Train train4=new Train(4,"BPQ","Balharshah","13:30","13:35");
		Printschedule(train4);
		Train train5=new Train(5,"HBJ","Habibganj","21:20","21:25");
		Printschedule(train5);
		Train train6=new Train(6,"JHS","Jhansi Jn","01:15","01:20");
		Printschedule(train6);
		Train train7=new Train(7,"DEE","Delhi S Rohilla","07:00","");
		Printschedule(train7);
		System.out.println("---------------------------------------------");
	}
	public static void Printschedule(Train train) {
		System.out.println(train.getId()+ "    "+train.getCode()+"     "+train.getStation()+"       "+train.getArr()+ "       "+train.getDep());
	}

}
