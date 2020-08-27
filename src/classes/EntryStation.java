package classes;

public class EntryStation {
	
	public static int[] Spots = {0,0,0,0,0,0,0,0};
	
	public static int AdiviceCustomer() {
		
		for (int i = 0; i < 8;i++) {
			if (Spots[i] == 0) {
				Spots[i] = 1;
				return i;
			}
		}
		return - 1;
	}
        public static int isParkingEmpty(){
            int Full = 1;
            for (int i = 0; i < 8;i++){
                if (Spots[i] == 1)
                    Full++;
            }
            if (Full == 8)
                return 1;
            else
                return 0;
        }
}