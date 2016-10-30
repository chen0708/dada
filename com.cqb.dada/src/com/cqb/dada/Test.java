package com.cqb.dada;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double rent=0;
        
		PassengercarA passengercarA = new PassengercarA();
		PassengercarM passengercarM = new PassengercarM();
		Picard picard = new Picard();
		PassengercarJ passengercarJ = new PassengercarJ();
		TruckS truckS = new TruckS();
		TruckY truckY = new TruckY();

		System.out.println("娆㈣繋浣跨敤鍡掑棐绉熻溅绯荤粺,璇烽�夋嫨鎮ㄦ槸鍚︾杞︼細1鏄紝0鍚�");

		int i = input.nextInt();

		switch (i) {
		case 0:
			System.out.println("璋㈣阿鎮ㄧ殑浣跨敤锛岀郴缁熷凡閫�鍑�");
			return;

		case 1:
			System.out.println("鎮ㄥ彲閫夋嫨鐨勮溅鍨嬪強绉熼噾璇﹀崟涓猴細 ");
			System.out.println("搴忓彿" + "\t" + "杞﹀瀷" + "\t" + "绉熼噾" + "\t" + "\t" + "瀹归噺");
			passengercarA.passengercarA();
			passengercarM.passengercarM();
			picard.picard();
			passengercarJ.passengercarJ();
			truckS.trucks();
			truckY.trucky();
			break;

		default:
			System.out.println("鎮ㄨ緭鍏ョ殑鏁版嵁鏈夎 ");
			return;
		}

		System.out.println("璇疯緭鍏ユ偍瑕佺鍑犺締杞� ");
		int amount = input.nextInt();
		int[] amoun = new int[amount];
		for (int num = 0; num < amoun.length; num++) {
			System.out.println("璇烽�夋嫨鎮ㄨ绉熺殑绗�  " + (num + 1) + " 杈嗚溅 ");
			amoun[num] = input.nextInt();
		
		if(amoun[num]>6){
			System.out.println("输入错误" );
		}
		}

		System.out.println("请输入您要租的天数 ");
		int day = input.nextInt();

		for (int num = 0; num < amoun.length; num++) {
			/*if (amoun[num] == 1) {
               rent=day*passengercarA.getRent();    
               
			}*/
		switch (amoun[num]) {
		case 1:
            rent+=day*passengercarA.getRent();
                
		case 2:
            rent+=day*passengercarM.getRent();    
		case 3:
            rent+=day*picard.getRent();    
		case 4:
            rent+=day*passengercarJ.getRent();    
		case 5:
            rent+=day*truckS.getRent();    
		case 6:
            rent+=day*truckY.getRent();    

			break;

		default:
			break;
		}
		}
	}

}
