package kr.ac.kopo.day0327;

public class LottoView {


		public void process() {
			
			LottoUtil util = new LottoUtil();
			for(int game = 1; game <= 6; game++) {
				System.out.println(game + "°ÔÀÓ : " + util.getLotto() );
			}
			
		}
	}



