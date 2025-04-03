package Collections;

public class Generic_DataStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStore<Integer> intStore = new DataStore<>();
		intStore.setdata(200);
		System.out.println(intStore.getdata());
		
		DataStore<String> strStore = new DataStore<>();
		strStore.setdata("hi");
		System.out.println(strStore.getdata());
	}

}
