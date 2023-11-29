package cardDealer2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CardDealerTest2 extends JFrame{

	public CardDealerTest2(String title) {
		super(title);
		this.setVisible(true);
		this.setSize(new Dimension(1080, 1080));
		
	}
	
		@Override // <= annotation
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
//		System.out.println("!");
		String imagePath = "D:\\Lectures\\java\\CardDealerTest2\\poker.png";
		
		File fPath = new File(imagePath);
		try {
			g.drawImage(ImageIO.read(fPath), 100, 100, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("이미지를 불러오지 못했음");
			System.exit(0);
		}
		
		
	}

		public static void main(String[] args) {
		// 생성자

//		Card2 card1 = new Card2(1, 1);
//		System.out.println(card1.toString());
		
		Dealer2 현성 = new Dealer2();
		System.out.println(현성.displayCard());

		현성.shuffle();
		System.out.println(현성.displayCard());
		
//		for (int i = 0; i < Dealer2.CARD_NUM; i++ ) {
//			Card2 pick = 현성.pickCard();
//			System.out.println((i + 1) + "번째 카드 : " + pick.toString());
//			System.out.println(현성.displayCard());
//		}
		
		for (int i = 0; i < Dealer2.CARD_NUM; i++ ) {
			Card2 pick2 = 현성.pickCardWithRemoveArr();
			System.out.println((i + 1) + "번째 카드 : " + pick2.toString());
			System.out.println(현성.displayCard());
		}
		
//		for (int i = 0; i < Dealer2.CARD_NUM; i++ ) {
//			Card2 pick2 = 현성.pickCardWithRemoveArray();
//			System.out.println((i + 1) + "번째 카드 : " + pick2.toString());
//			System.out.println(현성.displayCard());
//		}
		
		CardDealerTest2 win = new CardDealerTest2("포커");

		
	}
}
